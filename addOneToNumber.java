public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
    
    //Creating a new array to store the elements after adding one.
        ArrayList<Integer> ans = new ArrayList<>();
        
        //taking variable with value 1 to add to the Nth element.
        int carry =1;
        
        //reversing the array
        Collections.reverse(A);
        
        //here we are adding carry to the last element which is <9 and adding that value to the ans array.
        //if the element is 9 we are adding 1 to the element and doing mod with that value and then adding 0 to the ans array.
        //then 
        for(int x =0; x<A.size(); x++){
            ans.add((A.get(x)+carry)%10);
            carry = (A.get(x)+carry)/10;
        }
        if(carry ==1){
            ans.add(1);
        }

        Collections.reverse(ans);
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
