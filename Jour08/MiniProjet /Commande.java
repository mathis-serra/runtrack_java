import java.time.LocalDate;

class Commande {
 
    private int numeroCommande;
    private LocalDate dateCommande;
    private Client client;

   
    public Commande(int numeroCommande, String dateCommande, Client client) {
        this.numeroCommande = numeroCommande;
        this.dateCommande = LocalDate.parse(dateCommande);
        this.client = client;
    }

    
    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

   
    public void affiche() {
        System.out.println("Numéro de Commande: " + numeroCommande);
        System.out.println("Date de Commande: " + dateCommande);
        client.affiche();
    }
}
