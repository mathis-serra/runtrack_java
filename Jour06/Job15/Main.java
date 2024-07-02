
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un nombre
        System.out.println("Veuillez entrer un nombre :");
        String nombreStr = scanner.nextLine(); // Lire le nombre en tant que chaîne de caractères
        
        // Inverser le nombre
        String nombreInverseStr = inverserNombre(nombreStr);
        
        // Afficher le nombre inversé à l'utilisateur
        System.out.println("Le nombre inversé est : " + nombreInverseStr);

        // Fermeture du scanner
        scanner.close();
    }

    // Méthode pour inverser une chaîne de caractères représentant un nombre
    public static String inverserNombre(String nombreStr) {
        // Utilisation de StringBuilder pour faciliter l'inversion de la chaîne
        StringBuilder sb = new StringBuilder(nombreStr);
        sb.reverse(); // Inverser la chaîne de caractères
        return sb.toString(); // Retourner la chaîne inversée
    }
}
