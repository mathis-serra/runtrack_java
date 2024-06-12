public class ValeurUnique {
    public static void main(String[] args) {
        int[] tableau = {3, 7, 3, 9, 8};

        int valeurMax = 0;
        for (int nombre : tableau) {
            if (nombre > valeurMax) {
                valeurMax = nombre;
            }
        }

        int[] occurrences = new int[valeurMax + 1];

        for (int nombre : tableau) {
            occurrences[nombre]++;
        }

        System.out.println("Valeurs uniques du tableau :");
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] == 1) {
                System.out.println(i);
            }
        }
    }
}