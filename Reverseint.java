class Reverseint {
    public int reverse(int x) {
        int n;
        long rev=0;
        while(x!=0)
        {
            n=x%10;
            rev=rev*10+n;
            x=x/10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
        {
            return 0;
        }
        return (int) rev;
    }
}