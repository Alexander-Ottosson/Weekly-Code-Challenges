import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyPin {
    public static void main(String[] args) {
        System.out.println(isValidPin("121317")); //should be true
        System.out.println(isValidPin("1234")); //should be true
        System.out.println(isValidPin("45135")); //should be false
        System.out.println(isValidPin("89abc1")); //should be false
        System.out.println(isValidPin("900876")); //should be true
        System.out.println(isValidPin(" 4983")); //should be false
    }

    public static boolean isValidPin(String pin) {
        Pattern pattern = Pattern.compile("^\\d{4}(\\d{2})?$");
        Matcher matcher = pattern.matcher(pin);
        return matcher.find();
    }
}
