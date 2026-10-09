class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int lo = 0;
        int hi = letters.length-1;
        int ans = Integer.MAX_VALUE;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(letters[mid]>target){
                ans = Math.min(ans,(int)letters[mid]);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        if(ans==Integer.MAX_VALUE){
            return letters[0];
        }
        return (char) ans;
    }
}