package zad2;

import java.util.ArrayList;
import java.util.List;


public class PrimeNumbers {
    private static int maxNumber;
    private static List<Integer> whatToCheck;
    private static List<Integer> primeNumbers;

    public static List<Integer> finalResult(int number) throws NumberFormatException {
        initialization(number);
        if (number < 2) throw new NumberFormatException();
        searchingPrimeNumbers();
        return primeNumbers;
    }

    private static void initialization(int number) {
        primeNumbers= new ArrayList<>();
        whatToCheck = new ArrayList<>();
        PrimeNumbers.maxNumber = number;
    }


    private static void searchingPrimeNumbers() {
        for (int i = 2; i <= maxNumber; i++) {
            if (!whatToCheck.contains(i)) {
                primeNumbers.add(i);
                testingWhatToCheck(i);
            }
        }
    }

    private static void testingWhatToCheck(int lastIterator) {
        for (int j = lastIterator*2; j <= maxNumber; j += lastIterator) {
            if (!whatToCheck.contains(j)) whatToCheck.add(j);
        }
    }
}
