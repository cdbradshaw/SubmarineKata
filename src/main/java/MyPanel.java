import model.Coordinate;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyPanel extends JPanel {
    Calculator calculator;
    Image image;

    MyPanel(Calculator calculator) {
        image = new ImageIcon("src/main/resources/ocean-background-vector.jpg").getImage();
        this.setPreferredSize(new Dimension(2250, 1500));
        this.calculator = calculator;
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image, 0, 0, 2356, 1666, null);
        g2D.setStroke(new BasicStroke(2));
        g2D.setPaint(Color.white);

        ArrayList<Coordinate> coordinatesList = calculator.getCoordinatesList();

        for (int i=1; i< coordinatesList.size()-1; i++){
            int x1 = coordinatesList.get(i).getHorizontal();
            int y1 = coordinatesList.get(i).getDepth();
            int x2 = coordinatesList.get(i+1).getHorizontal();
            int y2 = coordinatesList.get(i+1).getDepth();

            g2D.drawLine(x1,y1,x2,y2);
        }
        int lastX = coordinatesList.get(coordinatesList.size()-1).getHorizontal();
        int lastY = coordinatesList.get(coordinatesList.size()-1).getDepth();
        g2D.setPaint(Color.red);
        g2D.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        g2D.drawString("X", lastX, (lastY + 6));
    }



}


