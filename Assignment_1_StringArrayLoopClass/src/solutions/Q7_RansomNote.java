/*********************************************************************************
 * Question 7:
 * Given two strings ransomNote and magazine,
 * return true if ransomNote can be constructed from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 *********************************************************************************/

/*****************************************************************
 * Things need to be clarified:
 *     Do strings only consist of lowercase of English letters?
 *         If yes, Method 1 and Method 2 are better.
 *         If no, Method 3 can be used.
 *****************************************************************/
package solutions;

import java.util.HashMap;
import java.util.Map;

class Solution7 {
    public static void main(String[] args) {
        // Test Case
        String ransomNote = "mine";
        String magazine = "magazine";

        //Method 1
        System.out.println(canConstruct_count(ransomNote,magazine));
        //Method 2
        System.out.println(canConstruct_hashMap(ransomNote,magazine));
    }

    /*
    Method 1:
    ! Constraint: Strings only consist of 26 lowercase English letters
    - Time Complexity: O(|ransomNote| + |magazine|)
    - Space Complexity: O(1)
     */
    public static boolean canConstruct_count(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        int[] count = new int[26];

        for (int i = 0; i < magazine.length(); i++)
            count[magazine.charAt(i) - 'a'] ++;
        for (int i = 0; i < ransomNote.length(); i++)
            count[ransomNote.charAt(i) - 'a'] --;

        for (int i : count) {
            if ( i < 0)
                return false;
        }
        return true;
    }


    /*
    Method 2: Create a HashMap
    - Time Complexity: O(|ransomNote| + |magazine|)
    - Space Complexity: O(|magazine|)
    */
    public static boolean canConstruct_hashMap(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            if (map.containsKey(magazine.charAt(i)))
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            else
                map.put(magazine.charAt(i), 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i)) > 0)
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
            else
                return false;
        }
        return true;
    }
}
