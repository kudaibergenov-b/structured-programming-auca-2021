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
    int score;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(30);
        circleR = height / 20f;
        horizontalX = width / 5f;
        horizontalY = height / 8f;
        circleX = horizontalX + (circleR / 2);
        circleY = horizontalY + (circleR / 2);
        verticalX = horizontalX;
        verticalY = horizontalY;
        circleX2 = circleX + circleR * (int) random(1,19);;
        circleY2 = circleY + circleR * (int) random(1,14);
        score = 0;
        frameRate(15);
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
            if (circleX < horizontalX + (circleR / 2)) {
                circleX += circleR;
            }
            if (circleX > horizontalX + (circleR / 2) + circleR * 19) {
                circleX -= circleR;
            }
            if (circleY < horizontalY + (circleR / 2)) {
                circleY += circleR;
            }
            if (circleY > horizontalY + (circleR / 2) + circleR * 14) {
                circleY -= circleR;
            }
            if (circleX == circleX2 && circleY == circleY2) {
                circleX2 = horizontalX + (circleR / 2) + circleR * (int) random(1,19);
                circleY2 = horizontalY + (circleR / 2) + circleR * (int) random(1,14);
                noStroke();
                fill(255, 255, 0);
                circle(circleX2, circleY2, circleR);
                ++score;
            }
        }

        fill(0,255,0);
        text("Score: " + score, horizontalX + circleR * 9,height - height / 20f);

        fill (0, 255, 0);
        text("Game: Collect Yellow Circles using Arrow Buttons", horizontalX + circleR * 2, height / 20f);
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}