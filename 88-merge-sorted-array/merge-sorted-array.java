class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int i = m-1; // Pointer to end of 1st Array
        int j = n-1; // Pointer to end of 2nd Array
        int k = m+n-1; // Pointer to actual end of 1st Array
        while(i>=0 && j>=0){
            if(a[i]>=b[j]){
                a[k] = a[i];
                i--; k--;
            }
            else{
                a[k] = b[j];
                j--; k--;
            }
        }
        if(i==-1){
            while(j>=0){
                a[k] = b[j];
                j--; k--;
            }
        }
    }
}