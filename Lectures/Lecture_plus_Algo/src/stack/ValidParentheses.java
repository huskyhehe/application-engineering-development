package stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;

        HashMap<Character, Character>map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put(']', '[');
        map.put('}', '{');
        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char brace = s.charAt(i);
            if (map.containsValue(brace)) stack.push(brace);
            else if (stack.isEmpty() || stack.peek() != map.get(brace)) return false;
            else stack.pop();
        }
        return stack.isEmpty();
    }
}
