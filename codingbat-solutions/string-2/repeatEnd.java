public String repeatEnd(String str, int n) {
    StringBuilder sb = new StringBuilder();
    String sub = str.substring(str.length() - n);
    for (int i = 0; i < n; i++) sb.append(sub);
    return sb.toString();
}
