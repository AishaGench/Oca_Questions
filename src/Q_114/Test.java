package Q_114;

public class Test {
    public static void main(String[] args) {
        int numbers[];
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;

        numbers = new int[4];
        numbers[2] = 30;
        numbers[3] = 40;

        for (int x : numbers) {
            System.out.print(" " + x);

        }
    }
}
/*
What is the result?
A. 10 20 30 40
B. 0 0 30 40
C. Compilation fails.
D. An exception is throw at runtime.

 Answer : B

 */
