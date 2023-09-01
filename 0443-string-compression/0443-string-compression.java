class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if(n<=1)
            return n;
        int ind=0, count=1;
        for(int i=1; i<n; i++)
        {
            if(chars[i-1]==chars[i])
                count++;
            else 
            {
                chars[ind++] = chars[i-1];
                if(count>1){
                String val = String.valueOf(count);
                for(char c : val.toCharArray())
                {
                    chars[ind++] = c;
                }
                }
                count = 1;
            }
        }

        chars[ind++] = chars[n-1];
        if(count>1)
        {
            String val = String.valueOf(count);
            for(char c : val.toCharArray())
            {
                chars[ind++] = c;
            }
        }

        return ind;
    }
}