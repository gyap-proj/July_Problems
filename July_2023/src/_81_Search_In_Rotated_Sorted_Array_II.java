public class _81_Search_In_Rotated_Sorted_Array_II {


    public static boolean search(int[] nums, int target){
        int left = 0, right = nums.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(nums[mid] == target){
                return true;
            }

            if(nums[left] == nums[mid]){
                left++;
                continue;
            }

            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                } else{
                    left = mid + 1;
                }
            } else{
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                } else{
                    right = mid - 1;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 0));
    }
}
