class Solution {
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int firstMissingPositive(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(i+1==arr[i] || arr[i]<=0 || arr[i] > arr.length) i++;
            else if(arr[i] == arr[arr[i] - 1]) i++;
            else{
                swap(arr,i,arr[i]-1);
            }
        }
        for(i=0; i<arr.length; i++){
            if(arr[i]!=i+1) return i+1;
        }
        return arr.length+1;
    }
}