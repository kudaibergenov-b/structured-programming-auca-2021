import processing.core.*;

public class Problem02 extends PApplet {
    float x;
    float y;
    float dx = random(-10, 10);
    float dy = random(-8, 8);

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = 640;
        y = 360;
    }

    public void draw() {
        background(0, 0, 0);
        circle(x, y, 50 );
        fill(0, 0, 255);
        x += dx;
        y += dy;
        if (x >= width) {
            x = width;
            dx = -dx;
        }
        if (x <= 0) {
            x = 0;
            dx = -dx;
        }
        if (y >= height) {
            y = height;
            dy = -dy;
        }
        if (y <= 0) {
            y = 0;
            dy = -dy;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}
