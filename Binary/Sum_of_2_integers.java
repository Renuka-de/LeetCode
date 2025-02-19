class Solution {
    public int getSum(int a, int b) {
        while(b!=0)
        {
            int carry=(a&b)<<1; //computes the carry bit
            a=(a^b);
            b=carry;
        }
        return a;
    }
}
