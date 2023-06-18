import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton login, signin, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("TrustCapital");
        setLayout(null);
        ImageIcon img = new ImageIcon("Bank Management System\\src\\icons\\bank.png");
        setIconImage(img.getImage());

        ImageIcon imageIcon = new ImageIcon(
                "Bank Management System\\src\\icons\\bank.png");
        Image i2 = imageIcon.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(220, 8, 100, 100);
        add(label);

        JLabel text = new JLabel("TrustCapital");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(300, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("Card ID: ");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(180, 150, 150, 40);

        add(cardno);
        cardTextField = new JTextField();
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        cardTextField.setBounds(330, 160, 250, 30);
        add(cardTextField);

        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(232, 220, 250, 30);
        add(pin);

        Color labels = new Color(158, 158, 158);
        pin.setForeground(labels);
        cardno.setForeground(labels);

        pinTextField = new JPasswordField();
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        pinTextField.setBounds(330, 222, 250, 30);
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(260, 330, 130, 30);
        // login.setBackground(Color.pink);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        // login.setBackground(Color(252, 255, 235));
        add(login);

        Color buttons = new Color(254, 255, 245);
        login.setBackground(buttons);

        signin = new JButton("SIGN UP");
        signin.setBounds(410, 330, 130, 30);
        signin.setBackground(Color.pink);
        signin.setForeground(Color.BLACK);
        signin.addActionListener(this);
        add(signin);
        signin.setBackground(buttons);

        clear = new JButton("RESET");
        clear.setBounds(680, 410, 80, 25);
        clear.setBackground(Color.pink);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);
        clear.setBackground(buttons);
        clear.setForeground(labels);

        Color bckcolor = new Color(254, 255, 245);
        getContentPane().setBackground(bckcolor);

        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            // int i=0;
        } else if (e.getSource() == signin) {
            setVisible(false);
            new signin().setVisible(true);
        } else if (e.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        }
    }

    public static void main(String[] args) {
        new Login();
    }

}
