public class BinarySearch {

    public static void main(String[] args) {
        int nums[] = {2,5,6,7,9,10,12};
        System.out.println(BinarySearch(nums,9));
    }

    // parameters can write with its data type, no need to initialize seperately

    static int BinarySearch(int arr[] , int target){

        int start = 0;  //index values
        int end = arr.length -1 ; //index values

        /* dealing with indexes
         length = size = 7
         end = 6
         start = 0
         mid = (0 + 6) /2 = 3
       */


        while( start <= end){  // if periodical increment does not need use for but while

           int  mid = (start+ end)/2;  //increment eka udin liyanne

            if (target == arr[mid]){

                return arr[mid];
            } // while loop eke (last-1) bracket eken panna gaman aye while loop wenawa
            // while loop eke last bracket eka paninne true unoth witharai

            else if  (target < arr[mid]){
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


        return -1;
    }

}
