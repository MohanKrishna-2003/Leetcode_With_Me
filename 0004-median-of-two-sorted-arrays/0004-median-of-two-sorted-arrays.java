class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] arr=new double[nums1.length+nums2.length];
        for(int i=0;i<arr.length;i++){
            if(i<nums1.length){
                arr[i]=nums1[i];
            }else arr[i]=nums2[arr.length-i-1];
        }
        Arrays.sort(arr);
        if(arr.length%2!=0){
            return arr[arr.length/2];
        }else return (arr[arr.length/2]+arr[(arr.length-1)/2])/2;
    }
}