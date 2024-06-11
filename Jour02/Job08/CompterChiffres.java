import java.util.Scanner;

public class CompterChiffres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int numero = scanner.nextInt();
        
        // Convertir le nombre en chaîne de caractères pour compter les chiffres
        String numeroStr = Integer.toString(numero);
        int nombreDeChiffres = numeroStr.length();
        
        System.out.println("Le nombre de chiffres dans " + numero + " est : " + nombreDeChiffres);
        
        scanner.close();
    }
}
