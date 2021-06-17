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
    }
}
