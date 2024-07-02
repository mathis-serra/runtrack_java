import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre entier n
        System.out.println("Veuillez entrer un nombre entier n :");
        int n = scanner.nextInt();

        // Calculer la somme des n premiers cubes
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i * i * i; // Ajouter le cube de i à la somme
        }

        // Afficher la somme des n premiers cubes
        System.out.println("La somme des " + n + " premiers cubes est : " + somme);

        // Fermeture du scanner
        scanner.close();
    }
}
