import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class QuizWindow extends JFrame implements ActionListener {
    Container c;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5;
    JRadioButton btn1A, btn1B, btn1C, btn2A, btn2B, btn2C, btn3A, btn3B, btn3C, btn4A, btn4B, btn4C, btn5A, btn5B,
            btn5C;
    JButton btnSubmit, btnCancel, btnClear;
    int correct = 0;

    ButtonGroup bg1 = new ButtonGroup();
    ButtonGroup bg2 = new ButtonGroup();
    ButtonGroup bg3 = new ButtonGroup();
    ButtonGroup bg4 = new ButtonGroup();
    ButtonGroup bg5 = new ButtonGroup();

    QuizWindow() {
        c = getContentPane();

        lbl1 = new JLabel("1. Which is the nearest planet to Earth?");
        lbl2 = new JLabel("2. What is 8%4?");
        lbl3 = new JLabel("3. Is multiple inheritance supprted in java?");
        lbl4 = new JLabel("4. Who is the president of india?");
        lbl5 = new JLabel("5. Is MySQL case sensitive?");

        btn1A = new JRadioButton(" Mercury");
        btn1B = new JRadioButton(" Venus");
        btn1C = new JRadioButton(" Mars");
        bg1.add(btn1A);
        bg1.add(btn1B);
        bg1.add(btn1C);
        btn2A = new JRadioButton(" 1");
        btn2B = new JRadioButton(" 0");
        btn2C = new JRadioButton(" 4");
        bg2.add(btn2A);
        bg2.add(btn2B);
        bg2.add(btn2C);
        btn3A = new JRadioButton(" Yes");
        btn3B = new JRadioButton(" No");
        btn3C = new JRadioButton(" I dont know");
        bg3.add(btn3A);
        bg3.add(btn3B);
        bg3.add(btn3C);
        btn4A = new JRadioButton(" Narendra Modi");
        btn4B = new JRadioButton(" Ram Nath Kovind");
        btn4C = new JRadioButton(" Droupadi Murmu");
        bg4.add(btn4A);
        bg4.add(btn4B);
        bg4.add(btn4C);
        btn5A = new JRadioButton(" Yes");
        btn5B = new JRadioButton(" No");
        btn5C = new JRadioButton(" I dont know");
        bg5.add(btn5A);
        bg5.add(btn5B);
        bg5.add(btn5C);
        btnSubmit = new JButton("Submit");
        btnCancel = new JButton("Cancel");
        btnClear = new JButton("Clear");

        c.setBackground(Color.LIGHT_GRAY);
        btnCancel.setForeground(Color.RED);

        lbl1.setBounds(40, 40, 300, 20);
        btn1A.setBounds(50, 60, 300, 20);
        btn1B.setBounds(50, 80, 300, 20);
        btn1C.setBounds(50, 100, 300, 20);

        lbl2.setBounds(40, 140, 300, 20);
        btn2A.setBounds(50, 160, 300, 20);
        btn2B.setBounds(50, 180, 300, 20);
        btn2C.setBounds(50, 200, 300, 20);

        lbl3.setBounds(40, 240, 300, 20);
        btn3A.setBounds(50, 260, 300, 20);
        btn3B.setBounds(50, 280, 300, 20);
        btn3C.setBounds(50, 300, 300, 20);

        lbl4.setBounds(40, 340, 300, 20);
        btn4A.setBounds(50, 360, 300, 20);
        btn4B.setBounds(50, 380, 300, 20);
        btn4C.setBounds(50, 400, 300, 20);

        lbl5.setBounds(40, 440, 300, 20);
        btn5A.setBounds(50, 460, 300, 20);
        btn5B.setBounds(50, 480, 300, 20);
        btn5C.setBounds(50, 500, 300, 20);

        btnSubmit.setBounds(88, 550, 75, 20);
        btnClear.setBounds(188, 550, 75, 20);
        btnCancel.setBounds(288, 550, 75, 20);

        c.add(lbl1);
        c.add(btn1A);
        c.add(btn1B);
        c.add(btn1C);
        c.add(lbl2);
        c.add(btn2A);
        c.add(btn2B);
        c.add(btn2C);
        c.add(lbl3);
        c.add(btn3A);
        c.add(btn3B);
        c.add(btn3C);
        c.add(lbl4);
        c.add(btn4A);
        c.add(btn4B);
        c.add(btn4C);
        c.add(lbl5);
        c.add(btn5A);
        c.add(btn5B);
        c.add(btn5C);
        c.add(btnSubmit);
        c.add(btnClear);
        c.add(btnCancel);

        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);
        btnCancel.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnCancel) {
            System.exit(0);
        }
        if (ae.getSource() == btnClear) {
            bg1.clearSelection();
            bg2.clearSelection();
            bg3.clearSelection();
            bg4.clearSelection();
            bg5.clearSelection();

        }
        if (ae.getSource() == btnSubmit) {
            String Name = JOptionPane.showInputDialog(null, "You finished the quiz.\nPlease enter your name");
            if (btn1A.isSelected())
                correct++;
            if (btn2B.isSelected())
                correct++;
            if (btn3B.isSelected())
                correct++;
            if (btn4C.isSelected())
                correct++;
            if (btn5B.isSelected())
                correct++;
            if (correct >= 3) {
                JOptionPane.showMessageDialog(c,
                        "CONGRATULATIONS " + Name + " 🥳" + "\nYour Score is " + correct + "/5 .");
            } else {
                JOptionPane.showMessageDialog(c,
                        "You failed our expectation " + Name + " 💔" + "\nYour Score is " + correct + "/5 .");
            }
            System.exit(0);
        }
    }
}

public class Quiz {
    public static void main(String[] args) {
        QuizWindow q = new QuizWindow();
        q.setLayout(null);
        q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        q.setVisible(true);
        q.setBounds(400, 100, 450, 650);
        q.setTitle("Quiz");
    }
}