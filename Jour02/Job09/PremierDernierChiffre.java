public class PremierDernierChiffre {
    public static void main(String[] args) {
        int nombre = 1234;
        int dernierChiffre = nombre % 10; // Le dernier chiffre est obtenu par le reste de la division par 10

        int premierChiffre = nombre;
        // Utilisation d'une boucle pour obtenir le premier chiffre
        while (premierChiffre >= 10) {
            premierChiffre /= 10; // Division entière par 10
        }

        System.out.println("Le premier chiffre de " + nombre + " est : " + premierChiffre);
        System.out.println("Le dernier chiffre de " + nombre + " est : " + dernierChiffre);
    }
}
