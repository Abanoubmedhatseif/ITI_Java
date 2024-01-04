import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassWithMethods class404 = new ClassWithMethods();

        try {
            class404.method1();
        }catch (MyOwnExceptionClass e1) {
            System.out.println("This is catch1 Output " + e1.getMessage());
        }finally {
            System.out.println("This is Final in method 1 ");
        }

        try {
            class404.method2();
        }catch (MyOwnExceptionClass e2) {
            System.out.println("This is catch2 Output " + e2.getMessage());
        }finally {
            System.out.println("This is Final in method 2 ");
        }

        try {
            class404.method3();
        }catch (MyOwnExceptionClass e3) {
            System.out.println("This is catch1=2 Output " + e3.getMessage());
        }finally {
            System.out.println("This is Final in method 3 ");
        }





    }
}