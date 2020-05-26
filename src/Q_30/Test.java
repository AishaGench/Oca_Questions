package Q_30;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        if(x++ <++y){
            System.out.print("Hello ");
        }else{
            System.out.println("Welcome ");
        }
        System.out.println("Log " + x + ":" +y);
    }
}
        /*
        What is the result?
        A. Hello Log 2:2
        B. Welcome Log 1:2
        C. Welcome Log 2:1
        D. Hello Log 1:2

        Answer: A
         */
