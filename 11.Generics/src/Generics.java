import java.util.ArrayList;

/**
 * Created by ma on 2017-12-31.
 */
public class Generics {

    public static void main(String[] args){


        ArrayList<Employee> staff = new ArrayList<Employee>(10);

        staff.add(new Employee(1997, "Jacob"));
        staff.add(new Employee(1998, "James"));
        staff.add(new Employee(1999, "Ernie"));

        System.out.println(staff.size());  // 3

        staff.trimToSize();

        System.out.println(staff.size());  // 3

        Employee set = new Employee(1998, "James2");

        staff.set(1, set);

        for(Employee e: staff)
            System.out.println(e.getNumber() + " " + e.getName());

        staff.add(2, set );

        System.out.println();

        for(Employee e: staff)
            System.out.println(e.getNumber() + " " + e.getName());

        staff.remove(2);

        System.out.println();

        for(Employee e: staff)
            System.out.println(e.getNumber() + " " + e.getName());
    }

}
