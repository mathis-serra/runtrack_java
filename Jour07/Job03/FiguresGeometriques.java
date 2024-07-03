// Déclaration du fichier FiguresGeometriques.java

// Classe Rectangle
class Rectangle {
    // Attributs
    private double largeur;
    private double longueur;

    // Constructeur par défaut
    public Rectangle() {
        this.largeur = 0.0;
        this.longueur = 0.0;
    }

    // Constructeur avec paramètres
    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    // Getter pour largeur
    public double getLargeur() {
        return largeur;
    }

    // Setter pour largeur
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    // Getter pour longueur
    public double getLongueur() {
        return longueur;
    }

    // Setter pour longueur
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    // Méthode pour calculer la surface
    public double surface() {
        return largeur * longueur;
    }
}

// Classe RectangleColore qui hérite de Rectangle
class RectangleColore extends Rectangle {
    // Attribut supplémentaire
    private int couleur;

    // Constructeur par défaut
    public RectangleColore() {
        super();  // Appel au constructeur par défaut de Rectangle
        this.couleur = 0;
    }

    // Constructeur avec paramètres
    public RectangleColore(double largeur, double longueur, int couleur) {
        super(largeur, longueur);  // Appel au constructeur de Rectangle avec paramètres
        this.couleur = couleur;
    }

    // Getter pour couleur
    public int getCouleur() {
        return couleur;
    }

    // Setter pour couleur
    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
}

// Classe Cercle
class Cercle {
    // Attributs
    private double centreX;
    private double centreY;
    private double rayon;

    // Constructeur par défaut
    public Cercle() {
        this.centreX = 0.0;
        this.centreY = 0.0;
        this.rayon = 0.0;
    }

    // Constructeur avec paramètres
    public Cercle(double centreX, double centreY, double rayon) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.rayon = rayon;
    }

    // Getter pour centreX
    public double getCentreX() {
        return centreX;
    }

    // Setter pour centreX
    public void setCentreX(double centreX) {
        this.centreX = centreX;
    }

    // Getter pour centreY
    public double getCentreY() {
        return centreY;
    }

    // Setter pour centreY
    public void setCentreY(double centreY) {
        this.centreY = centreY;
    }

    // Getter pour rayon
    public double getRayon() {
        return rayon;
    }

    // Setter pour rayon
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // Méthode pour calculer la surface
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    // Méthode pour vérifier si un point (x, y) est à l'intérieur du cercle
    public boolean isPointInside(double x, double y) {
        double distance = Math.sqrt((x - centreX) * (x - centreX) + (y - centreY) * (y - centreY));
        return distance <= rayon;
    }
}

// Classe principale pour tester les objets
public class FiguresGeometriques {
    public static void main(String[] args) {
        // Test de la classe Rectangle
        Rectangle rect1 = new Rectangle();
        System.out.println("Surface du rectangle rect1 (par défaut) : " + rect1.surface());
        rect1.setLargeur(5.0);
        rect1.setLongueur(10.0);
        System.out.println("Surface du rectangle rect1 (modifié) : " + rect1.surface());

        Rectangle rect2 = new Rectangle(2.0, 4.0);
        System.out.println("Surface du rectangle rect2 : " + rect2.surface());

        // Test de la classe RectangleColore
        RectangleColore rectColore1 = new RectangleColore(3.0, 6.0, 255);
        System.out.println("Surface du rectangle coloré rectColore1 : " + rectColore1.surface());
        System.out.println("Couleur du rectangle coloré rectColore1 : " + rectColore1.getCouleur());

        rectColore1.setCouleur(128);
        System.out.println("Nouvelle couleur du rectangle coloré rectColore1 : " + rectColore1.getCouleur());

        // Test de la classe Cercle
        Cercle cercle1 = new Cercle();
        System.out.println("Surface du cercle cercle1 (par défaut) : " + cercle1.surface());
        cercle1.setCentreX(1.0);
        cercle1.setCentreY(1.0);
        cercle1.setRayon(3.0);
        System.out.println("Surface du cercle cercle1 (modifié) : " + cercle1.surface());

        Cercle cercle2 = new Cercle(0.0, 0.0, 5.0);
        System.out.println("Surface du cercle cercle2 : " + cercle2.surface());
        System.out.println("Le point (3, 4) est-il à l'intérieur du cercle2 ? " + cercle2.isPointInside(3, 4));
        System.out.println("Le point (6, 0) est-il à l'intérieur du cercle2 ? " + cercle2.isPointInside(6, 0));
    }
}
