class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char arr[] = new char[256];
        boolean visited[] = new boolean[256];
        for(int i=0; i<s.length(); i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(arr[ch1]!=0)
            {
                if(arr[ch1]!=ch2)
                    return false;
            }
            else 
            {
                if(visited[ch2])
                    return false;

                arr[ch1] = ch2;
                visited[ch2] = true;
            }          
        }
        return true;
    }
}