public String wordEnds(String str, String word) {
    StringBuilder sb = new StringBuilder();
    int len = word.length();
    for (int i = 0; i <= str.length() - len; i++) {
        if (str.substring(i, i + len).equals(word)) {
            if (i > 0) sb.append(str.charAt(i - 1));
            if (i + len < str.length()) sb.append(str.charAt(i + len));
        }
    }
    return sb.toString();
}
