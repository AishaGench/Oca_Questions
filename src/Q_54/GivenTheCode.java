package Q_54;

public class GivenTheCode {
    public static void main(String[] args) {
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for(int i = 0; i< arr.length; i++){
            for(int j =0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
                if(arr[i][j].equals("B")){
                    break;
                }
            }
            continue;
        }
    }

}

        /*
        What is the result?
        A. A B C
        Lead to pass your exam quickly and easily. First Test, First Pass! - visit - http://www.certleader.com
        B. A B C D E
        C. A B D E
        D. Compilation fails.

        Answer: C
         */
