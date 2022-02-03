/************************************************************************
 * Question 6:
 * Write a program to calculate the monthly telephone bills as per the following rule:
 * Minimum $ 200 for up to 100 calls.
 * Plus $ 0.60 per call for next 50 calls.
 * Plus $ 0.50 per call for next 50 calls.
 * Plus $ 0.40 per call for any call beyond 200 calls.
 * Use Switch Statement in the function.
 ************************************************************************/
package solutions;

import java.util.Scanner;

class Solution6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of calls: ");
        int call = scanner.nextInt();
        System.out.println("Your monthly bill is: $ " + calculateTelephoneBill(call));
    }

    public static double calculateTelephoneBill(int call) {
        double bill = 0;
        int level = (call > 100 ? 1:0) + (call > 150 ? 1:0) + (call > 200 ? 1:0);

        switch (level) {
            case 0:
                bill = 200;
                break;
            case 1:
                bill = 200 + (call - 100) * 0.6;
                break;
            case 2:
                bill += 200 + 50 * 0.6 + (call - 150) * 0.5;
                break;
            case 3:
                bill += 200 + 50 * 0.6 + 50 * 0.5 + (call - 200) * 0.4;
                break;
            default:
                bill = 0;
        }
        return bill;
    }
}
