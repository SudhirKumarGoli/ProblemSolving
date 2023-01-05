public class Sudhir {
        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 3};
            System.out.print(solve(arr));
        }
        
        public static int solve(int[] A) {
            int ans =0;

            for(int j =0; j<A.length; j++){
                int l =0, r =0;
                for(int i = j-1; i>=0; i--){
                    if(A[i]<A[j]){
                        l++;
                    }
                }
                
                for(int k = j+1; k<A.length; k++){
                    if(A[k]>A[j]){
                        r++;
                    }
                }
                
                ans += l*r;
            }
            
            return ans;
        }
}

