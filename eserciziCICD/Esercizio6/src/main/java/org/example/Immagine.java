package org.example;

import java.util.Scanner;

public class Immagine extends Elemento {

    private int luminosita;

    public void brighter(Immagine immagine){
        if (immagine.luminosita >1|| immagine.luminosita <5){
            immagine.luminosita++;
        System.out.println("La luminosità è adesso di "+immagine.luminosita);}
        else if(immagine.luminosita ==0) {
            System.out.println("Luminosità al massimo");
            return;
        }
        else {
            System.out.println("Riprova");
            return;
        }
        return;
    }
    public void darker(Immagine immagine){
        if (immagine.luminosita >1|| immagine.luminosita <5){
            immagine.luminosita--;
            System.out.println("La luminosità è adesso di "+immagine.luminosita);}
        else if(immagine.luminosita ==0) {
            System.out.println("Luminosità al minimo");
            return;
        }
        else {
            System.out.println("Riprova");
            return;
        }
        return;
    }


    @Override
    public void Show() {
        super.Show();
    }

    public Immagine(int luminosita) {
        this.luminosita= luminosita;
    }
}
