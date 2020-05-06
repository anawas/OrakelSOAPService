package ch.abbts.sya.service;

import java.util.Random;

public class LuckySymbol {
    static String[] symbols = {
            "Kleeblatt",
            "Räppler",
            "Kaminfeger",
            "Hufeisen",
            "Schweinchen"
    };

    public static String getSymbol() {
        Random rand = new Random();
        int nr = rand.nextInt(symbols.length);
        return symbols[nr];
    }
}
