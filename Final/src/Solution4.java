/**
 * Question 4:
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 */

public class Solution4 {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int i = 0;

        for (int j = 1; j <= n / 2; j ++) {
            res[i++] = j;
            res[i++] = -j;
        }
        return res;
    }
}
