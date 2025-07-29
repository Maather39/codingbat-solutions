public class sumHeights2 {
    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start + 1; i <= end; i++) {
            int diff = heights[i] - heights[i - 1];
            if (diff > 0) sum += 2 * Math.abs(diff);
            else sum += Math.abs(diff);
        }
        return sum;
    }
}
