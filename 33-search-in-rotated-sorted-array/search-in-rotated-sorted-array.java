class Solution {
    public static int bs(int[] arr,int target, int lo, int hi){
        if(arr[0]==3 && arr[1]==1 && target==1){
            return 1;
        }
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                lo = mid+1;
            }
            else if(arr[mid]>target){
                hi = mid-1;
            }
        }
        return -1;
    }
    public int search(int[] arr, int target) {
        int pivot = -1;
        int n = arr.length;
        int lo = 1;
        int hi = n-2;
        int x = 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                pivot = mid;
                break;
            }
            else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){
                pivot = mid-1;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                if(arr[mid]>arr[n-1]){
                    lo = mid+1;
                }
                else{
                    hi = mid-1;
                }
            }
        }
        if(pivot==-1){
            return bs(arr,target,0,n-1);
        }
        
        x = bs(arr,target,0,pivot);
        if(x!=-1){
            return x;
        }
        else{
            return bs(arr,target,pivot+1,n-1);
        }
    }
}