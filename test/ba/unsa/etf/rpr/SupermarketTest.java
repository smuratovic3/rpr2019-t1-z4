package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        Artikl a = new Artikl("Biciklo", 1000, "1");
        supermarket.dodajArtikl(a);
        assertEquals(1, supermarket.getVelicina());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket();
        Artikl a = new Artikl("Biciklo", 1000, "1");
        supermarket.dodajArtikl(a);
        supermarket.izbaciArtiklSaKodom("1");
        assertEquals(0, supermarket.getVelicina());

    }
}