/*  Why Encapsulation?
Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method), 
or write-only (if you only use the set method)
Increased security of data  */

public class Person {
  private String name; 

  public String getName() {
    return name;
  }
  public void setName(String newName) {
    this.name = newName;
  }
}

public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("Tyson"); 
    System.out.println(myObj.getName());
  }
}
