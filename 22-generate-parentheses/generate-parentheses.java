class Solution {
    public static void parenthesis(int n, String ans, int o, int c,List<String> r){
        if(ans.length()>=2*n){
            r.add(ans);
            return;
        }
        if(o<n){
            parenthesis(n, ans+'(', o+1,c,r);
        };
        if(c<o){
            parenthesis(n, ans+')',o, c+1,r);
            
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> r = new ArrayList<>();
        parenthesis(n,"",0,0,r);
        return r;
    }
}