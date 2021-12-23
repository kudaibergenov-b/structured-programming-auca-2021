import processing.core.*;

public class Problem04 extends PApplet {
    float circleX;
    float circleY;
    float circleX2;
    float circleY2;
    float circleR;
    float horizontalX;
    float horizontalY;
    float verticalX;
    float verticalY;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        circleR = height / 20f;
        horizontalX = width / 5f;
        horizontalY = height / 8f;
        circleX = horizontalX + (circleR / 2);
        circleY = horizontalY + (circleR / 2);
        verticalX = horizontalX;
        verticalY = horizontalY;
        circleX2 = (int) random(circleX, circleX + circleR * 5);
        circleY2 = (int) random(circleY, circleY);
        frameRate(10);
    }

    public void draw() {
        noStroke();
        fill(0,0,0, 50);
        rect(0,0, width, height);

        for (int i = 0, h = height / 8; i < 16; ++i, h += circleR) {
            stroke(0,0,255);
            strokeWeight(2);
            line(horizontalX, h, horizontalX + circleR * 21, h);
        }
        for (int j = 0, v = width / 5; j < 21; ++j, v += circleR * 1.067) {
            stroke(0,0,255);
            strokeWeight(2);
            line(v, verticalY, v, height - verticalY);
        }

        noStroke();
        fill(255, 0, 0);
        circle(circleX, circleY, circleR);

        noStroke();
        fill(255, 255, 0);
        circle(circleX2, circleY2, circleR);

        if (key == CODED) {
            switch (keyCode) {
                case UP:
                    circleY -= circleR;
                    break;
                case DOWN:
                    circleY += circleR;
                    break;
                case LEFT:
                    circleX -= circleR;
                    break;
                case RIGHT:
                    circleX += circleR;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}