import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        String firstString = "Java";
        String secondString = "Python";

        Predicate<String> isBetter = str -> str.length() > 6;
        String result = StringComparator.betterString(firstString, secondString, isBetter);
        System.out.println("Better string: " + result);

        Predicate<String> isBetter2 = str -> str.length() > 3;
        String result2 = StringComparator.betterString(firstString, secondString, isBetter2);
        System.out.println("Better string: " + result2);
    }
}