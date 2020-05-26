package Q_16;

public class GivenCode {
    public static void main(String[] args) {
        String[][] arr = {{"A", "B", "C"},{"D", "E"}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
                if(arr[i][j].equals("B")){
                    continue; //when we write something under the continue, it gives us to compile error
                }
            }
            continue;
        }
        //Answer is : A B C D E

        /*
        String[][] arr = {{"A", "B", "C"},{"D", "E"}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
                if(arr[i][j].equals("B")){
                    break;
                }
            }
            continue;
        }
        //Answer is : A B D E
         */

        /*
        String[][] arr = {{"A", "B", "C"},{"D", "E"}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
                if(arr[i][j].equals("B")){
                    continue;
                }
            }
            break;
        }
        //Answer is : A B C
         */



    }
}
