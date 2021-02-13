import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPage extends JFrame {
    public static void StartGui() {
        JFrame frame = new JFrame("Beaver Frogger");
        JPanel panel = new JPanel();

        JLabel title = new JLabel("BEAVER FROGGER");
        title.setFont(new Font("Tahoma", Font.PLAIN, 50));
        title.setBounds(152, 195, 484, 64);

        JButton start = new JButton("Start");
        start.setFont(new Font("Tahoma", Font.PLAIN, 34));
        start.setBounds(240, 446, 218, 64);

        JButton exit = new JButton("Exit");
        exit.setFont(new Font("Tahoma", Font.PLAIN, 34));
        exit.setBounds(240, 564, 218, 64);

        panel.setBorder(new EmptyBorder(5,5,5,5));
        panel.setLayout(null);
        panel.add(title);
        panel.add(start);
        panel.add(exit);

        frame.add(panel);
        frame.setResizable(false);
        frame.setBounds(100, 100, 725, 820);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        start.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        StartGui();
    }
}
