class Solution {
    public boolean search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                return true;
            }
            if (arr[lo] == arr[mid] && arr[mid] == arr[hi]) {
                lo++;
                hi--;
            }
            else if(arr[mid]<=arr[hi]){
                if(arr[mid]<target && target<=arr[hi]) lo = mid+1;
                else hi = mid-1;
            }
            else{
                if(arr[lo]<=target && target<arr[mid]) hi = mid-1;
                else lo = mid+1;
            }
        }
        return false;
    }
}