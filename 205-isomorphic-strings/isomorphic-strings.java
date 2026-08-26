class Solution {
    public boolean isIsomorphic(String s, String t) {
        char arr[] = new char[128];
        for(int i=0; i<s.length(); i++){
            int idx = (int)s.charAt(i);
            if(arr[idx]=='\u0000' || arr[idx]==t.charAt(i)){
                arr[idx]=t.charAt(i);
            }
            else{
                return false;
            }
        }
        char brr[] = new char[128];
        for(int i=0; i<t.length(); i++){
            int idx = (int)t.charAt(i);
            if(brr[idx]=='\u0000' || brr[idx]==s.charAt(i)){
                brr[idx]=s.charAt(i);
            }
            else{
                return false;
            }
        }
        return true;
    }
}