class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int lb = n;
        int ub = n;
        int hi = n-1;
        int lo = 0;
        int r[] = {-1,-1};

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                if(mid>0 && arr[mid-1]==arr[mid]){
                    hi = mid-1;
                }
                else{
                    lb = mid;
                    break;
                }
            }
            else if(arr[mid]<target){
                lo = mid+1;
            }
            else if(arr[mid]>target){
                hi = mid-1;
            }
        }

        lo = 0;
        hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                if(mid<n-1 && arr[mid+1]==arr[mid]){
                    lo = mid+1;
                }
                else{
                    ub = mid;
                    break;
                }
            }
            else if(arr[mid]<target){
                lo = mid+1;
            }
            else if(arr[mid]>target){
                hi = mid-1;
            }
        }
        if (lb == n) lb = -1;
        if (ub == n) ub = -1;
        r[0]= lb;
        r[1] = ub;
        return r;
    }
}