package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl[] artikli = new Artikl[50];
    private int velicina = 0;
    private int brArtikala = 0;

    public Korpa() {

    }

    public boolean dodajArtikl(Artikl a) {
        if (velicina >= 50) return false;
        artikli[velicina] = a;
        velicina++;
        brArtikala++;
        return true;
    }

    public int getBrArtikala() {
        return brArtikala;

    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < velicina; i++) {
            if (artikli[i].getKod().equals(kod)) {
                Artikl izbaci = artikli[i];
                artikli[i] = null;
                System.arraycopy(artikli, i + 1, artikli, i, velicina - i);
                velicina--;
                return izbaci;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for (int i = 0; i < velicina; i++) {
            ukupnaCijena += artikli[i].getCijena();
        }
        return ukupnaCijena;
    }
}
