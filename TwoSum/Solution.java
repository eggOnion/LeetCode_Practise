import java.util.Arrays;

public class Solution{

    public static int[] twoSum(int[] nums, int target) {

        int sum = 0;
        int genesisIndex = 0;
        int[] result = new int[2];


        for(int i=genesisIndex; i<nums.length; i++){
        
            if((i+1) != nums.length)        //A protection to prevent ArrayIndexOutOfBounds
                sum = nums[genesisIndex] + nums[i+1];            

            if(sum==target){
                result[0] = genesisIndex;
                result[1] = i+1;
                break;
            }

            if(sum!=target && (i == nums.length-1)){    //Reaches the last index in the array
                
                if(genesisIndex==nums.length-1)     //final step to break the for loop if sum no match target
                    break;
                
                i=genesisIndex;      
                sum=0;       
                genesisIndex++;
                continue;                
            }                     
        }

        return result;
   }
    public static void main(String[] args) {
              
        int[] nums = {2,1,9,4,4,56,90,3};
        int target = 8;        

        System.out.println(Arrays.toString(twoSum(nums, target)));     
    }        
}
