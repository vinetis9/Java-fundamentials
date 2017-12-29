/**
 * Created by ma on 2017-12-28.
 */
public class Car extends Machine {

    double cost;
    Car(int number, String brand, double cost){
        super(number, brand);
        this.cost = cost;

    }

    Car (double cost){
        super();
        this.cost = cost;

    }

   @Override
    public void changeNumber(){
        System.out.println("Changed number: ");
        this.number = 9999;

    }

        public double getCost(){
            return cost;
        }
}
