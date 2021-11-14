package programy;

import java.util.Scanner;

public class Main {
    private static int licznik1;
    private static int mianownik1;
    private static int licznik2;
    private static int mianownik2;

    /********************************************************
     * nazwa funkcji: wczytaj
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: wczytyje liczniki i mianowniki przemnażanych ułamków
     * autor: 34567890123
     * ****************************************************/
    public static void wczytaj() {
        Scanner daneWejsciowe = new Scanner(System.in);
        System.out.print("Podaj licznik1: ");
        licznik1 = daneWejsciowe.nextInt();

        System.out.print("Podaj mianiownik1: ");
        mianownik1 = daneWejsciowe.nextInt();

        System.out.print("Podaj licznik2: ");
        licznik2 = daneWejsciowe.nextInt();

        System.out.print("Podaj mianiownik2: ");
        mianownik2 = daneWejsciowe.nextInt();
    }

    /********************************************************
     * nazwa funkcji: main
     * parametry wejściowe: args - tablica parametrów uruchomienia
     * wartość zwracana: brak
     * opis: główna metoda uruchomieniowa programu
     * autor: 34567890123
     * ****************************************************/
    public static void main(String[] args) {
        // write your code here
        wczytaj();

        UlamkiMnozenie ulamkiMnozenie = new UlamkiMnozenie(licznik1, mianownik1, licznik2, mianownik2);
        ulamkiMnozenie.przemnozUlamki();

        int iloczynLicznik = ulamkiMnozenie.getIloczynLicznik();
        int iloczynMianownik = ulamkiMnozenie.getIloczynMianiownik();

        System.out.println(licznik1 + "/" + mianownik1 + " * " + licznik2 + "/" + mianownik2 + " = " + iloczynLicznik + "/" + iloczynMianownik);

    }
}
