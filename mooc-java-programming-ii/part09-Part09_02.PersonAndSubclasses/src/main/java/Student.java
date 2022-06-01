/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Hamdy
 */
public class Student extends Person {

    private int amount = 0;

    public Student(String name, String address) {
        super(name, address);
        this.amount = 0;
    }

    public void study() {
        this.amount++;
    }

    public int credits() {
        return amount;
    }

    @Override
    public String toString() {
        return super.getName() + '\n' + "  " + this.getAddress() + '\n' + "  Study credits " + this.credits();
    }
}
