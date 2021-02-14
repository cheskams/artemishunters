import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class StartPage extends JFrame {
    public static final int WINDOW_WIDTH = 725;
    public static final int WINDOW_HEIGHT = 820;

    private JPanel panel;
    private JFrame frame;
    private JLabel title;
    private JButton start, exit;

    public StartPage() {
        frame = new JFrame("Beaver Frogger");
        panel = new JPanel();

        title = new JLabel("BEAVER FROGGER");
        title.setFont(new Font("Tahoma", Font.PLAIN, 50));
        title.setBounds(152, 195, 484, 64);

        start = new JButton("Start");
        start.setFont(new Font("Tahoma", Font.PLAIN, 34));
        start.setBounds(240, 446, 218, 64);

        exit = new JButton("Exit");
        exit.setFont(new Font("Tahoma", Font.PLAIN, 34));
        exit.setBounds(240, 564, 218, 64);

        panel.setBorder(new EmptyBorder(5,5,5,5));
        panel.setLayout(null);
        panel.add(title);
        panel.add(start);
        panel.add(exit);

        frame.add(panel);
        frame.setResizable(false);
        frame.setBounds(100, 100, WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainGameplay gp = new mainGameplay();

                gp.setVisible(true);
                frame.dispose();
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new StartPage();
    }
}
