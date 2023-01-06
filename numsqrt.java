public class numsqrt {

    //square root is mid value
    public static void main(String[] args) {
        int ans = mySqrt(8); //no sppace in Heap since ans is reffernecing to x object
        System.out.println(ans);

    }

    static int mySqrt(int x) {

        int i = 0;   //space complexcity 4 byte
        int sq = i * i; //space complexcity 4 byte
        while (x >= sq) {  // big O (log2x) time complexity
            sq = i * i;
            i++;


//        while(i*i < x){
//            i+=1;
//        }
//        if (i*i == x) {
//            return i;
//        }
//        else{
//            return i-1;
//        }
//cannot add operations to LHS

        }
        return (int) (i-1);  //time complexity O(1)


    }
}

