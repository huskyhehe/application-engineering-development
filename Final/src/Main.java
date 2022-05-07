import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Question 1
        System.out.println("\nQuestion1-----↓↓");
        Solution1 solution1 = new Solution1();
        // Given test cases
        String testCase1_1 = "()[]{}";      // expects: true
        String testCase1_2 = "(]";          // expects: false
        // Outputs
        System.out.println(solution1.isValid(testCase1_1));
        System.out.println(solution1.isValid(testCase1_2));


        // Question 2
        System.out.println("\nQuestion2-----↓↓");
        Solution2 solution2 = new Solution2();
        // Given test cases
        String testCase2_1 = "aabcccccaaa";     // expects: "a2b1c5a3"
        String testCase2_2 = "ab";              // expects: "ab"
        // Outputs
        System.out.println(solution2.compressString(testCase2_1));
        System.out.println(solution2.compressString(testCase2_2));


        // Question 3
        System.out.println("\nQuestion3-----↓↓");
        Solution3 solution3 = new Solution3();
        // Given test cases
        String testCase3_1 = "bbbbb";       // expects: 1
        String testCase3_2 = "pwwkew";      // expects: 3
        // Outputs
        System.out.println(solution3.lengthOfLongestSubstring(testCase3_1));
        System.out.println(solution3.lengthOfLongestSubstring(testCase3_2));


        // Question 4
        System.out.println("\nQuestion4-----↓↓");
        Solution4 solution4 = new Solution4();
        // Given test cases
        int testCase4_1 = 5;
        int testCase4_2 = 3;
        System.out.println(Arrays.toString(solution4.sumZero(testCase4_1)));
        System.out.println(Arrays.toString(solution4.sumZero(testCase4_2)));


        // Question 5
        System.out.println("\nQuestion5-----↓↓");
        Solution5 solution5 = new Solution5();
        // Given test cases
        int[] testCase5_1_arr = new int[]{3,2,1,5,6,4};
        int testCase5_1_k = 2;                                  // expects: 5
        int[] testCase5_2_arr = new int[]{3,2,3,1,2,4,5,5,6};
        int testCase5_2_k = 4;                                  // expects: 4
        // Outputs
        System.out.println(solution5.findKthLargest(testCase5_1_arr, testCase5_1_k));
        System.out.println(solution5.findKthLargest(testCase5_2_arr, testCase5_2_k));
    }
}
