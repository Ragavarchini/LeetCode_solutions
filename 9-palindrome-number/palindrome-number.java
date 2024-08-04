class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||(x%10==0&&x!=0)){
            return false;
        }
        int copy = x;
        int rev_num =0;
         int rem=0;
         
    while(x!=0){
        rem = x%10;
        rev_num = rev_num*10+rem;
        x/=10;
    } 
  if(copy==rev_num)
    return true;
  else
    return false;
    }
}