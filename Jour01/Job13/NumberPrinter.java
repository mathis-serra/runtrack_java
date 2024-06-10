import java.util.Scanner;

public class NumberPrinter {
    public static void main(String[] args) {
        // Création d'un scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande du nombre entier à l'utilisateur
        System.out.print("Veuillez entrer un nombre entier : ");
        int nombre = scanner.nextInt();

        // Fermeture du scanner
        scanner.close();

        // Affichage des nombres de 1 jusqu'au nombre saisi
        System.out.println("Les nombres de 1 à " + nombre + " sont :");
        for (int i = 1; i <= nombre; i++) {
            System.out.print(i);
            if (i < nombre) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
