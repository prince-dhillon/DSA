class Solution {
    public static int gcd(int a, int b){
        if(b%a==0) return a;
        return gcd(b%a,a);
    }
    public int findGCD(int[] arr) {
        int small = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int nums: arr){
            small = Math.min(small,nums);
            max = Math.max(max,nums);
        }
        return gcd(small,max);

    }
}