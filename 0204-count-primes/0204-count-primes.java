class Solution {
    public int countPrimes(int n) {
    boolean[] check=new boolean[n];
    return prime( n,check);
                                  }
    int prime(int n,boolean [] check)
  {   int count=0;
     for(int i=2;i*i<n;i++)
     {
      //if the value is false means,the value is prime
       if(!check[i])
       {
        for(int j=i*2;j<n;j+=i)
        //make all the value of prime to be true,means no-prime
         {
           check[j]=true;
         }
       }
     }
// after sorting boolean array,the value is false is prime & and true value is no-prime
     for(int i=2;i<n;i++)
     {
       if(!check[i])
       {
        count++;
       }
     }
     return count;
 }
}