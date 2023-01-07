public class test {
    public static void main(String[] args) {
        int [] A = {-5};
        System.out.println(firstMissingPositive(A));
    }
    public static int firstMissingPositive(int[] A) {
      //making all numbers that are <= 0 to length+2, so it will make easy for us to find the first missing positive number.
        for(int i =0; i<A.length; i++){
            if(A[i]<=0){
                A[i] = A.length+2;
            }
        }
      
      //Here we are taking absolute value of the ith element and check whether it lies >= 1 and <=A.length if it lies then we are marking it as negative.
        for(int i =0; i<A.length; i++){
            int ele = Math.abs(A[i]);
            if(ele>=1 && ele<=A.length){
                if(A[ele-1]>0){
                    A[ele-1]=-1*A[ele-1];
                }
            }
        }
      
      //if the ith element is a non negative number then the ith+1 is the first positive integer is missing.
        for(int i =0; i<A.length; i++){
            if(A[i]>0){
                return i+1;
            }
        }

        return A.length+1;
    }
}
