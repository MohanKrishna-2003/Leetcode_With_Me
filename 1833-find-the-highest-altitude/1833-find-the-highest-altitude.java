class Solution {
    public int largestAltitude(int[] gain) {
        int temp[] = new int[gain.length+1];
        temp[0] = 0;
        int k=1;
        for(int i=0; i<gain.length; i++)
        {
            temp[k] = temp[k-1] +  gain[i];
            k++;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<temp.length; i++)
        {
            if(max<temp[i])
                max = temp[i];
        }
        return max;
    }
}