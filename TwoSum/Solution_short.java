import java.util.Arrays;

public class Solution_short{

    public static int[] twoSum(int[] nums, int target) {

        int sum=0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                sum = nums[i] + nums[j];
                if(sum==target){
                    return new int[]{i,j};
                }                
            }            
        }
        return new int[]{0,0};
    }

   
    public static void main(String[] args) {
              
        int[] nums = {2,1,9,4,4,56,90,3};
        int target = 111;        

        System.out.println(Arrays.toString(twoSum(nums, target)));     
    }        
}
