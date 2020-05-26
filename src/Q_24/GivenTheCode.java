package Q_24;

public class GivenTheCode {
    public static void main(String[] args) {
        // Given the code fragment
        String[] strs = new String[2];
        int idx = 0;
        for ( String s : strs){
            strs[idx].concat(" element " + idx);  //we can not concat if array is null
            idx++;
        }
        for (idx =0; idx < strs.length; idx ++){
            System.out.println(strs[idx]);
        }
    }
    /*
    What is the result?
    A. Element 0Element 1
    B. Null element 0Null element 1
    C. NullNull
    D. A NullPointerException is

    Answer is: D
    */

}
