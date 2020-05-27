package Q_57;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("JAVA SE 8"));
        System.out.println("Hello " + new MyString("JAVA SE 8"));// burada objeyi yazdirdigi icin hashcode veriyor
    }
/*
NOT: Q_57 --> soruda p1 yani package name olarak verilmis
    What is the result?
    A
    Hello Java SE 8
    Hello Java SE 8
    B
    Hello java.lang.StringBuilder@<<hashcode1>>
    Hello Q_57.MyString@<<hashcode1>>
    C
    Hello Java SE 8
    Hello Q_57.MyString@<<hashcode1>>
    D
    Compilation fails at the Test class


    A. Option A
    B. Option B
    C. Option C
    D. Option D
    Answer: C
 */

}
