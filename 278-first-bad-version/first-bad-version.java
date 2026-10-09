/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 0;
        int hi = n;
        int ans = n;
        while(lo<=hi){
            int mid = lo+ (hi-lo)/2;
            if(isBadVersion(mid)){
                ans = Math.min(ans,mid);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}