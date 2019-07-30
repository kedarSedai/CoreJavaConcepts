package ObjectCreation;

public class Book  { //Declaration of Class Book
     int a ; //they are Local Variable
    private String name;//They are instance Variable
    private int price;

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
}
