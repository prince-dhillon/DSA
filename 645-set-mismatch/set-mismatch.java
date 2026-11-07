class Solution {
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] findErrorNums(int[] arr) {
        int ans[] = {-1,-1};
        int i=0;
        while(i<arr.length){
            if(arr[i]!=arr[arr[i]-1]) swap(arr,i,arr[i]-1);
            else i++;
        }

        for(i=0; i<arr.length; i++){
            if(i+1!=arr[i]){
                ans[0] = arr[i];
                ans[1] = i+1;
                break;
            }
        }

        return ans;
    }
}