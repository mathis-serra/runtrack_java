import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);
        
        // Affichage d'un message invitant l'utilisateur à entrer un texte
        System.out.println("Veuillez entrer un texte :");
        
        // Récupération de la saisie clavier
        String saisie = scanner.nextLine();
        
        // Affichage de la saisie clavier
        System.out.println("Vous avez entré : " + saisie);
        
        // Fermeture du scanner
        scanner.close();
    }
}
