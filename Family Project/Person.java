
/**
 * Write a description of class Person here.
 * 
 * @author Anthony Dragone
 * @team: TEAM FAM
 * @team_members: Chris, NIIIIIIIIIIIIIIIIICK
 * @version 10/10/2016
 */
public class Person
{
    String firstName;
    String middleName;
    boolean isMale;
    int age;
   
    //Template Person
    public Person()
    {
        firstName = "John";
        middleName = "Wilkes";
        isMale = true;
        age = 0;
    }
    
    //Make new person and set all variables
    public Person(String firstName, String middleName, boolean isMale, int age)
    {
        this.firstName = firstName.trim().toUpperCase();
        this.middleName = middleName.trim().toUpperCase();
        this.isMale = isMale;
        this.age = age;
    }
    
    //Make new person with age set to 0
    public Person(String firstName, String middleName, boolean isMale)
    {
        this.firstName = firstName.trim().toUpperCase();
        this.middleName = middleName.trim().toUpperCase();
        this.isMale = isMale;
        this.age = 0;
    }
    
    //Returns first name of person
    public String getFirstName()
    {
       return firstName;
    }
    
    
    //returns gender of person
    public String getGender()
    {
        if(isMale == true)
        {return "male";}
        else
        {return "female";}
    }
   
    //returns initials of person
    public String getInitials()
    {
        return firstName.substring(0,1) + "." + middleName.substring(0,1) + ".";
    }
   
    //increases person's age
    public void incrementAge()
    {
        age++;
    }
   
    //returns person's age
    public int getAge()
    {
        return age;
    }
   
    //returns person's middle name
    public String getmiddleName()
    {
        return middleName;
    }
   
    //Block to change someone's name
    public void changeName(String firstName)
    {
        String newName;
        if(firstName != null)
        {
            newName = firstName.trim().toUpperCase();
            if(newName.isEmpty())
            {
                System.out.println("First name changed to: " + newName);
            }
            else
            {
                this.firstName = firstName;
                System.out.println("New first name does not contain any valid characters");
            }
        }
        else
        {
            System.out.println("New first name is null");
        }
    }
}
