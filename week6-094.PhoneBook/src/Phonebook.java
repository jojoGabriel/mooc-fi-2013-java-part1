/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */

import java.util.ArrayList;

public class Phonebook {
    
    private ArrayList<Person> persons = new ArrayList<Person>();
    
    public void add(String name, String number) {
        Person p = new Person(name, number);
        persons.add(p);
    }
    
    public void printAll() {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
    
    public String searchNumber(String person) {
        for (Person p : persons) {
            if (p.getName().contains(person)) {
                return p.getNumber();
            }
        }
        return "number not known";
    }
    
}
