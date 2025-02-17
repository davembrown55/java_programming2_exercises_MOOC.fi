
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davem
 */
public class Abbreviations {
    private HashMap <String, String> abbreviationDictionary;
    
    public Abbreviations() {
        this.abbreviationDictionary = new HashMap <>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviationDictionary.put(abbreviation, explanation);        
    }
    
    public boolean hasAbbreviation(String abbreviation){
        String sanitizedAbbreviation = sanitizedString(abbreviation);
        
        if (sanitizedAbbreviation.equals("")){
            return false;
        }        
        return this.abbreviationDictionary.containsKey(sanitizedAbbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        if(hasAbbreviation(abbreviation)) {            
            return this.abbreviationDictionary.get(sanitizedString(abbreviation));
        } else {
            return null;
        }
    }
    
    private String sanitizedString (String str) {
        if (str == null || str.trim().length() == 0){
            return "";
        }          
        String sanitizedString = str.trim();
        sanitizedString = sanitizedString.toLowerCase();    
        return sanitizedString;
    } 
    
    
}
