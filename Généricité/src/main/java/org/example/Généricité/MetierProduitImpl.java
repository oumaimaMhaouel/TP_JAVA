package org.example;

import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {

    private List<Produit> produits;

    public MetierProduitImpl(List<Produit> produits) {
        this.produits = produits;
    }

    @Override
    public void add(Produit o) {
        produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }

    @Override
    public Produit findById(long o) {
        return produits.stream().filter(element -> element.getId() == o).findFirst().orElse(null);
    }

    @Override
    public void delete(long id) {
        Produit produit = produits.stream().filter(element -> element.getId() == id).findFirst().orElse(null);
        if (produit != null) {
            produits.remove(produit);
        }
    }

    @Override
    public String toString() {
        String element = "";
        for (int i = 0; i < produits.size(); i++) {
            element+= "Produit : " + i + " -> " + produits.get(i);
        }
        return  element;
    }
}
