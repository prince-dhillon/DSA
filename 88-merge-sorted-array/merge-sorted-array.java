class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m+n;
        int p=0;
        int arr[] = new int[x];
        for(int i=0; i<m; i++){
            arr[i] = nums1[i];
        }
        for(int i=m; i<x; i++){
            arr[i] = nums2[p++];
        }
        Arrays.sort(arr);
        System.out.print("[");
        for(int i=0; i<x; i++){
            nums1[i] = arr[i];
        }
        
    }
}