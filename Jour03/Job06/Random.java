public class Random{
    public static void main(String[] args) {
        int[] tableau = new int[10];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * 100);
        }

        System.out.println("Tableau :");
        for (int nombre : tableau) {
            System.out.println(nombre);
        }
    }
}