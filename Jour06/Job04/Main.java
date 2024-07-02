import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);
        
        // Affichage d'un message invitant l'utilisateur à entrer son nom
        System.out.println("Veuillez entrer votre nom :");
        
        // Récupération du nom de l'utilisateur
        String nom = scanner.nextLine();
        
        // Affichage du message de bienvenue
        System.out.println("Bienvenue, " + nom + " !");
        
        // Fermeture du scanner
        scanner.close();
    }
}
