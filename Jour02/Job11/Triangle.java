import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la hauteur du triangle: ");
        int hauteur = scanner.nextInt();

        // Construire le triangle
        for (int i = 1; i <= hauteur; i++) {
            // Afficher les étoiles pour la ligne actuelle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Sauter à la ligne suivante après avoir affiché les étoiles
            System.out.println();
        }
        
        scanner.close();
    }
}
