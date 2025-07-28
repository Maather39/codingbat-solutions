public String sameEnds(String str) {
    int len = str.length();
    for (int i = len / 2; i > 0; i--) {
        if (str.substring(0, i).equals(str.substring(len - i))) {
            return str.substring(0, i);
        }
    }
    return "";
}
