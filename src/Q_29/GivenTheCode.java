package Q_29;

public class GivenTheCode {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
//        for(XXX){
//            System.out.println(a[e]);
//        }
        //Which option can replace xxx to enable the code to print 135?

        for(int e=0; e< 5; e +=2){
            System.out.print(a[e]);
        }

    }
        /*
        A : int e = 0; e<= 4; e++

        B: int e = 0; e< 5; e +=2

        C: int e = 1; e<= 5; e +=1

        D: int e = 1; e< 5; e ++2

        Answer is: B
         */




}
