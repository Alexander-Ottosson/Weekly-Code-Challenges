package lights;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 3, 2, 1};
        int[] a = new int[A.length / 2];
        int[] b = new int[A.length / 2];
        for (int j = 0; j < A.length / 2; j++) {
            a[j] = A[j];
            b[j] = A[(A.length - 1) - j];
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
