package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        Artikl a = new Artikl("Biciklo", 1000, "1");
        korpa.dodajArtikl(a);
        assertEquals(1, korpa.getBrArtikala());

    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        Artikl a = new Artikl("Biciklo", 1000, "1");
        korpa.izbaciArtiklSaKodom("1");
        assertEquals(0, korpa.getBrArtikala());
    }


    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        int cijena = korpa.dajUkupnuCijenuArtikala();
        assertEquals(2000, cijena);

    }
}