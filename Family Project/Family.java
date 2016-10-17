
/**
 * Write a description of class Family here.
 * 
 * @author Anthony Dragone 
 * @team Team Fam
 * @teammembers Chris, Nick
 * @version 10/11/2016
 */
public class Family
{
  String surname;
  Person husband;
  Person wife;
  Person child;
  Person baby;
  
  //Set family name and set people as husband and wife
  public Family(String surname, Person husband, Person wife)
  {
    this.surname = surname.trim().toUpperCase();
    this.husband = husband;
    this.wife = wife;
  }
  
  //Returns the last name of the family
  public String getSurname()
  {return surname;}
  
  //Returns the name of the husband
  public Person getHusband()
  {return husband;}
  
  //Returns the name of the wife
  public Person getWife()
  {return wife;}
  
  //Returns the name of the child
  public Person getChild()
  {return child;}
  
  /* THIS IS BUGGED */
  public void haveChild(Person child)
  {
      System.out.println(child + " is born.");
      this.child = child;
  }
  
  /* THIS IS BUGGED */
  public void haveChild(String firstName, String middleName, boolean isMale)
  {
      Person baby;
      System.out.println(firstName + " is born.");
      child = this.baby;
  }
  
  //Increase age of all family members
  public void haveFamilyBirthday()
  {
      this.husband.incrementAge();
      this.wife.incrementAge();
      System.out.println("Husband is now " + husband.getAge() + " years old. Wife is now " + wife.getAge() + " years old.");
      if(child != null)//If child exists, then it prints the child's age
      {
          this.child.incrementAge();
          System.out.println("Child is now " + child.getAge() + " years old.");
      }
  }
  
  //Prints whether ther is a child or not
  public void printChild()
  {
      if(child != null)
      {
          System.out.println("The " + surname + " family " + child.getGender() + " child is: " + child.getFirstName() + " " + child.getmiddleName() + " (" + child.getAge() + ")");
      }
      else
      {
          System.out.println("THere is no child in the " + surname + " family.");
      }
  }
  
  //Prints the initials of the family members
  public void printFamilyInitials()
  {
      System.out.println("The " + surname + " family:\n" +
      "Husband: " + husband.getInitials() + " Age: " + husband.getAge() + "\n" +
      "Wife: " + wife.getInitials() + " Age: " + wife.getAge());
      if(child != null) //prints the initals of the child if child exists
      {System.out.println("Child: " + child.getInitials() + " Age: " + child.getAge());}
  }
}