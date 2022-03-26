public class Solution {

    public int longestUniqueSubstring(String str) {

        if (str.length() == 0 && str.length() == 1)
            return str.length();

        int maxLength = 0;
        String tempStr = "";

        for (char i : str.toCharArray()) {
            String s = String.valueOf(i);

            if (tempStr.contains(s))
                tempStr = tempStr.substring(tempStr.indexOf(s) + 1);
            tempStr += String.valueOf(s);

            maxLength = Math.max(maxLength, tempStr.length());
        }
        return maxLength;
    }
}
