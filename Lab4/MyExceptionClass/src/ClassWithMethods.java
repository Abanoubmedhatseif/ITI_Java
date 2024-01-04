public class ClassWithMethods {
    void method1() throws MyOwnExceptionClass {
        int x = 20 ;
        int y = 0 ;
        int z =0;
        if ( y == 0 ) {
            throw new MyOwnExceptionClass("This is method 1 ");
        }
        else {
            z = x/y ;
        }

    }

    void method2() throws MyOwnExceptionClass {
        int x = 20 ;
        int y = 103 ;
        int z =0;
        if ( y == 0 ) {
            throw new MyOwnExceptionClass("This is method 2 ");
        }
        else {
            z = x/y ;
        }
    }

    void method3() throws MyOwnExceptionClass {
        int x = 20 ;
        int y = 0 ;
        int z =0;
        if ( y == 0 ) {
            throw new MyOwnExceptionClass("This is method 3 ");
        }
        else {
            z = x/y ;
        }
    }





}

