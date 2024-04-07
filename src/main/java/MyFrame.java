import javax.swing.*;

public class MyFrame extends JFrame {

    MyPanel panel;

    MyFrame(Calculator calculator){
        panel = new MyPanel(calculator);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("Submarine Position Calculator");

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.getContentPane().add(scrollPane);
    }

}
