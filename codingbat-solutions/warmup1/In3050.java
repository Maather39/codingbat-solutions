public class In3050 {
    public boolean in3050(int a, int b) {
        return (inRange(a, 30, 40) && inRange(b, 30, 40)) ||
                (inRange(a, 40, 50) && inRange(b, 40, 50));
    }
    private boolean inRange(int x, int low, int high) {
        return x >= low && x <= high;
    }
}
