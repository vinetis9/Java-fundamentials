/**
 * Created by ma on 2017-12-24.
 */
public class Shop {

    public static void main (String []args) {
        // creating Tesco and Lidl objects
        Shops Tesco = new Shops("Tesco", 200.5, 11);
        Shops Lidl = new Shops("Lidl", 1000000, 12222);

        System.out.println(Lidl.getNumberOfClients());
        System.out.println(Lidl.getName());

        Lidl.addClient();
        System.out.println(Lidl.getNumberOfClients());


        Shops Small[] = new Shops[2];
        Small[0] = new Shops("Aldi", 9999, 98888);
        System.out.println(Small[0].getNumberOfClients());

    }

}

 class Shops{

    //In the spirit of encapsulation, it is common to make fields private
    private String name;
    private double cash;
    private int numberOfClients;

     // constructor

    public Shops(String name, double cash, int numberOfClients){

        this.name=name;
        this.cash=cash;
        this.numberOfClients=numberOfClients;

    }
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


}