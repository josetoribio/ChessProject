import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NumberKeypadPanel extends JPanel {
    private JPanel clearPanel = new JPanel();
    private JPanel KeyPanel = new JPanel();
    private JLabel displayLabel = new JLabel();





    public NumberKeypadPanel()
    {
        JPanel finalPanel = new JPanel();

       finalPanel.setLayout(new BorderLayout());





       clearPanel.setLayout(new BorderLayout());
       KeyPanel.setLayout(new GridLayout(8,8));


        JButton display = new JButton("display");
      //  displayLabel.setPreferredSize(new Dimension(350, 300));
        //display labal can send whos turn it is
      //  JButton clear = new JButton("Clear");
        KeyPanel.setPreferredSize(new Dimension(600, 600));
        //clear.setPreferredSize(new Dimension(300, 300));

        JButton b1 = new JButton("empty");
        JButton b2 = new JButton("empty");
        JButton b3 = new JButton("empty");
        JButton b4 = new JButton("empty");
        JButton b5 = new JButton("empty");
        JButton b6 = new JButton("empty");
        JButton b7 = new JButton("empty");
        JButton b8 = new JButton("empty");
        JButton b9 = new JButton("empty");
        JButton b10 = new JButton("empty");
        JButton b11 = new JButton("empty");
        JButton b12 = new JButton("empty");
        JButton b13 = new JButton("pawn");
        JButton b14 = new JButton("empty");
        JButton b15 = new JButton("empty");
        JButton b16 = new JButton("empty");
        JButton b17 = new JButton("empty");
        JButton b18 = new JButton("empty");
        JButton b19 = new JButton("empty");
        JButton b20 = new JButton("empty");
        JButton b21 = new JButton("empty");
        JButton b22 = new JButton("empty");
        JButton b23 = new JButton("empty");
        JButton b24 = new JButton("empty");
        JButton b25 = new JButton("empty");
        JButton b26 = new JButton("empty");
        JButton b27 = new JButton("empty");
        JButton b28 = new JButton("empty");
        JButton b29 = new JButton("empty");
        JButton b30 = new JButton("empty");
        JButton b31 = new JButton("empty");
        JButton b32 = new JButton("empty");
        JButton b33 = new JButton("empty");
        JButton b34 = new JButton("empty");
        JButton b35 = new JButton("empty");
        JButton b36 = new JButton("empty");
        JButton b37 = new JButton("empty");
        JButton b38 = new JButton("empty");
        JButton b39 = new JButton("empty");
        JButton b40 = new JButton("empty");
        JButton b41 = new JButton("empty");
        JButton b42 = new JButton("empty");
        JButton b43 = new JButton("empty");
        JButton b44 = new JButton("empty");
        JButton b45 = new JButton("empty");
        JButton b46 = new JButton("empty");
        JButton b47 = new JButton("empty");
        JButton b48 = new JButton("empty");
        JButton b49 = new JButton("empty");
        JButton b50 = new JButton("empty");
        JButton b51 = new JButton("empty");
        JButton b52 = new JButton("empty");
        JButton b53 = new JButton("empty");
        JButton b54 = new JButton("empty");
        JButton b55 = new JButton("empty");
        JButton b56 = new JButton("empty");
        JButton b57 = new JButton("empty");
        JButton b58 = new JButton("empty");
        JButton b59 = new JButton("empty");
        JButton b60 = new JButton("empty");
        JButton b61 = new JButton("empty");
        JButton b62 = new JButton("empty");
        JButton b63 = new JButton("empty");
        JButton b64 = new JButton("empty");



        displayLabel.add(display);
      //  clearPanel.add(clear);

        //odd number to black
        //row 1
        b1.setBackground(Color.gray);
        b3.setBackground(Color.gray);
        b5.setBackground(Color.gray);
        b7.setBackground(Color.gray);
        //odd number to black
        //row 3
        b17.setBackground(Color.gray);
        b21.setBackground(Color.gray);
        b23.setBackground(Color.gray);
        b19.setBackground(Color.gray);
        //row5
        b39.setBackground(Color.gray);
        b33.setBackground(Color.gray);
        b35.setBackground(Color.gray);
        b37.setBackground(Color.gray);
        //row7
        b55.setBackground(Color.gray);
        b51.setBackground(Color.gray);
        b53.setBackground(Color.gray);
        b49.setBackground(Color.gray);

        //row 2
        b10.setBackground(Color.gray);
        b12.setBackground(Color.gray);
        b14.setBackground(Color.gray);
        b16.setBackground(Color.gray);
        //even number to black
        //row 4
        b32.setBackground(Color.gray);
        b30.setBackground(Color.gray);
        b28.setBackground(Color.gray);
        b26.setBackground(Color.gray);
        //row6
        b42.setBackground(Color.gray);
        b44.setBackground(Color.gray);
        b46.setBackground(Color.gray);
        b48.setBackground(Color.gray);
        //row8
        b64.setBackground(Color.gray);
        b62.setBackground(Color.gray);
        b60.setBackground(Color.gray);
        b58.setBackground(Color.gray);


        KeyPanel.add(b1);
        KeyPanel.add(b2);
        KeyPanel.add(b3);
        KeyPanel.add(b4);
        KeyPanel.add(b5);
        KeyPanel.add(b6);
        KeyPanel.add(b7);
        KeyPanel.add(b8);
        KeyPanel.add(b9);
        KeyPanel.add(b10);
        KeyPanel.add(b11);
        KeyPanel.add(b12);
        KeyPanel.add(b13);
        KeyPanel.add(b14);
        KeyPanel.add(b15);
        KeyPanel.add(b16);
        KeyPanel.add(b17);
        KeyPanel.add(b18);
        KeyPanel.add(b19);
        KeyPanel.add(b20);
        KeyPanel.add(b21);
        KeyPanel.add(b22);
        KeyPanel.add(b23);
        KeyPanel.add(b24);
        KeyPanel.add(b25);
        KeyPanel.add(b26);
        KeyPanel.add(b27);
        KeyPanel.add(b28);
        KeyPanel.add(b29);
        KeyPanel.add(b30);
        KeyPanel.add(b31);
        KeyPanel.add(b32);
        KeyPanel.add(b33);
        KeyPanel.add(b34);
        KeyPanel.add(b35);
        KeyPanel.add(b36);
        KeyPanel.add(b37);
        KeyPanel.add(b38);
        KeyPanel.add(b39);
        KeyPanel.add(b40);
        KeyPanel.add(b41);
        KeyPanel.add(b42);
        KeyPanel.add(b43);
        KeyPanel.add(b44);
        KeyPanel.add(b45);
        KeyPanel.add(b46);
        KeyPanel.add(b47);
        KeyPanel.add(b48);
        KeyPanel.add(b49);
        KeyPanel.add(b50);
        KeyPanel.add(b51);
        KeyPanel.add(b52);
        KeyPanel.add(b53);
        KeyPanel.add(b54);
        KeyPanel.add(b55);
        KeyPanel.add(b56);
        KeyPanel.add(b57);
        KeyPanel.add(b58);
        KeyPanel.add(b59);
        KeyPanel.add(b60);
        KeyPanel.add(b61);
        KeyPanel.add(b62);
        KeyPanel.add(b63);
        KeyPanel.add(b64);








    finalPanel.add(displayLabel,BorderLayout.NORTH);
    finalPanel.add(KeyPanel,BorderLayout.CENTER);
    finalPanel.add(clearPanel,BorderLayout.SOUTH);



     JFrame frame = new JFrame();

     frame.getContentPane().setBackground(Color.BLACK);


    frame.add(finalPanel);



     frame.setLayout(new FlowLayout());
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.pack();
     frame.setVisible(true);


   /*  b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+b0.getText());
                //insert code here
            }
        } );
        */
     b1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             displayLabel.setText(displayLabel.getText()+b1.getText());

            }

        } );

        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b5.setBackground(Color.RED);
                b5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       b5.setBackground(Color.gray);
                        b5.setText("Pawn");
                       b13.setText("empty");

                    }

                } );


            }

        } );

     b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+b2.getText());

            }
        } );
     b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+b3.getText());

            }
        } );
    b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+b4.getText());

            }
        } );
     b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+b5.getText());

            }
        } );
     b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+b6.getText());

            }
        } );
     b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+b7.getText());

            }
        } );
     b8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            displayLabel.setText(displayLabel.getText()+b8.getText());

        }
    } );
     b9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            displayLabel.setText(displayLabel.getText()+b9.getText());

        }
    } );

/*    clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText("");
                //insert code here
            }
        } );

*/





    }





}
