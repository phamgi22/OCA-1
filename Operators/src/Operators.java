import java.util.Scanner;
public class Operators {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        logicalOps(x, y);
        simpleMaths(x, y);
        System.out.println(modulus(x, y));
        incrDecr();
    }

    public static void logicalOps(int x, int y) {
        if (x > 0 && y > 0) {

        } else if (x < 0 && y < 0) {

        } else if (x == 0 || y == 0) {

        } else if (x < 0 || y < 0) {

        }
    }

    public static void simpleMaths(int x, int y) {
        int sum = x + y;
        int dif = Math.abs(x - y);
        int product = x * y;
        int quo = x / y;

        System.out.println(String.format("The sum of %d ad %d is %d", x, y, sum));
        System.out.println(String.format("The dif of %d ad %d is %d", x, y, dif));
        System.out.println(String.format("The product of %d ad %d is %d", x, y, product));
        System.out.println(String.format("The quotient of %d ad %d is %d", x, y, quo));
    }

    public static boolean modulus(int x, int y) {
        return x % y == 0;
    }

    public static void incrDecr() {
        int x=0, w=0, y=0, z=0;
        x=4;
        /*
        x = 4
        y = 0
        w = 0
        z = 0
         */
        System.out.println(++x);// 5
        System.out.println(x++);// 5
        System.out.println(x); // 6
        System.out.println(--x); // 5
        System.out.println(x--); // 5
        System.out.println(x); // 4
        w=20;
        x=10;
        y=-5;
        z=0;
        System.out.println( w == x && y != z ); // false
        System.out.println( w == x || y != z ); // true
        System.out.println( ! ( w == (x + z) )); // true
    }
}