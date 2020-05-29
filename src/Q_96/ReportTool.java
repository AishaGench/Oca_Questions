package Q_96;

public class ReportTool extends Tool {
//    void export(){                 //line n2
//        System.out.println("RTool::export");
//    }
    public static void main(String [] args) {
           Tool aTool = new ReportTool();
           Tool bTool = new Tool();
           callExport(aTool);
            callExport(bTool);
   }
     public static void callExport (Exportable ex){
                ex.export ();
    }
    /*
    What is the result?
    A. Compilation fails only at line n1.
    B. Compilation fails only at line n2.
    C. Tool::exportTool::export
    D. Compilation fails at both line n1 and line2.
    E. RTool::exportTool::export

    Answer is: B
     */
}
/*
interface Exportable {
    void export(); //default olarak public
}
class Tool implements Exportable {
    protected void export() {         // line n1
        System.out.println("Tool::export");
    }
}
class ReportTool extends Tool {
    public void export () {   // line n2
        System.out.println("RTool::export");
    }
    public static void main(String [] args) {
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }
    public static void callExport (Exportable ex){
        ex.export ();
   }
}

// ANSWER: Compilation fails only at line n1.
 */