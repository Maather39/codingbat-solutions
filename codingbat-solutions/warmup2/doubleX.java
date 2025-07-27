public boolean doubleX(String str) {
    int index = str.indexOf("x");
    return index != -1 && index + 1 < str.length() && str.charAt(index + 1) == 'x';
}
