package Sem3.LSP;

public class Rectangle extends QuardRangle {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.height * this.width;
    }
}
