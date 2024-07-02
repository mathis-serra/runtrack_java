public class Main {
    public static void main(String[] args) {
        // Création et initialisation du tableau
        int[] T = new int[10];
        for (int i = 0; i < T.length; i++) {
            T[i] = i;
        }

        // Affichage des valeurs spécifiques du tableau
        System.out.println("T[0] = " + T[0]);
        System.out.println("T[1] = " + T[1]);
        System.out.println("T[5] = " + T[5]);
        System.out.println("T[9] = " + T[9]);

        // T[10] est en dehors des limites du tableau et provoquera une exception
        try {
            System.out.println("T[10] = " + T[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("T[10] est en dehors des limites du tableau");
        }
    }
}
