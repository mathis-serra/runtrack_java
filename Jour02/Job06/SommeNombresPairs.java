public class SommeNombresPairs {
    public static void main(String[] args) {
        int somme = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {  // Vérifie si le nombre est pair
                somme += i;   // Ajoute le nombre pair à la somme
            }
        }
        
        System.out.println("La somme des nombres pairs de 1 à 100 est: " + somme);
    }
}
