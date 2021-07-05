package zad1;
import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {
    private static long number = 0;
    private static final Scanner scanningInput = new Scanner(System.in);
    private static final ArrayList<Long> divisors = new ArrayList<>();

    private static void createDivisors() {
        for (long divider = 1 ; divider <= Divisors.number ; divider++ ) {
            if (Divisors.number % divider == 0) Divisors.divisors.add(divider);
        }
    }
    private static void writeResult() {
        System.out.println("Divisors of number: " + Divisors.number);

        for (int i = 0; i < Divisors.divisors.size()-1 ; i++) {
            System.out.print(Divisors.divisors.get(i) + ", ");
        }
        System.out.println(Divisors.divisors.get(Divisors.divisors.size()-1));
    }
    private static void testingNumber() {
        while (Divisors.number == 0) {
            try {
                System.out.print("Input positive natural number: ");
                String inputNumber = scanningInput.next();
                long inputNumberLong = Long.parseLong(inputNumber);
                if (inputNumberLong > 0) Divisors.number = inputNumberLong;
                else throw new NumberFormatException();
            }
            catch(NumberFormatException e){
                System.out.println("Wrong input");
            }
        }
    }

    public static void main(String[] args) {
        testingNumber();
        createDivisors();
        writeResult();
    }
}
