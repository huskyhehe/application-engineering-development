/****************************************************************************
 * Question 4:
 * Write a program to check if two strings are anagrams.
 * Anagrams are strings which can be made by rearranging characters in string.
 ****************************************************************************/

/*****************************************************************
 * Things need to be clarified:
 *     Do strings only consist of lowercase of English letters?
 *         If yes, see Method 1 and Method 2.
 *         If no, see Method 3 and Method 4.
 *****************************************************************/
package solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution4 {
    public static void main(String[] args) {
        // Test Case
        String a = "leetcode";
        String b = "ocedeelt";

        //Method 1
        System.out.println(isAnagram(a,b));
        //Method 2
        System.out.println(isAnagram_charArray(a,b));
        //Method 3
        System.out.println(isAnagram_sort(a,b));
        //Method 4
        System.out.println(isAnagram_hashMap(a,b));
    }


    /*
    Method 1: creating a count array (for loop)
    ! Constraint: two Strings only consist of 26 lowercase English letters
    - Time Complexity: O(n)
    - Space Complexity: O(1)
     */
    public static boolean isAnagram(String a, String b) {

        if (a.length() != b.length())
            return false;

        int[] count = new int[26];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a'] ++;
            count[b.charAt(i) - 'a'] --;
        }

        for (int i : count) {
            if ( i != 0)
                return false;
        }
        return true;
    }

    /*
    Method 2: Create a count array (for each loop)
    ! Constraint: two Strings only consist of 26 lowercase English letters
    - Time Complexity: O(n)
    - Space Complexity: O(n)
     */
    public static boolean isAnagram_charArray(String a, String b) {

        if (a.length() != b.length())
            return false;

        int[] count = new int[26];
        for (char ch: a.toCharArray()) {
            count[ch - 'a'] ++;
        }
        for (char ch: b.toCharArray()) {
            count[ch - 'a'] --;
        }

        for (int i : count) {
            if ( i != 0)
                return false;
        }
        return true;
    }

    /*
    Method 3: Sort
    - Time Complexity: O(n log n)
    - Space Complexity: O(log n)
     */
    public static boolean isAnagram_sort(String a, String b) {
        if (a.length() != b.length())
            return false;

        char[] sArr = a.toCharArray();
        char[] tArr = b.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }


    /*
    Method 4: Create a HashMap
    - Time Complexity: O(n)
    - Space Complexity: O(n)
     */
    public static boolean isAnagram_hashMap(String a, String b) {

        if (a.length() != b.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i)))
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            else
                map.put(a.charAt(i), 1);
        }

        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i)) && map.get(b.charAt(i)) > 0)
                map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
            else
                return false;
        }
        return true;
    }
}
