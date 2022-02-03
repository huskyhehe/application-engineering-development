/**********************************************************************
 * Question2:
 * Write a program to check if a string has all unique characters.
 * Constraint:  only consist of lowercase English letters ('a' to 'z')
 **********************************************************************/
package solutions;

class Solution2 {
    public static void main(String[] args) {
        // Test Cases
        String str1 = "welcome";
        String str2 = "north";
        // Method 1
        System.out.println(isUnique_array(str1));
        System.out.println(isUnique_array(str2));
        // Method 2
        System.out.println(isUnique_charArray(str1));
        System.out.println(isUnique_charArray(str2));
        // Method 3
        System.out.println(isUnique_bit(str1));
        System.out.println(isUnique_bit(str2));
    }

    /*
    Method 1: create a count array
    - Time Complexity: O(n)
    - Space Complexity O(1)
     */
    public static boolean isUnique_array(String str) {
        if (str.length() <= 1)
            return true;

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            count[index] ++;
            if (count[index] > 1)
                return false;
        }
        return true;
    }

    /*
    Method 2: create a count array (for each loop)
    - Time Complexity: O(n)
    - Space Complexity O(n)
 */
    public static boolean isUnique_charArray(String str) {
        if (str.length() <= 1)
            return true;

        int[] count = new int[26];

        for (char ch : str.toCharArray()) {
            count[ch - 'a'] ++;
            if (count[ch - 'a'] > 1)
                return false;
        }
        return true;
    }


    public static boolean isUnique_bit(String str) {
        if (str.length() <= 1)
            return true;

        int checker = 0;
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0)
                return false;
                checker |= (1 << val);
            }
        return true;
    }
}
