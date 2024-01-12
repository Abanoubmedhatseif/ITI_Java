import java.util.function.Predicate;

public class StringComparator {

    public static String betterString(String s1, String s2, Predicate<String> better) {
        return better.test(s1) ? s1 : s2;
    }

}
