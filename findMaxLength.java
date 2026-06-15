class findMaxLength {
    public int findMaxLength(int[] nums) {
        int maxLen=0;
        for(int i=0;i<nums.length;i++)
        {
            int zeros=0;
            int ones=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]==0)
                {
                    zeros++;
                }
                else
                {
                    ones++;
                }
                if(zeros==ones)
                {
                    int currentlen=0;
                    currentlen=j-i+1;
                    if(currentlen>maxLen)
                    {
                        maxLen=currentlen;
                    }
                }
            }
        }
        return maxLen;
    }
}
