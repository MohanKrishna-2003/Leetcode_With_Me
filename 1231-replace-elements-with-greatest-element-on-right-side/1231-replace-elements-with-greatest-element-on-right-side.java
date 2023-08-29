class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        for(int i=n-1; i>=0; i--)
        {
            int temp = arr[i];
            arr[i] = max;
            if(max<temp)
                max = temp;
        }
        return arr;
    }
}