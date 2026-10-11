class Solution {
    public static boolean isPossible(int arr[], int mid, int days){
        int load = 0;
        int d = 1;
        for(int i=0; i<arr.length; i++){
            if(load+arr[i]<=mid) load+=arr[i];
            else{
                d++;
                load = arr[i];
            }
        }
        if(d<=days) return true;
        return false;
    }
    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        int mx = 0;
        int s = 0;
        for(int num: arr){
            mx = Math.max(mx,num);
            s+=num;
        }
        int lo = mx;
        int hi = s;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(arr,mid,days)){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}