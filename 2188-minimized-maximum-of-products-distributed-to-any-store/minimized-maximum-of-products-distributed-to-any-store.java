class Solution {
    public boolean isPossible(int arr[], int q ,int mid){
        int load = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%mid==0) load+=arr[i]/mid;
            else load+=arr[i]/mid + 1;
        }
        if(load<=q) return true;
        return false;
    }
    public int minimizedMaximum(int n, int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int nums: arr){
            max = Math.max(nums,max);
        }

        int lo = 1;
        int hi = max;
        int ans = -1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(isPossible(arr,n,mid)){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
    }
}