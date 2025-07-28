public String repeatSeparator(String word, String sep, int count) {
    if (count == 0) return "";
    StringBuilder sb = new StringBuilder(word);
    for (int i = 1; i < count; i++) {
        sb.append(sep).append(word);
    }
    return sb.toString();
}
