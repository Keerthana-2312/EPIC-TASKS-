package Number_program;

public class Armstrong {

    public static void main(String[] args) {

        int n = 153;
        int t = n;
        int s = 0;

        while (t > 0) {
            int d = t % 10;
            s = s + (d * d * d);
            t = t / 10;
        }

        if (s == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}