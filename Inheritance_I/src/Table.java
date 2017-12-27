/**
 * Created by ma on 2017-12-27.
 */
class Table extends Furniture {

   private int numberOfLegs;
    Table(int cost, int numberOfLegs){
        super(cost);                            //the super keyword is used to invoke a superclass's constructor
        this.numberOfLegs = numberOfLegs;

    }


    public int getNumberOfLegs(){

        return numberOfLegs;
    }
}
