import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre entier n (<= 9)
        System.out.println("Veuillez entrer un nombre entier n (<= 9) :");
        int n = scanner.nextInt();

        // Vérifier si n est inférieur ou égal à 9
        if (n <= 9 && n >= 0) {
            // Afficher la table de multiplication de n
            System.out.println("Table de multiplication de " + n + " :");
            for (int i = 1; i <= 10; i++) {
                int produit = n * i;
                System.out.println(n + " * " + i + " = " + produit);
            }
        } else {
            System.out.println("Le nombre saisi n'est pas inférieur ou égal à 9.");
        }

        // Fermeture du scanner
        scanner.close();
    }
}
