class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int sum1=0;
        for (int i =0;i<n;i++){
            sum1=sum1+nums[i];

        }
        int sum2=(n+1)*n/2;
        int missing =sum2-sum1;
        return missing;
    }
}
