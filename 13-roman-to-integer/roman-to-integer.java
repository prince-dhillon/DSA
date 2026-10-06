class Solution {
    public static int getValue(char c){
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
  static int romanToInt(String str) {
    // Complete the function
      int s = 0;
      for(int i=0; i<str.length()-1; i++){
          if(getValue(str.charAt(i))>= getValue(str.charAt(i+1))){
              s+=getValue(str.charAt(i));
          }
          else{
              s-=getValue(str.charAt(i));
          }
      }
      s += getValue(str.charAt(str.length() - 1));
      return s;
    
  }
}