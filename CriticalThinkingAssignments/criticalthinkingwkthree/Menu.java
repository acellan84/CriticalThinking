package criticalthinkingwkthree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Menu {
    private JFrame frame;
    private JTextArea textBox;
    private SimpleDateFormat dateFormat;

    public Menu() {
        frame = new JFrame("User Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel(new FlowLayout());
        frame.add(buttonPanel, BorderLayout.NORTH);

        JButton showDateTimeButton = new JButton("Date/Time Stamp");
        buttonPanel.add(showDateTimeButton);

        JButton changeBackgroundColorButton = new JButton("Change Color");
        buttonPanel.add(changeBackgroundColorButton);

        JButton saveToFileButton = new JButton("Save to a log.txt");
        buttonPanel.add(saveToFileButton);

        JButton exitButton = new JButton("Exit");
        buttonPanel.add(exitButton);

        textBox = new JTextArea();
        frame.add(new JScrollPane(textBox), BorderLayout.CENTER);

        dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm");

        showDateTimeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDateTime();
            }
        });

        changeBackgroundColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeBackgroundColor();
            }
        });

        saveToFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    private void showDateTime() {
        String dateTime = dateFormat.format(new Date());
        textBox.setText("Current Date and Time: " + dateTime);
    }

    private void saveToFile() {
        try {
            String textToSave = textBox.getText();
            File file = new File("log.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(textToSave);
            writer.close();
            JOptionPane.showMessageDialog(frame, "Text saved to log.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void changeBackgroundColor() {
        Random random = new Random();
        float hue = 0.25f + random.nextFloat() * 0.15f; // Generate random green hue (0.25 to 0.40)
        float saturation = 0.8f;
        float brightness = 0.9f;
        Color backgroundColor = Color.getHSBColor(hue, saturation, brightness);
        textBox.setBackground(backgroundColor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu();
            }
        });
    }
}