class Solution {
    public int smallestDivisor(int[] arr, int t) {
        int mx = 0;
        int n = arr.length;
        for(int num: arr){
            mx = Math.max(mx,num);
        }
        int lo = 1;
        int hi = mx;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int sum=0;
            for (int num : arr) {
                sum += (num + mid - 1) / mid;
            }
            if(sum>t){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return lo;
    }
}