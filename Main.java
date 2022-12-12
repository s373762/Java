import static java.lang.Math.*;

public class Main {

    public static double randNumber(){
        double rnd = 0;
        rnd = (Math.random() * 5) - 2 ;
        return rnd;
    }
    public static void main (String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        double[] x = new double[17];
        for (int i = 0; i < 17; i++) {
            x[i] = randNumber();
        }

        double[][] A = new double[16][17];

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 17; j++) {
                if (a[i] == 7) {
                    A[i][j] = (pow((0.25) / (asin(pow(E, -abs(x[j]))) + 3), sin(pow(x[j], 1 - x[j]))));
                } else if (a[i] == 3 || a[i] == 4 || a[i] == 8 || a[i] == 11 || a[i] == 12 || a[i] == 13 || a[i] == 14 || a[i] == 15) {
                    A[i][j] = pow(cos(pow(x[j] * (PI - x[j]), 2)), 3);
                } else {
                    A[i][j] = pow((cos(sin(pow(4 * (1 - x[j]), 3)))) / 2, 2);
                }

                System.out.printf("%-6.2f ", A[i][j]);

            }

            System.out.println();

        }


    }
}