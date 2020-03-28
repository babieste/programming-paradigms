package br.mackenzie.paradigms.polynomials;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class Main {

    private static final NumberFormat SIGNED_FORMAT = new DecimalFormat("+#;-#");
    private static final NumberFormat UNSIGNED_FORMAT = new DecimalFormat("#");

    public static void main(String[] args) {

        // String signed = SIGNED_FORMAT.format(-1);
        // String signedPositive = SIGNED_FORMAT.format(1);

        // String unsigned = UNSIGNED_FORMAT.format(-1);
        // String unsignedPositive = UNSIGNED_FORMAT.format(1);

        // System.out.println(signed);
        // System.out.println(signedPositive);
        // System.out.println(unsigned);
        // System.out.println(unsignedPositive);
        Client client = new Client();
        do {
            client.printMenu();
        } while(client.getMenuChoice() != 4);

    }

}
