package Number_program;

public class Primenumber {

    public static void main(String[] args) {

        int n = 29;
        int c = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }

        if (c == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}