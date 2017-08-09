package intro_02.fibonacci.small;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nth = in.nextInt();

        int fpp = 0, fp = 1, fn = 0;
        if (nth == 0)
            fn = fpp;
        else if (nth == 1)
            fn = fp;

        for (int i = 2; i <= nth; i++) {
            fn = fpp + fp;
            fpp = fp;
            fp = fn;
        }

        System.out.println(fn);
    }
}
