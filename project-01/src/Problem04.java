import processing.core.*;

public class Problem04 extends PApplet {
    float circleX;
    float circleY;
    float circleR;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        circleX = width / 2f;
        circleY = height / 2f;
        circleR = height / 20f;
        frameRate(10);
    }

    public void draw() {
        fill(0,0,0,50);
        rect(0, 0, width, height);

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
