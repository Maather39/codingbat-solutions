public class maxTriple {
    public int maxTriple(int[] nums) {
        int mid = nums[nums.length / 2];
        return Math.max(nums[0], Math.max(mid, nums[nums.length - 1]));
    }
}
