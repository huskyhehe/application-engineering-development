/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Solution1 {
    public boolean isValid(String s) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i ++) {
            Character ch = s.charAt(i);
            if (map.containsValue(ch)) {
                stack.push(ch);
            } else if (stack.isEmpty() || stack.peek() != map.get(ch)) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
