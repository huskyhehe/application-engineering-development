/**
 * Question 2: String Compression
 * Implement a method to perform basic string compression
 * using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3.
 * If the "compressed" string would not become smaller than the original string,
 * your method should return the original string.
 * You can assume the string has only uppercase and lowercase letters (a - z).
 */

public class Solution2 {
    public String compressString(String str) {

        int length = str.length();

        if (length > 2) {
            String compressedStr = "";
            char lastChar = str.charAt(0);
            int count = 1;
            for(int i = 1; i < length; i ++) {
                if (str.charAt(i) == lastChar) {
                    count++;
                } else {
                    compressedStr += Character.toString(lastChar) + Integer.toString(count);
                    lastChar = str.charAt(i);
                    count = 1;
                }
            }

            compressedStr += Character.toString(lastChar) + Integer.toString(count);
            if (compressedStr.length() < length) {
                return compressedStr;
            }
        }
        return str;
    }
}