package pangramChecker;

public class PangramChecker {

    public boolean check(String param) {
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        boolean found= true;
        for (String letter : alphabet) {
            if (!param.contains(letter)) {
                found = false;
                break;
            }
        }
        return found;
    }
}
