import java.util.Arrays;


import priorityQueue.KthLargest;
import stack.ValidParentheses;              // easy
import twoPointer.StringCompression;
import map.LongestSubStrWithoutRepeatChar;  // easy
import dfs.Islands;
import binary.MedianSortedArr;              // hard
import dp.MaxSumSubArray;                   // easy
import stack.MinStack;                      // easy
import symmetry.UniqueIntsSumZero;          // easy
import greedy.MinDeletionsToGoodStr;
import dp.StockBestTime;                    // easy
import prefixSum.ContinuousSubArrSum;
import backtrack.PhoneLetterCombinations;
import binary.RotatedSortedArrSearch;
import map.GroupAnagrams;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        // Q1
        System.out.println("\nQuestion1------↓↓");
        ValidParentheses solution1 = new ValidParentheses();
        // Test case
        System.out.println(solution1.isValid("()[]{}"));    // expects: true
        System.out.println(solution1.isValid("(]"));        // expects: false


        // Q2 string compression
        System.out.println("\nQuestion2------↓↓");
        StringCompression solution2 = new StringCompression();
        // Test case
        char[] testCase2_1 = new char[]{'a','a','b','b','c','c','c'};
        System.out.println(solution2.compress(testCase2_1));        // expects: 6


        // Q3 easy
        System.out.println("\nQuestion3------↓↓");
        LongestSubStrWithoutRepeatChar solution3 = new LongestSubStrWithoutRepeatChar();
        // Test case
        System.out.println(solution3.lengthOfLongestSubstring("bbbbb"));      // expects: 1
        System.out.println(solution3.lengthOfLongestSubstring("pwwkew"));     // expects: 3


        // Q4
         System.out.println("\nQuestion4------↓↓");
         Islands solution4 = new Islands();
         // Test case
        char[][] testCase4_1 = new char[][]{
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        System.out.println(solution4.numIslands(testCase4_1));      // expects: 3


        // Q5 hard!!
        // https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
        System.out.println("\nQuestion5------↓↓");
        MedianSortedArr solution5 = new MedianSortedArr();


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
        UniqueIntsSumZero solution8 = new UniqueIntsSumZero();
        // Test case
        System.out.println(Arrays.toString(solution8.sumZero(7)));       // expects: vary
        System.out.println(Arrays.toString(solution8.sumZero(4)));       // expects: vary


        // Q9
        System.out.println("\nQuestion9------↓↓");
        MinDeletionsToGoodStr solution9 = new MinDeletionsToGoodStr();
        // Test case
        System.out.println(solution9.minDeletions("aaabbbcc"));     // expects: 2


        // Q10 easy
        System.out.println("\nQuestion10-----↓↓");
        StockBestTime solution10 = new StockBestTime();
        // Test case
        int[] testCase10_1 = new int[]{7,1,5,3,6,4};
        int[] testCase10_2 = new int[]{7,6,8,3,1};
        System.out.println(solution10.maxProfit(testCase10_1));      // expects: 5
        System.out.println(solution10.maxProfit(testCase10_2));      // expects: 2


        // Q11
        System.out.println("\nQuestion11-----↓↓");
        ContinuousSubArrSum solution11 = new ContinuousSubArrSum();



        // Q12
        System.out.println("\nQuestion12-----↓↓");
        RotatedSortedArrSearch solution12 = new RotatedSortedArrSearch();
        // Test case
        int[] testCase12_1 = new int[]{5,1,3};
        int[] testCase12_2 = new int[]{4,5,6,7,0,1,2};
        System.out.println(solution12.search(testCase12_1, 5));     // expects: 0
        System.out.println(solution12.search(testCase12_2, 3));     // expects: -1


        // Q13
        System.out.println("\nQuestion13-----↓↓");
        PhoneLetterCombinations solution13 = new PhoneLetterCombinations();
        // Test case
        System.out.println(solution13.letterCombinations("23"));


        // Q14
        System.out.println("\nQuestion14-----↓↓");
        GroupAnagrams solution14 = new GroupAnagrams();
        String[] testCase14_1 = new String[] {
                "eat","tea","tan","ate","nat","bat"
        };
        System.out.println(solution14.groupAnagrams(testCase14_1));

        // Q15
        System.out.println("\nQuestion14-----↓↓");
        KthLargest solution15 = new KthLargest();
        int[] testCase15_1 = new int[]{3,2,1,5,6,4};
        System.out.println(solution15.findKthLargest(testCase15_1, 2));     // expects: 5

        



    }
}
