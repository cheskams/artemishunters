import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Background extends JFrame {
    public static final int FRAME_WIDTH = 630;
    public static final int FRAME_HEIGHT = 536;

    public static final int PANEL_WIDTH = 614;
    public static final int PANEL_HEIGHT = 536;

    public static final int IMAGE_HEIGHT = 96;

    private JPanel top, middleTop, middleBottom, bottom, contentPane, topEnd, bottomEnd, solidBlock;
    private JFrame frame;
    private JLabel topLabel, middleTopLabel, middleBottomLabel, bottomLabel;

    public Background() throws IOException {
        frame = new JFrame();
        top = new JPanel();
        middleTop = new JPanel();
        middleBottom = new JPanel();
        bottom = new JPanel();
        topEnd = new JPanel();
        bottomEnd = new JPanel();
        solidBlock = new JPanel();

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        //setContentPane(contentPane);
        contentPane.setLayout(null);

        BufferedImage topImage = ImageIO.read(new FileInputStream("Water background.png"));
        BufferedImage bottomImage = ImageIO.read(new FileInputStream("RoadBackground.png"));

        topEnd.setBounds(0,0,PANEL_WIDTH,55);
        contentPane.add(topEnd);
        topEnd.setBackground(new Color(102, 204, 0));

        top.setBounds(0,50,PANEL_WIDTH,IMAGE_HEIGHT+5);
        contentPane.add(top);
        topLabel = new JLabel(new ImageIcon(topImage));
        topLabel.setIcon(new ImageIcon(new ImageIcon(topImage).getImage().getScaledInstance(PANEL_WIDTH,IMAGE_HEIGHT+5,Image.SCALE_DEFAULT)));
        topLabel.setBounds(0,0,PANEL_WIDTH,IMAGE_HEIGHT+5);
        top.add(topLabel);

        middleTop.setBounds(0,140,PANEL_WIDTH,IMAGE_HEIGHT+11);
        contentPane.add(middleTop);
        middleTopLabel = new JLabel(new ImageIcon(topImage));
        middleTopLabel.setIcon(new ImageIcon(new ImageIcon(topImage).getImage().getScaledInstance(PANEL_WIDTH,IMAGE_HEIGHT+11,Image.SCALE_DEFAULT)));
        middleTopLabel.setBounds(0,0,PANEL_WIDTH,IMAGE_HEIGHT+11);
        middleTop.add(middleTopLabel);

        middleBottom.setBounds(0,230,PANEL_WIDTH,IMAGE_HEIGHT+16);
        contentPane.add(middleBottom);
        middleBottomLabel = new JLabel(new ImageIcon(bottomImage));
        middleBottomLabel.setIcon(new ImageIcon(new ImageIcon(bottomImage).getImage().getScaledInstance(PANEL_WIDTH,IMAGE_HEIGHT+16,Image.SCALE_DEFAULT)));
        middleBottomLabel.setBounds(0,0,PANEL_WIDTH,IMAGE_HEIGHT+16);
        middleBottom.add(middleBottomLabel);

        solidBlock.setBounds(0,230,PANEL_WIDTH,IMAGE_HEIGHT+22);
        contentPane.add(solidBlock);
        solidBlock.setBackground(new Color(255, 255, 0));

        bottom.setBounds(0,343,PANEL_WIDTH,IMAGE_HEIGHT);
        contentPane.add(bottom);
        bottomLabel = new JLabel(new ImageIcon(bottomImage));
        bottomLabel.setIcon(new ImageIcon(new ImageIcon(bottomImage).getImage().getScaledInstance(PANEL_WIDTH,IMAGE_HEIGHT,Image.SCALE_DEFAULT)));
        bottomLabel.setBounds(0,0,PANEL_WIDTH,IMAGE_HEIGHT);
        bottom.add(bottomLabel);

        bottomEnd.setBounds(0,439,PANEL_WIDTH,58);
        contentPane.add(bottomEnd);
        bottomEnd.setBackground(new Color(51, 153, 0));

        frame.add(contentPane);
        frame.setResizable(false);
        frame.setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);
        //frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getBackFrame() {
    	return frame;
    }
    
    public static void main(String[] args) throws IOException {
        new Background();
    }
}
