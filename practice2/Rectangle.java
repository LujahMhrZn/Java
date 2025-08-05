package practice2;

public class Rectangle {
    int length;
    int width;

    int Area(){
        return length * width;
    }
    

    public static void main(String[] args) {
        Rectangle  r =new Rectangle();
        r.length = 5;
        r.width = 10;
        System.out.println("Area of Rectangle: " + r.Area());
    }
}
