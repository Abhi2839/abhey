public class min_in_rotated_sorted_array{
    public static int findMin(int[] nums) {
        int n=nums.length;
        int ans=-1;
        int left=0,right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=nums[n-1]){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 5,6,7,1, 2};
    System.out.println(findMin(nums));
    
    }
}