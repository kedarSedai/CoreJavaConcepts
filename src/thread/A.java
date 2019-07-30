package thread;

import javax.swing.*;
import java.awt.*;

public class A {
  JFrame j;

  A() {
    j = new JFrame();
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    Button b3 = new Button("2");
    Button b4 = new Button("2");
    Button b5 = new Button("2");
    Button b6 = new Button("2");
    j.add(b1);
    j.add(b2);
    j.add(b3);
    j.add(b4);
    j.add(b5);
    j.add(b6);

    j.setLayout(new GridLayout(2, 2));
    j.setSize(200,200);
    j.setVisible(true);



  }

  public static void main(String[] args) {
    new A();
  }


}