import stack.ValidParentheses;
import map.LongestSubstrWithoutRepeatChar;
import dfs.Islands;
import stack.MinStack;

public class Main {
    public static void main(String[] args) {

        // Q1
        System.out.println("\nQuestion1------↓↓");
        ValidParentheses solution1 = new ValidParentheses();
        // Test case
        System.out.println(solution1.isValid("()[]{}"));    // expects: true
        System.out.println(solution1.isValid("(]"));        // expects: false

        // Q3
        System.out.println("\nQuestion3------↓↓");
        LongestSubstrWithoutRepeatChar solution3 = new LongestSubstrWithoutRepeatChar();
        // Test case
        System.out.println(solution3.lengthOfLongestSubstring("bbbbb"));      // expects: 1
        System.out.println(solution3.lengthOfLongestSubstring("pwwkew"));     // expects: 3

        // Q4
        System.out.println("\nQuestion4------↓↓");
        Islands solution4 = new Islands();

        // Q5 hard!!
        // https://leetcode-cn.com/problems/median-of-two-sorted-arrays/

        // Q6


        // Q7
        System.out.println("\nQuestion7------↓↓");
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.push(-5);
        minStack.push(2);
        minStack.push(-8);
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());


//        //Q13
//        System.out.println("Question13");
//        PhoneLetterCombinations solution13 = new PhoneLetterCombinations();
//        System.out.println(solution13.letterCombinations("23"));

    }
}
