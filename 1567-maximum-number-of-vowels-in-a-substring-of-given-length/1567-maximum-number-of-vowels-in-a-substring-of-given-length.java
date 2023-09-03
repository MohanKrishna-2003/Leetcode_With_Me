class Solution {
    public int maxVowels(String s, int k) {
        if(s.length()==1 && isVowel(s.charAt(0)))
            return 1;
        if(s.length()<k)
            return 0;
        if(s.length()==1 && !isVowel(s.charAt(0)))
            return 0;
        int count=0;
        int maxCount = 0;
        for(int i=0; i<k; i++)
        {
            if(isVowel(s.charAt(i)))
                count++;
        }
        maxCount = count;
        for(int i=k; i<s.length(); i++)
        {
            if(isVowel(s.charAt(i-k))) 
                count--;
            if(isVowel(s.charAt(i)))
                count++;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    public static boolean isVowel(char ch)
    {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }
}