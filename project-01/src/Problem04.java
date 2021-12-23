import processing.core.*;

public class Problem04 extends PApplet {
    float circleX;
    float circleY;
    float circleR;
    float horizontalX;
    float horizontalY;
    float verticalX;
    float verticalY;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        circleX = width / 2f;
        circleY = height / 2f;
        circleR = height / 20f;
        horizontalX = width / 5f;
        horizontalY = height / 8f;
        verticalX = horizontalX;
        verticalY = horizontalY;
        frameRate(10);
    }

    public void draw() {
        noStroke();
        fill(0,0,0, 50);
        rect(0,0, width, height);

        for (int i = 0; i < 16; ++i) {
            stroke(0,0,255);
            strokeWeight(2);
            line(horizontalX, horizontalY, width - horizontalX, horizontalY);
            horizontalY += circleR;
        }
        for (int j = 0; j < 21; ++j) {
            stroke(0,0,255);
            strokeWeight(2);
            line(verticalX, verticalY, verticalX, height - verticalY);
            verticalX += circleR * 1.067;
        }


        noStroke();
        fill(255, 0, 0);
        circle(circleX, circleY, circleR);

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