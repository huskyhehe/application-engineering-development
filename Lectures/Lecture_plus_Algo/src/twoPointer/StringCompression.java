package twoPointer;

public class StringCompression {
    public int compress(char[] chars) {
        int i = 0;
        int cur = 0;

        while (cur < chars.length) {
            chars[i++] = chars[cur];
            int next = cur + 1;
            while (next < chars.length && chars[next] == chars[cur]) next++;
            int count = next - cur;
            if (count > 1) {
                String str = Integer.toString(count);
                for (int j = 0; j < str.length(); j ++) {
                    chars[i++] = str.charAt(j);
                }
            }
            cur = next;
        }
        return i;
    }
}
