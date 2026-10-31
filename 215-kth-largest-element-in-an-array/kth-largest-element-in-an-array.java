import java.util.Random;

class Solution {

    Random random = new Random();

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int partition(int[] nums, int lo, int hi) {

        int randomIdx = lo + random.nextInt(hi - lo + 1);
        swap(nums, randomIdx, hi);

        int pivot = nums[hi];
        int i = lo;

        for (int j = lo; j < hi; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }

        swap(nums, i, hi);

        return i;
    }

    public int quickSelect(int[] nums, int lo, int hi, int target) {

        while (lo <= hi) {

            int idx = partition(nums, lo, hi);

            if (idx == target) {
                return nums[idx];
            }

            if (idx < target) {
                lo = idx + 1;
            } else {
                hi = idx - 1;
            }
        }

        return -1;
    }

    public int findKthLargest(int[] nums, int k) {

        int target = nums.length - k;

        return quickSelect(nums, 0, nums.length - 1, target);
    }
}