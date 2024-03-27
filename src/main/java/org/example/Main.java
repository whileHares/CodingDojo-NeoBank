package org.example;

import org.example.konto.Girokonto;
import org.example.konto.Konto;
import org.example.kunde.Premiumkunde;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Girokonto girokonto1 = new Girokonto(12345, 1750.20, "Test", "Girokonto", "DE380000");
        List<Konto> kontoList = new ArrayList<>();
        Premiumkunde premiumkunde1 = new Premiumkunde("PK1", "Tobias", "Rauch", "Premium",kontoList, "Visa");


        System.out.println(girokonto1.toString());



    }
}
