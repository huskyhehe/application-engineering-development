/************************************************************
 * Question 3:
 * Write a program to check if string contains duplicates
 * Constraint: string can contain all types of characters
 ***********************************************************/
package solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution3 {
    public static void main(String[] args) {
        // Test Cases
        String str1 = "welcome";
        String str2 = "north";
        // Method 1
        System.out.println(containsDuplicate_brute(str1));
        System.out.println(containsDuplicate_brute(str2));
        // Method 2
        System.out.println(containsDuplicate_sort(str1));
        System.out.println(containsDuplicate_sort(str2));
        // Method 3
        System.out.println(containsDuplicate_set(str1));
        System.out.println(containsDuplicate_set(str2));
    }

    /*
    Method 1: Brute Force
    - Time Complexity:  O(n^2)
    - Space Complexity: O(n)
     */
    public static boolean containsDuplicate_brute(String str) {
        if (str.length() <= 1)
            return false;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return true;
            }
        }
        return false;
    }

    /*
    Method 2: Sort the charArray
    - Time Complexity: O(n log n)
    - Space Complexity:
 */
    public static boolean containsDuplicate_sort(String str) {
        if (str.length() <= 1)
            return false;

        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1])
                return true;
        }
        return false;
    }

    /*
    Method 3: Create a HashSet
    - Time Complexity: O(n)
    - Space Complexity: O(n)
     */
    public static boolean containsDuplicate_set(String str) {
        if (str.length() <= 1)
            return false;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (!set.add(str.charAt(i)))
                return true;
        }
        return false;
    }
}
