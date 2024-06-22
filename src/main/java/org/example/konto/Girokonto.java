package org.example.konto;

import org.example.schnittstellen.Unterkonten;
import org.example.schnittstellen.Zinsberechnung;

public class Girokonto extends Konto implements Unterkonten, Zinsberechnung {
    private String iban;
    public Girokonto(Integer kontoNummer, Double kontostand, String kontoInhaber, String kontoArt, String iban) {
        super(kontoNummer, kontostand, kontoInhaber, kontoArt);
        this.iban = iban;
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
  
    //TODO: Zinsen und Unterkonten
    //TODO: einfach getKontostand und printen

    @Override
    public void kontostandAktualisieren() {

    }

    @Override
    public double checkeKontostand() {
        System.out.println(getKontostand());
        return getKontostand();
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
