package com.umutavci;

import java.util.Comparator;

public class NachDemAutorComparator implements Comparator<Buch> {
    @Override
    public int compare(Buch o1, Buch o2) {
        return o1.autor.compareTo(o2.autor);
    }
}
