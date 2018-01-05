import static java.lang.Math.pow;

/**
 * Created by ma on 2018-01-05.
 */
public class Wars {

    public static void main(String[] args) {

        System.out.print(squareDigits(21));

    }


    public static int squareDigits(int n) {
        int m = n;
        int i = 10;
        int sqrnumber = 0;
        while ((m/i) != 0) {
            m = n;

            i *= 10;

           // System.out.print(pow(n-(m/i)*i, 2));
            sqrnumber = sqrnumber + (int) pow(n-(m/i)*i, 2) * i/10;


        }
        return sqrnumber;
    }

}
