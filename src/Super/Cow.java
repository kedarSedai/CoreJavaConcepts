package Super;

public class Cow extends Animal {
  String color = "white";

  public void printcolor() {
    System.out.println("Color of Animal is: " + super.color); /*we can use super keyword to access the data member
    or field of parent class.*/
  }
}
