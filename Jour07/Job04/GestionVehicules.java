import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

// Classe Vehicule
class Vehicule {
    // Attributs
    private String marque;
    private LocalDate dateAchat;
    private double prixAchat;
    private double prixCourant;

    // Constructeur
    public Vehicule(String marque, String dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = LocalDate.parse(dateAchat, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.prixAchat = prixAchat;
        this.prixCourant = prixAchat; // Initialement, le prix courant est le même que le prix d'achat
    }

    // Getters
    public String getMarque() {
        return marque;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public double getPrixCourant() {
        return prixCourant;
    }

    // Setters
    public void setPrixCourant(double prixCourant) {
        this.prixCourant = prixCourant;
    }

    // Méthode pour calculer le prix courant
    public void calculePrix(int anneeActuelle) {
        int annees = anneeActuelle - dateAchat.getYear();
        prixCourant = prixAchat * Math.pow(0.99, annees);
        if (prixCourant < 0) {
            prixCourant = 0;
        }
    }

    // Méthode pour afficher les attributs de l'instance
    public void affiche() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Marque: " + marque);
        System.out.println("Date d'achat: " + dateAchat.format(formatter));
        System.out.println("Prix d'achat: " + prixAchat);
        System.out.println("Prix courant: " + prixCourant);
    }
}

// Classe Voiture héritant de Vehicule
class Voiture extends Vehicule {
    // Attributs supplémentaires
    private double cylindree;
    private int nombrePortes;
    private double puissance;
    private double kilometrage;

    // Constructeur
    public Voiture(String marque, String dateAchat, double prixAchat, double cylindree, int nombrePortes, double puissance, double kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree;
        this.nombrePortes = nombrePortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    // Redéfinition de la méthode calculePrix
    @Override
    public void calculePrix(int anneeActuelle) {
        int annees = anneeActuelle - getDateAchat().getYear();
        double prix = getPrixAchat();

        // Dépréciation annuelle de 2%
        prix *= Math.pow(0.98, annees);

        // Dépréciation par kilométrage
        prix *= Math.pow(0.95, Math.round(kilometrage / 10000));

        // Dépréciation ou appréciation par marque
        if (getMarque().equals("Renault") || getMarque().equals("Fiat")) {
            prix *= 0.90;
        } else if (getMarque().equals("Ferrari") || getMarque().equals("Porsche")) {
            prix *= 1.20;
        }

        // Assurer que le prix ne soit pas négatif
        if (prix < 0) {
            prix = 0;
        }

        setPrixCourant(prix);
    }

    // Méthode pour afficher les attributs de l'instance
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Cylindrée: " + cylindree);
        System.out.println("Nombre de portes: " + nombrePortes);
        System.out.println("Puissance: " + puissance);
        System.out.println("Kilométrage: " + kilometrage);
    }
}

// Classe Avion héritant de Vehicule
class Avion extends Vehicule {
    // Attributs supplémentaires
    private String typeMoteur;
    private double heuresDeVol;

    // Constructeur
    public Avion(String marque, String dateAchat, double prixAchat, String typeMoteur, double heuresDeVol) {
        super(marque, dateAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.heuresDeVol = heuresDeVol;
    }

    // Redéfinition de la méthode calculePrix
    @Override
    public void calculePrix(int anneeActuelle) {
        double prix = getPrixAchat();
        double depreciation = 0;

        if (typeMoteur.equals("HELICES")) {
            depreciation = 0.10 * (heuresDeVol / 100);
        } else {
            depreciation = 0.10 * (heuresDeVol / 1000);
        }

        prix *= Math.pow(1 - depreciation, 1);

        // Assurer que le prix ne soit pas négatif
        if (prix < 0) {
            prix = 0;
        }

        setPrixCourant(prix);
    }

    // Méthode pour afficher les attributs de l'instance
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Type de moteur: " + typeMoteur);
        System.out.println("Heures de vol: " + heuresDeVol);
    }
}

// Classe principale pour tester les objets
public class GestionVehicules {
    public static void main(String[] args) {
        // Création d'une instance de Voiture
        Voiture voiture1 = new Voiture("Toyota", "2022-05-15", 20000, 2.0, 4, 150, 50000);
        System.out.println("Informations sur la voiture avant calcul du prix courant :");
        voiture1.affiche();
        voiture1.calculePrix(2024);
        System.out.println("Informations sur la voiture après calcul du prix courant :");
        voiture1.affiche();
        System.out.println();

        // Création d'une instance d'Avion
        Avion avion1 = new Avion("Boeing", "2018-07-20", 1000000, "REACTION", 1200);
        System.out.println("Informations sur l'avion avant calcul du prix courant :");
        avion1.affiche();
        avion1.calculePrix(2024);
        System.out.println("Informations sur l'avion après calcul du prix courant :");
        avion1.affiche();
    }
}
