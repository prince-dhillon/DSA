class Solution {
    public static boolean isPossible(int arr[], int mid, int k){
        int s = 0;
        for(int i=0 ; i<arr.length; i++){
            s+= Math.ceil((double)arr[i]/mid);
        }
        if(s<=k) return true;
        return false;
    }
    public int smallestDivisor(int[] arr, int threshold) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int nums: arr){
            mx = Math.max(nums,mx);
        }
        int lo = 1;
        int hi = mx;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(arr,mid,threshold)){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}