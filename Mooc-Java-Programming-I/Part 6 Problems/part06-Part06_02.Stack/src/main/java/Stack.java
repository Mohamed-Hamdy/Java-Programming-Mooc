
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed Hamdy
 */
public class Stack {

    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return (this.stack.isEmpty());

    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        ArrayList<String> newList = this.stack;
        return newList;
    }

    public String take() {
        final String topMost = stack.get(stack.size() - 1);
        stack.remove(topMost);
        return topMost;
    }
}
