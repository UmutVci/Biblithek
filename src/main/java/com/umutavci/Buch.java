package com.umutavci;

import java.util.Iterator;

public class Buch implements IBuch{
    String name;
    public String autor;
    String verlag;
    int preisInCents;

    public Buch(String name, String autor, String verlag, int preisInCents) {
        this.name = name;
        this.autor = autor;
        this.verlag = verlag;
        this.preisInCents = preisInCents;
    }
    @Override
    public String getName(){
        return "";
    }

    @Override
    public String getAutor() {
        return "";
    }
}
