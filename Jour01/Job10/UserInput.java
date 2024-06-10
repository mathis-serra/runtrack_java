import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Veuillez entrer votre prénom : ");
        String prenom = scanner.nextLine();

     
        System.out.print("Veuillez entrer votre nom : ");
        String nom = scanner.nextLine();

    
        scanner.close();

        
        System.out.println("Bonjour, " + prenom + " " + nom + " !");
    }
}
