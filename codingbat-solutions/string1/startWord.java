public class startWord {
    public String startWord(String str, String word) {
        if (word.length() > str.length()) return "";
        if (str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0, word.length());
        }
        return "";
    }
}
