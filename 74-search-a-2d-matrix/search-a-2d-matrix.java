class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m= arr[0].length;
        int lo = 0;
        int hi = m*n-1;
        while(lo<=hi){
           int mid = lo+(hi-lo)/2;
           int midR = mid/m;
           int midC = mid%m;
           if(arr[midR][midC]==target){
            return true;
           }
           else if(arr[midR][midC]<target) lo = mid+1;
           else hi = mid-1;
        }
        return false;
    }
}