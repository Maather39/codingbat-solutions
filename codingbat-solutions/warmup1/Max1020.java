public class Max1020 {
    public int max1020(int a, int b) {
        if (!inRange(b)) b = 0;
        if (!inRange(a)) a = 0;
        return Math.max(a, b);
    }
    private boolean inRange(int n) {
        return n >= 10 && n <= 20;
    }
}
