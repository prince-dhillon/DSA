class Solution {
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int findDuplicate(int[] arr) {
        int i=0;
        int n=arr.length;
        while(true){
            if(arr[0]==arr[arr[0]]) return arr[0];
            swap(arr,0,arr[0]);
        }
    }
}