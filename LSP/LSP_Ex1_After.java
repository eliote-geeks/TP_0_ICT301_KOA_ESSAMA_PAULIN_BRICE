class Rectangle {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square {
    private Rectangle rectangle = new Rectangle();

    public void setSide(int side) {
        rectangle.setWidth(side);
        rectangle.setHeight(side);
    }

    public int getArea() {
        return rectangle.getArea();
    }
}
