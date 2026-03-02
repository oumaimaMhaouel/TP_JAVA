package org.example.GestionDesExceptions.CompteBancaireApp;

public class FondsInsuffisantsException extends Exception{

    private int val;
    public FondsInsuffisantsException(double val){
        super("solde insufissant pour faire le retrait "+ val);
    }

    public int getVal() {
        return val;
    }
}
