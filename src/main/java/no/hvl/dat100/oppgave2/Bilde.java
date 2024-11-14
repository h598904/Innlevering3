package no.hvl.dat100.oppgave2;

public class Bilde extends Tekst {

    // Objektvariabel
    private String url;

    public Bilde(int id, String bruker, String dato, String tekst, String url) {
        // Initialiserer variabler, setter likes til 0 som standard
        super(id, bruker, dato, tekst);
        this.url = url;
    }

    public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
        // Initialiserer variabler med gitt likes-verdi
        super(id, bruker, dato, likes, tekst);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "BILDE\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n" + url + "\n";
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML() {
        throw new UnsupportedOperationException("Method not implemented");
    }
}
