import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        String s="";
        for(int i=0;i<digits.length;i++)
        {
            s+=Integer.toString(digits[i]);
        }
          BigInteger num = new BigInteger(s);
            num = num.add(BigInteger.ONE); 

       
        String s1 = num.toString();
        int len = s1.length();
        int arr[] = new int[len];
        for(int i =0;i<len;i++)
        {
            arr[i] = Integer.parseInt(Character.toString(s1.charAt(i)));
        }
        return arr;
    }
}