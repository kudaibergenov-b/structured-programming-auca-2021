import processing.core.*;

public class Problem04 extends PApplet {
    static final int NUMBER_OF_CIRCLES = 100;
    static final float MIN_RADIUS = 5;
    static final float MAX_RADIUS = 50;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);

        for (int i = 0; i < NUMBER_OF_CIRCLES; ++i) {
            float x = random(width);
            float y = random(height);
            float r = random(MIN_RADIUS, MAX_RADIUS);
            float redComp = random(255);
            float greenComp = random(255);
            float blueComp = random(255);

            fill (redComp, greenComp, blueComp);
            circle (x,y, 2 *r);
        }
        noLoop();
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}