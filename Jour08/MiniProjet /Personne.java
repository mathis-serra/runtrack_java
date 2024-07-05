abstract class Personne {
  
    protected int identite;
    protected String nomSocial;
    protected String adresse;

    
    protected Personne(int identite, String nomSocial, String adresse) {
        this.identite = identite;
        this.nomSocial = nomSocial;
        this.adresse = adresse;
    }

    // Assesseurs (getters et setters)
    protected int getIdentite() {
        return identite;
    }

    protected void setIdentite(int identite) {
        this.identite = identite;
    }

    protected String getNomSocial() {
        return nomSocial;
    }

    protected void setNomSocial(String nomSocial) {
        this.nomSocial = nomSocial;
    }

    protected String getAdresse() {
        return adresse;
    }

    protected void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    protected void affiche() {
        System.out.println("Identité: " + identite);
        System.out.println("Nom Social: " + nomSocial);
        System.out.println("Adresse: " + adresse);
    }
}
