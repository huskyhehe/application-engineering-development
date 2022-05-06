import stack.ValidParentheses;              // easy

import map.LongestSubStrWithoutRepeatChar;  // easy


import dp.MaxSumSubArray;                   // easy
import stack.MinStack;                      // easy
import dp.StockBestTime;                    // easy

public class Main {
    public static void main(String[] args) {

        // Q1
        System.out.println("\nQuestion1------↓↓");
        ValidParentheses solution1 = new ValidParentheses();
        // Test case
        System.out.println(solution1.isValid("()[]{}"));    // expects: true
        System.out.println(solution1.isValid("(]"));        // expects: false

        // Q2 string compression


        // Q3 easy
        System.out.println("\nQuestion3------↓↓");
        LongestSubStrWithoutRepeatChar solution3 = new LongestSubStrWithoutRepeatChar();
        // Test case
        System.out.println(solution3.lengthOfLongestSubstring("bbbbb"));      // expects: 1
        System.out.println(solution3.lengthOfLongestSubstring("pwwkew"));     // expects: 3

        // Q4
        // https://leetcode-cn.com/problems/number-of-islands/solution/dao-yu-lei-wen-ti-de-tong-yong-jie-fa-dfs-bian-li-/
        // System.out.println("\nQuestion4------↓↓");
        // Islands solution4 = new Islands();

        // Q5 hard!!
        // https://leetcode-cn.com/problems/median-of-two-sorted-arrays/

        // Q6 easy
        System.out.println("\nQuestion6------↓↓");
        MaxSumSubArray solution6 = new MaxSumSubArray();
        // Test case
        int[] testCase6_1 = new int[]{5,4,-1,7,8};
        int[] testCase6_2 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution6.maxSubArray(testCase6_1));     // expects: 23
        System.out.println(solution6.maxSubArray(testCase6_2));     // expects: 6

        // Q7 easy
        System.out.println("\nQuestion7------↓↓");
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.push(-5);
        minStack.push(2);
        minStack.push(-8);
        System.out.println(minStack.top());         // expects: -8
        minStack.pop();
        System.out.println(minStack.getMin());      // expects: -5

        // Q8 easy
        System.out.println("\nQuestion8------↓↓");
        StockBestTime solution8 = new StockBestTime();
        // Test case
        int[] testCase8_1 = new int[]{7,1,5,3,6,4};
        int[] testCase8_2 = new int[]{7,6,8,3,1};
        System.out.println(solution8.maxProfit(testCase8_1));      // expects: 5
        System.out.println(solution8.maxProfit(testCase8_2));      // expects: 2

//        Q13
//        https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/solution/hui-su-dui-lie-tu-jie-by-ml-zimingmeng/
//        System.out.println("Question13");
//        PhoneLetterCombinations solution13 = new PhoneLetterCombinations();
//        System.out.println(solution13.letterCombinations("23"));
    }
}
