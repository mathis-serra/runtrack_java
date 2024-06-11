public class CombinaisonsDes {
    public static void main(String[] args) {
        int totalCombinaisons = 0;

        // Boucles imbriquées pour générer toutes les combinaisons possibles
        for (int de1 = 1; de1 <= 6; de1++) {
            for (int de2 = 1; de2 <= 6; de2++) {
                for (int de3 = 1; de3 <= 6; de3++) {
                    System.out.println("(" + de1 + ", " + de2 + ", " + de3 + ")");
                    totalCombinaisons++;
                }
            }
        }

        // Afficher le nombre total de combinaisons
        System.out.println("Le nombre total de combinaisons possibles est : " + totalCombinaisons);
    }
}
