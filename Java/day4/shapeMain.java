import packs.circle;
import packs.shape;
import packs.rectangle;
import java.util.ArrayList;
import java.util.List;

public class shapeMain {
    public static void drawShapes(List<? extends shape> shapes) {
        for (int i=0;i<shapes.size();i++) {
            shapes.get(i).draw();
        }
    }

    public static void main(String[] args) {
        List<rectangle> rectangles = new ArrayList<>();
        rectangles.add(new rectangle());
        rectangles.add(new rectangle());

        List<circle> circles = new ArrayList<>();
        circles.add(new circle());
        circles.add(new circle());

        drawShapes(rectangles);
        drawShapes(circles);
    }
}