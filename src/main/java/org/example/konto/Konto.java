package org.example.konto;

import java.util.List;

public  abstract class Konto {
    /*
    * Erstellung einer abstrakten Klasse Konto. Diese Klasse dient als Grundlage für alle anderen Konten und besitzt Eigenschaften die jedes Konto haben muss.
    * Zusätzlich werden Instanzvariablen final gesetzt, da diese während der Laufzeit nicht mehr veränderbar sind wie Kontonummer oder Inhaber.
    * Es wurde auch schon ein Konstruktor erstellt und abstrakte Methoden, die jede andere Konto-Klasse implementieren und überschreiben muss.
    * Instanzvariablen werden doch nicht final gesetzt sondern erst in der Konkreten Klasse
    * */
    private Integer kontoNummer;
    private Double kontostand;
    private String kontoInhaber;
    private String kontoArt;

    public Konto(Integer kontoNummer, Double kontostand, String kontoInhaber, String kontoArt){
        if(kontoNummer == null || kontostand == null || kontoInhaber == null || kontoArt == null) {
            throw new IllegalArgumentException("Ungültige Parameter : Kontonummer, Kontostand, Kontoinhaber und Kontoart dürfen nicht leer sein.");
        }
        this.kontostand = kontostand;
        this.kontoInhaber = kontoInhaber;
        this.kontoNummer = kontoNummer;
        this.kontoArt = kontoArt;
    }


    /*Methode um Geld vom Konto auszuzahlen*/
    public abstract void geldAuszahlen(double auszahlungsbetrag);

    /*Methode um Geld auf das Konto einzuzahlen*/
    public abstract void geldEinzahlen(double einzahlungsbetrag);

    /*Methode um den Kontostand nach Transaktionen zu aktualisieren*/
    public abstract void kontostandAktualisieren();

    /*Ausgabe des aktuellen Kontostandes*/
    public abstract double checkeKontostand();


    //TODO: Überarbeitung der abstrakten Methoden bzgl. der Methodensignatur für die Übergabe der Parameter.

    public Integer getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer(Integer kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public Double getKontostand() {
        return kontostand;
    }

    public void setKontostand(Double kontostand) {
        this.kontostand = kontostand;
    }

    public String getKontoInhaber() {
        return kontoInhaber;
    }

    public void setKontoInhaber(String kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
    }

    public String getKontoArt() {
        return kontoArt;
    }

    public void setKontoArt(String kontoArt) {
        this.kontoArt = kontoArt;
    }
}
