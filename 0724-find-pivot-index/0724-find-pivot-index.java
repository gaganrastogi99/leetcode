class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        int leftSum=0;
        int rightSum;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            rightSum=totalSum-leftSum-nums[i];
             if(leftSum==rightSum)
             {
            return i;
             }
             leftSum+=nums[i];
        }
      return -1;  
    }
}