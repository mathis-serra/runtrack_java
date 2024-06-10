import java.util.Scanner;

public class StringSwap {
    public static void main(String[] args) {
        // Création d'un scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande de la première chaîne de caractères à l'utilisateur
        System.out.print("Veuillez entrer la première chaîne de caractères : ");
        String chaine1 = scanner.nextLine();

        // Demande de la deuxième chaîne de caractères à l'utilisateur
        System.out.print("Veuillez entrer la deuxième chaîne de caractères : ");
        String chaine2 = scanner.nextLine();

        // Fermeture du scanner
        scanner.close();

        // Affichage des valeurs avant l'échange
        System.out.println("Avant l'échange :");
        System.out.println("chaine1: " + chaine1);
        System.out.println("chaine2: " + chaine2);

        // Échange des valeurs sans utiliser de variable supplémentaire
        chaine1 = chaine1 + chaine2;
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());
        chaine1 = chaine1.substring(chaine2.length());

        // Affichage des valeurs après l'échange
        System.out.println("Après l'échange :");
        System.out.println("chaine1: " + chaine1);
        System.out.println("chaine2: " + chaine2);
    }
}
