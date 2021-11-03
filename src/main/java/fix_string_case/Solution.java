package fix_string_case;

public class Solution {
    public static String solve(final String str) {

        int lowerCaseNum = 0;
        int upperCaseNum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                lowerCaseNum++;
            } else {
                upperCaseNum++;
            }
        }
        if (lowerCaseNum == upperCaseNum && lowerCaseNum > upperCaseNum) {
            return str.toLowerCase();
        } else {
            return str.toUpperCase();
        }
    }
}