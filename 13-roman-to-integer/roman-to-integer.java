class Solution {
    public static int getValue(char c){
        if(c == 'I') return 1;
        else if(c == 'V') return 5;
        else if(c == 'X') return 10;
        else if(c == 'L') return 50;
        else if(c == 'C') return 100;
        else if(c == 'D') return 500;
        else return 1000;
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