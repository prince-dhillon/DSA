class Solution {
    static List<List<Integer>> ans = new ArrayList<>();
    public void subset(int arr[], List<Integer> a, int i){
        if(i==arr.length){
            List<Integer> s = new ArrayList<>();
            for(int j=0; j<a.size(); j++){
                s.add(a.get(j));
            }
            ans.add(s);
            return;
        }
        //Taking
        a.add(arr[i]);
        subset(arr,a,i+1);
        a.remove(a.size()-1);
        
        //Not taking
        subset(arr,a,i+1);
        
    }
    public List<List<Integer>> subsets(int[] arr) {
        ans = new ArrayList<>();
        subset(arr,new ArrayList<>(), 0);
        return ans;
        
    }
}