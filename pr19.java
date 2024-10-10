import java.util.*;

class rectangle {
    double length, breadth;

    void display_rec() {
        System.out.println("Perimeter: " + 2 * (length + breadth));
        System.out.println("Area: " + breadth * length);
    }
}

class square extends rectangle {
    double side;

    square(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    square(double side) {
        this.side = side;
    }

    void display_sq() {
        System.out.println("Perimeter: " + 4 * side);
        System.out.println("Area: " + side * side);
    }
}

class pr19 {
    public static void main(String[] args) {
        square sq = new square(6);
        square rec = new square(6, 7);
        sq.display_sq();
        rec.display_rec();
    }
}
