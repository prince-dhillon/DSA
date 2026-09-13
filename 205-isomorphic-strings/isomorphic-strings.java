class Solution {
    public boolean isIsomorphic(String s, String t) {
        char freq[] = new char[128];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)(ch);
            if(freq[idx]=='\0'){
                freq[idx] = dh;
            }
            else{
                if(freq[idx]!= dh) return false;
            }
        }
        for(int i=0; i<128; i++){
            freq[i] = '\0';
        }
        for(int i=0; i<t.length(); i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)(dh);
            if(freq[idx]=='\0'){
                freq[idx] = ch;
            }
            else{
                if(freq[idx]!= ch) return false;
            }
        }
        return true;
    }
}