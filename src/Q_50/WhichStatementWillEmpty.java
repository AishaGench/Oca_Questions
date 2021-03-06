package Q_50;

public class WhichStatementWillEmpty {
    /*
        Which statement will empty the contents of a StringBuilder variable named sb?
        A. sb. deleteAll ();
        B. sb. delete (0, sb. size () );
        C. sb. delete (0, sb. length () );
        D. sb. removeAll ();

        Answer: C
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.delete(0,sb.length()); //--> deletes the string
        System.out.println(sb);
    }
}
