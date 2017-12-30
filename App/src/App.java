/**
 * Created by ma on 2017-12-30.
 */
public class App {

    public static void main(String[] args){

        Person[] people = new Person[3];
     people[0] = new Student();
    people[1] = new Student();

    people[2] = new Teacher();

    for(Person p : people){
        p.show();
    }

    }


}

abstract class Person{

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public  int getId(){return id;};

    public abstract void show();






}
