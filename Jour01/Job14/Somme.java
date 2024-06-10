public class Somme {
    // Méthode qui calcule et affiche la somme de deux nombres
    public static void calculerSomme(int nombre1, int nombre2) {
        int somme = nombre1 + nombre2;
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est : " + somme);
    }

    public static void main(String[] args) {
        // Vérification que deux arguments ont été passés
        if (args.length < 2) {
            System.out.println("Veuillez fournir deux nombres en paramètres.");
            return;
        }

        try {
            // Conversion des arguments de chaîne de caractères en entiers
            int nombre1 = Integer.parseInt(args[0]);
            int nombre2 = Integer.parseInt(args[1]);

            // Calcul et affichage de la somme
            calculerSomme(nombre1, nombre2);
        } catch (NumberFormatException e) {
            System.out.println("Veuillez entrer des valeurs entières valides.");
        }
    }
}
