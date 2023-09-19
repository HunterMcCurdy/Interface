import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Object> rectangle = new ArrayList<>();

        rectangle.add(new BigRectLister(2, 5));
        rectangle.add(new BigRectLister(5, 7));
        rectangle.add(new BigRectLister(3, 4));
        rectangle.add(new BigRectLister(2, 3));
        rectangle.add(new BigRectLister(3, 3));
        rectangle.add(new BigRectLister(2, 2));
        rectangle.add(new BigRectLister(1, 2));
        rectangle.add(new BigRectLister(4, 5));
        rectangle.add(new BigRectLister(1, 3));
        rectangle.add(new BigRectLister(2, 4));
        System.out.println(rectangle);










    }
}