package Q_21;

public class GivenTheCode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int i = 0;
        do{
            System.out.print(arr[i] + " ");
            i++;
        }while (i< arr.length +1);
    }

}
//Answer is : 1 2 3 4 followed by an ArrayIndexOutOfBoundsException
