package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Immagine immagine = new Immagine(4);
        immagine.brighter(immagine);
        immagine.darker(immagine);
    }
}
