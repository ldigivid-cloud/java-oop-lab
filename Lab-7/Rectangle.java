class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        double result = length * breadth;
        System.out.printf("Area of Rectangle: %.2f\n", result);
    }
}
