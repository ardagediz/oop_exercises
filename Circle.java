public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Invalid radius");

        }
        this.radius = radius
    }
    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Radius(Circle: %.4f)", this.radius);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle other = (Circle) obj;
        return Math.abs(this.radius - other.radius) < 0.00005;
    }
}