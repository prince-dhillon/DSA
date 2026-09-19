class Solution {
    public int largestPerimeter(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){

            boolean swapped = false;

            for(int j = 0; j < nums.length - i - 1; j++){

                if(nums[j] > nums[j + 1]){

                    int temp = nums[j];

                    nums[j] = nums[j + 1];

                    nums[j + 1] = temp;

                    swapped = true;

                }

            }

            if(!swapped) break;

        }
        int peri = 0;
        for(int i=nums.length-1; i>=2; i--){
            int a = nums[i-2];
            int b = nums[i-1];
            int c = nums[i];
            if(a+b>c && a+c>b && b+c>a){
                peri = a+b+c;
                break;
            }
        }
        return peri;
    }
}