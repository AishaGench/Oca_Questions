package Q_60;

public class C extends B {
    public C(){                // line n2
        System.out.println("C ");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
/*
What is the result?
A. C B A
B. C
C. A B C
D. Compilation fails at line n1 and line n2

Answer: C
 */