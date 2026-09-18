class Solution {
    public void moveZeroes(int[] nums) {
        int n = 0;
        for(int num: nums){
            if(num==0){
                n++;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<nums.length-i-1; j++){
                if(nums[j]==0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }
    }
}