class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> x = new ArrayList<>();
            for(int j=0; j<i+1; j++){
                if(j==0 || j==i){
                    x.add(1);
                }
                else{
                    x.add(r.get(i-1).get(j)+ r.get(i-1).get(j-1));
                }
            }
            r.add(x);
        }
        return r;
    }
}