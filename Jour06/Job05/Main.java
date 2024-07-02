import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);
        
        // Affichage d'un message invitant l'utilisateur à entrer un nombre
        System.out.println("Veuillez entrer un nombre :");
        
        // Récupération du nombre de l'utilisateur
        double nombre = scanner.nextDouble();
        
        // Calcul du carré du nombre
        double carre = nombre * nombre;
        
        // Affichage du carré du nombre
        System.out.println("Le carré de " + nombre + " est " + carre + ".");
        
        // Fermeture du scanner
        scanner.close();
    }
}
