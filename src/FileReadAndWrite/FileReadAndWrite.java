package FileReadAndWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadAndWrite {
  public static void main(String[] args) throws IOException {
    FileInputStream in = null;
    FileOutputStream out = null;
    try {
      in = new FileInputStream("D:/copy/input.txt");
      out = new FileOutputStream("D:/copy/output.txt");
      int c;
      while ((c = in.read()) != -1){
        out.write(c);
      }

    } finally {
      if (in != null){
        in.close();
      }
      if(out != null){
        out.close();
      }
    }

  }
}
