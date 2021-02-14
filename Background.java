import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Background extends JFrame {
    public static void BackGui() throws IOException {
        JFrame frame = new JFrame();
        JPanel top = new JPanel();
        JPanel middleTop = new JPanel();
        JPanel middleBottom = new JPanel();
        JPanel bottom = new JPanel();

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(null);

        BufferedImage topImage = ImageIO.read(new File("src/Water_background.png"));
        BufferedImage bottomImage = ImageIO.read(new File("src/RoadBackground.png"));

        top.setBounds(0,0,710,196);
        contentPane.add(top);
        JLabel topLabel = new JLabel(new ImageIcon(topImage));
        topLabel.setIcon(new ImageIcon(new ImageIcon(topImage).getImage().getScaledInstance(710,196,Image.SCALE_DEFAULT)));
        topLabel.setBounds(0,0,710,196);
        top.add(topLabel);

        middleTop.setBounds(0,196,710,196);
        contentPane.add(middleTop);
        JLabel middleTopLabel = new JLabel(new ImageIcon(topImage));
        middleTopLabel.setIcon(new ImageIcon(new ImageIcon(topImage).getImage().getScaledInstance(710,196,Image.SCALE_DEFAULT)));
        middleTopLabel.setBounds(0,0,710,400);
        middleTop.add(middleTopLabel);

        middleBottom.setBounds(0,392,710,196);
        contentPane.add(middleBottom);
        JLabel middleBottomLabel = new JLabel(new ImageIcon(bottomImage));
        middleBottomLabel.setIcon(new ImageIcon(new ImageIcon(bottomImage).getImage().getScaledInstance(710,196,Image.SCALE_DEFAULT)));
        middleBottomLabel.setBounds(0,0,710,196);
        middleBottom.add(middleBottomLabel);

        bottom.setBounds(0,588,710,196);
        contentPane.add(bottom);
        JLabel bottomLabel = new JLabel(new ImageIcon(bottomImage));
        bottomLabel.setIcon(new ImageIcon(new ImageIcon(bottomImage).getImage().getScaledInstance(710,196,Image.SCALE_DEFAULT)));
        bottomLabel.setBounds(0,0,710,196);
        bottom.add(bottomLabel);

        frame.add(contentPane);
        frame.setResizable(false);
        frame.setBounds(100, 100, 725, 820);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException {
        BackGui();
   }
}
