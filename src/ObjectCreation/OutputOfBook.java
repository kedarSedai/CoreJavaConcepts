package ObjectCreation;

public class OutputOfBook {
    public static void main(String[] args) {
        Book book = new Book(); /* The new operator instantiates a class by dynamically allocating
        // memory for a new object and returning a reference to that memory */
        book.setName("Java");
        book.setPrice(1500);

        System.out.println("Price of Books is: " + book.getPrice() + " Name of Books is: " + book.getName());
    }
}
