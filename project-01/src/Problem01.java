import processing.core.*;

public class Problem01 extends PApplet {
    static float MIN_SIZE = 10;
    static float MAX_SIZE = 144;
    static float DELTA = 1;

    static String MESSAGE = "Hello, Processing!!!";

    float messageSize;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        messageSize = MIN_SIZE;
    }
    int period = 1;

    public void draw() {

        background(0, 0, 0);

        if (period == 1) {
            textSize(messageSize);
            textAlign(CENTER, CENTER);
            fill(255, 0, 0);
            text(MESSAGE, width / 2f, height / 2f);

            if (messageSize > MAX_SIZE) {
                DELTA = -1;
            } else if (messageSize < MIN_SIZE) {
                DELTA = 1;
                period += 1;
            }
        }
        if (period == 2) {
            textSize(messageSize);
            textAlign(CENTER, CENTER);
            fill(0, 255, 0);
            text(MESSAGE, width / 2f, height / 2f);

            if (messageSize > MAX_SIZE) {
                DELTA = -1;
            } else if (messageSize < MIN_SIZE) {
                DELTA = 1;
            } else if (messageSize == MIN_SIZE && DELTA == -1) {
                period += 1;
            }
        }
        if (period == 3) {
            textSize(messageSize);
            textAlign(CENTER, CENTER);
            fill(0, 0, 255);
            text(MESSAGE, width / 2f, height / 2f);

            if (messageSize > MAX_SIZE) {
                DELTA = -1;
            } else if (messageSize < MIN_SIZE) {
                DELTA = 1;
            }
        }

        messageSize += DELTA;
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
}