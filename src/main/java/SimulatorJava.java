import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimulatorJava {

    private static void createGUI() {
        JFrame mainFrame = new JFrame();
        mainFrame.setLayout(new BorderLayout());
        JButton habrButton = new JButton();
        habrButton.addActionListener(new ActionListener() { // слушатель на нажатие кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                new DownloadPage();
        }});

        mainFrame.add(habrButton, BorderLayout.LINE_END);
        mainFrame.setSize(500, 500);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.setTitle("Simulator Java");
    }

    public static void main(String[] args){
        createGUI();
    }

}
