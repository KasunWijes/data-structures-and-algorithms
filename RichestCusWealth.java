import java.util.Arrays;

import static java.lang.Math.max;


public class RichestCusWealth {


    public static void main(String[] args) {

        int [][] Account = {{1,2,3},
                            {3,2,4}};
        int ans = MaxWealth(Account);
        System.out.println(ans);
    }
    static int MaxWealth (int [][] arr){
        int maxwealth =0;
        for (int i = 0; i < arr.length ; i++) {
            int sum = 0;
            for (int j = 0; j <arr[i].length; j++) {  //inner for loop start from index 1 to sum

               sum  = sum + arr[i][j];  // sum of 2D arrays and 1D arrays together?  //Iterative summation is required for update an new array

            }
              maxwealth = Math.max(maxwealth,sum);
              // return 2D array in inner loop required?
        }
         //Scoping, we can only return value which is in same level
        return maxwealth;
        /*
        * Time complexity = rows*cols
        * space complexity = constant since no new varibles are creating +no recursion
        *
        * */
        
    }
    
    
    
}
