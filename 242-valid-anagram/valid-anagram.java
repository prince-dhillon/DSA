class Solution {
    public boolean isAnagram(String s, String t) {
        char k[] = s.toCharArray();
        char l[] = t.toCharArray();
        Arrays.sort(k);
        Arrays.sort(l);
        return Arrays.equals(k,l);

    }
}