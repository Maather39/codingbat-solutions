public class makeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int maxBig = goal / 5;
        if (maxBig > big) maxBig = big;
        return (goal - maxBig * 5) <= small;
    }
}
