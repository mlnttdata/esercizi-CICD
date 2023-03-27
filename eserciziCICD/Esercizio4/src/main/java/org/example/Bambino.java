package org.example;

import java.util.Scanner;

public class Bambino implements Comparabile{

    private int eta;
    private String nome;

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bambino(int eta, String nome) {
        this.eta = eta;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Bambino{" +
                "eta=" + eta +
                ", nome='" + nome + '\'' +
                '}';
    }


    @Override
    public boolean maggioreDi(Bambino bambino) {

        Bambino b = (Bambino) bambino ;
        if ( this.eta > b.eta)
            return true;
        else
            return false;
    }
}
