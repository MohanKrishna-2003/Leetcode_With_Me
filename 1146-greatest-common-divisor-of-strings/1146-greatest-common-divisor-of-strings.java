class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";
        int len = getLen(str1.length(), str2.length());
        return str1.substring(0, len);

    }
    public static int getLen(int x, int y)
    {
        while(y>0)
        {
            int temp;
            temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }
}