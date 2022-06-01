
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed Hamdy
 */
public class Abbreviations {

    private Map<String, String> abbreviation = new HashMap<String, String>();

    void addAbbreviation() {
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviation.put(abbreviation, explanation);

    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviation.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }

    }

    public String findExplanationFor(String abbreviation) {
        if (this.hasAbbreviation(abbreviation)) {
            return this.abbreviation.get(abbreviation);
        } else {
            return null;
        }
    }

}
