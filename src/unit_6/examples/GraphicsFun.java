package unit_6.examples;
import java.awt.*;
import javax.swing.JFrame;

class Drawing extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing LMAO");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    public void paint(Graphics g){
        g.fillOval(100, 100, 200, 200);
    }

    public void boxOval(Graphics g, Rectangle bb){
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }


}
