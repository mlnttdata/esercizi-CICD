package org.example;

public class Prova {
    public static void main(String[] args) {
        boolean bool;
        Bambino b1 = new Bambino(13, "Elena");
        Bambino b2 = new Bambino(14, "Luca");

        bool = b1.maggioreDi(b2);
        if (bool = false)
            System.out.println(b1.toString());
        else
            System.out.println(b2.toString());

    }
}