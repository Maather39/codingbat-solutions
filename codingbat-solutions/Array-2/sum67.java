public int sum67(int[] nums) {
    int sum = 0;
    boolean inRange = false;
    for (int n : nums) {
        if (n == 6) inRange = true;
        if (!inRange) sum += n;
        if (n == 7 && inRange) inRange = false;
    }
    return sum;
}
