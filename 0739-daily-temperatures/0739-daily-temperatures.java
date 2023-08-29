class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> s =new Stack<>();
       int n = temperatures.length;
       int res[] = new int[n];
       Arrays.fill(res, 0);

       for(int i=n-1; i>=0; i--)
       {

           while(!s.isEmpty() && temperatures[i]>=temperatures[s.peek()]){
               s.pop();
           }
           if(!s.isEmpty())
           {
               res[i] = s.peek() - i;
           }

           s.push(i);
       }
       return res;
    }
}