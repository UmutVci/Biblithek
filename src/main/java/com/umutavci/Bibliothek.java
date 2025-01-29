package com.umutavci;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    public List<Buch> buecher = new ArrayList<>();
    public Bibliothek(){
    }
    public void add(List<? extends Buch> buecher){
        this.buecher.addAll(buecher);
        sort();
    }

    public void sort(){
        this.buecher = this.buecher.stream().sorted(new NachDemAutorComparator()).toList();
    }

    public List<Buch> autorFind(String aut){
        return buecher.stream().filter(m -> m.autor == aut).toList();
    }
}
