import stack.ValidParentheses;
import map.LongestSubstrWithoutRepeatChar;
import stack.MinStack;

public class Main {
    public static void main(String[] args) {
        // Q1
        System.out.println("\nQuestion1------↓↓");
        ValidParentheses solution1 = new ValidParentheses();
        // Test case
        System.out.println(solution1.isValid("()[]{}"));    // expected: true
        System.out.println(solution1.isValid("(]"));        // expected: false

        // Q3
        System.out.println("\nQuestion3------↓↓");
        LongestSubstrWithoutRepeatChar solution3 = new LongestSubstrWithoutRepeatChar();
        // Test case
        System.out.println(solution3.lengthOfLongestSubstring("bbbbb"));      // expected: 1
        System.out.println(solution3.lengthOfLongestSubstring("pwwkew"));     // expected: 3


        //Q7
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
