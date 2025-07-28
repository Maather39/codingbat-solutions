public class roundSum {
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private int round10(int num) {
        int rem = num % 10;
        if (rem >= 5) return num + (10 - rem);
        return num - rem;
    }
}
