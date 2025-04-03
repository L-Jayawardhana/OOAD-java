import java.awt.*;

public class Main10 {
    public static void main(String[] args) {

        // abstract = Used to define abstract classes and methods
        //            Abstraction is the process of hiding implementation details and showing only the essential features
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(5,3);

        System.out.println(circle.area());
        System.out.println(rectangle.area());

        System.out.println();
        
        circle.isShape();
        rectangle.isShape();

    }
}
