public String getSandwich(String str) {
    int first = str.indexOf("bread");
    int last = str.lastIndexOf("bread");
    if (first != last && first != -1 && last != -1) {
        return str.substring(first + 5, last);
    }
    return "";
}
