import java.util.Arrays;

public class Solution {
    public int[] decode(int[] encoded) {
      int n=encoded.length+1;
      int p[]=new int[n];
      int x=0;
      for(int i=1;i<=n;i++){
x^=i;
      }
      int odd=x;
      for(int i=1;i<n-1;i+=2){
        odd^=encoded[i];
      }
      p[0]=odd;
      for(int i=1;i<n;i++){
        p[i]=p[i-1]^encoded[i-1];
      }
return p;
}
}