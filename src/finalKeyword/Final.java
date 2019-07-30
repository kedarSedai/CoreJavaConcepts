package finalKeyword;

public class Final {
  public static void main(String[] args) {

    final StringBuilder sb = new StringBuilder("abcd ");

    System.out.println(sb);

    sb.append("efgh");

    System.out.println(sb);
  }
}
