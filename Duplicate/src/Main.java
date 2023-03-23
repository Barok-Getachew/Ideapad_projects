public class Main {
    public static void main(String[] args) {

        int[] nums = {1,1,1,2,3,3,4};
        int j = 1;
            if(nums[0] == nums[1]){
                for(int i =1; i< nums.length - 1 ;i++){
                    if(nums[i] < nums[i+2]){

                        nums[j] = nums[i+2];
                        j++;

                    }
                    System.out.println(nums[j]);
                }
            }





    }
}