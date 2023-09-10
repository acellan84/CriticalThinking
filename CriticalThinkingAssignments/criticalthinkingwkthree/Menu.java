package criticalthinkingwktwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Menu {
	   private JFrame frame;
	    private JTextArea textArea;
	    private Color backgroundColor;

	    public MenuDemo() {
	        frame = new JFrame("Menu Demo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLayout(new BorderLayout());

	        JMenuBar menuBar = new JMenuBar();

	        JMenu fileMenu = new JMenu("File");
	        JMenuItem showDateTimeItem = new JMenuItem("Show Date/Time");
	        JMenuItem saveToFileItem = new JMenuItem("Save to File");
	        JMenuItem changeBackgroundColorItem = new JMenuItem("Change Background Color");
	        JMenuItem exitItem = new JMenuItem("Exit");

	        fileMenu.add(showDateTimeItem);
	        fileMenu.add(saveToFileItem);
	        fileMenu.add(changeBackgroundColorItem);
	        fileMenu.add(exitItem);

	        menuBar.add(fileMenu);
	        frame.setJMenuBar(menuBar);

	        textArea = new JTextArea();
	        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

	        showDateTimeItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                showDateTime();
	            }
	        });

	        saveToFileItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                saveToFile();
	            }
	        });

	        changeBackgroundColorItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                changeBackgroundColor();
	            }
	        });

	        exitItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });

	        frame.setVisible(true);
	    }

	    private void showDateTime() {
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String dateTime = sdf.format(new Date());
	        textArea.setText(dateTime);
	    }

	    private void saveToFile() {
	        try (FileWriter writer = new FileWriter("log.txt")) {
	            writer.write(textArea.getText());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private void changeBackgroundColor() {
	        Random random = new Random();
	        float hue = random.nextFloat();
	        backgroundColor = Color.getHSBColor(hue, 1, 1);
	        textArea.setBackground(backgroundColor);
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

