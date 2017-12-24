/**
 * Created by ma on 2017-12-24.
 */

/**
 * Created by ma on 2017-12-24.
 */
public class ShopsII {

    public static void main (String []args) {
        // creating Tesco and Lidl objects
        Shops Tesco = new Shops("Tesco", 200.5, 11);
        Shops Lidl = new Shops("Lidl", 1000000, 12222);


        System.out.println(Tesco.getPI());
        System.out.print(Tesco.isequal(Tesco));  //true
    }

}

class Shops{

    //In the spirit of encapsulation, it is common to make fields private
    private String name;
    private final double cash;  //when keyword 'final' is used, field has to be initialized while creating an object
    private int numberOfClients;
    private static double PI=3.14;      //a member belongs to the class instead of a specific instance

    // constructor

    public Shops(String name, double cash, int numberOfClients){

        this.name=name;
        this.cash=cash;
        this.numberOfClients=numberOfClients;

    }

    //Field accessors
    public String getName(){

        return name;
    }

    public double getCash(){

        return cash;
    }

    public int getNumberOfClients(){

        return numberOfClients;
    }


    public void addClient(){

        numberOfClients++;
    }

    public boolean isequal(Shops shop){     //methods in a class can access any private field in every object of the same class
        return name.equals(shop.name);      //comparing two strings
    }

    public static double getPI(){

        return PI;
    }


}