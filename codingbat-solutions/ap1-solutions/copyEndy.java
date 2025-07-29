public class copyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int j = 0;
        for (int num : nums) {
            if (isEndy(num) && j < count) {
                result[j++] = num;
            }
        }
        return result;
    }

    private boolean isEndy(int n) {
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }
}
