package fr.iut.editeur.document;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {
    private Document document;

    @BeforeEach
    void setUp() {
        document = new Document();
        document.setTexte("Bonjour tout le monde");
    }

    @Test
    void testRemplacer() {
        document.remplacer(8, 11, "tous");
        assertEquals("Bonjour tous le monde", document.getTexte(), "La méthode remplacer() ne fonctionne pas correctement.");
    }

    @Test
    void testMajuscules() {
        document.majuscules(0, 6);
        assertEquals("BONJOUR tout le monde", document.getTexte(), "La méthode majuscules() ne fonctionne pas correctement.");
    }

    @Test
    void testClear() {
        document.clear();
        assertEquals("", document.getTexte(), "La méthode clear() ne fonctionne pas correctement.");
    }

    @Test
    void testEffacer() {
        document.effacer(7, 11);
        assertEquals("Bonjour le monde", document.getTexte(), "La méthode effacer() ne fonctionne pas correctement.");
    }
}
