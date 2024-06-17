import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GenerateRandomString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez la longueur de la chaîne de caractères aléatoire à générer : ");
        int longueur = scanner.nextInt();
        
        long startTime = System.currentTimeMillis();
        
        // Générer la chaîne de caractères aléatoire
        String randomString = generateRandomString(longueur);
        
        // Écrire la chaîne dans le fichier "output.txt" en utilisant deux threads
        try (FileWriter writer = new FileWriter("output.txt")) {
            int mid = longueur / 2;
            
            WriteHalfThread thread1 = new WriteHalfThread(randomString, 0, mid, writer);
            WriteHalfThread thread2 = new WriteHalfThread(randomString, mid, longueur, writer);
            
            thread1.start();
            thread2.start();
            
            thread1.join();
            thread2.join();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        
        System.out.println("La chaîne de caractères aléatoire a été écrite dans 'output.txt'.");
        System.out.println("Temps d'exécution : " + executionTime + " ms");
        
        scanner.close();
    }
    
    // Méthode pour générer une chaîne de caractères aléatoire
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        
        return sb.toString();
    }
}
