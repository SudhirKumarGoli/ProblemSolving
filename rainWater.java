public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int res =0;
        int [] prefix = new int [A.length];
        int [] suffix = new int[A.length];
        prefix[0] = A[0];
        suffix[A.length-1]= A[A.length-1];
        for(int i =1; i<A.length; i++){
            prefix[i] = Math.max(prefix[i-1],A[i]);
        }
        for(int i =A.length-2; i>=0; i--){
            suffix[i] = Math.max(suffix[i+1],A[i]);
        }

        for(int i =1; i<A.length; i++){
            res += Math.min(prefix[i],suffix[i])-A[i];
        }
        return res;
    }
}
