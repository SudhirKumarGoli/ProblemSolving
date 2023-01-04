int[] ans = new int [b.length];
for(int i=0;i<B.length; i++){
      int l=B[ i ][ 0 ]-1
      int r=B[ i ][ 1 ]-1
      int val=B[ i ][ 2 ];
      ans[ l ]+=val;
      if(r+1<ans.length){
           ans[r+1]-=val
      }
}
for(int i=1;i<ans.len;i++){
    ans[i]=ans[i-1]+ans[i]
}
return ans;
