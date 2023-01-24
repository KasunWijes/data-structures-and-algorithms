import java.util.Arrays;

public class SumTranglefromanArray {

    public static void main(String[] args) {

        int[] ar = {3,4,6,7};
        printTran(ar);

    }

    static void printTran(int [] arr){

        if (arr.length<1)         //if does not need curly brackets
            return;

        //base condition to return from the fun

        int [] sum = new int [arr.length-1];    //

        for (int i = 0; i < arr.length-1; i++) {
            int val = arr[i]+arr[i+1];
            sum[i] = val;
        }

        //make a recurssive call and pass the newly created array

        printTran(sum); // backtracking(print reverse oder) if fun call first then print
        System.out.println(Arrays.toString(arr));  //print input array




    }






}
