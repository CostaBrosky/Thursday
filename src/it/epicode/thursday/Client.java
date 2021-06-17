package it.epicode.thursday;

import java.time.LocalDate;

public class Client {
    public String name;
    public String surname;
    public String cFis;
    public String phoneNumber;
    public LocalDate birthDate;
    public Ccorente[] count = new Ccorente[3];
    public boolean addAccount(Ccorente c) {
        for (int i = 0; i < count.length; i++) {
            if (count[i] == null) {
                count[i] = c;
                return true;
            }
        }
        return false;
    }

    public double getTotalCount() {
        double total = 0;
        for (int i = 0; i < count.length; i++) {
            if(count[i] != null) {
                total = total + count[i].saldo;
            }
        }
        return total;
    }

    public Ccorente removeCc(int pos) {
        Ccorente remove = count[pos];
        count[pos] = null;
        return remove;
    }

    public void wave() {
        System.out.println("Good morning, i'm " + name + " " + surname);
    }

    public boolean isMil() {
        /*
        if (birthDate.getYear() >= 2000) {
            return true;
        }
        return false; */
        return birthDate.getYear() >= 2000;
    }

    public Client() {

    }

    public Client(String name, String surname, String cFis, String phoneNumber, LocalDate birthDate, Ccorente c) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.cFis = cFis;
        this.count[0] = c;
    }

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}




// data abstraction: carateristiche che sono rilevanti per il mio problema. Creo una rappresentazione e scelgo solo caratetistiche rilevanti per il mio problema.
// quando invochi in construttore invoca heap e va a cercare uno spazio li e ne sceglie uno. Prende un area di memoria.
// non si lavora mai sui oggetti ma solo sui loro indirizzi.
// le istanze sono gli oggetti delle classi.
// instanza = oggetto.
// costruttore di default e quando non dichiariamo il parametro, quando non prende niente.
// quando una classe non deffinsce nessun costruttore, mette dentro questa classe di sua iniziativa il costruttore di default.
// costruttore di default = viene usato quando non si dichiara il costruttore di una classe.
// null = indirizzo non valido
// valore default per le booleane e false;
//