class Solution {
    public int maxProduct(int[] nums) {
       int max=nums[0];
       int min=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                int num=max;
                max=min;
                min=num;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            sum=Math.max(max,sum);
        }
        return sum; 
    }
}
