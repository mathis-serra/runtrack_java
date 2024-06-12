public class MonTableau {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau
        int[] monTableau = {12, 6, 76, 89};

        // Affichage des valeurs du tableau initial
        System.out.println("Valeurs initiales du tableau :");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }

        // Réassigner d'autres valeurs au tableau
        monTableau = new int[] {34, 45, 56, 67};

        // Affichage des nouvelles valeurs du tableau
        System.out.println("Nouvelles valeurs du tableau :");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }
    }
}
