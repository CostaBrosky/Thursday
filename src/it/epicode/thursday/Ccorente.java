package it.epicode.thursday;

public class Ccorente {
    public double saldo;
    public Ccorente(double saldo) {
        this.saldo = saldo;
    }
    public double deposit(double vers) {
        saldo = saldo + vers;
        return saldo;
    }
    public double withdraw(double prel) {
        saldo = saldo - prel;
        return saldo;
    }
}
