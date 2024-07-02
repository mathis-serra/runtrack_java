import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre entier n
        System.out.println("Veuillez entrer un nombre entier n :");
        int n = scanner.nextInt();

        // Afficher tous les nombres pairs jusqu'à n
        System.out.println("Les nombres pairs inférieurs ou égaux à " + n + " sont :");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) { // Vérifier si i est pair
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Aller à la ligne après l'affichage des nombres

        // Fermeture du scanner
        scanner.close();
    }
}
