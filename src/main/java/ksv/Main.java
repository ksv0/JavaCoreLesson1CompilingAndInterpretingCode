package ksv;

import ksv.calc.Calculation;

public class Main {
    /**
     * Main method for the Java program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        calc.add(5, 5);
        calc.subtract(5, 5);
        calc.multiply(5, 5);
        calc.divide(5, 5);
    }
}