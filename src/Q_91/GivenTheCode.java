package Q_91;

public class GivenTheCode {
    public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        //String s3 = (String)(s1 + s2); // line n1
        Long s4 = (long) s1 + s2; //line n2
        System.out.println("Sum is " + s4);

        /*
        What is the result?
        A. Sum is 600
        B. Compilation fails at line n1.
        C. Compilation fails at line n2.
        D. A ClassCastException is thrown at line n1.
        E. A ClassCastException is thrown at line n2.
        Answer: B
        */
    }
    //second way:
    /*
public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        Long s4 = (long) s1 + s2;
       // String s3 = (String)(s1 + s2); //LINE N2

    //our example
//       Character c1 = 'A';
//       String s2 = (String)c1;

        System.out.println("Sum is " + s4);
    }
}
//they change the string and long so be careful line with STRING is the answer
//because String gives us compilation fails
     */

}
