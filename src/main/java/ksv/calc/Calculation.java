package ksv.calc;

import ksv.view.View;

public class Calculation {
    /**
     * Adds two numbers and decorates the result using the View class.
     *
     * @param a the first integer to be added
     * @param b the second integer to be added
     */

    public void add(int a, int b) {
        View.decorate(a, b, a + b, View.Operation.ADD);
    }

    /**
     * Subtracts two integers and decorates the result using the View class.
     *
     * @param a the first integer
     * @param b the second integer
     */
    public void subtract(int a, int b) {
        View.decorate(a, b, a - b, View.Operation.SUBTRACT);
    }

    /**
     * Multiply two integers and decorate the result using the View class.
     *
     * @param a the first integer
     * @param b the second integer
     */
    public void multiply(int a, int b) {
        View.decorate(a, b, a * b, View.Operation.MULTIPLY);
    }

    /**
     * Perform division operation and decorate the view.
     *
     * @param a The dividend
     * @param b The divisor
     */
    public void divide(int a, int b) {
        View.decorate(a, b, a / b, View.Operation.DIVIDE);
    }
}
