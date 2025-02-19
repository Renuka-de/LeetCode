class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len=nums.length;
        if(len==0)
        {
            return null;
        }
         Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(int i=0;i<len-2;i++)
        {
           if(i==0||i>0&&(nums[i]!=nums[i-1]))
           {
            int left=i+1;
            int right=len-1;
            int target=-nums[i];
           while(left<right)
           {
            if(nums[left]+nums[right]==target)
            {
                list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                 while (left < right && nums[left] == nums[left + 1]) left++;
                 while (left < right && nums[right] == nums[right - 1]) right--;
                 left++;
                 right--;
            }
            else if (nums[left]+nums[right] < target) {
                        left++;
                    } else {
                        right--;
                    }
            }
            }
        }
        return list;
    }
}
