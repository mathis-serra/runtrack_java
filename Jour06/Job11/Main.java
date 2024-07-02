public class Main {
    public static void main(String[] args) {
        // Déclaration et initialisation de la variable pour la factorielle de 8
        int n = 8;
        int factorielle = 1;

        // Calcul de la factorielle de n
        for (int i = 1; i <= n; i++) {
            factorielle *= i; // Multiplier chaque nombre de 1 à n ensemble
        }

        // Affichage du résultat
        System.out.println("La factorielle de " + n + " est : " + factorielle);
    }
}
