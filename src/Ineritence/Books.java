package Ineritence;

public class Books {

  /*The this keyword can be used to refer current class instance variable.
    If there is ambiguity between the instance variables and parameters,
    this keyword resolves the problem of ambiguity. */
  private String name; //instance variable of string name
  private int price;  //instance variable ot int price

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void display() {
    System.out.println("Name of Books is: " + getName() + "Price of Books is " + getPrice());
  }

}
