class Solution {
    public String mergeAlternately(String word1, String word2) {
     StringBuffer sb = new StringBuffer();
     for(int i=0; i<word1.length() || i<word2.length(); i++)   
     {
         if(i<word1.length())
            sb.append(word1.charAt(i));
         if(i<word2.length())
            sb.append(word2.charAt(i));
     }
     return sb.toString();
    }
}