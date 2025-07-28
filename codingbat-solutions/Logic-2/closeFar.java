public class closeFar {
    public boolean closeFar(int a, int b, int c) {
        boolean cond1 = Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2;
        boolean cond2 = Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2;
        return cond1 || cond2;
    }
}
