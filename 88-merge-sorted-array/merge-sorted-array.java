class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int i = m-1; // Pointer to end of 1st Array
        int j = n-1; // Pointer to end of 2nd Array
        int k = m+n-1; // Pointer to actual end of 1st Array
        while(i>=0 && j>=0){
            if(a[i]>=b[j]){
                a[k--] = a[i--];
            }
            else{
                a[k--]= b[j--];
            }
        }
        if(i<0){
            while(j>=0){
                a[k--]= b[j--];
            }
        }
        if(j<0){
            while(i>=0){
                a[k--]= a[i--];
            }
        }
    }
}