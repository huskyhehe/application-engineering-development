package twoPointer;

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
//    public int compress(char[] chars) {
//        int i = 0;
//        int cur = 0;
//
//        while (cur < chars.length) {
//            chars[i++] = chars[cur];
//            int next = cur + 1;
//            while (next < chars.length && chars[next] == chars[cur]) next++;
//            int count = next - cur;
//            if (count > 1) {
//                String str = Integer.toString(count);
//                for (int j = 0; j < str.length(); j ++) {
//                    chars[i++] = str.charAt(j);
//                }
//            }
//            cur = next;
//        }
//        return i;
//    }

