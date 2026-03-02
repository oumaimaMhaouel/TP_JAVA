package org.example.GestionDesExceptions.CompteBancaireApp;

public sealed class CompteBancaire permits CompteCourant,CompteEpargne{
    private Long numCompte;
    private double solde;
    private String nomTitulaire;

    public CompteBancaire(Long numCompte, double solde, String nomTitulaire) {
        this.numCompte = numCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public Long getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(Long numCompte) {
        this.numCompte = numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    public void retrait(double retrait) throws FondsInsuffisantsException {
        var soldeFinal = solde - retrait;
        if (soldeFinal >= 0) {
            solde = soldeFinal;
        } else {
            throw new FondsInsuffisantsException(retrait);
        }
    }

    public void deposer(double depo) {
        if (depo > 0) {
            solde += depo;
        }
    }

    public void transfert(double amount, CompteBancaire compteBancaire) throws FondsInsuffisantsException {
        if (compteBancaire == null) {
            throw new CompteInexistantException(null);
        }
        retrait(amount);
        compteBancaire.deposer(amount);
        System.out.println("Le transfert a été effectuer avec suuccès");
    }
}
