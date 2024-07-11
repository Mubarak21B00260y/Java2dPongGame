import java.awt.*;

public class Rectangle {
    private final int x;
    private  final int y;
    private final int width;
     private final int height;
     private  final Color color;


    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color= color;
    }

    public  void draw (Graphics2D graphics2D) {
        graphics2D.setColor(color);
        graphics2D.fillRect(x,y,width,height);

    }
}
