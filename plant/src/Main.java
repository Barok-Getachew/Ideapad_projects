import java.util.Map;

public class Main {

    void Roman(){

    }
    public static void main(String[] args) {

      int nums[] = new int[]{1, 0, 0, 0, 0,0,0,0,0,0,0,1};
      int l = nums.length;

      for(int i = 0 ; i<l-1 ; i++){
          if (l % 2 == 0) {
              if(nums[i] > nums[i+1] && nums[i] != nums[i+3])
                  nums[i+2] = 1;


          }
          else {
              if(nums[i] > nums[i+1] && nums[i] != nums[i+1]){
                  nums[i+2] = 1;
          }





      }
      }


        for(int k =0;k<l;k++){
            System.out.println(nums[k]);

    }
}}