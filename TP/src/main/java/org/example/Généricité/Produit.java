package org.example.Généricité;

public class Produit {

    private long id ;
    private String nom;
    private  String marque;
    private double prix;
    private String description;
    private double nbrStock;

    public Produit(long id, String nom, String marque, double prix, String description, double nbrStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nbrStock = nbrStock;
    }

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNbrStock() {
        return nbrStock;
    }

    public void setNbrStock(double nbrStock) {
        this.nbrStock = nbrStock;
    }


    @Override
    public String toString( ) {
        return "{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", nbrStock=" + nbrStock +
                '}';
    }
}
