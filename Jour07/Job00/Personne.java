public class Personne {
    // Attributs publics
    public String nom;
    public String prénom;
    
    // Attributs protégés
    protected String dateNaissance;
    protected String lieuNaissance;
    
    // Attributs privés
    private String adresse;
    private String téléphone;
    
    // Constructeur
    public Personne(String nom, String prénom, String dateNaissance, String lieuNaissance,
                    String adresse, String téléphone) {
        this.nom = nom;
        this.prénom = prénom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.adresse = adresse;
        this.téléphone = téléphone;
    }
    
    // Getters et Setters pour les attributs privés
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTéléphone() {
        return téléphone;
    }

    public void setTéléphone(String téléphone) {
        this.téléphone = téléphone;
    }
}
