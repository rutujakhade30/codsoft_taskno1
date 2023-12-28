import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SecondPage extends JFrame implements ActionListener {
    int x,y;
    int attempt=0;
    int max_attempt=3;
    int count=0;
    JLabel l2,l3;
    JButton b2,b3,b4;
    JTextField t1;
    SecondPage()
    {
        setSize(700,500);
        ImageIcon im= new ImageIcon("Snake.jpg");
        l2= new JLabel();
        l2.setIcon(im);
        l2.setBounds(40,30,295,171);
        add(l2);

        b2=new JButton();
        b2.setText("Submit");
        b2.setBounds(500,120,110,30);
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        b2.setFont(new Font("Arial",Font.BOLD,19));
        Random();
        b2.addActionListener(this);

        t1=new JTextField();
      //  t1.setText("Enter a number...");
        t1.setBounds(350,120,110,30);
        t1.setBackground(Color.white);
        t1.setForeground(Color.black);

        l3=new JLabel();
        l3.setBounds(400,400,100,30);
        l3.setForeground(Color.red);

        b3=new JButton();
        b3.setText("TRY AGAIN");
        b3.setBounds(350,230,110,30);
        b3.setBackground(Color.white);
        b3.setForeground(Color.black);
        b3.setFont(new Font("Arial",Font.BOLD,19));

        //b3.addActionListener(this);

        b4=new JButton();
        b4.setText("Exit");
        b4.setBounds(500,230,110,30);
        b4.setBackground(Color.white);
        b4.setForeground(Color.black);
        b4.setFont(new Font("Arial",Font.BOLD,19));

        add(t1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setVisible(true);

    }
    public void Random()
    {
         Random r=new Random();
         x=r.nextInt(100)+1;
            System.out.println(x);
        }
    public void score()
    {
        if(attempt>=max_attempt)
        {
            if(count==1)
            {
                JOptionPane.showMessageDialog(this,"Score :100%");
            }
            else if(count==2)
            {
                JOptionPane.showMessageDialog(this,"Score :50%");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Score :25%");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2)
        {
            if(attempt>=max_attempt)
            {
                l3.setText("Sorry, reached the maximum no of attempts");
                return;
            }
            String str=t1.getText();
            int y=Integer.parseInt(str);
            //System.out.println(y);

            count++;
            if (x == y) {
                l3.setText("Congrats!!! You guessed the correct number:");
                attempt=3;
                score();
            }
            else if (y > x)
            {
                l3.setText("Highh! Try again.");
            }
            else
            {
                l3.setText("loww! Try again.");
            }
            attempt++;
            t1.setText(null);
        }

       if(e.getSource()==b3)
       {
          attempt=0;
           Random();
          t1.setText(null);
      }

       if(e.getSource()==b4)
       {
           dispose();
       }

    }
    }
