import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = 2*a + b;
        System.out.println(c);
    }
}
