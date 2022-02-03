/*************************************************
 * Question 1:
 * Write a program find if String is Palindrome
 ************************************************/

/************************************************************************************
 * Tings need to be clarified:
 * Does the palindrome need to a "strict palindrome"?
 *    If yes,
 *         it reads the same forward and backward without any converting or removing
 *         See Method 1 and Method 3;
 *    If no,
 *         after converting all uppercase letters into lowercase letters and
 *         removing all non-alphanumeric characters,
 *         it reads the same forward and backward.
 *         See Method 2 and Method 4
 ************************************************************************************/
package solutions;

class Solution1 {
    public static void main(String[] args) {
        // Test Cases
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "bnb";

        // Method 1
        System.out.print("Strict Mode: ");
        System.out.print(isStrictPalindrome_reverse(str1) + ", ");
        System.out.println(isStrictPalindrome_reverse(str2));
        // Method 2
        System.out.print("Normal Mode: ");
        System.out.print(isPalindrome_reverse(str1) + ", ");
        System.out.println(isPalindrome_reverse(str2));

        // Method 3
        System.out.print("Strict Mode: ");
        System.out.print(isStrictPalindrome_pointers(str1) + ", ");
        System.out.println(isStrictPalindrome_pointers(str2));
        // Method 4
        System.out.print("Normal Mode: ");
        System.out.print(isPalindrome_pointers(str1) + ", ");
        System.out.println(isPalindrome_pointers(str2));
    }

    /*
    Method 1: create a StringBuilder and reverse (strict)
    - Time Complexity: O(n)
    - Space Complexity: O(n)
     */
    public static boolean isStrictPalindrome_reverse(String str) {
        if (str.length() <= 1)
            return true;
        StringBuilder sb = new StringBuilder(str);
        return sb.toString().equals(sb.reverse().toString());
    }


    /*
    Method 2: create a StringBuilder and reverse
    - Time Complexity: O(n)
    - Space Complexity: O(n)
     */
    public static boolean isPalindrome_reverse(String str) {
        if (str.length() <= 1)
            return true;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i ++) {
            if (Character.isLetterOrDigit(str.charAt(i)))
                sb.append(Character.toLowerCase(str.charAt(i)));
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    /*
    Method 3: two pointers (strict)
     - Time Complexity: O(n)
     - Space Complexity: O(1)
 */
    public static boolean isStrictPalindrome_pointers(String str) {
        if (str.length() <= 1)
            return true;

        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left ++;
                right --;
            }
        }
        return true;
    }

    /*
    Method 4: two pointers
     - Time Complexity: O(n)
     - Space Complexity: O(1)
     */
    public static boolean isPalindrome_pointers(String str) {
        if (str.length() <= 1)
            return true;

        int left = 0, right = str.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left)))
                left ++;
            while (left < right && !Character.isLetterOrDigit(str.charAt(right)))
                right --;

            if (left < right) {
                if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right)))
                    return false;
                else {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
}
