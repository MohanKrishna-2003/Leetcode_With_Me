class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<numRows; i++)
        {
            list.add(getRow(i));
        }
        return list;
    }
    public static List<Integer> getRow(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int prev = 1;
        list.add(prev);
        for(int i=1; i<=n; i++)
        {
            int curr = (prev*(n-i+1))/i;
            list.add(curr);
            prev = curr;
        }
        return list;
        
    }
}