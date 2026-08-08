class Solution {
    public void sortColors(int[] nums) {
        // Using normal Method
        int zero=0;
        int one=0;
        int two=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        for(int i=0; i<n; i++){
            if(i<zero){
                nums[i] = 0;
            }
            else if(i<zero+one){
                nums[i] = 1;
            }
            else{
                nums[i] = 2;
            }
        }
        
    }
}