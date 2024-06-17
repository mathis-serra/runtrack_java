import java.util.Scanner;

public class ParallelCount {
    public static void main(String[] args) {
        // Créer un scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir le nombre maximum à compter
        System.out.print("Entrez le nombre maximum à compter : ");
        int maxNumber = scanner.nextInt();
        
        // Déterminer les plages de nombres pour chaque thread
        int mid = maxNumber / 2;
        
        // Capturer le temps de début
        long startTime = System.currentTimeMillis();
        
        // Créer et lancer les threads
        CountThread thread1 = new CountThread(1, mid);
        CountThread thread2 = new CountThread(mid + 1, maxNumber);
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Combiner les résultats
        long total = thread1.getSum() + thread2.getSum();
        
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
