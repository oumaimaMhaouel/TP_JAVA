package org.example.GestionDesExceptions.CompteBancaireApp;

public class CompteInexistantException extends Error {
    private CompteBancaire compteBancaire;

    public CompteInexistantException(CompteBancaire compteBancaire) {
        super("Compte inexistant " + compteBancaire);
        this.compteBancaire = compteBancaire;
    }

    public CompteBancaire getCompteBancaire() {
        return compteBancaire;
    }
}
