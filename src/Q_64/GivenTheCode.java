package Q_64;

public class GivenTheCode {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i] + " ");
            if (arr[i].equals("C")) {
                continue;
            }
            System.out.println("Work done");
            break;
        }
    }
    // Answer: A Work done
    //Baska bir sekilde sorulmus continue ve break in yeri degistirilmis ve cevap:A B C Work done
}
