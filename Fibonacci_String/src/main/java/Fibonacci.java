import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Number of iterations:");
        int n = Integer.parseInt(reader.readLine());

        System.out.println("Character 0");
        char a = reader.readLine().charAt(0);

        System.out.println("Character 1");
        char b = reader.readLine().charAt(0);

        char[] c = new char[] { a, b };

        System.out.println("Generated Sequence");
        System.out.println(generate(n, c));

        //System.out.println(generate(3, new char[] {'j', 'h'}));
    }

    public static String generate(int n, char[] c) {
        if (n < 2) {
            return "invalid";
        }

        StringBuilder sequence = new StringBuilder();
//        sequence.append(c[0]);
//        sequence.append(", ");
//        sequence.append(c[1]);
        for (int i = 0; i < n; i++) {
            sequence.append(fibonacci(i, "", c));
            if (i != n - 1) {
                sequence.append(", ");
            }
        }

        return sequence.toString();
    }

    private static String fibonacci(int n, String s, char[] c) {
        if (n == 1) {
            return String.valueOf(c[1]);
        }
        if (n == 0) {
            return String.valueOf(c[0]);
        }

        if (n < 1) {
            return "";
        }

        String s1 = fibonacci(n - 1, s, c);
        String s2 = fibonacci(n - 2, s, c);

        return s1 + s2;
    }
}
