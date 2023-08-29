class Solution {
    public int fib(int n) {
        // if(n<=1)
        //     return n;
        // return fib(n-1)+fib(n-2);

   return (int)Math.floor((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));


    }
}