package greedy;

import java.util.Arrays;

public class MinDeletionsToGoodStr {
    public int minDeletions(String s) {

        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a'] ++;
        }
        Arrays.sort(freq);

        int expected = freq[25];
        int res = 0;
        for (int i = 25; i >= 0; i --) {
            if (freq[i] == 0) break;
            if(freq[i] <= expected) expected = freq[i];
            else res += freq[i] - expected;
            if (expected > 0) expected --;
        }
        return res;
    }
}
