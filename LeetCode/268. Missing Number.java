/* 
better approach: do hashing create a separate array with range [0,n+1] for storing the frequency of all elements present in the array. 
If any element has freq 0 then return that element
*/

class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length;
      int freq[]=new int[n+1];
      for(int i=0;i<n;i++)
      {
        freq[nums[i]]=1;
      }
      for(int i=0;i<=n;i++)
      {
        if(freq[i]==0)
        return i;
      }
      return -1;
    }
}

/*
optimised approach : Use XOR, xor the elements of given array and xor all the elements from range [0,n] and then return the answer of xor of these two
*/

class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length,xor1=0,xor2=0;
      for(int i=0;i<n;i++)
      {
        xor1=xor1^nums[i];
      }
      for(int j=0;j<=n;j++)
      {
        xor2=xor2^j;
      }
      return xor1^xor2;
    }
}
