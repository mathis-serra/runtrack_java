public class Facture {
    public static void main(String[] args) {
        double prixHT = 49.99;
        int quantite = 3;
        double tva = 0.2;
        double prixTTC = (prixHT * quantite) * (1 + tva);
        System.out.println("Le prix HT est de " + prixHT + " et le prix TTC est de " + prixTTC);
    }
}