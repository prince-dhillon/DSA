class Solution {
    public boolean isPerfectSquare(int x) {
        long lo = 1;
        long hi = x;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long square = mid * mid;

            if (square == x) {
                return true;
            } else if (square < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return false;
    }
}
