package backtrack;

import java.util.ArrayList;
import java.util.List;

public class PhoneLetterCombinations {

    String[] letterArr = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    StringBuilder sb = new StringBuilder();
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return res;
        backtrack(digits, 0);
        return res;
    }

    public void backtrack(String digits, int index) {
        if (sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String val = letterArr[digits.charAt(index) - '2'];
        for (char ch : val.toCharArray()) {
            sb.append(ch);
            backtrack(digits, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}