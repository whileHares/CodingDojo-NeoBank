package org.example.konto;

import com.sun.nio.sctp.MessageInfo;

public class Kinderkonto extends Konto{
    private String vormundVorname;
    private String vormundNachname;
    public Kinderkonto(Integer kontoNummer, Double kontostand, String kontoInhaber, String kontoArt, String vormundVorname, String vormundNachname) {
        super(kontoNummer, kontostand, kontoInhaber, kontoArt);
        this.vormundNachname = vormundNachname;
        this.vormundVorname = vormundVorname;
    }

    @Override
    public void geldAuszahlen(double auszahlungsbetrag) {
        if (auszahlungsbetrag > 0 && auszahlungsbetrag <= getKontostand()) {
            setKontostand(getKontostand() - auszahlungsbetrag);
            System.out.println("Der Betrag " + auszahlungsbetrag + " wurde vom Konto abgebucht.");
            System.out.println("Dein Vormund " + getVormundVorname() + getVormundNachname() + " wurde informiert.");
        } else {
            throw new IllegalArgumentException("Ungültiger Auszahlungsbetrag.");
        }
    }

    @Override
    public void geldEinzahlen(double einzahlungsbetrag) {
        if (einzahlungsbetrag > 0) {
            setKontostand(getKontostand() + einzahlungsbetrag);
            System.out.println("Der Betrag " + einzahlungsbetrag + " wurde auf das Konto eingezahlt.");
            System.out.println("Dein Vormund " + getVormundVorname() + getVormundNachname() + " wurde informiert.");
        } else {
            throw new IllegalArgumentException("Ungültiger Einzahlungsbetrag.");
        }
    }
    //TODO: Kontostand aktualisieren. Idee ist Nach ein und Auszahlung und Zinseingang den Kontostand zu aktualiseren.
    //TODO: einfach getKontostand und printen
    //TODO: Vormund

    @Override
    public void kontostandAktualisieren() {

    }

    @Override
    public double checkeKontostand() {
        System.out.println(getKontostand());
        return getKontostand();
    }

    public String getVormundVorname() {
        return vormundVorname;
    }

    public void setVormundVorname(String vormundVorname) {
        this.vormundVorname = vormundVorname;
    }

    public String getVormundNachname() {
        return vormundNachname;
    }

    public void setVormundNachname(String vormundNachname) {
        this.vormundNachname = vormundNachname;
    }
}
