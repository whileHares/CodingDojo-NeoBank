package org.example.kunde;

import org.example.konto.Konto;

import java.util.List;
import java.util.Map;

public class Premiumkunde extends Kunde{
    private String kreditkartenArt;
    public Premiumkunde(String kundennummer, String vorname, String nachname, String kundenart, List<Konto> kontoList, String kreditkartenArt) {
        super(kundennummer, vorname, nachname, kundenart, kontoList);
        this.kreditkartenArt = kreditkartenArt;
    }

    //Methode woher das meiste Geld gekommen.
    //An welchem Tag war der Kontostand am höchsten
    @Override
    public Boolean kontoErstellen(Konto konto) {

        if(konto == null) {
            throw new IllegalArgumentException("Konto darf nicht leer sein.");
        } if(getKontoList().contains(konto)) {
            throw new IllegalArgumentException("Das Konto existiert bereits.");
        }
        getKontoList().add(konto);
        return true;
    }

    @Override
    public Boolean kontoKuendigen(Konto konto) {

        //konto leer
        if(konto == null) {
            throw new IllegalArgumentException("Konto darf nicht leer sein.");
        } //existiert nicht
        if(!getKontoList().contains(konto)) {
            throw new IllegalArgumentException("Das Konto existiert nicht.");
        }
        //entfernen aus der Liste
        getKontoList().remove(konto);
        System.out.println("Konto erfolgreich gekündigt.");
        return true;
    }

    @Override
    public List<Konto> getKonten() {
        return getKontoList();
    }

    @Override
    public Konto getKontenByKontonummer(Integer kontonummer) {
        for (Konto konto : getKontoList()) {
            if (konto.getKontoNummer().equals(kontonummer)) {
                return konto;
            }
        }
        System.out.println("Keine Übereinstimmung gefunden");
        return null;
    }

    @Override
    public Konto kontoHinzufuegenListe(Konto konto) {

        getKontoList().add(konto);
        return konto;
    }

    public String getKreditkartenArt() {
        return kreditkartenArt;
    }

    public void setKreditkartenArt(String kreditkartenArt) {
        this.kreditkartenArt = kreditkartenArt;
    }
}
