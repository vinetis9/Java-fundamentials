import ocean.Chief;

import java.util.Random;


/**
 * Created by ma on 2017-12-26.Importing packages. 
 */


public class Employe_II
 {

    public static void main(String[] args) {

        Boss boss = new Boss("Bronislaw");

        System.out.println(boss.getName());


        Chief chief = new Chief("Andrzej");

        System.out.println(chief.getName());

    }
 }



class Employe{

    private String givenName;
    private String surname;
    private int dob;
    private int number;


    //default constructor
    Employe() {
        System.out.println("Randomizing constructor running");
        Random random = new Random();
        this.number = random.nextInt(9000) + 1000;

        this.givenName = "?";
        this.surname = "?";
        this.dob = 0;

    }

    Employe(String givenName, String surname, int dob){
        this();
        System.out.println("First constructor running");

        this.givenName=givenName;
        this.surname=surname;
        this.dob=dob;

    }

    Employe(String givenName ,int dob){
        this();
        System.out.println("Second constructor running");

        this.givenName=givenName;
        this.dob=dob;

    }



    Employe(String surname){
        this();
        System.out.println("Third constructor running");

        this.surname=surname;


    }

    Employe(int dob, String givenName ){
        this();
        System.out.println("Fourth constructor running");

        this.givenName=givenName;
        this.dob=dob;

    }

    //getters
    public String getGivenName(){
        return givenName;
    }

    public String getSurname(){
        return surname;
    }

    public int getDob(){
        return dob;
    }

    public int getNumber(){
        return number;
    }

    //setter
    public void setGivenName(String givenName){
        this.givenName=givenName;
    }

}
