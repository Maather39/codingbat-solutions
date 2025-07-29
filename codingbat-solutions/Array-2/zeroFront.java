public int[] zeroFront(int[] nums) {
    int[] result = new int[nums.length];
    int index = 0;

    for (int num : nums) {
        if (num == 0) {
            result[index++] = 0;
        }
    }

    for (int num : nums) {
        if (num != 0) {
            result[index++] = num;
        }
    }

    return result;
}
