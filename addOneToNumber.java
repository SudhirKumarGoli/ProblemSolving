public class Solution {
    
    public static void main(String[] args) {
          ArrayList<Integer> A = new ArrayList<>();
             //{0,9,9} or {1,2,3}
                A.add(0);
                A.add(9);
                A.add(9);
           System.out.println(plusOne(A));
      }
    
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
    
    //Creating a new array to store the elements after adding one.
        ArrayList<Integer> ans = new ArrayList<>();
        
        //taking variable with value 1 to add to the Nth element.
        int carry =1;
        
        //reversing the array
        Collections.reverse(A);
        
        //here we are adding carry to the last element if it is <9 and adding that value to the ans array.
        //if the element is 9 we are adding 1 to the element and doing mod with that value, we get 0 and then adding 0 to the ans array.
        //then we are fetching the xth element from the array A and dividing it by 10, if the element is 9 then we add carry 1 to it and divide it to get 1           in carry
        for(int x =0; x<A.size(); x++){
            ans.add((A.get(x)+carry)%10);
            carry = (A.get(x)+carry)/10;
        }
        
        //if all the elements are 9,9,9 like this then carry will be 1 and we add the carry to array at last.
        if(carry ==1){
            ans.add(1);
        }
        
        //we're reversing the array here.
        Collections.reverse(ans);
        
        //created new array to add ans array to delete the leading zeros by using if condition.
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i<ans.size(); i++){
            if(ans.get(i)==0 && res.size()==0){
                continue;
            }
            else {
                res.add(ans.get(i));
            }
        }

        return res;
    }
}
