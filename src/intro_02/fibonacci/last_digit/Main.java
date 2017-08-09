package intro_02.fibonacci.last_digit;

import java.util.Scanner;

class Main {

    public int lastFibDigit(int nth) {
        int ldpp = 0;
        int ldp = 1;

        if (nth == 0)
            return ldpp;
        else if (nth == 1)
            return ldp;

        int ldn = 0;
        for (int i = 2; i <= nth; i++) {
            ldn = (ldpp + ldp) % 10;

            ldpp = ldp;
            ldp = ldn;
        }

        return ldn;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nth = s.nextInt();

        System.out.println(new Main().lastFibDigit(nth));
    }
}
