import java.util.List;

public class test {
    public static void testMethod (List<?extends Shape> shapeList){
        for (Shape shape : shapeList){
            System.out.println("This is shape of type " + shape.getClass().getName());
        }
    }
}
