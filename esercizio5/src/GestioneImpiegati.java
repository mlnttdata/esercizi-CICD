import java.util.HashMap;
import java.util.Map;

    public class GestioneImpiegati {
        private Map<String, Impiegato> impiegati;
        private Map<String, Progetto> progetti;
        private Map<String, Dipartimento> dipartimenti;
        private Map<String, Città> città;

        public GestioneImpiegati() {
            impiegati = new HashMap<>();
            progetti = new HashMap<>();
            dipartimenti = new HashMap<>();
            città = new HashMap<>();
        }

        // Operazioni CRUD per impiegati
        public void aggiungiImpiegato(String codiceFiscale, String nome, String cognome) {
            impiegati.put(codiceFiscale, new Impiegato());
        }

        public void modificaImpiegato(String codiceFiscale, String nome, String cognome) {
            Impiegato impiegato = impiegati.get(codiceFiscale);
            if (impiegato != null) {
                impiegato.setNome(nome);
                impiegato.setCognome(cognome);
            }
        }

        public void eliminaImpiegato(String codiceFiscale) {
            impiegati.remove(codiceFiscale);
        }

        public Impiegato ricercaImpiegato(String codiceFiscale) {
            return impiegati.get(codiceFiscale);
        }

        // Operazioni CRUD per progetti
        public void aggiungiProgetto(String nome, int budget, String nomeCitta) {
            progetti.put(nome, new Progetto());
        }

        public void modificaBudgetProgetto(String nome, int budget) {
            Progetto progetto = progetti.get(nome);
            if (progetto != null) {
                progetto.setBudget(budget);
            }
        }

        public void eliminaProgetto(String nome) {
            progetti.remove(nome);
        }

        public Progetto ricercaProgetto(String nome) {
            return progetti.get(nome);
        }

        // Operazioni CRUD per dipartimenti
        public void aggiungiDipartimento(String nome, String numeroTelefono, String nomeCitta) {
            dipartimenti.put(nome, new Dipartimento());
        }

        public void modificaNumeroTelefonoDipartimento(String nome, String numeroTelefono) {
            Dipartimento dipartimento = dipartimenti.get(nome);
            if (dipartimento != null) {
                dipartimento.setNumeroTelefono(numeroTelefono);
            }
        }
        public void eliminaDipartimento(String nome) {
            dipartimenti.remove(nome);
        }

        public Dipartimento ricercaDipartimento(String nome) {
            return dipartimenti.get(nome);
        }
}