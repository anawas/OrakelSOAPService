package ch.abbts.sya.service;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;

public class LuckyNumber {
    static Random rand = new Random();

    public static String getNumber() {
        int luckyNumber = rand.nextInt(20 ) + 1;

        return String.valueOf(luckyNumber);
    }
}
