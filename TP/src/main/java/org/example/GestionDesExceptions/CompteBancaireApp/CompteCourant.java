package org.example.GestionDesExceptions.CompteBancaireApp;

public final class CompteCourant extends CompteBancaire{
    public CompteCourant(Long numCompte, double solde, String nomTitulaire) {
        super(numCompte, solde, nomTitulaire);
    }
    @Override
    public void retrait(double retrait) throws FondsInsuffisantsException {
        setSolde(getSolde()-retrait);

    }

}
