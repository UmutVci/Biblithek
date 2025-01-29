package com.umutavci;

public class Gebundenebuch extends Buch{
    int seitenzahl;


    public Gebundenebuch(String name, String autor, String verlag, int preisInCents, int seitenzahl) {
        super(name, autor, verlag, preisInCents);
        this.seitenzahl = seitenzahl;
    }
}
