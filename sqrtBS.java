public class sqrtBS {

    public static void main(String[] args) {
        // binary search walata arrayma ganna one neh

        System.out.println(findsqrt(7));
    }
    static int findsqrt( int target){

        int start = 0;  //index values
        int end = target ; //index values


        /* dealing with indexes
         length = size = 7
         end = 6
         start = 0
         mid = (0 + 6) /2 = 3
       */


        while( start <= end){  // if periodical increment does not need use for but while

            int  mid = (start+ end)/2;  //increment eka udin liyanne

            if (target == mid *mid){

                return mid;
            } // while loop eke (last-1) bracket eken panna gaman aye while loop wenawa
            // while loop eke last bracket eka paninne true unoth witharai

            else if  (target < mid*mid){
                //index values
                end = mid-1; //index values
                start = start; //index values

            }
            else {                //don't write without else as out of brackets
                //index values
                start = mid + 1; //index values
                end = end; //index values
            }
        }


        return (int) start-1;
    }


}
