
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */
public class BirdDB {
    
    ArrayList<Bird> birds;
    
    public BirdDB() {
        this.birds = new ArrayList<Bird>();
    }
    
    
    public void add(String name, String latinName) {
        Bird bird = new Bird(name, latinName);        
        this.birds.add(bird);
    }
    
    
    public void observed(String name) {
        
        for (Bird bird : this.birds) {
            if (bird.name().equalsIgnoreCase(name)) {
                bird.observed();
                return;
            }
        }
        System.out.println("Is not a bird!");
        
    }
    
    
    public void stats() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }
    
    public void show(String name) {
        for (Bird bird : this.birds) {
            if (bird.name().equalsIgnoreCase(name)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
}
