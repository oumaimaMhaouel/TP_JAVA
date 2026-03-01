package org.example.Généricité;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produit> produits = new ArrayList<>();
        MetierProduitImpl metierProduit = new MetierProduitImpl(produits);
        boolean isActive = true;
        while (isActive) {
            System.out.println("===== Veuillez sélectionner l'opération que vous souhaitez effectuer. =====");
            System.out.println("1. Afficher la liste des produits ");
            System.out.println("2. Rechercher un produit par son id ");
            System.out.println("3. Ajouter un nouveau produit ");
            System.out.println("4. supprimer par id ");
            System.out.println("5. Quiter le programme ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    if (produits.isEmpty()) {
                        System.out.println("Aucun produits à afficher");
                    } else {
                        System.out.println(metierProduit.getAll().toString());
                    }
                    break;
                case 2:
                    System.out.println("Veuillez saisir l'id du Produit :");
                    Long id = scanner.nextLong();
                    if (id instanceof Long) {
                        Produit produit = metierProduit.findById(id);
                        if (produit != null) {
                            System.out.println(produit);
                        } else {
                            System.out.println("Le produit n'existe pas");

                        }
                    }
                    break;
                case 3:
                    System.out.println("Veuillez saisir les donneés du produit ");
                    System.out.println("id : ");
                    Long ids = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("nom : ");
                    String nom = scanner.nextLine();

                    System.out.println("marque : ");
                    String marque = scanner.nextLine();

                    System.out.println("prix : ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("description : ");
                    String description = scanner.nextLine();

                    System.out.println("nombre de stock : ");
                    double nbrStock = scanner.nextDouble();
                    scanner.nextLine();
                    Produit produit = metierProduit.findById(ids);
                    if (produit != null) {
                        System.out.println("Cet id existe !!");
                    } else {
                        Produit produitAdd = new Produit(ids, nom, marque, prix, description, nbrStock);
                        metierProduit.add(produitAdd);
                        System.out.println("Le produit a été ajouté avec succès ");
                    }
                    break;
                case 4:
                    System.out.println("Veuillez saisir les donneés du produit que vous souhaitez supprimé");
                    Long idDelete = scanner.nextLong();
                    if (idDelete instanceof Long) {
                        Produit produitDelete = metierProduit.findById(idDelete);
                        if (produitDelete != null) {
                            metierProduit.delete(idDelete);
                            System.out.println("Le produit a été supprimé avec succès ");
                        } else {
                            System.out.println("Le produit n'existe pas ");
                        }
                    }
                    break;
                case 5:
                    isActive = false;
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Erreur de système ");
            }

        }
        scanner.close();

    }
}