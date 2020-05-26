package Q_03;

public class GivenTheCodeFragment {
    public static void main(String[] args) {

        int num[][] = new int[1][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 10;
            }

        }

/*
Which option represents the state of the num array after successful completion of the outer loop
Answer A
num[0] [0] = 10;
num[0] [1] = 10;
num[0] [2] = 10;

1-3 => [{10,10,10}]

3-1 => [{10},{10},{10}]
 */



        //SECOND VERSIONS

        int num2 [][] =  new int[3][1];
        for (int i = 0 ; i < num2.length; i++){
            for (int j = 0; j < num2[i].length; j++){
                num2[i][j] = 10;
            }
        }
//        num [0] [0] = 10
//        num [1] [0] = 10
//        num [2] [0] = 10
    }

}
