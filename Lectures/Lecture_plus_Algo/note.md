## dfs
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

## Binary
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
## dp
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

## map
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

## stack
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

## symmetry
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