package Q_35;

public class GivenTheClass {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3};
        int nums2[] = {1, 2, 3, 4, 5};
        nums2 = nums1;
        for (int x : nums2) {
            System.out.print(x + " ");
            //what is the result?
        }
    }
}
        /*
            What is the result?
            A. 1:2:3:4:5:
            B. 1:2:3:
            C. Compilation fails.
            D. An ArrayOutOfBoundsException is thrown at runtime

            Answer is : B. 1:2:3


         */