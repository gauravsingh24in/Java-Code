package HomeAreaCalculator;
// Write a class that creates instances of the HomeAreaCalculator.Rectangle class gto find the total area and perimeter of 2 rooms of a house.
public class HomeAreaCalculator {

    public static void main(String args []){
        // Rectangle 1
        Rectangle room1 = new Rectangle();
        room1.setWidth(10);
        room1.setLength(20);
        double areaOfRoom1 = room1.calculateArea();
        double perimeterOfRoom1 = room1.calculatePerimeter();

        // Rectangle 2
        Rectangle room2 = new Rectangle();
        room2.setWidth(30);
        room2.setLength(40);
        double areaOfRoom2 = room2.calculateArea();
        double perimeterOfRoom2 = room2.calculatePerimeter();

        double totalArea = areaOfRoom1+areaOfRoom2;
        double totalPerimeter = perimeterOfRoom1+perimeterOfRoom2;

        System.out.println("Total area of both rooms is " + totalArea);
        System.out.println("Total perimeter of both rooms is " + totalPerimeter);
    }
}
