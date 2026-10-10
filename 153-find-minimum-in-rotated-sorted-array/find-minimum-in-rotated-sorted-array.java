class Solution {
    public int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>arr[hi]){
                lo = mid+1;
            }
            else{
                min = Math.min(min,arr[mid]);
                hi = mid-1;
            }
        }
        return min;
    }
}