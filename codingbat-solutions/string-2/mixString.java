public String mixString(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int len = Math.max(a.length(), b.length());
    for (int i = 0; i < len; i++) {
        if (i < a.length()) sb.append(a.charAt(i));
        if (i < b.length()) sb.append(b.charAt(i));
    }
    return sb.toString();
}
