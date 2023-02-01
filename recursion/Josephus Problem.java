
class Solution
{
   public int josephus(int n, int k)
    {
        //Your code here
     return jos(n,k)+1;    // since index starts from 1
    }
        
    int jos(int n , int k){
        
        
        if(n==1) return 0;
        
        return (jos(n-1, k)+k)%n;
    }

}