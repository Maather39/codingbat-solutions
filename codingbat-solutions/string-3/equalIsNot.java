public boolean equalIsNot(String str) {
    int isCount = str.split("is", -1).length - 1;
    int notCount = str.split("not", -1).length - 1;
    return isCount == notCount;
}
