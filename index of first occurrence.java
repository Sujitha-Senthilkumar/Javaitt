class Solution {
    public int strStr(String haystack, String needle) {
        int hlen=haystack.length();
        int nlen=needle.length();
        char[] hayarray=haystack.toCharArray();
        char[] neearray=needle.toCharArray();
        int i,j;
        for(i=0;i<=hlen-nlen;i++)
        {
            for(j=0;j<nlen;j++)
            {
                if(hayarray[i+j]!=neearray[j])
                {
                    break;
                }
            }
            if(j==nlen)
            {
                return i;
            }
        }
        return -1;
    }
    
}