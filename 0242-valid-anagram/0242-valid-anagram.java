class Solution {
    public boolean isAnagram(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b)==true)
            return true;
        return false;
    }
}