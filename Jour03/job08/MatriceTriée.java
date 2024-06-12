import java.util.Arrays;

public class MatriceTriée {
    public static void main(String[] args) {
        // Déclaration et initialisation de la matrice
        int[][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };

        // Affichage de la matrice originale
        System.out.println("Matrice originale :");
        afficherMatrice(tableau);

        // Aplatir la matrice en une seule liste
        int[] listeAplatir = new int[tableau.length * tableau[0].length];
        int index = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                listeAplatir[index++] = tableau[i][j];
            }
        }

        // Trier la liste
        Arrays.sort(listeAplatir);

        // Reformater la matrice à partir de la liste triée
        index = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = listeAplatir[index++];
            }
        }

        // Affichage de la matrice triée
        System.out.println("Matrice triée :");
        afficherMatrice(tableau);
    }


    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
