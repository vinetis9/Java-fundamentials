/**
 * Created by ma on 2017-12-27.
 */
final class Bed {                   //You can't extend a class that is declared final

    private int cost;
    Bed(int cost){
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
