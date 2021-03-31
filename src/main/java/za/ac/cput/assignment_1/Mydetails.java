/*
 * This is  a simple java class that takes i my student details. And display them using a toString
 */
package za.ac.cput.assignment_1;

/**
 *
 * @author Alizwa Solibanzi - 220001499
 */
public class Mydetails 
{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mydetails{" + "name=" + name + ", StudNum=" + StudNum + ", course=" + course + '}';
    }

    public int getStudNum() {
        return StudNum;
    }

    public void setStudNum(int StudNum) {
        this.StudNum = StudNum;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
   private String name;
    private int StudNum;
   private String course;
   
   
            
}
