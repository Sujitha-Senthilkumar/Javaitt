class searchInsert {
    public int searchInsert(int[] nums, int target) {
        int i,j=0;
        int len=nums.length;
        for(i=0;i<len;i++)
        {
            if(nums[i]>=target)
            {
                return i;
            }
        }
        return len;
    }
}