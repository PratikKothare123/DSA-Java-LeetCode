// Print All Binary Strings of size n without consicutive ones (1)
//Binarry String - "10001,"10001010",etc

 /*
     * Problem:
     * Print all binary strings of size N without consecutive 1's.
     *
     * Example:
     * n = 3
     *
     * Valid:
     * 000
     * 001
     * 010
     * 100
     * 101
     *
     * Invalid:
     * 011
     * 110
     * 111
     */

package Recursions;

public class BinaryString {
    
    public static void printBinaryString(int n,int lastplace, String str){
        //Base Case
        if(n==0){
            System.out.println(str);
            return;
        }

        // ---------------- CHOICE 1 ----------------
        // We can ALWAYS place '0'
        // because 0 never creates consecutive 1's.
        printBinaryString(n-1,0,str+"0");



          // ---------------- CHOICE 2 ----------------
        // We can place '1'
        // ONLY IF previous character was 0.
        //
        // lastPlace = 0
        //      0 -> 1  ✔ Allowed
        //
        // lastPlace = 1
        //      1 -> 1  ✘ Not Allowed
        //
        if(lastplace==0){
            printBinaryString(n-1, 1, str+"1");
        }

    }
    public static void main(String[] args) {
        int n = 3;
     /*
         * Initially:
         *
         * n = 3
         * lastPlace = 0
         * str = ""
         *
         * lastPlace is taken as 0 because
         * initially no character exists.
         */
    printBinaryString(n,0,"");
}
}

// 000
// 001
// 010
// 100
// 101