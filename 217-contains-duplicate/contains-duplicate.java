class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int ch: nums){
            if(hs.contains(ch)){
                return true;
            }
            else{
                hs.add(ch);
            }
        }
        return false;
    }
}