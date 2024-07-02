import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir trois nombres
        System.out.println("Veuillez entrer le premier nombre :");
        double nombre1 = scanner.nextDouble();
        
        System.out.println("Veuillez entrer le deuxième nombre :");
        double nombre2 = scanner.nextDouble();
        
        System.out.println("Veuillez entrer le troisième nombre :");
        double nombre3 = scanner.nextDouble();

        // Calcul du maximum des trois nombres
        double maximum = Math.max(Math.max(nombre1, nombre2), nombre3);

        // Affichage du maximum
        System.out.println("Le maximum des trois nombres est : " + maximum);

        // Fermeture du scanner
        scanner.close();
    }
}
