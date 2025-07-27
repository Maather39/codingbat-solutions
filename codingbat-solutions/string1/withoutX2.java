public class withoutX2 {
    public String withoutX2(String str) {
        if (str.length() >= 2) {
            String result = "";
            if (str.charAt(0) != 'x') result += str.charAt(0);
            if (str.charAt(1) != 'x') result += str.charAt(1);
            return result + str.substring(2);
        } else if (str.length() == 1) {
            return str.charAt(0) == 'x' ? "" : str;
        }
        return str;
    }
}
