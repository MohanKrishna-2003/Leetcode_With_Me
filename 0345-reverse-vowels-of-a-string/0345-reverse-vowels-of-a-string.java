class Solution {
    public String reverseVowels(String s) {
        char str[] = s.toCharArray();
        int i=0, j=s.length()-1;
        while(i<j)
        {
            if(isVowel(str[i]) && isVowel(str[j])){
                swap(str, i, j);
                i++;
                j--;
            }
            if(!isVowel(str[i]))
                i++;
            if(!isVowel(str[j]))
                j--;
            
        }
        return new String(str);
    }
    public static boolean isVowel(char ch)
    {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }
    public static void swap(char str[], int i, int j)
    {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}