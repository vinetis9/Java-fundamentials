/**
 * Created by ma on 2017-12-27.
 */
public class Inheritance_I {

    public static void main(String[] args){

        Furniture furniture = new Furniture(5);
        Table table = new Table(2, 99);
        Bed bed = new Bed (9999);

        System.out.println(table.getCost());
        System.out.println(table.getNumberOfLegs());
        System.out.println(Table.getId());          // Id is a class variable since it is static!
        System.out.println(bed.getCost());


    }


}

class Furniture{


    private int cost;
    private static int Id = 0;

    public Furniture(int cost) {

        this.cost = cost;
        Id++;
    }



    public int getCost() {
        return cost;
    }

    public static int getId() {
        return Id;
    }
}


