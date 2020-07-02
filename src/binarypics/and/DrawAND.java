package binarypics.and;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawAND {

  static int WIDTH = 2 * 256;
  static int HEIGHT = 2 * 256;

  public static void mainDraw(Graphics graphics) {
    int d = 256;
    int sqSize = 2;

    for (int i = 0; i < d; i++) {
      for (int j = 0; j < d; j++) {
        int red = i & j;
        int green = i & j;
        int blue = i & j;
        graphics.setColor(new Color(red, green, blue));
        graphics.fillRect(i * sqSize, j * sqSize, sqSize, sqSize);
      }
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("AND");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}