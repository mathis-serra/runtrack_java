import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        // Créer un scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();
        
        // Initialiser le tableau
        int[] numbers = new int[size];
        
        // Lire les nombres dans le tableau
        System.out.println("Entrez les nombres dans le tableau :");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Capturer le temps de début
        long startTime = System.currentTimeMillis();
        
        // Calculer la somme des nombres dans le tableau
        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        // Capturer le temps de fin
        long endTime = System.currentTimeMillis();
        
        // Calculer le temps d'exécution
        long executionTime = endTime - startTime;
        
        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme totale est : " + sum);
        System.out.println("Temps d'exécution : " + executionTime + " ms");
        
        // Fermer le scanner
        scanner.close();
    }
}
