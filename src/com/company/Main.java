package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("do you want to continue. if you want to quit: press Q");
        String ans = input.next();

        while (!ans.equalsIgnoreCase("q")) {
            System.out.println("Enter the decimal number: ");
            int deci_Num = input.nextInt();

            int remainder;

            String hex_Deci_Num = " ";
            char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

            while (deci_Num > 0) {
                remainder = deci_Num % 16;
                hex_Deci_Num = hex[remainder] + hex_Deci_Num;
                deci_Num = deci_Num / 16;

            }
            System.out.println("Hexadecimal number is : " + hex_Deci_Num);



            System.out.println("do you want to continue. if you want to quit: press Q");
            ans = input.next();


        }
       /* // with other way
        int remainder=0;
        String hex = "";
        System.out.println(" enter a number: ");
        int number = input.nextInt();
        while (number != 0) {
            remainder = number % 16;

            if (remainder < 10) {
                hex= hex+ remainder;
            } else {
                switch (remainder) {
                    case 10:
                        hex += 'A';
                        break;
                    case 11:
                        hex += 'B';
                        break;
                    case 12:
                        hex += 'C';
                        break;
                    case 13:
                        hex += 'D';
                        break;
                    case 14:
                        hex += 'E';
                        break;
                    case 15:
                        hex += 'F';
                        break;

                }
            }
             number = number / 16;



            }


            StringBuilder sb = new StringBuilder(hex).reverse();

            System.out.println("hexadecimal number of this nimber is "+ sb);


*/
    }
}
