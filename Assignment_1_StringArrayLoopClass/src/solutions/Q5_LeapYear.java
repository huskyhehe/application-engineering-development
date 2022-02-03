/**********************************************************************
 * Question 5:
 * Write a program to determine whether the year is a leap year or not.
 * Leap Years are any year that can be evenly divided by 4.
 * A year that is evenly divisible by 100 is a leap year
 * only if it is also evenly divisible by 400.
 ******************************************************************** */
package solutions;

class Solution5 {
    public static void main(String[] args) {
        // Test Cases
        int case1 = 1900;
        int case2 = 2024;
        System.out.println(isLeapYear(case1));
        System.out.println(isLeapYear(case2));
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
