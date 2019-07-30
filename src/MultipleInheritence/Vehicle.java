package MultipleInheritence;

public class Vehicle implements Bus, Car {
  int distanceTravelled;

  public void distance() {
    distanceTravelled = speed * distance;
    System.out.println("Distance Travelled is : " + distanceTravelled);
  }
}
