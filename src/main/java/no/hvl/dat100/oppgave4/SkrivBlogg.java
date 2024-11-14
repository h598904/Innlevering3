package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        try {
            // Definerer filbanen
            File file = new File(mappe, filnavn);
            
            // Oppretter PrintWriter for å skrive til fil
            PrintWriter writer = new PrintWriter(file);
            
            // Skriver innholdet fra samlingen til filen
            writer.print(samling.toString());
            
            // Lukker skrivingen til fil
            writer.close();
            
            return true;
        } catch (FileNotFoundException e) {
            // Håndterer filunntak ved å returnere false
            System.out.println("Fil ikke funnet: " + e.getMessage());
            return false;
        }
    }
}
