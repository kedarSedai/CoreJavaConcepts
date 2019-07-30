package ThrowsKeyword;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionThrows {
  public static void main(String[] args) {
    ExceptionThrows et = new ExceptionThrows();
    try {
      et.fileRead();

    } catch (FileNotFoundException e) {
      System.out.println(e);

    }
  }
  public void fileRead() throws FileNotFoundException{
    File file = new File("D:\\File.txt");
    FileReader fr = new FileReader(file);
  }
}
