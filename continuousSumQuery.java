public class Sudhir {
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
              int A = 5;
              int [][]B = new int [3][3];
             //[[1, 2, 10], [2, 3, 20], [2, 5, 25]]
              for(int i =0; i<B.length; i++){
                    for(int j =0; j<B[0].length; j++){
                          B[i][j] = sc.nextInt();
                    }
              }
              System.out.println(solve(A,B));
      }
      
    public static int[] solve(int A, int[][] B) {
      int[] ans = new int [A];
      for(int i=0;i<B.length; i++){
            int l=B[i][0]-1;
            int r=B[i][1]-1;
            int val=B[i][2];
            ans[l]+=val;
            if(r+1<ans.length){
                 ans[r+1]-=val;
            }
      }
          
      for(int i=1;i<ans.length;i++){
          ans[i]=ans[i-1]+ans[i];
      }

            return ans;
   }
}
