/**
 * Example 1:
 *      Input: s = "abcabcbb"
 *      Output: 3
 *      Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *      Input: s = "bbbbb"
 *      Output: 1
 *      Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *      Input: s = "pwwkew"
 *      Output: 3
 *      Explanation: The answer is "wke", with the length of 3.
 */

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case
        String case1 = "abcabcbb";
        String case2 = "bbbbb";
        String case3 = "pwwkew";

        System.out.println(solution.longestUniqueSubstring(case1));     // Expects 3
        System.out.println(solution.longestUniqueSubstring(case2));     // Expects 1
        System.out.println(solution.longestUniqueSubstring(case3));     // Expects 3
    }
}
