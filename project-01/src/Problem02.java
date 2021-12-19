import processing.core.*;

public class Problem02 extends PApplet {
    float x;
    float y;
    float dx;
    float dy;
    float circleTwoPosX;
    float circleTwoPosY;
    float circleThreePosX;
    float circleThreePosY;

    public void settings() {
        fullScreen();
    }


    public void setup() {
        x = width / 2f;
        y = height / 2f;
        dx = random(-10, 10);
        dy = random(-8, 8);
        circleTwoPosX = x - 35;
        circleTwoPosY = y + 35;
    }

    public void draw() {
        background(0, 0, 0);

        fill(0, 0, 255);
        circle(x, y, 50 );

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

        fill(255, 0, 0);
        circle(circleTwoPosX, circleTwoPosY, 50);

        circleTwoPosX += dx;
        circleTwoPosY += dy;

        if (circleTwoPosX >= width) {
            circleTwoPosX = width;
            dx = -dx;
        }
        if (circleTwoPosX <= 0) {
            circleTwoPosX = 0;
            dx = -dx;
        }
        if (circleTwoPosY >= height) {
            circleTwoPosY = height;
            dy = -dy;
        }
        if (circleTwoPosY <= 0) {
            circleTwoPosY = 0;
            dy = -dy;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}
