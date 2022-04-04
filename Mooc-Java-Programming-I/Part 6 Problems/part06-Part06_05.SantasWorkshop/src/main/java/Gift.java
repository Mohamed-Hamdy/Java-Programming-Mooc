
import java.text.MessageFormat;
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
public class Gift {

    private String name;
    private int weight;

    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Gift setName(String name) {
        this.name = name;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Gift setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String toString() {
        return MessageFormat.format("{0} ({1} kg)", name, weight);
    }
}
