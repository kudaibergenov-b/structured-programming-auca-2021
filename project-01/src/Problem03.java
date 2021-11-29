import processing.core.*;

public class Problem03 extends PApplet {
    public static float RECT_WIDTH = 550;

    public static float RECT_HEIGHT = 100;

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

        fill(255, 255, 255);
        text("Java Programming Language", rectTopLeftX + RECT_WIDTH / 2f, rectTopLeftY + RECT_HEIGHT/ 2f);

        fill(0, 0, 255);
        rect(rectTopLeftX, rectTopLeftY + RECT_HEIGHT, RECT_WIDTH, RECT_HEIGHT);

        fill(255, 255, 255);
        text("Kotlin Programming Language", rectTopLeftX + RECT_WIDTH / 2f, rectTopLeftY + RECT_HEIGHT * 3 / 2);

        fill(0, 0, 255);
        rect(rectTopLeftX, rectTopLeftY + 2 * RECT_HEIGHT, RECT_WIDTH, RECT_HEIGHT);

        fill(255, 255, 255);
        text("Scala Programming Language", rectTopLeftX + RECT_WIDTH / 2f, rectTopLeftY + RECT_HEIGHT * 5 / 2);


        if (rectTopLeftX <= mouseX && mouseX <= rectTopLeftX + RECT_WIDTH &&
        rectTopLeftY <= mouseY && mouseY <= rectTopLeftY + RECT_HEIGHT) {
            fill(255, 0, 0);
            text("Java Programming Language", rectTopLeftX + RECT_WIDTH / 2f, rectTopLeftY + RECT_HEIGHT/ 2f);
            fill (255, 255, 0);
            text("Year: 1995.PYPL Index: 2", width / 2f, height - height / 10f);
        }
        if (rectTopLeftX <= mouseX && mouseX <= rectTopLeftX + RECT_WIDTH &&
                rectTopLeftY + RECT_HEIGHT <= mouseY && mouseY <= rectTopLeftY + 2 * RECT_HEIGHT) {
            fill(255, 0, 0);
            text("Kotlin Programming Language", rectTopLeftX + RECT_WIDTH / 2f, rectTopLeftY + RECT_HEIGHT * 3 / 2);
            fill (255, 255, 0);
            text("Year: 2011.PYPL Index: 11", width / 2f, height - height / 10f);
        }
        if (rectTopLeftX <= mouseX && mouseX <= rectTopLeftX + RECT_WIDTH &&
                rectTopLeftY + 2 * RECT_HEIGHT <= mouseY && mouseY <= rectTopLeftY + 3 * RECT_HEIGHT) {
            fill(255, 0, 0);
            text("Scala Programming Language", rectTopLeftX + RECT_WIDTH / 2f, rectTopLeftY + RECT_HEIGHT * 5 / 2);
            fill (255, 255, 0);
            text("Year 2004.PYPL Index: 20", width / 2f, height - height / 10f);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}
