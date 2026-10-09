class Solution {
    public static boolean isPossible(int arr[], long mid, int T){
            long tripsTaken = 0;
            for(int i=0; i<arr.length; i++){
                tripsTaken+=mid/arr[i];
            }
            if(tripsTaken>=T) return true;
            return false;
        }
    public long minimumTime(int[] time, int totalTrips) {
        int mn = Integer.MAX_VALUE;
        for(int num: time){
            mn = Math.min(mn,num);
        }
        long lo = 1;
        long hi = (long) mn * totalTrips;
        long ans = 0;
        while(lo<=hi){
            long mid = lo+ (hi-lo)/2;
            if(isPossible(time,mid,totalTrips)){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}