import java.util.Scanner;
import java.util.Vector;

public class Commerciale {
    private Vector<Article> articles = new Vector<>();
    private Vector<Client> clients = new Vector<>();
    private Vector<Commande> commandes = new Vector<>();
    private Vector<Ligne> lignes = new Vector<>();

    
    public void passerCommande(Commande c) {
        commandes.add(c);
    }

   
    public void annulerCommande(Commande c) {
        commandes.remove(c);
    }

    
    public void ajouterArticle(Article a) {
        articles.add(a);
    }


    public void supprimerArticle(Article a) {
        articles.remove(a);
    }

 
    public void ajouterClient(Client c) {
        clients.add(c);
    }

    public void supprimerClient(Client c) {
        clients.remove(c);
    }

  
    public static void main(String[] args) {
        Commerciale gestion = new Commerciale();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Menu Gestion Commerciale :");
            System.out.println("1. Ajouter un client");
            System.out.println("2. Ajouter un article");
            System.out.println("3. Passer une commande");
            System.out.println("4. Afficher les clients");
            System.out.println("5. Afficher les articles");
            System.out.println("6. Afficher les commandes");
            System.out.println("7. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    System.out.print("Identité du client : ");
                    int identite = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nom social : ");
                    String nomSocial = scanner.nextLine();
                    System.out.print("Adresse : ");
                    String adresse = scanner.nextLine();
                    System.out.print("Chiffre d'affaires : ");
                    double chiffreAffaire = scanner.nextDouble();
                    scanner.nextLine();
                    Client client = new Client(identite, nomSocial, adresse, chiffreAffaire);
                    gestion.ajouterClient(client);
                    break;
                case 2:
                    System.out.print("Référence de l'article : ");
                    int reference = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Désignation : ");
                    String designation = scanner.nextLine();
                    System.out.print("Prix unitaire : ");
                    double prixUnitaire = scanner.nextDouble();
                    System.out.print("Quantité en stock : ");
                    int quantiteStock = scanner.nextInt();
                    scanner.nextLine(); 
                    Article article = new Article(reference, designation, prixUnitaire, quantiteStock);
                    gestion.ajouterArticle(article);
                    break;
                case 3:
                    System.out.print("Numéro de la commande : ");
                    int numeroCommande = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Date de la commande (AAAA-MM-JJ) : ");
                    String dateCommande = scanner.nextLine();
                    System.out.print("Identité du client : ");
                    int clientId = scanner.nextInt();
                    scanner.nextLine();
                    Client clientCommande = gestion.clients.stream()
                            .filter(c -> c.getIdentite() == clientId)
                            .findFirst()
                            .orElse(null);
                    if (clientCommande == null) {
                        System.out.println("Client introuvable !");
                        break;
                    }
                    Commande commande = new Commande(numeroCommande, dateCommande, clientCommande);
                    gestion.passerCommande(commande);
                    break;
                case 4:
                    System.out.println("Liste des clients :");
                    for (Client c : gestion.clients) {
                        c.affiche();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Liste des articles :");
                    for (Article a : gestion.articles) {
                        a.affiche();
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Liste des commandes :");
                    for (Commande com : gestion.commandes) {
                        com.affiche();
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
                    break;
            }
        } while (choix != 7);

        scanner.close();
    }
}
