import java.util.Arrays;

public class BuildArray {

    public static void main(String[] args) {

        int [] nums = {0,2,1,5,3,4};
        int [] x = buildArray(nums);

        //withput toSring method only the memory address of the object is print
        System.out.println(Arrays.toString(x));

    }

static int[] buildArray(int[] nums){
            // array size count from 1
            //Avoid coner cases failing by fixing array size
        int[] ans = new int[nums.length];

        for (int i : nums){

            ans[i] = nums[nums[i]];

        }
        return ans;


    }

}