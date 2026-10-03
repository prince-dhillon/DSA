class Solution {
    public static boolean isPossible(int arr[], int h, int mid){
        int load = 0;
        int hours = 0;
        for (int i = 0; i < arr.length; i++) {
            hours += (arr[i] + mid - 1) / mid;

            if (hours > h) {
                return false;
            }
        }

        return true;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int mx = Integer.MIN_VALUE;
        for(int nums: arr){
            mx = Math.max(nums,mx);
        }
        
        int lo = 1;
        int hi = mx;
        int ans = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(arr,h,mid)){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}