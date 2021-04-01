package za.ac.cput.assignment_1;

/*
 * @author Wilbur Smith 220003033
 */

/*This java class takes the deatials of a person and displays them using the toSting method*/

public class PersonDetails 
{//Start of class PersonDetails
    
    //Atributes of the class
    private String name, surname;

    //Constructor
    public PersonDetails(String name, String surname) 
    {
        this.name = name;
        this.surname = surname;
    }

    //Method used to access the name of the person
    public String getName() 
    {
        return name;
    }

    //Method used to modify the name of the person
    public void setName(String name) 
    {
        this.name = name;
    }

    //Method used to access the surname of the person
    public String getSurname() 
    {
        return surname;
    }

    //Method used to modify the surname of the person
    public void setSurname(String surname) 
    {
        this.surname = surname;
    }

    //Method used to give the details of the person, to the user
    @Override
    public String toString() 
    {
        return "PersonDetails{" + "name=" + name + ", surname=" + surname + '}';
    } 
    
}//End of class PersonDetails
