public class Main {
    public static void main(String[] args) {
        // Déclaration et initialisation de la variable pour la somme
        int somme = 0;

        // Boucle pour calculer la somme des 100 premiers entiers
        for (int i = 1; i <= 100; i++) {
            somme += i; // Ajouter chaque entier à la somme
        }

        // Affichage du résultat
        System.out.println("La somme des 100 premiers entiers est : " + somme);
    }
}
