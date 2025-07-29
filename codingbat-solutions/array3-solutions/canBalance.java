public boolean canBalance(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        int leftSum = 0, rightSum = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j < i) leftSum += nums[j];
            else rightSum += nums[j];
        }
        if (leftSum == rightSum) return true;
    }
    return false;
}
