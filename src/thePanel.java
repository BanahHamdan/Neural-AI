import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class thePanel extends JPanel {

    private ArrayList<theShapes> shapes;
    private ArrayList<Point> lines;
    private ArrayList<Color> myColors;
    private double[] weights;

    public thePanel() {
        initComponents();
        shapes = new ArrayList<>();
        lines = new ArrayList<>();
        myColors = new ArrayList<>();
        myColors.add(Color.ORANGE);
        myColors.add(Color.PINK);
        myColors.add(Color.RED);
        myColors.add(Color.BLUE);
    }

    private void initComponents() {
        setBackground(new java.awt.Color(255, 255, 255));
    }

    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    public void clear() {
        shapes.clear();
        lines.clear();
        repaint();
    }

    public void clearLines() {
        lines.clear();
        repaint();
    }

    public void draw(theShapes shape) {
        shapes.add(shape);
        repaint();
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        lines.add(p1);
        lines.add(p2);
        repaint();
    }

    private void drawDecisionBoundary(Graphics2D g2) {
        if (weights == null || weights.length != 3) {
            return;
        }

        double w0 = weights[0];
        double w1 = weights[1];
        double w2 = weights[2];

        int x1 = 0;
        int y1 = (int) (-w0 / w2);
        int x2 = getWidth();
        int y2 = (int) (-(w1 * x2 + w0) / w2);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(x1, y1, x2, y2);
    }

    protected void paintComponent(Graphics g, int y1) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (theShapes shape : shapes) {
            if (shape.type.equals("circle")) {
                g2.setColor(Color.ORANGE);
                g2.drawOval((int)shape.x, (int)shape.y, 30, 30);
            } else if (shape.type.equals("triangle")) {
                g2.setColor(Color.PINK);
                g2.drawLine((int)shape.x, (int)shape.y, (int)shape.x + 20, (int)shape.y);
                g2.drawLine((int)shape.x, (int)shape.y, (int)shape.x + 20, (int)shape.y + 20);
                g2.drawLine((int)shape.x + 20, (int)shape.y + 20, (int)shape.x + 20, (int)shape.y);
            } else if (shape.type.equals("square")) {
                g2.setColor(Color.RED);
                g2.drawRect((int)shape.x, (int)shape.y, 20, 20);
            } else if (shape.type.equals("blue square")) {
                g2.setColor(Color.BLUE);
                g2.drawRect((int)shape.x,(int) shape.y, 20, 20);
            }
        }

        for (int i = 0; i < lines.size(); i += 2) {
            int C = i / 2;
            g2.setColor(myColors.get(C));
            g2.drawLine(lines.get(i).x, lines.get(i).y, lines.get(i + 1).x, lines.get(i+1).y);
        }
        // Draw decision boundary
        drawDecisionBoundary(g2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (theShapes shape : shapes) {
            if (shape.type.equals("circle")) {
                g2.setColor(Color.ORANGE);
                g2.drawOval((int) shape.x, (int) shape.y, 30, 30);
            } else if (shape.type.equals("triangle")) {
                g2.setColor(Color.PINK);
                g2.drawLine((int) shape.x, (int) shape.y, (int) (shape.x + 20), (int) shape.y);
                g2.drawLine((int) shape.x, (int) shape.y, (int) (shape.x + 20), (int)shape.y + 20);
                g2.drawLine((int)shape.x + 20, (int)shape.y + 20, (int)shape.x + 20, (int)shape.y);
            } else if (shape.type.equals("square")) {
                g2.setColor(Color.RED);
                g2.drawRect((int)shape.x, (int)shape.y, 20, 20);
            } else if (shape.type.equals("blue square")) {
                g2.setColor(Color.BLUE);
                g2.drawRect((int)shape.x, (int)shape.y, 20, 20);
            }
        }

        for (int i = 0; i < lines.size(); i += 2) {
            int C = i / 2;
            g2.setColor(myColors.get(C));
            g2.drawLine(lines.get(i).x, lines.get(i).y, lines.get(i + 1).x, lines.get(i + 1).y);
        }

        // Draw decision boundary
        drawDecisionBoundary(g2);
    }

}