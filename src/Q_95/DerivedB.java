package Q_95;

public class DerivedB extends DerivedA {
    public void test(){
        System.out.println("DerivedB ");
    }

    public static void main(String[] args) {
//        Base b1 = new DerivedB();
//        Base b2 = new DerivedA();
//        Base b3 = new DerivedB();
//        b1 = (Base) b3;
//        Base b4 = (DerivedA) b3;
//        b1.test();
//        b4.test();
        /*
        What is the result?
        A. BaseDerivedA
        B. BaseDerivedB
        C. DerivedBDerivedB
        D. DerivedBDerivedA
        E. A ClassCastException is thrown at runtime.

        Answer: C
         */
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b2;
        Base b4 = (DerivedA) b3;
        b4 = b3;
        b1.test();
        b4.test();

        //Answer: DerivedA DerivedB
    }
}
