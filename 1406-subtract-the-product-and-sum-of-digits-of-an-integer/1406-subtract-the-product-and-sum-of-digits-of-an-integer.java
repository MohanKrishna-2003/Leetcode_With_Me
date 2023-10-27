class Solution {
    public int subtractProductAndSum(int n) {
        int prod = getProduct(n);
        int sum = getSum(n); 
        return prod - sum;  
    }

    public static int getProduct(int n)
    {
        int prod = 1;
        while(n>0)
        {
            prod *= n%10;
            n/=10;
        }
        return prod;
    }

    public static int getSum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}