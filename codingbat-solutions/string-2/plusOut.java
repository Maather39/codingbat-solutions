public String plusOut(String str, String word) {
    StringBuilder sb = new StringBuilder();
    int i = 0;
    while (i < str.length()) {
        if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
            sb.append(word);
            i += word.length();
        } else {
            sb.append("+");
            i++;
        }
    }
    return sb.toString();
}
