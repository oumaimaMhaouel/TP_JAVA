package org.example.GestionDesExceptions.entierNaturelApp;

public class NombreNegatifException  extends Exception{

    private int val;

    public NombreNegatifException(int val){
        super("La valeur "+ val+" est négative");
    }

    public int getVal() {
        return val;
    }
}
