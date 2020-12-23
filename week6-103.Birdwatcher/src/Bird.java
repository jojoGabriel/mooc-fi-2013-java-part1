/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int observed;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }
    
    public void observed() {
        this.observed++;
    }
    
    public String name() {
        return this.name;
    }
    
    public String toString() {
        return String.format("%s (%s): %d observations",
                this.name,
                this.latinName,
                this.observed);
    }
    
}
