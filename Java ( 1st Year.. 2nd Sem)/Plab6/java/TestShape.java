package plab.plab6;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape("Blue", true);
        
        System.out.println("----------------------------------------------------");
        System.out.println(s1);
        System.out.println("----------------------------------------------------");
        System.out.println(s2);
        System.out.println("----------------------------------------------------");
         
        Circle c1 = new Circle();
        Circle c2 = new Circle(14.0);
        Circle c3 = new Circle();
        c3.setColor("Blue");
        c3.setFill(true);
        c3.setRadius(21.00);
       
        System.out.println(c1);
        System.out.println("----------------------------------------------------");
        System.out.println(c2);
        System.out.println("----------------------------------------------------");
        System.out.println(c3);
        System.out.println("----------------------------------------------------");
        
        System.out.println(String.format("Area is %.2f",c3.getArea()));
        //c3.getArea();
        System.out.println("----------------------------------------------------");
        System.out.println(String.format("Perimeter is %.2f",c3.getPerimeter()));
        //c3.getPerimeter();
        System.out.println("----------------------------------------------------");
        
    }
}
