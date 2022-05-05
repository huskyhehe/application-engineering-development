package stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PhoneLetterCombinations {

    String[] letterArr = new String[]
            {"0", "1", "abc", "def", "ghi", "jkl", "nmo", "pqrs", "tuv", "wxyz"};
    ArrayList<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return res;

        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < digits.length(); i ++) {
        }
        return res;
    }

    public void findCombination(String digits, int index, String s){
        if(index == digits.length()){
            res.add(s);
            return;
        }
        Character letter = digits.charAt(index);
        String letters = letterArr[letter - '0'];
        for(int i = 0 ; i < letters.length() ; i ++){
            findCombination(digits, index+1, s + letters.charAt(i));
        }
        return;
    }
}
