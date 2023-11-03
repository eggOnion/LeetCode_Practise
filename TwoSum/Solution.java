public class Solution{
    public static void main(String[] args) {
              
        int[] nums = {2,7,11,15};
        int sum = 0;
        int target = 26;


        for(int i=0; i<nums.length; i++){
            
            if((i+1) != nums.length)        //this is a protection to prevent ArrayIndexOutOfBounds
                sum = nums[i] + nums[i+1];

            if(sum==target){
                System.out.println("You hit the target!");
                System.out.println("index is: [" + i + "," + (i+1)+"]");
                break;
            }          
        }

        if(sum != target)
            System.out.println("You did not hit your target");
   }
}