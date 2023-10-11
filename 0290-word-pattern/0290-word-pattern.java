class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[] = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }

        HashMap<Character, String> hm = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (hm.containsKey(ch)) {
                if (!hm.get(ch).equals(str[i])) {
                    return false;
                }
            } else {
                if (hm.containsValue(str[i])) {
                    return false;
                }
                hm.put(ch, str[i]);
            }
        }
        return true;
    }
}
