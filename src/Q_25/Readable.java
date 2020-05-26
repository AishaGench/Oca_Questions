package Q_25;

/*in interface we can create in two ways abstract method
 1)with abstrackt keyword.
 2) without abstrackt keyword
when a class imp. an abstract class methods need to be initialize
 */
interface Downloadable{
    public void download();
}
interface Readable extends Downloadable {        // line 1
    public void readBook();
}
abstract class Book implements Readable{        //line 2
    public void readBook(){
        System.out.println("Read Book");
    }
}
class EBook extends Book { //line 3
    public void download(){ }  //we need to add absract method in nonabstract class
    public void readBook() {
        System.out.println("Read E-Book");
    }
}
//    public static void main(String[] args) {
//        Book book1 = new EBook();
//        book1.readBook();
//
//}
        /*
        What is result?
        A.Compilationfailsatlinen2.
        B.ReadBook
        C.ReadE-Book
        D.Compilationfailsatlinen1
        E. Compilation fails at line n3.

        Answer: E
        */
