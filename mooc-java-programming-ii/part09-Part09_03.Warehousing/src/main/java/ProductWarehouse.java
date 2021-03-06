/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Hamdy
 */
public class ProductWarehouse extends Warehouse {

    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    public String getName() {
        return this.productName;
    }
    @Override
    public String toString(){
        return this.getName() + ": balance = " + super.getBalance() + ", space left " + super.howMuchSpaceLeft();
    }
}
