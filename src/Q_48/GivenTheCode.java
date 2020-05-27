package Q_48;

import java.util.ArrayList;
import java.util.List;

public class GivenTheCode {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3, "cyan");
        System.out.println(colors);
    }

    //What is the result?
//A.	[green, red, yellow, cyan]
//B.	[green, blue, yellow, cyan]
//C.	[green, red, cyan, yellow]
//D.	An IndexOutOfBoundsException is thrown at runtime.

//Answer: D

    //2. version
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("green");
//        colors.add("red");
//        colors.add("blue");
//        colors.add("yellow");
//        colors.add(3,"cyan");
//
//        System.out.println(colors);

     //3. version
//        List<String> colors = new ArrayList<>();
//        colors.add("green");
//        colors.add("red");
//        colors.add("blue");
//        colors.add("yellow");
//        colors.remove(2);
//        colors.add(3,"cyan");
//
//        System.out.println(colors);




}
