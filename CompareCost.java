package comparecost;

import java.util.Scanner;

public class CompareCost {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight and price of package 1 and 2 accordingly:");

        if (input.nextDouble() * input.nextDouble() < input.nextDouble() * input.nextDouble()) {

            System.out.println("Package 1 has a better price!");

        } else {

            System.out.println("Package 2 has a better price!");

        }
        
//        if (input.nextDouble() / input.nextDouble() > input.nextDouble() / input.nextDouble()) {
//
//            System.out.println("Package 1 has a better price!");
//
//        } else {
//
//            System.out.println("Package 2 has a better price!");
//
//        }

    }

}
