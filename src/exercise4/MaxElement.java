package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size: ");

        int size = input.nextInt();
        double[] numbers = new double[size];

        System.out.println("Enter numbers: ");
        for(int index = 0; index < numbers.length; index++){
            numbers[index] = input.nextDouble();
        }

        double maxNumber = numbers[0];
        for(int i = 0; i < numbers.length; i++){
          if(numbers[i] > maxNumber){
            maxNumber = numbers[i];
          }
        }
        
        System.out.println("Max number:" + maxNumber);
    }

}
