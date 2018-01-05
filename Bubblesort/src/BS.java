class BubbleSort{

    public static<T extends Comparable<T>> void BS(T array[]){
        int j;

        for(int i=0;i<array.length;i++){

            for(j = i; j<array.length;j++){

                int comp = array[i].compareTo(array[j]);

                if(comp>0) {
                    T temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                }


            }




        }



    }


    public static void main(String[] args){

        int[] arr1 = {4,23,6,78,1,54,231,9,12};
        int last = arr1.length;

        for(int i = 0;i<arr1.length;i++)
            System.out.print(arr1[i] + "\t");
            System.out.println();

        Integer[] array = new Integer[last];
        for (int i=0;i<last;i++) {
            array[i] = arr1[i];
        }

        BS(array);

        for(int i = 0; i<array.length;i++)
            System.out.print(array[i] + "\t");


    }





        }
