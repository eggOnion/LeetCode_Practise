import java.util.Arrays;

public class Solution{

    public static int[] twoSum(int[] nums, int target) {

        int sum = 0;
        int genesisIndex = 0;
        int[] result = new int[2];


        for(int i=0; i<nums.length; i++){
        
            if((i+1) != nums.length)        //this is a protection to prevent ArrayIndexOutOfBounds
                sum = nums[genesisIndex] + nums[i+1];            

            if(sum==target){
                result[0] = genesisIndex;
                result[1] = i+1;
                break;
            }

            if(sum!=target && (i == nums.length-1)){   
                
                if(genesisIndex==nums.length-1)
                    break;
                
                i=0;      
                sum=0;       
                genesisIndex++;
                continue;                
            }                     
        }

        return result;
   }
    public static void main(String[] args) {
              
        int[] nums = {2,7,11,15};
        int target = 17;        

        System.out.println(Arrays.toString(twoSum(nums, target)));     
    }        
}
