class Solution {
    public int[] reverse(int[] arr,int start,int end)
    {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public void rotate(int[] nums, int k) {
       int n=nums.length,j=0,i;
       int rotate=k%n;
        reverse(nums,0,(n-rotate-1));
        reverse(nums,(n-rotate),n-1);
        reverse(nums,0,n-1);
       
}
}
