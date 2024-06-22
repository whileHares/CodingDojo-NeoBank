package org.example.konto;

public class Sparkonto extends Konto {
    private String sparziel;
    public Sparkonto(Integer kontoNummer, Double kontostand, String kontoInhaber, String kontoArt, String sparziel) {
        super(kontoNummer, kontostand, kontoInhaber, kontoArt);
        this.sparziel = sparziel;
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

    @Override
    public void kontostandAktualisieren() {
    
        //TODO: Sparziel definieren
        //TODO: einfach getKontostand und printen
    }

    @Override
    public double checkeKontostand() {
        System.out.println(getKontostand());
        return getKontostand();
    }



    public String getSparziel() {
        return sparziel;
    }

    public void setSparziel(String sparziel) {
        this.sparziel = sparziel;
    }
}
