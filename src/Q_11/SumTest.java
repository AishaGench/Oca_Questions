package Q_11;

public class SumTest {
    public static void doSum(Integer x, Integer y) {
        System.out.println("Integer sum is " + (x + y));
    }

    public static void doSum(double x, double y) {
        System.out.println("double sum is " + (x + y));
    }

    public static void doSum(float x, float y) {
        System.out.println("float sum is " + (x + y));
    }

    public static void main(String[] args) {  //before primitive
        doSum(10, 20);
        doSum(10.0, 20.0);

    }

/*
            //  SECOND VERSION
     public static void doSum(Integer x, Integer y) {
        System.out.println("Integer sum is " + (x + y));
    }
    public static void doSum(double x, double y) {
        System.out.println("double sum is " + (x + y));
    }
    public static void doSum(float x, float y) {
        System.out.println("float sum is " + (x + y));
    }
    public static void doSum(int x, int y) {
        System.out.println("int sum is " + (x + y));
    }
    public static void main(String[] args) {  //once primitive cagrilir
        doSum(10, 20);
        doSum(10.0, 20.0);
    }

 */

}
    /*
    What is the result? for FIRST version
    A. Option A
    float sum is 30.0
    double sum is 30.0
     */

    /*
    Result of SECOND
    int sum is 30
    double sum is 30.0
     */
