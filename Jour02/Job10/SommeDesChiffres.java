public class SommeDesChiffres {
    public static void main(String[] args) {
        int nombre = 1234;
        int somme = 0;
        
        // Utilisation d'une boucle pour additionner tous les chiffres
        while (nombre != 0) {
            somme += nombre % 10;  // Ajouter le dernier chiffre à la somme
            nombre /= 10;          // Retirer le dernier chiffre du nombre
        }
        
        System.out.println("La somme des chiffres est : " + somme);
    }
}
