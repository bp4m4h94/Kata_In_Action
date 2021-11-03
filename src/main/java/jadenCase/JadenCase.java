package jadenCase;

public class JadenCase {
    public String toJadenCase(String phrase) {
        String[] result;

        if (phrase ==  null || phrase.equals("")) {
            return null;
        } else {
            result = phrase.split(" ");
            for (int i=0; i < result.length; i++) {
                result[i] = result[i].substring(0, 1).toUpperCase() + result[i].substring(1).toLowerCase();
            }
            return String.join(" ", result);
        }

    }
}
