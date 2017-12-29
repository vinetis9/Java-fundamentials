/**
 * Created by ma on 2017-12-29.
 */
public class Polymorphism {

    public static void main(String[] args){

        Plant plant1 = new Plant();
        Tree tree  = new Tree();

        Plant plant3 = plant1;

        //polymorphism
        Plant plant2 = tree;

        plant2.grow();

        tree.shedLeaves();

        // plant2.shedLeaves(); //error

        doGrow(tree);

    }


    public static void doGrow(Plant plant){
        plant.grow();
    }

}


