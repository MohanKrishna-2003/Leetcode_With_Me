class Solution {
    public int maxArea(int[] height) {
        int i=0, j=height.length-1, maxArea = 0;
        while(i<j)
        {
            int area = Math.min(height[i], height[j]) * (j-i);
            maxArea = Math.max(maxArea, area);
            if(height[i]<height[j])
                i++;
            else 
                j--;
        }
        return maxArea;
    }
}