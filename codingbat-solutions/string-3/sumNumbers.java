public int sumNumbers(String str) {
    int sum = 0;
    String num = "";
    for (int i = 0; i < str.length(); i++) {
        if (Character.isDigit(str.charAt(i))) {
            num += str.charAt(i);
        } else {
            if (!num.equals("")) {
                sum += Integer.parseInt(num);
                num = "";
            }
        }
    }
    if (!num.equals("")) {
        sum += Integer.parseInt(num);
    }
    return sum;
}
