class Client extends Personne {
    // Attribut privé
    private double chiffreAffaire;

    // Constructeur paramétré
    public Client(int identite, String nomSocial, String adresse, double chiffreAffaire) {
        super(identite, nomSocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

    // Accesseurs pour chiffreAffaire
    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    // Redéfinition de la méthode affiche
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Chiffre d'Affaires: " + chiffreAffaire);
    }
}
