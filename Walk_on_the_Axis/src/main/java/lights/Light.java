package lights;

import java.util.Arrays;

public class Light {

    public static void main(String[] args) {
        int[] N = {
               2,
               1,
               2
        };
        System.out.println(shutOff(N.length, N));
    }

    public static String shutOff(int T, int[] N) {
        StringBuilder sb = new StringBuilder();
        // Sorts the array
        Arrays.sort(N);
        int currentPosition = 0;
        boolean goingRight = true;
        int totalDistance = 0;
        for (int i = 0; i < T; i++) {
            int distance;
            if (goingRight) {
                //person is moving right
                int index = T - i;
                if (i == 0) {
                    index = T - 1;
                }
                distance = N[index] - currentPosition;

                currentPosition = N[T - (i + 1)];
                goingRight = false;
            } else {
                //Person is moving left
                distance = currentPosition - N[i-1];

                currentPosition = N[i-1];
                goingRight = true;
            }

            sb.append(distance);
            sb.append("\n");
            totalDistance += distance;
        }
        sb.append("Total Distance: ");
        sb.append(totalDistance);
        return sb.toString();
    }
}
