package org.example.Esercizio2;

import java.util.ArrayList;

public class Corso {
    private Esame[] esami;
    public Corso(Esame[] esami) {
     this.esami = esami;
    }


    public int votoMinimo() {
 int min = Integer.MAX_VALUE;
        for (Esame e : esami) {
            if (e.getVoto() < min) {
            min = e.getVoto();
 }
 }
return min;
    }



    public String[] studentiPeggiori() {
        int min = votoMinimo();
        ArrayList<String> studenti = new ArrayList<>();
        for (Esame e : esami) {
        if (e.getVoto() == min) {
        studenti.add(e.getCognome());
    }
 }
        String[] result = new String[studenti.size()];
        result = studenti.toArray(result);
        return result;
    }
}
