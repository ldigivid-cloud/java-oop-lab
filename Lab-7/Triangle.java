class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        double result = 0.5 * base * height;
        System.out.printf("Area of Triangle: %.2f\n", result);
    }
}
