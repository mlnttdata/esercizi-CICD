public class Main {
    public static void main(String[] args) {
        T orarioIniziale = new T(12, 30, 0);
        System.out.println(orarioIniziale);
        orarioIniziale.setOrario(8, 15, 45);
        System.out.println(orarioIniziale);
        T orarioSottratto = new T(2, 44, 15);
        orarioIniziale.sottrai(orarioSottratto);
        System.out.println(orarioIniziale);
}
}