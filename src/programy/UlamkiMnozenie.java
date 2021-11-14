package programy;

public class UlamkiMnozenie {

    private int licznik1;
    private int mianownik1;
    private int licznik2;
    private int mianownik2;
    private int iloczynLicznik;
    private int iloczynMianiownik;

    public UlamkiMnozenie(int licznik1, int mianiownik1, int licznik2, int mianiownik2) {
        this.licznik1 = licznik1;
        this.mianownik1 = mianiownik1;
        this.licznik2 = licznik2;
        this.mianownik2 = mianiownik2;
    }

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

    public void przemnozUlamki() {

        iloczynLicznik = licznik1 * licznik2;
        iloczynMianiownik = mianownik1 * mianownik2;
        int nwd = obliczNWD(iloczynLicznik, iloczynMianiownik);
        iloczynLicznik = iloczynLicznik / nwd;
        iloczynMianiownik = iloczynMianiownik / nwd;

    }

    public int getIloczynLicznik() {
        return iloczynLicznik;
    }

    public int getIloczynMianiownik() {
        return iloczynMianiownik;
    }

}