import java.util.Arrays;

public class Solution{

    public static int[] twoSum(int[] nums, int target) {

        int sum = 0;
        int[] result = new int[2];


        for(int i=0; i<nums.length; i++){
            
            if((i+1) != nums.length)        //this is a protection to prevent ArrayIndexOutOfBounds
                sum = nums[i] + nums[i+1];

            if(sum==target){
                result[0] = i;
                result[1] = i+1;
                break;
            }          
        }

        if(sum != target)
            System.out.println("You did not hit your target");
        else
            System.out.println("You hit the target! \n" + Arrays.toString(result));         

        return result;
   }
    public static void main(String[] args) {
              
        int[] nums = {2,7,11,15};
        int target = 26;        

        twoSum(nums, target);
        

        //Retrieve the return value from twoSum method
        // for (int i : twoSum(nums, target)) {
        //     System.out.println(i);
        // }
    }
        
}
