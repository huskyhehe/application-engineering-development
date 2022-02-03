/******************************************************************
 * Question 8 :
 * Write a program that prompts the user’s grade.
 * Your program should display the corresponding meaning of grade
 * as per the following table
 * Grade            Meaning
 *   A              Excellent
 *   B              Good
 *   C              Average
 *   D              Deficient
 *   F              Failing
 ******************************************************************/
package solutions;

import java.util.Scanner;

class Solution8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        String grade = scanner.next();
        displayGradeMeaning(grade);
    }

    public static void displayGradeMeaning(String grade) {
        String meaning;
        switch (grade) {
            case "A":
                meaning = "Excellent";
                break;
            case "B":
                meaning = "Good";
                break;
            case "C":
                meaning = "Average";
                break;
            case "D":
                meaning = "Deficient";
                break;
            case "F":
                meaning = "Failing";
                break;
            default:
                meaning = "Invalid Grade";
        }
        System.out.println(meaning);
    }
}
