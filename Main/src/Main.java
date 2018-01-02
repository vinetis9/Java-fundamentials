/**
 * Created by ma on 2018-01-02.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        }
        else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {


            return false;
    }

    private double getArgument() {

        Scanner argument = new Scanner(System.in);
        int arg = argument.nextInt();

        return arg; 
    }

}

