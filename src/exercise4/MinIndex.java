package exercise4;


import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");

        int size = input.nextInt();
        double[] numbers = new double[size];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
        }
          int minIndex = 0;
          for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
              minIndex = i;
            }

          }
          System.out.println("Min index: " + minIndex);

          }


    } 