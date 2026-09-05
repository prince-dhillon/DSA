class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=0;
        int r[] = new int[nums.length];
        while(i<nums.length){
            r[j++] = nums[i]*nums[i];
            i++;
        }
        Arrays.sort(r);
        return r;
    }
}