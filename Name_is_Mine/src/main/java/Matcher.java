import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Matcher {

    public static void main(String[] args) {
        String[] couples = {
                "john johanna",
                "ira ira",
                "kayla jayla",
                "alex blex"
        };
        System.out.println(isMatch(couples.length, couples));
    }
    public static String isMatch(int T, String[] couples) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; ++i) {
            String[] names = couples[i].split(" ");
            String m = names[0];
            String w = names[1];

            //If both strings are equal this saves a lot of work
            if (Objects.equals(m, w)) {
                sb.append("YES \n");
                continue;
            }

            //W can't be a subsequence if it is shorter than M
            if (m.length() > w.length()) {
                sb.append("NO \n");
                continue;
            }

            int wIndex = 0;
            int foundChars = 0;
            for (int j = 0; j < m.length(); j++) {
                char cc = m.charAt(j);

                while (wIndex < w.length()) {
                    if (cc == w.charAt(wIndex)) {
                        ++foundChars;
                        ++wIndex;
                        break;
                    }
                    ++wIndex;
                }
            }
            if (foundChars == m.length()) {
                sb.append("YES \n");
            } else {
                sb.append("NO \n");
            }
        }

        return sb.toString();
    }
}
