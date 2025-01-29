package com.umutavci;

public class Hoerbuch extends Buch{
    String sprecher;
    int spieldauer;

    public Hoerbuch(String name, String autor, String verlag, int preisInCents, String sprecher, int spieldauer){
        super(name, autor, verlag, preisInCents);
        this.spieldauer = spieldauer;
        this.sprecher = sprecher;
    }
}
