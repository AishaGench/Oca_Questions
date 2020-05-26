package Q_19.p1;

public class Acc {
    int p;              //not visible outside of the package
    private int q;      //only visible within the class
    protected int r;
    public int s;       //Only public is accessible through the object references outside package

}
    /*
    Protected is inheritable to sub class (outside the package)
    so there for if the sub class’ object was created
    then you could access to the protected variable.
    But the object was created from super class

     */

        /*
         Which statement is true?
         A. Both p and s are accessible via obj.
         B. Only s is accessible via obj.
         C. Both r and s are accessible via obj.
         D. p, r, and s are accessible via obj.

         Answer: B
         */