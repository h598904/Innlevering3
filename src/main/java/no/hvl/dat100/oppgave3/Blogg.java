package no.hvl.dat100.oppgave3;

import no.hvl.dat100.oppgave1.Innlegg;

public class Blogg {

    // Objektvariable
    private Innlegg[] innleggtabell;
    private int nesteledig;

    // Standardkonstruktør som setter tabellstørrelsen til 20
    public Blogg() {
        this.innleggtabell = new Innlegg[20];
        this.nesteledig = 0;
    }

    // Konstruktør der lengden på tabellen blir satt ved parameter
    public Blogg(int lengde) {
        this.innleggtabell = new Innlegg[lengde];
        this.nesteledig = 0;
    }

    // Returnerer antall innlegg som er lagret i tabellen
    public int getAntall() {
        return nesteledig;
    }

    // Returnerer en peker til tabellen av innlegg-objekt
    public Innlegg[] getSamling() {
        return innleggtabell;
    }

    // Returnerer indeksen for et innlegg med samme id, eller -1 om det ikke finnes
    public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
    }

    // Sjekker om et innlegg med samme id finnes i samlingen
    public boolean finnes(Innlegg innlegg) {
        return finnInnlegg(innlegg) != -1;
    }

    // Returnerer true om det er ledig plass i samlingen
    public boolean ledigPlass() {
        return nesteledig < innleggtabell.length;
    }

    // Legger til et nytt innlegg hvis det har en unik id, og det er ledig plass
    public boolean leggTil(Innlegg innlegg) {
        if (!finnes(innlegg) && ledigPlass()) {
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        }
        return false;
    }

    // Returnerer en strengrepresentasjon av innholdet i tabellen
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nesteledig).append("\n");
        for (int i = 0; i < nesteledig; i++) {
            sb.append(innleggtabell[i].toString());
        }
        return sb.toString();
    }

    // valgfrie oppgaver nedenfor

    public void utvid() {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public boolean leggTilUtvid(Innlegg innlegg) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public boolean slett(Innlegg innlegg) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    public int[] search(String keyword) {
        throw new UnsupportedOperationException("Method not implemented");
    }
}
