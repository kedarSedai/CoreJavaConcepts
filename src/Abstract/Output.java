package Abstract;

public class Output {
  public static void main(String[] args) {
    Nic nic = new Nic();
    System.out.println("Rate provided by NIC Asia is : " + nic.getRate() + "%s");
  }
}
