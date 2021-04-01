/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

/**
 *
 * @author Lindiwe Thokozile Somana
 * @student number 218076509
 * 
 */
public class Events {
    
    private String address, time;
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
            this.address = address;
    }
    
    public String getTime(){
        return time;
    }
    
    public void setTime(String time){
        this.time = time;
    }
   
    
 @Override
    public String toString(){
     return "Events {" + "Addresss:  " + address + ", Time:   " + time + '}';
    }
}
