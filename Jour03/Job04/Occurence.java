public class Occurence{
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


        System.out.println("Nombre d'occurrences de chaque nombre :");
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0) {
                System.out.println(i + " : " + occurrences[i]);
            }
        }
    }
}