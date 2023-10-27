class Solution {
    public boolean validMountainArray(int[] arr) {
        int pos = 1;
        int n = arr.length;
        while(pos<n && arr[pos-1]<arr[pos])
            pos++;
        if(pos==1 || pos==n)
            return false;
        while(pos<n && arr[pos-1]>arr[pos])
            pos++;
        return pos==arr.length;
    }
}