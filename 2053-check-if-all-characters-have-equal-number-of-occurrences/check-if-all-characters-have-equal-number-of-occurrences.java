class Solution {
    public boolean areOccurrencesEqual(String s) {
        int k = 0;
        for(int i=0; i<s.length(); i++){
            int c = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    c++;
                }
            }
            if(k==0){
                k=c;
            }
            if(c!=k){
                return false;
            }
        }
        return true;
    }
}