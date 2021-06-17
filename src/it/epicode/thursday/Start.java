package it.epicode.thursday;

public class Start {
    public static void main(String[] args) {
        Client c = new Client("Mario", "Rossi");
        Ccorente c1 = new Ccorente(100);
        c.addAccount(c1);
        Ccorente c2 = new Ccorente(200);
        c.addAccount(c2);
        Ccorente r = c.removeCc(0);
        System.out.println(r.saldo);
        //double tot = c.getTotalCount();
        System.out.println("Total cash amount ot the Client " + c.name + " " + c.surname + " is: " + c.getTotalCount());
        Ccorente c3 = new Ccorente(1000);
        c.addAccount(c3);
        System.out.println("Total cash amount ot the Client " + c.name + " " + c.surname + " is: " + c.getTotalCount());
        c.addAccount(r);
        System.out.println("Total cash amount ot the Client " + c.name + " " + c.surname + " is: " + c.getTotalCount());
        Ccorente c4 = new Ccorente(10000);
        boolean addAccount = c.addAccount(c4);
        System.out.println(addAccount);
        System.out.println("Total cash amount ot the Client " + c.name + " " + c.surname + " is: " + c.getTotalCount());
        if (c.count[1] != null) {
            System.out.println("Cash amount: " + c.count[1].saldo);
        } else {
            System.out.println("Account n2 not found");
        }
    }
}




