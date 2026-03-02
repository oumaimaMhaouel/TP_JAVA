package org.example.GestionDesExceptions.CompteBancaireApp;

public class CompteBancaireApp {

    public static void main(String[] args)  {

            CompteCourant c1 = new CompteCourant(123334545l, 500,"oumaima courant" );
            CompteEpargne c2 = new CompteEpargne(123334599l, 1000,"oumaima epargne" , 0.05);

            try {
                c1.deposer(200);
                c1.retrait(800);
                System.out.println("le solde de c1 est "+ c1.getSolde());

                c2.appliquerInterets();
                System.out.println("le solde de c2 est "+ c2.getSolde());

                // Transfert
                c2.transfert(200, c1);

                System.out.println("le solde de c1 est "+ c1.getSolde());
                System.out.println("le solde de c2 est "+ c2.getSolde());


                // Retrait impossible
                c2.retrait(2000);


        }catch (FondsInsuffisantsException exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }catch (CompteInexistantException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

}
