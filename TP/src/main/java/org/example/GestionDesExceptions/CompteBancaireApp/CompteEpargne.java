package org.example.GestionDesExceptions.CompteBancaireApp;

public final class CompteEpargne extends CompteBancaire{
    private double tauxInteret;
    public CompteEpargne(Long numCompte, double solde, String nomTitulaire,double tauxInteret) {
        super(numCompte, solde, nomTitulaire);
        this.tauxInteret=tauxInteret;
    }

    public void appliquerInterets() {
        double interets =getSolde()*tauxInteret;
        setSolde(getSolde()+interets);
    }


}
