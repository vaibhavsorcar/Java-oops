// =====================
// Non-Access Modifiers for attributes and methods
//1. final	
//2. static - simply called by function call.
//3. abstract	
//4. transient
//5. synchronized
//6. volatile	
// =====================

// For static method:
  
public class Main {
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
  public static void main(String[ ] args) {
    myStaticMethod(); 
    Main myObj = new Main();
    myObj.myPublicMethod();
  }
}
