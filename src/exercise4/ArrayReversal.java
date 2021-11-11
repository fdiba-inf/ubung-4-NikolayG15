package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter size: ");

        int size = input.nextInt();
        char[] symbols = new char[size];

        System.out.println("Enter symbols: ");

        for (int index = 0; index < symbols.length; index++) {
            symbols[index] = input.next().charAt(0);
        }

        char[] reservedSymbols = new char[size];

        int reservedIndex = 0;

        for (int i = symbols.length - 1; i >= 0; i--) {
          reservedSymbols[reservedIndex] = symbols[i];
          reservedIndex++;
        }
        String reserString = Arrays.toString(reservedSymbols);
        System.out.println("Reversed symbols: " + reserString);
    }

}
