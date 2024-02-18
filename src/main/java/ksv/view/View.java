package ksv.view;

public class View {
    /**
     * Decorates the result of the operation with the given operands.
     *
     * @param firstOperand  the first operand
     * @param secondOperand the second operand
     * @param result        the result of the operation
     * @param operation     the operation to perform
     */
    public static void decorate(int firstOperand, int secondOperand, int result, Operation operation) {
        print("%d %s %d = %d", firstOperand, operation.symbol, secondOperand, result);
    }

    /**
     * A method to print a formatted message.
     *
     * @param message the message to be formatted and printed
     * @param args    the arguments to be inserted into the formatted message
     */
    public static void print(String message, Object... args) {
        System.out.println(String.format(message, args));

    }

    public enum Operation {
        ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/");

        private final String symbol;

        Operation(String s) {
            this.symbol = s;
        }
    }
}
