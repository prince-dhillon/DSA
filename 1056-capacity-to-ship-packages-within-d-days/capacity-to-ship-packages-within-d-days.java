class Solution {
    public static boolean isPossible(int arr[], int c, int d){
        int daysTaken = 1;
        int s = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]+s<=c){
                s+=arr[i];
            }
            else{
                s = arr[i];
                daysTaken++;
            }
        }
        if(daysTaken>d){
            return false;
        }
        return true;
    }
    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        int sum = 0;
        int mx = 0;
        for(int num: arr){
            sum+=num;
            mx = Math.max(mx,num);
        }

        int lo = mx;
        int hi = sum;
        int minC = sum;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(isPossible(arr,mid,days)){
                minC = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return minC;
    }
}