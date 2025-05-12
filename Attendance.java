class MyException extends Exception {
    MyException() {
        super("This is a custom exception.");
    }
}

public class Attendance {
    public static void main(String args[]) {
        try {
            throw new MyException();
        } catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}