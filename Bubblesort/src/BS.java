class BubbleSort{

    public static<T extends Comparable<T>> void BS(T array[]){
        boolean swap;

        for(int i=0;i<=array.length;i++){

            for(int j = i; j<=array.length;i++){

                int comp = array[i].compareTo(array[j]);
                T temp = array[j];
                array[j] = array[i];
                array[i] = temp;


            }




        }



    }


    public static void main(String[] args){




    }





        }
