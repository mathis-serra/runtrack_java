import java.util.Scanner;

public class ParallelSumArray {
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
        
        // Déterminer les indices de début et de fin pour chaque thread
        int mid = size / 2;
        
        // Capturer le temps de début
        long startTime = System.currentTimeMillis();
        
        // Créer et lancer les threads
        SumThread thread1 = new SumThread(numbers, 0, mid - 1);
        SumThread thread2 = new SumThread(numbers, mid, size - 1);
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Combiner les résultats
        long totalSum = thread1.getSum() + thread2.getSum();
        
        // Capturer le temps de fin
        long endTime = System.currentTimeMillis();
        
        // Calculer le temps d'exécution
        long executionTime = endTime - startTime;
        
        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme totale est : " + totalSum);
        System.out.println("Temps d'exécution : " + executionTime + " ms");
        
        // Fermer le scanner
        scanner.close();
    }
}
