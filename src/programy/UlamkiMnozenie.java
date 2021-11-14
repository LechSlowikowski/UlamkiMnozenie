package programy;

public class UlamkiMnozenie {
    private int licznik1;
    private int mianownik1;
    private int licznik2;
    private int mianownik2;
    private int iloczynLicznik;
    private int iloczynMianiownik;

    /********************************************************
     * nazwa funkcji: UlamkiMnozenie
     * parametry wejściowe: licznik1 - licznik ułamka pierwszego
     *                      mianiownik1 - mianownik ułamka pierwszego
     *                      licznik2 - licznik ułamka drugiego
     *                      int mianiownik2 - mianownik ułamka  drugiego
     * wartość zwracana: brak
     * opis: konstruktor klasy mnożącej ułamk
     * autor: 34567890123
     * ****************************************************/
    public UlamkiMnozenie(int licznik1, int mianiownik1, int licznik2, int mianiownik2) {
        this.licznik1 = licznik1;
        this.mianownik1 = mianiownik1;
        this.licznik2 = licznik2;
        this.mianownik2 = mianiownik2;
    }


    /********************************************************
     * nazwa funkcji: obliczNWD
     * parametry wejściowe: a - pierwsza liczba
     *                      b - druga liczba*
     * wartość zwracana: największy wspólny dzielnik liczb a i b
     * opis: oblicza największy wspólny dzielnik liczb a i b
     * autor: 34567890123
     * ****************************************************/
    private int obliczNWD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    /********************************************************
     * nazwa funkcji: przemnozUlamki
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: przemnaża dwa ułamki zwykłe
     * autor: 34567890123
     * ****************************************************/
    public void przemnozUlamki() {
        iloczynLicznik = licznik1 * licznik2;
        iloczynMianiownik = mianownik1 * mianownik2;
        int nwd = obliczNWD(iloczynLicznik, iloczynMianiownik);
        iloczynLicznik = iloczynLicznik / nwd;
        iloczynMianiownik = iloczynMianiownik / nwd;
    }

    /********************************************************
     * nazwa funkcji: getIloczynLicznik
     * parametry wejściowe: brak
     * wartość zwracana: licznik ułamka będącego wynikiem mnożenia
     * opis: zwraca licznik ułamka będącego wynikiem mnożenia
     * autor: 34567890123
     * ****************************************************/
    public int getIloczynLicznik() {
        return iloczynLicznik;
    }

    /********************************************************
     * nazwa funkcji: getIloczynMianiownik
     * parametry wejściowe: brak
     * wartość zwracana: mianownik ułamka będącego wynikiem mnożenia
     * opis: zwraca mianownik ułamka będącego wynikiem mnożenia
     * autor: 34567890123
     * ****************************************************/
    public int getIloczynMianiownik() {
        return iloczynMianiownik;
    }

}