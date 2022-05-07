package stack;

import java.util.ArrayList;
import java.util.List;

public class PhoneLetterCombinations {

    String[] letterArr = new String[]
            {"0", "1", "abc", "def", "ghi", "jkl", "nmo", "pqrs", "tuv", "wxyz"};
    ArrayList<String> res = new ArrayList<>();
    private StringBuilder sb = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return res;
        backtrack(digits,0);
        return res;
    }

    private void backtrack(String digits,int index) {
        if(sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String val = letterArr[digits.charAt(index)];
        for(char ch:val.toCharArray()) {
            sb.append(ch);
            backtrack(digits,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

