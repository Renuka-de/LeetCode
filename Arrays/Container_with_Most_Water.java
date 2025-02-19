class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int maxArea=0;
        while(low<high)
        {
            int h=Math.min(height[high],height[low]);
            int b=high-low;
            if(h*b>maxArea)
            {
                maxArea=h*b;
            }
            if(height[low]>height[high])
            {
                high--;
            }
            else{
                low++;
            }
        }
        return maxArea;
        
    }
}
