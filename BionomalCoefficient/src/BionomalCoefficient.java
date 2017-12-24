/**
 * Created by ma on 2017-12-24.
 */
public class BionomalCoefficient {

    public static void main(String[] args ){

       final int MAX=12;
       int array[][]=new int [MAX][];

       for(int n=0;n<MAX;n++){
           array[n]=new int [n+1];        //creating triangular array

       }

        for(int n=0;n<array.length;n++){
           for(int k=0;k<array[n].length;k++) {
               int coef = 1;
               for(int i=1;i<=k;i++) {
                   coef = (coef * ((n + 1) - i)) / i;
                    array[n][k] = coef;
               }
           }

        }

        for(int n=0;n<array.length;n++) {
            for (int k = 0; k < array[n].length; k++)
                System.out.printf("%4d", array[n][k]);

                System.out.println();


        }


    }
}
