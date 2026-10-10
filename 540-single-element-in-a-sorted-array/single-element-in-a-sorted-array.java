class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int lo = 1;
        int hi = n-2;
        if (n == 1) {
            return arr[0];
        }
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            else if(arr[mid]==arr[mid-1]&& mid%2==1 ||(arr[mid] == arr[mid + 1] && mid % 2 == 0)){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return -1;
    }
}