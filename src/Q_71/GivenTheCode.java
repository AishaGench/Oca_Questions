package Q_71;

public class GivenTheCode {
    //What is the result
    public static void main(String[] args) {
        int[][] arr = new int[2][4];

        arr[0] = new int[]{1,3,5,7};
        arr[1] = new int[]{1,3};

        for (int[] a : arr){
            for (int i=0; i< arr.length; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
    /*
    What is the result?
        A. 1 3 5 71 3
        B. 1 31 3
        C. 1 31 3 0 0
        D. 1 3followed by an ArrayIndexOutOfBoundsException
        E. Compilation fails.

        Answer: B
     */

}
