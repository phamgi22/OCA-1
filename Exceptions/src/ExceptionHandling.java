import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
//        System.out.println(a());
//        System.out.println(b());
//        System.out.println(c());;
        Parent p = new Child();
        try {
            p.process();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String a() {

        try {
            return "ok";
        } catch (Exception e ) {
            System.out.println("Exception occured");
            return "exception";
        } finally {
            System.out.println("finally sections...");
            return "finally";
        }
    }

    public static String b() {
        try {

        } catch (Exception e) {
            System.out.println("Exception occured");
            return "exception";
        } finally {
            System.out.println("finally section...");
            return "finally";
        }
    }

    public static String c() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception occured");
            return "exception";
        } finally {
            System.out.println("Finally section...");
            return "finally";
        }
    }

    public static String d() {
        try {
            return "ok";
//        } catch (IOException e) {
//
//        } catch (NoSuchMethodException e) {
//
//        } catch (ClassNotFoundException e) {


//        } catch (RuntimeException e) {

        } catch (Exception e) {
            return "Exception";
        }

    }
}
