class Solution {
    public int addDigits(int num) {
      
      int sum = checkSum(num);
      while(sum>9)
        {
            sum = checkSum(sum);
        }
        return sum;
      
    }
    public static int checkSum(int num)
    {
        int sum = 0;
        while(num>0)
        {
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
}