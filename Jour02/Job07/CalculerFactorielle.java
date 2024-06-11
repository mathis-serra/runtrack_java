import java.util.Scanner;

public class CalculerFactorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int nombre = scanner.nextInt();
        
        long factorielle = 1; // Utilisation de long pour éviter le dépassement pour des grands nombres
        
        for (int i = 1; i <= nombre; i++) {
            factorielle *= i;
        }
        
        System.out.println("La factorielle du nombre " + nombre + " est : " + factorielle);
        
        scanner.close();
    }
}
