package sample;

public class Model { //inpsired by youtube and Github

    public long calculate(long number1, long number2, String operator) {
        switch (operator) {
            case "+": // setting the calculator operators
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0)
                    return 0;

                return number1 / number2;
        }

        System.out.println("Unknown - " + operator);// Exception if number exceeds parameter
        return 0;
    }
}