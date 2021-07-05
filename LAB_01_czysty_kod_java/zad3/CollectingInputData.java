package zad3;

import java.util.Scanner;

public class CollectingInputData {
    private static final Scanner scanner = new Scanner(System.in);

    public static double inputData(String nameOfVariable, double min, double max) {
        double valueOfInputData;
        while (true) {
            System.out.print(nameOfVariable + ": ");
            valueOfInputData = scanner.nextDouble();
            if (valueOfInputData >= min && valueOfInputData <= max) {
                break;
            }
            System.out.println("Enter the value between " + min + " and " + max + ".");
        }
        return valueOfInputData;
    }
}

