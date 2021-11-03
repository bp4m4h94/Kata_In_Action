package mumbling;

public class Accumul {
    public static String accum(String s) {
        // your code
        String result = "";
        for (int i=0; i < s.length(); i++) {
            String upperCase =  String.valueOf(Character.toUpperCase(s.charAt(i)));
            String lowerCase = String.valueOf(Character.toLowerCase(s.charAt(i)));
            if (i > 0) {
                result += "-";
            }
            result = result + upperCase + lowerCase.repeat(i);
        }
        return result;
    }
}
