package Q_57;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("JAVA SE 8"));
        System.out.println("Hello " + new MyString("JAVA SE 8"));// burada objeyi yazdirdigi icin hashcode veriyor
    }
}
