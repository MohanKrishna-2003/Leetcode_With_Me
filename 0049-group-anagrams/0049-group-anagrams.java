class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs)
        {
            char ch[] = str.toCharArray();
            Arrays.sort(ch);  // aet
            String orderedStr = new String(ch);

            if(!map.containsKey(orderedStr)){
                map.put(orderedStr, new ArrayList<>());
            }
            
            map.get(orderedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}