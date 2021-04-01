/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

/**
 *
 * @author Sinethemba Sithela
 */
public class SmallApp 
{
    private String name, salary, age;
    
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSalary() {
        return salary;
    }
    
    public void setSalary(String salary){
        this.salary = salary;
        
    }
    
    public String getAge() {
        return age;
    }
    
    public void setAge(String age){
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "SmallApp" + "Name: " + name + "Salary: " + salary + "Age: " + age;
    }
}
