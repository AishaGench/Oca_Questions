package Q_75_Clothing.pants;
// line n1

//import static Q_61_84.Q75.clothing.Shirt.getColor; //Answer C
//import Q_61_84.Q75.clothing.Shirt; //Answer A
public class Jeans {
    public void matchShirt(){
        // line n2
        // String color = getColor(); //C sikki
        //  String color = Shirt.getColor();  //A sikki
//        if(color.equals("Green")){
//            System.out.print("Fit");
//        }
    }

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }
}
/*
    Which two sets of actions, independently, enable the code fragment to print Fit?
    A. At line n1 insert: import clothing.Shirt;At line n2 insert: String color = Shirt.getColor();
    B. At line n1 insert: import clothing;At line n2 insert: String color = Shirt.getColor();
    C. At line n1 insert: import static clothing.Shirt.getColor;At line n2 insert: String color = getColor();
    D. At line n1 no changes required.At line n2 insert: String color = Shirt.getColor();
    E. At line n1 insert: import Shirt;At line n2 insert: String color = Shirt.getColor();
    Answer: A C
    we inserted the options in answer A :
        line n1: import clothing.Shirt (since our package starts with Q75 our one has that too)
        line n2 :  String color = Shirt.getColor();
        and it printed Fit on the console
 */
