package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int size = input.nextInt();

        int[] numbers = new int[size];

        
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Numbers: " + numbersAsString);
    }

}