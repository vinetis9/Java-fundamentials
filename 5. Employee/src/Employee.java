/**
 * Created by ma on 2017-12-25.
 */

import java.util.Random;

public class Employee {

    public static void main(String[] args){

        Employe[] em = new Employe[5];

        em[0] = new Employe("Marcin", "Gemra", 1997);       // -> First constructor
        System.out.println(em[0].getGivenName());
        System.out.println(em[0].getNumber());

        em[1]=new Employe("Poltorak");         // -> Third constructor
        em[2]=new Employe("Jan",2000);  // -> Second constructor
        em[3]=new Employe(1999, "Kowalski"); // -> Fourth constructor
        em[4]=new Employe();                            // -> default/randomizing constructor


        for(Employe e: em )                         //for each loop
            System.out.println(e.getGivenName());

        em[1].setGivenName("setted");               //setter

        for(Employe e: em )
            System.out.println(e.getGivenName());
    }



}


class Employe{

    private String givenName;
    private String surname;
    private int dob;
    private int number;             // unique random numbers are given to every employee


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
        this();                                                            // call to this must be first statement in constructor
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
