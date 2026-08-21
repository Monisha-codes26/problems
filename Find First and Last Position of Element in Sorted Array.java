class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int first = -1;

        while(start<=end){
            int mid = (start + (end-start)/2);
            if(nums[mid]==target){
                first = mid;
                end = mid-1; 
            }
            else if(nums[mid]<target)
                start = mid+1;
            else if(nums[mid]>target)
                end = mid-1;

        }
        // System.out.println("The mid is = "+req);

        start = 0;
        end = n-1;
        int last = -1;

        if(first==-1)
            return new int[]{-1,-1};
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                last = mid;
                start = mid+1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return new int[]{first,end};


    }
}
