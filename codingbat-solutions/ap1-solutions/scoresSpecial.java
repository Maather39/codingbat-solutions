public class scoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        return largestSpecial(a) + largestSpecial(b);
    }

    private int largestSpecial(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num % 10 == 0 && num > max) max = num;
        }
        return max;
    }
}
