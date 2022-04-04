/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Hamdy
 */
import java.util.ArrayList;

public class Package {

    private final ArrayList<Gift> gifts = new ArrayList<>();

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        return gifts.stream()
                .mapToInt(Gift::getWeight)
                .sum();
    }
}
