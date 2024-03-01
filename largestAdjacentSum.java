public class largestAdjacentSum {
    static int maxAdjacentSum (int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n - 1; i++){
            int currSum = nums[i] + nums[i + 1];
            if(currSum > max)
                max = currSum;
        }

        return max;
    }
    public static void main(String[] args) {
        // int[] nums = {1,2,3,4};
        // int[] nums = {{18, -12, 9, -10};
        // int[] nums = {1,1,1,1,1,1,1,1,1};
        int[] nums = {1,1,1,1,1,2,1,1,1};
        System.out.println(maxAdjacentSum(nums));
    }
}