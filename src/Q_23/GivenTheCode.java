package Q_23;

public class GivenTheCode {
    public static void main(String[] args) {
        // given the code fragment
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;
        /*  line n1  */
        do{
            idx++;
        }while (idx <size -1);
        System.out.println("The Top element: " + stack[idx]);
    }
    //Question :Which code fragment, inserted at line n1, prints The Top element: 30?

        /*
         * A. do{idx++;}while(idx>=size);

         * B. while(idx<size){idx++;}

         * C. do{ idx++;}while(idx<size-1);  <--Answer

         * D. do{idx++;} while(idx<=size);

         * E. while(idx<=size-1){idx++;}
         */
    //Cevap: do{
    //            idx++;
    //        }while (idx <size -1);
}
