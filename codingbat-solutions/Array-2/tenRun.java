public int[] tenRun(int[] nums) {
    int[] result = new int[nums.length];
    int current = -1;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 10 == 0) current = nums[i];
        result[i] = (current != -1) ? current : nums[i];
    }
    return result;
}
