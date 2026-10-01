class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int lb = n;
        int ub = n;
        int hi = n-1;
        int lo = 0;
        int r[] = {-1,-1};
        boolean flag= false;

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                flag = true;
                break;
            }
            else if(arr[mid]<target){
                lo = mid+1;
            }
            else if(arr[mid]>target){
                hi = mid-1;
            }
        }
        if(flag==false) return r;

        lo = 0;
        hi=n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>=target){
                lb = Math.min(mid,lb);
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        hi = n-1;
        lo = 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>target){
                ub = Math.min(mid,ub);
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        
        r[0]= lb;
        r[1] = ub-1;
        return r;
    }
}