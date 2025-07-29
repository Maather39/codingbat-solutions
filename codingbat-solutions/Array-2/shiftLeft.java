public int[] shiftLeft(int[] nums) {
    if (nums.length == 0) return nums;
    int[] result = new int[nums.length];
    for (int i = 1; i < nums.length; i++) result[i - 1] = nums[i];
    result[nums.length - 1] = nums[0];
    return result;
}
