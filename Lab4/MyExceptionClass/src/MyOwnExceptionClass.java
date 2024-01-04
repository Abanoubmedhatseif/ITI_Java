public class MyOwnExceptionClass extends Exception {
    MyOwnExceptionClass(){
        super("This is the default error handler");
    }
    MyOwnExceptionClass(String ErrorMessage){
        super(ErrorMessage);
    }

}
