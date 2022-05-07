## dfs 1
```java
public class Islands {
    public int numIslands(char[][] grid) {
        int res = 0;

        for (int i = 0; i < grid.length; i ++) {
            for (int j = 0; j < grid[0].length; j ++) {
                if (grid[i][j] == '1') {
                    dfsGrid(grid, i, j);
                    res ++;
                }
            }
        }
        return res;
    }

    public void dfsGrid(char[][] grid, int row, int col) {
        int nRow = grid.length;
        int nCol = grid[0].length;

        if (row < 0 || col < 0 || row >= nRow || col >= nCol || grid[row][col] == '0') return;

        grid[row][col] = '0';
        dfsGrid(grid, row - 1, col);
        dfsGrid(grid, row + 1, col);
        dfsGrid(grid, row, col - 1);
        dfsGrid(grid, row, col + 1);
    }
}
```

## two pointers 1
```java
public class StringCompression {
    public int compress(char[] chars) {
        int write = 0, left = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read == chars.length - 1 || chars[read] != chars[read + 1]) {
                chars[write++] = chars[read];
                int num = read - left + 1;
                if (num > 1) {
                    int anchor = write;
                    while (num > 0) {
                        chars[write++] = (char) (num % 10 + '0');
                        num /= 10;
                    }
                    reverse(chars, anchor, write - 1);
                }
                left = read + 1;
            }
        }
        return write;
    }

    public void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left ++;
            right --;
        }
    }
}
```

## dp 2
```java
public class MaxSumSubArray {
    public int maxSubArray(int[] nums) {

        int maxSoFar = 0;
        int res = nums[0];

        for (int num : nums) {
            maxSoFar = Math.max(num, maxSoFar + num);
            res = Math.max(res, maxSoFar);
        }
        return res;
    }
}
```
```java
public class StockBestTime {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(price, minPrice);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
```

## greedy 1
```java
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
```

## map 2
```java
public class LongestSubStrWithoutRepeatChar {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) return 0;

        HashMap<Character, Integer>  map = new HashMap<>();
        int start = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i ++) {
            Character ch = s.charAt(i);
            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }
            map.put(ch, i);
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}
```
```java
public class ContinuousSubArrSum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int m = nums.length;
        if (m < 2) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int remainder = 0;
        for (int i = 0; i < m; i++) {
            remainder = (remainder + nums[i]) % k;
            if (map.containsKey(remainder)) {
                int prevIndex = map.get(remainder);
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }
}    
```

## stack 2
```java
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
```
```java
public class MinStack {
    Deque<Integer> helperStack;
    Deque<Integer> minStack;

    public MinStack() {
        helperStack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.addFirst(Integer.MAX_VALUE);
    }

    public void push(int val) {
        helperStack.addFirst(val);
        minStack.addFirst(Math.min(minStack.getFirst(), val));
    }

    public void pop() {
        helperStack.removeFirst();
        minStack.removeFirst();
    }

    public int top() {
        return minStack.getFirst();
    }

    public int getMin() {
        return minStack.getFirst();
    }
}
```

## binary 1
```java
public class RotatedSortedArrSearch {
    public int search(int[] nums, int target) {

        if (nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}
```

## symmetry 1
```java
public class UniqueIntsSumZero {
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
```