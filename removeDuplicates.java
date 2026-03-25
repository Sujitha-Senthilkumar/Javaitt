class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int i,j=0;
        int len=nums.length;
        if(len==0)
        {
            return 0;
        }
        for(i=1;i<len;i++)
        {
            if(nums[i]!=nums[j])
            {
                j++;
                nums[j]=nums[i];
            }

        }
        return j+1;
    }
    
}