class Solution {
    public void swap(int[] nums,int x,int y)
    {
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public void moveZeroes(int[] nums) {
        int i,j,n=nums.length;
        for(j=0;j<n;j++)
        {
            if(nums[j]==0)
            break;
        }
        i=j+1;
        for(;i<n;i++)
        { 
            if(nums[i]!=0){
            swap(nums,i,j);
            j++;
            }
        }
}
}
