class firstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i,j=1;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==j)
            {
                j++;
            }
        }
        return j;
    }
}