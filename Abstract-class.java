abstract class Main {
  public String fname = "Doe";
  public int age = 24;
  public abstract void study(); // abstract method
}

class Student extends Main {
  public int graduationYear = 2018;
  public void study() { 
    System.out.println("Studying all day long");
  }
}

class Second {
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
