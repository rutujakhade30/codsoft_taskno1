import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class Task1 extends JFrame implements ActionListener {


     JButton b1;

    public Task1() {
        setSize(700, 500);
        ImageIcon img = new ImageIcon("game.jpg");
        JLabel l1 = new JLabel(img);
        setTitle("Guess The Number");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        b1 = new JButton();
        b1.setText("Play");
        b1.setBounds(700, 200, 150, 40);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        b1.setFont(new Font("Arial", Font.BOLD, 19));
        b1.setForeground(Color.white);
        add(b1);
        setResizable(true);
        add(l1);
        pack();
        setLayout(null);
        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            SecondPage obj = new SecondPage();
            dispose();
        }
    }
}
public class First {
    public static void main(String[] args) {
        Task1 t = new Task1();
    }
}

