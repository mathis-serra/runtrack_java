import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);
        
        // Affichage d'un message invitant l'utilisateur à entrer son prénom
        System.out.println("Veuillez entrer votre prénom :");
        
        // Récupération du prénom de l'utilisateur
        String prenom = scanner.nextLine();
        
        // Affichage du message de bienvenue
        System.out.println("Bonjour " + prenom + " !");
        
        // Fermeture du scanner
        scanner.close();
    }
}
