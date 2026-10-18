import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        sub(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public void sub(int i, int[] nums, List<Integer> a,
                    List<List<Integer>> ans) {

        if (i == nums.length) {
            ans.add(new ArrayList<>(a));
            return;
        }

        // Not take
        sub(i + 1, nums, a, ans);

        // Take
        a.add(nums[i]);
        sub(i + 1, nums, a, ans);

        // Backtrack
        a.remove(a.size() - 1);
    }
}
