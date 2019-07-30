package ConstructorOverloading;

public class OutConstructorOverloading {
    public static void main(String[] args) {
        ConstructorOverloading co = new ConstructorOverloading("Takdir", 20);
        System.out.println("Name is: " + co.getName() + " Age is : " + co.getAge());

        ConstructorOverloading co1 = new ConstructorOverloading("Takdir", 23, "Bartula");
        System.out.println("Name is: " + co.getName() + " Age is : " + co.getAge() + " LastName is : " + co1.getLname() );

    }
}
