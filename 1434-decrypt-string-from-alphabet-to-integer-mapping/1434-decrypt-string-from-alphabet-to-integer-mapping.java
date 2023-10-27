class Solution {
    public String freqAlphabets(String s) {
        StringBuffer sb = new StringBuffer();
        int i=s.length()-1;
        while(i>=0)
        {
            char ch = s.charAt(i);
            if(ch=='#')
            {
                int number = Integer.parseInt(s.substring(i-2, i));
                sb.insert(0, (char)(number+96));
                i-=3;
            }
            else 
            {
                int number = Integer.parseInt(s.substring(i, i+1));
                sb.insert(0, (char)(number+96));
                i--;
            }
            
        }
        return sb.toString();
    }
}