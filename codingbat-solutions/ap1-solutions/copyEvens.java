public class copyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int j = 0;
        for (int num : nums) {
            if (num % 2 == 0 && j < count) {
                result[j++] = num;
            }
        }
        return result;
    }
}
