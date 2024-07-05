class Ligne {
    
    private Commande commande;
    private Article article;
    private int quantiteCommande;

   
    public Ligne(Commande commande, Article article, int quantiteCommande) {
        this.commande = commande;
        this.article = article;
        this.quantiteCommande = quantiteCommande;
    }

    // Accesseurs
    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQuantiteCommande() {
        return quantiteCommande;
    }

    public void setQuantiteCommande(int quantiteCommande) {
        this.quantiteCommande = quantiteCommande;
    }

    
    public void affiche() {
        System.out.println("Commande: " + commande.getNumeroCommande());
        System.out.println("Article: " + article.getReference());
        System.out.println("Quantité Commandée: " + quantiteCommande);
    }
}
