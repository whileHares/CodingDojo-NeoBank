package org.example.kunde;

import org.example.konto.Konto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Kunde {
    //instanzvariablen
    private String kundennummer;
    private String vorname;
    private String nachname;
    private String kundenart;

    private List<Konto> kontoList;




    //Kontruktor
    public Kunde(String kundennummer, String vorname, String nachname, String kundenart, List<Konto> kontoList) {
        if(kundennummer == null || vorname == null || nachname == null || kundenart == null || kontoList == null) {
            throw new IllegalArgumentException("Ungültige Parameter: Kundennummer, Vorname & Nachname und die Kundenart, sowie Kontolist und Kontomap dürfen nicht leer sein.");
        }
        this.kundenart = kundenart;
        this.kundennummer = kundennummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.kontoList = kontoList;
        //this.kontoMap = kontoMap;

    }

    //Methoden
    //Kontoverwaltung
    public abstract Boolean kontoErstellen(Konto konto);
    public abstract Boolean kontoKuendigen(Konto konto);
    public abstract List<Konto> getKonten();
    public abstract Konto getKontenByKontonummer(Integer kontonummer);
    public abstract Konto kontoHinzufuegenListe(Konto konto);



    //Getter und Setter

    public String getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(String kundennummer) {
        this.kundennummer = kundennummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getKundenart() {
        return kundenart;
    }

    public void setKundenart(String kundenart) {
        this.kundenart = kundenart;
    }

    public List<Konto> getKontoList() {
        return kontoList;
    }

    public void setKontoList(List<Konto> kontoList) {
        this.kontoList = kontoList;
    }

}
