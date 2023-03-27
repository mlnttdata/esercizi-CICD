import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UfficioPostale ufficioPostale = new UfficioPostale();
        Lettera lettera1 = new Lettera("Mario", "Rossi", "Luca", "Verdi");
        Lettera lettera2 = new Lettera("Paolo", "Bianchi", "Luca", "Verdi");
        Lettera lettera3 = new Lettera("Francesca", "Neri", "Marco", "Gialli");
        Scanner input = new Scanner(System.in);
        ufficioPostale.aggiungiLettera(lettera1);
        ufficioPostale.aggiungiLettera(lettera2);
        ufficioPostale.aggiungiLettera(lettera3);

        System.out.println("Lettere per Luca Verdi: " + ufficioPostale.contaLetterePerDestinatario("Luca", "Verdi"));

        Lettera prossimaLettera = ufficioPostale.getProssimaLettera();
        while (prossimaLettera != null) {
            System.out.println("Prossima lettera da consegnare: " + prossimaLettera.getNomeMittente() + " " + prossimaLettera.getCognomeMittente() + " per " + prossimaLettera.getNomeDestinatario() + " " + prossimaLettera.getCognomeDestinatario());
            prossimaLettera = ufficioPostale.getProssimaLettera();

            // Inserimento delle lettere
            System.out.print("Inserire il numero di lettere da spedire: ");
            int numLettere = input.nextInt();
            input.nextLine(); // Consuma la fine linea
            for (int i = 0; i < numLettere; i++) {
                System.out.printf("Dati per la lettera %d:\n", i + 1);
                System.out.print("Nome mittente: ");
                String nomeMittente = input.nextLine();
                System.out.print("Cognome mittente: ");
                String cognomeMittente = input.nextLine();
                System.out.print("Nome destinatario: ");
                String nomeDestinatario = input.nextLine();
                System.out.print("Cognome destinatario: ");
                String cognomeDestinatario = input.nextLine();
                Lettera l = new Lettera(nomeMittente, cognomeMittente,
                        nomeDestinatario, cognomeDestinatario);
                ufficioPostale.aggiungiLettera(l);
            }

            // Prelevamento e visualizzazione della prima lettera da consegnare
            Lettera prossima = ufficioPostale.getProssimaLettera();
            System.out.printf("Prossima lettera da consegnare:\n" +
                            "Mittente: %s %s\n" +
                            "Destinatario: %s %s\n",
                    prossima.getNomeMittente(), prossima.getCognomeMittente(),
                    prossima.getNomeDestinatario(), prossima.getCognomeDestinatario());

            // Conteggio delle lettere per destinatario
            System.out.println("Conteggio lettere per destinatario:");
            System.out.print("Nome destinatario: ");
            String nomeDestinatario = input.nextLine();
            System.out.print("Cognome destinatario: ");
            String cognomeDestinatario = input.nextLine();
            int numLettereDestinatario = ufficioPostale.contaLetterePerDestinatario(nomeDestinatario, cognomeDestinatario);
            System.out.printf("Numero di lettere per %s %s: %d", nomeDestinatario, cognomeDestinatario, numLettereDestinatario);
        }

    }
}
