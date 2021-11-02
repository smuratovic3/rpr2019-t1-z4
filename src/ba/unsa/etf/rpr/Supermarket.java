package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int velicina = 0;

    public void dodajArtikl(Artikl artikl) {
        artikli[velicina] = artikl;
        velicina++;
    }

    public int getVelicina() {
        return velicina;
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

    public Artikl[] getArtikli() {
        return artikli;
    }
}
