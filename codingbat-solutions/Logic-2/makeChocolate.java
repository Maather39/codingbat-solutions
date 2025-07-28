public class makeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int maxBig = goal / 5;
        if (maxBig > big) maxBig = big;
        int remaining = goal - (maxBig * 5);
        return (remaining <= small) ? remaining : -1;
    }
}
