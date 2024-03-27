package org.example.konto;

import org.example.schnittstellen.Zinsberechnung;

import java.util.List;

public class Investmentkonto extends Konto implements Zinsberechnung {

    private List<String>aktienListe;
    public Investmentkonto(Integer kontoNummer, Double kontostand, String kontoInhaber, String kontoArt, List<String> aktienListe) {
        super(kontoNummer, kontostand, kontoInhaber, kontoArt);
        this.aktienListe = aktienListe;
    }

    @Override
    public void geldAuszahlen(double auszahlungsbetrag) {
        if (auszahlungsbetrag > 0 && auszahlungsbetrag <= getKontostand()) {
            setKontostand(getKontostand() - auszahlungsbetrag);
            System.out.println("Der Betrag " + auszahlungsbetrag + " wurde vom Konto abgebucht.");
        } else {
            throw new IllegalArgumentException("Ungültiger Auszahlungsbetrag.");
        }
    }

    @Override
    public void geldEinzahlen(double einzahlungsbetrag) {
        if (einzahlungsbetrag > 0) {
            setKontostand(getKontostand() + einzahlungsbetrag);
            System.out.println("Der Betrag " + einzahlungsbetrag + " wurde auf das Konto eingezahlt.");
        } else {
            throw new IllegalArgumentException("Ungültiger Einzahlungsbetrag.");
        }
    }

    //TODO: Kontostand aktualisieren. Idee ist Nach ein und Auszahlung und Zinseingang den Kontostand zu aktualiseren.
    //TODO: Aktienliste erstellen
    //TODO: einfach getKontostand und printen
    //TODO: Zinsen

    @Override
    public void kontostandAktualisieren() {

    }

    @Override
    public double checkeKontostand() {
        System.out.println(getKontostand());
        return getKontostand();
    }

    public List<String> getAktienListe() {
        return aktienListe;
    }

    public void setAktienListe(List<String> aktienListe) {
        this.aktienListe = aktienListe;
    }
}
