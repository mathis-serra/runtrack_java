import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un entier n
        System.out.println("Veuillez entrer un entier positif pour calculer sa factorielle :");
        int n = scanner.nextInt();

        // Vérifier si l'entier saisi est positif
        if (n < 0) {
            System.out.println("Erreur : Entier négatif saisi. La factorielle n'est définie que pour les entiers positifs.");
        } else {
            // Calculer la factorielle de n
            long factorielle = 1; // Utilisation de long pour gérer de grandes valeurs de factorielles
            for (int i = 1; i <= n; i++) {
                factorielle *= i; // Multiplier chaque nombre de 1 à n ensemble
            }
            
            // Affichage du résultat
            System.out.println("La factorielle de " + n + " est : " + factorielle);
        }

        // Fermeture du scanner
        scanner.close();
    }
}
