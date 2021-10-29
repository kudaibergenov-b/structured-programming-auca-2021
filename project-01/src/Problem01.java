import processing.core.*;

public class Problem01 extends PApplet {
    static float MIN_SIZE = 10;
    static float MAX_SIZE = 144;

    static String MESSAGE = "Hello, Processing!!!";

    float messageSize;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        messageSize = MIN_SIZE;
    }

    public void draw() {

        background(0, 0, 0);
        textSize(messageSize);
        textAlign(CENTER, CENTER);
        fill(255, 0, 0);
        text(MESSAGE,width / 2f, height / 2f);

        if (messageSize <= MAX_SIZE) {
            messageSize += 1;
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}