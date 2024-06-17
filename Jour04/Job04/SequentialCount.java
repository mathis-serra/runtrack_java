import java.util.Scanner;

public class SequentialCount {
    public static void main(String[] args) {
        // Créer un scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir le nombre maximum à compter
        System.out.print("Entrez le nombre maximum à compter : ");
        int maxNumber = scanner.nextInt();
        
        // Capturer le temps de début
        long startTime = System.currentTimeMillis();
        
        // Initialiser une variable pour stocker le total
        long total = 0;
        
        // Compter de 1 jusqu'au nombre maximum
        for (int i = 1; i <= maxNumber; i++) {
            total += i;
        }
        
        // Capturer le temps de fin
        long endTime = System.currentTimeMillis();
        
        // Calculer le temps d'exécution
        long executionTime = endTime - startTime;
        
        // Afficher le compte total et le temps d'exécution
        System.out.println("Le compte total est : " + total);
        System.out.println("Temps d'exécution : " + executionTime + " ms");
        
        // Fermer le scanner
        scanner.close();
    }
}
