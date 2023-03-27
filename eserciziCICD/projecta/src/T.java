public class T {
    private int ora;
    private int minuti;
    private int secondi;

    public T(int ora, int minuti, int secondi) {
        // Verifica che l'orario specificato sia valido
        if (ora < 0 || ora > 23 || minuti < 0 || minuti > 59 || secondi < 0 || secondi > 59) {
            throw new IllegalArgumentException("Orario non valido");
        }
        this.ora = ora;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public void setOrario(int ora, int minuti, int secondi) {
        // Verifica che l'orario specificato sia valido
        if (ora < 0 || ora > 23 || minuti < 0 || minuti > 59 || secondi < 0 || secondi > 59) {
            throw new IllegalArgumentException("Orario non valido");
        }
        this.ora = ora;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public void aggiungi(T altroOrario) {
        int oreAggiunte = 0;
        int minutiAggiunti = 0;
        int secondiAggiunti = 0;

        // Aggiunge i secondi
        int nuovoSecondo = this.secondi + altroOrario.secondi;
        if (nuovoSecondo >= 60) {
            nuovoSecondo -= 60;
            minutiAggiunti++;
        }
        secondiAggiunti = nuovoSecondo - this.secondi;

        // Aggiunge i minuti
        int nuovoMinuto = this.minuti + altroOrario.minuti + minutiAggiunti;
        if (nuovoMinuto >= 60) {
            nuovoMinuto -= 60;
            oreAggiunte++;
        }
        minutiAggiunti = nuovoMinuto - this.minuti;

        // Aggiunge le ore
        int nuovaOra = this.ora + altroOrario.ora + oreAggiunte;
        if (nuovaOra >= 24) {
            nuovaOra -= 24;
        }
        this.ora = nuovaOra;
        this.minuti = nuovoMinuto;
        this.secondi = nuovoSecondo;
    }

    public void sottrai(T altroOrario) {
        int oreSottratte = 0;
        int minutiSottratti = 0;
        int secondiSottratti = 0;

        // Sottrae i secondi
        int nuovoSecondo = this.secondi - altroOrario.secondi;
        if (nuovoSecondo < 0) {
            nuovoSecondo += 60;
            minutiSottratti++;
        }
        secondiSottratti = this.secondi - nuovoSecondo;

        // Sottrae i minuti
        int nuovoMinuto = this.minuti - altroOrario.minuti - minutiSottratti;
        if (nuovoMinuto < 0) {
            nuovoMinuto += 60;
            oreSottratte++;
        }
        minutiSottratti = this.minuti - nuovoMinuto;

        // Sottrae le ore
        int nuovaOra = this.ora - altroOrario.ora - oreSottratte;
        if (nuovaOra < 0) {
            nuovaOra += 24;
        }
        this.ora = nuovaOra;
        this.minuti = nuovoMinuto;
        this.secondi = nuovoSecondo;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.ora, this.minuti, this.secondi);
    }
}
