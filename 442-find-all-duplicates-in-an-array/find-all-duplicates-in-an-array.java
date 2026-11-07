import java.util.ArrayList;
import java.util.List;

class Solution {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        // Step 1: Cyclic Sort
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            // If the current element is not in its correct position 
            // and the target position doesn't already have the correct element
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // Step 2: Find all numbers that are not in their correct positions
        List<Integer> ans = new ArrayList<>();
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != idx + 1) {
                ans.add(arr[idx]);
            }
        }

        return ans;
    }
}