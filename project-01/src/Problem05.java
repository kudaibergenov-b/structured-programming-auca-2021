import processing.core.*;

import javax.swing.*;

public class Problem05 extends PApplet {
    float size;
    float x;
    float y;
    float rectWidth = 10;
    float rectHeight = 10;
    int period = 1;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        try {
            String strSize = JOptionPane.showInputDialog("Enter the board's size [4, 12]: ");
            size = Float.parseFloat(strSize);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Incorrect input: " + size);
            System.exit(1);
        }
        if (size < 4 || 12 < size) {
            JOptionPane.showMessageDialog(null, "Incorrect input: " + (int) size);
            System.exit(1);
        }
        x = width / size;
        y = height / size;
    }

    public void draw() {
        background(0, 0, 0);

        for (int i = 1; i <= size; ++i) {
            for (int j = 1; j <= size; ++j) {
                if (period % 2 != 0) {
                    fill(255, 255, 255);
                } else {
                    fill(0, 20, 20);
                }
                rect(x, y, rectWidth, rectHeight);

                period += 1;
                x += rectWidth;
                if (period % 8 == 0) {

                }
            }
            noLoop();
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }
}