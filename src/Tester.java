package joseBeta;

import javax.swing.*;
import java.awt.*;

public class Tester {
   static NumberKeypadPanel panel1;

    public static void main(String[] args)
    {



        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        NumberKeypadPanel testerpanel = new NumberKeypadPanel();

        frame.add(testerpanel);

    }
}
