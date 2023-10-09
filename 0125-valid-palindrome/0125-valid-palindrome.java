class Solution {
    public boolean isPalindrome(String s) {

        if(s.length()==1)
            return true;


        StringBuffer sb = new StringBuffer();
        String str = s.toLowerCase().trim();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>=97 && ch<=122 || ch>='0' && ch<='9')
                sb.append(ch);
        }
        return sb.toString().equals(sb.reverse().toString());

    }
}