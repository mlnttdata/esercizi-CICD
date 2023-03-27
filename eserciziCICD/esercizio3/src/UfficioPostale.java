public class UfficioPostale {
    private Lettera[] lettere;
    private int numLettere;
    public UfficioPostale() {
        this.lettere = new Lettera[1000];
        this.numLettere = 0;
    }

    public void aggiungiLettera(Lettera lettera) {
        if (numLettere < lettere.length) {
            lettere[numLettere] = lettera;
            numLettere++;
        } else {
            System.out.println("L'ufficio postale è pieno!");
        }
    }

    public Lettera getProssimaLettera() {
        Lettera prossimaLettera = lettere[0];
        //sposta tutte le lettere di una posizione a sinistra
        for (int i = 0; i < numLettere - 1; i++) {
            lettere[i] = lettere[i+1];
        }
        //l'ultima posizione ora è vuota
        lettere[numLettere-1] = null;
        numLettere--;
        return prossimaLettera;
    }

    public int contaLetterePerDestinatario(String nomeDestinatario, String cognomeDestinatario) {
        int count = 0;
        for (int i = 0; i < numLettere; i++) {
            if (lettere[i].getNomeDestinatario().equals(nomeDestinatario)
                && lettere[i].getCognomeDestinatario().equals(cognomeDestinatario))
            {
                count++;
            }
        }
        return count;
    }

}
