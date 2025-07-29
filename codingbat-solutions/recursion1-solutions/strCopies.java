public boolean strCopies(String str, String sub, int n) {
    if (str.length() < sub.length()) return n <= 0;
    if (str.startsWith(sub)) {
        return strCopies(str.substring(1), sub, n - 1);
    }
    return strCopies(str.substring(1), sub, n);
}
