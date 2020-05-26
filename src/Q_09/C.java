package Q_09;

 class C {
    public C() {
        System.out.println("C");
    }
}
class B extends C {
    public B() {                   //line n1
        System.out.println("B");
    }
}
class A extends B {

    public A() {            //line n2
        System.out.println("A");
    }

    public static void main(String[] args) {
        A a = new A();
    }
}

    /*
    What is the result?
    A. C B A
    B. C
    C. A B C
    D. Compilation fails at line n1 and line n2

    Answer: A

    in another version change the class name so attentions
 */

