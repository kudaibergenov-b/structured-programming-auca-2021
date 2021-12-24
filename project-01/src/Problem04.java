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
    int rndX = (int) random(1,19);
    int rndY = (int) random(1,14);

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
        circleX2 = circleX + circleR * rndX;
        circleY2 = circleY + circleR * rndY;
        frameRate(10);
    }

    public void draw() {
        noStroke();
        fill(0,0,0, 50);
        rect(0,0, width, height);

        for (int i = 0, h = height / 8; i < 16; ++i, h += circleR) {
            stroke(0,0,255);
            strokeWeight(1);
            line(horizontalX, h,horizontalX + circleR * 20, h);
        }
        for (int j = 0, v = width / 5; j < 21; ++j, v += circleR) {
            stroke(0,0,255);
            strokeWeight(1);
            line(v, verticalY, v, verticalY + circleR * 15);
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
                    if (circleX == horizontalX + (circleR / 2)) {
                        circleX += circleR;
                    }
                    break;
                case RIGHT:
                    circleX += circleR;
                    if (circleX == 20 * (horizontalX + (circleR / 2))) {
                        circleX -= circleR;
                    }
                    break;
            }
        }

        //if (circleY == circleY || circleY == circleY + circleR * 15) {
          //  circleY += 0;
        //}

        noStroke();
        fill(255, 255, 0);
        circle(circleX2, circleY2, circleR);


    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}