class Solution {
    public int lengthOfLastWord(String s) {
       String newS = s.trim();
       int count = 0;
       for(int i=newS.length()-1; i>=0; i--)
       {
           if(newS.charAt(i)!=' '){
               count++;
           }
           else
           {
               break;
           }
       }
       return count;
    }
    // System.out.println(count);

}