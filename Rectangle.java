public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int area() {
        return this.width * this.height;
    }

    public int perimeter() {
        return 2 * (this.height + this.width);
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(12, 10);
        System.out.println(
                String.format("height: %s, width: %s, area: %s", rect1.getHeight(), rect1.getWidth(), rect1.area()));
        System.out.println(String.format("height: %s, width: %s, perimeter: %s", rect1.getHeight(), rect1.getWidth(),
                rect1.perimeter()));
    }
}
