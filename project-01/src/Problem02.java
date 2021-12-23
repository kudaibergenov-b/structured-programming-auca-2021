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
    float dCircleTwoPosX;
    float dCircleTwoPosY;
    float dCircleThreePosX;
    float dCircleThreePosY;
    float circleSize;
    float circleRadius;

    public void settings() {
        fullScreen();
    }


    public void setup() {
        x = width / 2f;
        y = height / 2f;
        circleSize = 70;
        circleRadius = circleSize / 2f;
        dx = random(-10, 10);
        dy = random(-8, 8);
        circleTwoPosX = x + (dx * 50 / abs(dx));
        circleTwoPosY = y + (dy * 50 / abs(dy));
        dCircleTwoPosX = dx;
        dCircleTwoPosY = dy;
        circleThreePosX = x + (-dx * 50 / abs(dx));
        circleThreePosY = y + (-dy * 50 / abs(dy));
        dCircleThreePosX = dx;
        dCircleThreePosY = dy;
    }

    public void draw() {
        background(0, 0, 0);

        fill(0, 0, 255);
        circle(x, y, circleSize);

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
        circle(circleTwoPosX, circleTwoPosY, circleSize);

        circleTwoPosX += dCircleTwoPosX;
        circleTwoPosY += dCircleTwoPosY;

        if (circleTwoPosX >= width) {
            circleTwoPosX = width;
            dCircleTwoPosX = -dCircleTwoPosX;
        }
        if (circleTwoPosX <= 0) {
            circleTwoPosX = 0;
            dCircleTwoPosX = -dCircleTwoPosX;
        }
        if (circleTwoPosY >= height) {
            circleTwoPosY = height;
            dCircleTwoPosY = -dCircleTwoPosY;
        }
        if (circleTwoPosY <= 0) {
            circleTwoPosY = 0;
            dCircleTwoPosY = -dCircleTwoPosY;
        }

        fill(0,255,0);
        circle(circleThreePosX, circleThreePosY, circleSize);

        circleThreePosX += dCircleThreePosX;
        circleThreePosY += dCircleThreePosY;

        if (circleThreePosX >= width) {
            circleThreePosX = width;
            dCircleThreePosX = -dCircleThreePosX;
        }
        if (circleThreePosX <= 0) {
            circleThreePosX = 0;
            dCircleThreePosX = -dCircleThreePosX;
        }
        if (circleThreePosY >= height) {
            circleThreePosY = height;
            dCircleThreePosY = -dCircleThreePosY;
        }
        if (circleThreePosY <= 0) {
            circleThreePosY = 0;
            dCircleThreePosY = -dCircleThreePosY;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}
