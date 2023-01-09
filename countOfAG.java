public class Solution {
    public int solve(String A) {
        long countOfA=0;
        long countOfAG=0;
        int mod=(int) (Math.pow (10,9) +7);
        for(int i=0;i<A.length(); i++){
            if (A.charAt(i) == 'A'){
                countOfA++;
            }
            else if(A.charAt(i)=='G'){
                countOfAG+=countOfA;
            }
        }
            return (int) (countOfAG%mod);
        
    }
}
