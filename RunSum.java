import java.util.Arrays;

public class RunSum{

        public static void main(String[] args) {

            int [] input = {1,4,5,6,7};

            int [] ans =  RunnableSum(input);

            System.out.println(Arrays.toString(ans));

        }

/* there are 2 types of methods to collect values to array 1. crete new array object in argument of fun 2. create new array obj in fun body but not good practice  */
        static int[] RunnableSum(int[] num){
            int [] sum = new int[num.length];
            sum[0]=num[0];
            for (int i = 1; i < num.length ; i++) {   // we need to care more about wether this should start from i=1 or i=0
                    //formula ekakta dakunu patten thamai values assign wennne
                sum[i] = sum[i-1] + num[i];


            }


            return sum;

        }
}
