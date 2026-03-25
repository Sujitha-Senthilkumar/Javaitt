class sortColors {
    public void sortColors(int[] nums) {
        int i,j;
        int len=nums.length;
        for(i=0;i<len-1;i++)
        {
            for(j=0;j<len-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}