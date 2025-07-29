public int maxMirror(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
        for (int j = nums.length - 1; j >= 0; j--) {
            int count = 0;
            int i2 = i, j2 = j;
            while (i2 < nums.length && j2 >= 0 && nums[i2] == nums[j2]) {
                count++;
                i2++;
                j2--;
            }
            max = Math.max(max, count);
        }
    }
    return max;
}
