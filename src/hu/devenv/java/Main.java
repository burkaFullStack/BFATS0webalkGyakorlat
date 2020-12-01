package hu.devenv.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Negyzet A oldala: ");
        Scanner in = new Scanner(System.in);
        Double a = in.nextDouble();
        System.out.print("\nNegyzet B oldala: ");
        Double b = in.nextDouble();

        SquareCount sc = new SquareCount();
        System.out.println("Negyzet terulete: " + Math.round(sc.count(a, b)));
    }
}
