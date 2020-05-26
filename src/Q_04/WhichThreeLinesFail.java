package Q_04;
public class WhichThreeLinesFail {
    public static void main(String[] args) {
        int iVar =100;
        float fVar = 100.100f;
        double dVar = 123;
       // iVar = fVar;
        fVar = iVar;
        dVar = fVar;
      //  fVar = dVar;
        dVar = iVar;
       // iVar = dVar;
    }

    /*
    Which three lines fail to compile
    line 7
    line 10
    line 12
     */

    /*
        Second Version
        the question was same but number of lines was changed.
        ivar=fvar was at line 8.
        fvar=dvar at line 9.
        ivar= dvar at line 11.
        be careful at line numbers.
    */
}
