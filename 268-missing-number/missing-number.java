class Solution {
    public int missingNumber(int[] arr) {
        int s1 = 0;
        int s2 = 0;
        for(int nums: arr){
            s1+=nums;
        }
        for(int i=0; i<=arr.length; i++){
            s2+=i;
        }
        return s2-s1;
    }
}