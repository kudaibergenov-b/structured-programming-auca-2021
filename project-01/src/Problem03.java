import processing.core.*;

public class Problem03 extends PApplet {
    public static float RECT_WIDTH = 400;

    public static float RECT_HEIGHT = 200;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(40);
        textAlign(CENTER);
        frameRate(30);
    }

    public void draw() {
        background(0, 0, 0);

        float rectTopLeftX = width / 2f - RECT_WIDTH / 2f;
        float rectTopLeftY = height / 4f - RECT_HEIGHT / 2f;

        fill(0, 0, 255);
        rect(rectTopLeftX, rectTopLeftY, RECT_WIDTH, RECT_HEIGHT);

        fill(0, 0, 100);
        ellipse(mouseX, mouseY, 100, 100);

        fill(255, 255, 0);
        text("mouseX: " + mouseX, width / 2f, height / 2f);
        text("mouseY: " + mouseY, width / 2f, height / 2f + height / 30f);

        if (rectTopLeftX <= mouseX && mouseX <= rectTopLeftX + RECT_WIDTH &&
        rectTopLeftY <= mouseY && mouseY <= rectTopLeftY + RECT_HEIGHT) {
            fill (255, 255, 255);
            text("Inside the Rectangle", width / 2f, height - height / 10f);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}
