import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);

        // Initialisation des variables
        int somme = 0; // Variable pour stocker la somme des entiers
        int nombre;    // Variable pour stocker chaque entier saisi

        // Demander à l'utilisateur de saisir cinq entiers
        System.out.println("Veuillez entrer cinq entiers :");
        for (int i = 0; i < 5; i++) {
            nombre = scanner.nextInt(); // Lecture de chaque entier
            somme += nombre;            // Ajout de l'entier à la somme
        }

        // Calcul de la moyenne
        double moyenne = (double) somme / 5;

        // Affichage de la moyenne
        System.out.println("La moyenne des cinq entiers est : " + moyenne);

        // Fermeture du scanner
        scanner.close();
    }
}
