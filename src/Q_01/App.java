package Q_01;

public class App {
    public static void main(String[] args) {
        Boolean[] bool = new Boolean[2];

        bool[0] = new Boolean(Boolean.parseBoolean("true"));
        bool[1] = new Boolean(null); //null returns false because it has no value

        System.out.println(bool[0] + " " + bool[1]);

    }
}
/*
Second Version
this is changed
bool[0] = new boolean(1);
bool[1]=new boolean(boolean.parseBoolean("true");
.println(bool[0]+" "+bool[1]);
answer is =
false true
Not: if you don't see true then false
 */

// What is teh result?
// A True False
//B. True null
//C. Compilation fails
//D. A NullPointerException is thrown at runtime

//Answer : A