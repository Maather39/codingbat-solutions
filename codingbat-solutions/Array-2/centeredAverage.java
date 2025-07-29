public int centeredAverage(int[] nums) {
    int sum = 0;
    int max = nums[0];
    int min = nums[0];
    for (int n : nums) {
        sum += n;
        if (n > max) max = n;
        if (n < min) min = n;
    }
    return (sum - max - min) / (nums.length - 2);
}
