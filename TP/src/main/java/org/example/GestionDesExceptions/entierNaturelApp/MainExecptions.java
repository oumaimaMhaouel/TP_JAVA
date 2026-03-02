package org.example.GestionDesExceptions.entierNaturelApp;


public class MainExecptions {
    public static void main(String[] args)  {
        try {
            EntierNaturel entierNaturel =new EntierNaturel(12);
            System.out.println(entierNaturel.getVal());
            //entierNaturel.setVal(12-13);
            entierNaturel.setVal(1);
            System.out.println("Après modification : " + entierNaturel.getVal());

            entierNaturel.decrementer();
            System.out.println("Après décrémentation : " + entierNaturel.getVal());

            entierNaturel.decrementer();
            System.out.println("Après décrémentation : " + entierNaturel.getVal());
        }
        catch (NombreNegatifException ex){
            System.out.println("Error : " + ex.getMessage());
            ex.printStackTrace();
        }

    }
}