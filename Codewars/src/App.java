/**
 * Created by ma on 2018-01-05.
 */
public class App {

    public static void main(String[] args){


    System.out.print(DnaStrand.makeComplement("TCGA"));



    }
}
 class DnaStrand {
    public static String makeComplement(String dna) {
       char array[] = dna.toCharArray();

       for(int i=0; i<array.length;i++){
          switch(array[i]){
              case 'A': array[i]='T';
              break;
              case 'T': array[i]='A';
                  break;
              case 'G': array[i]='C';
                  break;
              case 'C': array[i]='G';
                  break;


          }
       }

       String finstr = String.valueOf(array);
        return finstr;
    }
}