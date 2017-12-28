/**
 * Created by ma on 2017-12-28.
 */

import java.util.*;
public class Machines {

    public static void main(String[] args)
    {

        Machine[] machine = new Machine [10];

        machine[0] = new Machine();
        machine[1] = new Machine(4, "Samsung");
/*
        machine[1].changeNumber();
       System.out.println(machine[1].getNumber());
        System.out.println(machine[0].getId());
*/
        Car audi = new Car(4, "Audi", 555.5);
        audi.changeNumber();
        System.out.println(audi.getNumber());

        Car car = new Car(777, "BMW", 4.4);
        Machine machinek = (Machine) car;
        System.out.println(machinek.getNumber());

       // System.out.println(machinek.getCost()); error

        System.out.println(machine[1] instanceof Car);     //check- false
        System.out.println(machinek instanceof Machine);   //ckeck- true


    }
}

class Machine{

    int number;
    String brand;
    int id;

    Machine(int number, String brand){
        this();
        this.number=number;
        this.brand=brand;
    }

    Machine (){
         Random rand = new Random();
         this.id = rand.nextInt(60) + 1;
         this.number = 0;
         this. brand = "X";
    }


    public void changeNumber(){
        System.out.println("Type a number: ");
        Scanner nr = new Scanner(System.in);
        this.number = nr.nextInt();

    }

    public int getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public int getId() {
        return id;
    }
}