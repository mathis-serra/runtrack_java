import java.util.Scanner;

public class TableDeMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un chiffre: ");
        int nombre = scanner.nextInt();
        
        System.out.println("Table de multiplication de " + nombre + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + " x " + i + " = " + (nombre * i));
        }
        
        scanner.close();
    }
}
