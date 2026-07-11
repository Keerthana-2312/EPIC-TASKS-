package Number_program;
public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b);
        for (int i = 3; i <= n; i++) {

            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}