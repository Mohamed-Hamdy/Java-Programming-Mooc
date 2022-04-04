
public class HealthStation {

    private int counter;
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        counter++;      
        return person.getWeight();
    }

    public void feed(Person p){
        int W = p.getWeight();
        W += 1;
        p.setWeight(W);
    }

    public int weighings() {
        return counter;
    }
}
