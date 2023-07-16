package frames;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import components.ShowAbout;
import components.ShowHistory;
import converter.ConversionProgram;
import files.History_write_read;

public class DayYearConverter extends JFrame {
    private JLabel label1, label2, label3, label4;
    private JTextField field1, field2, field3, field4;
    private JButton button;
    private JPanel panel;
    String year;
    String month;
    String week;

    String days;
    History_write_read history;
    ConversionProgram converter;
    ShowHistory showHistory;
    public DayYearConverter() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          panel = new JPanel();
        // Set the layout manager
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Create the menu bar and menus
        JMenuBar menuBar = new JMenuBar();
        JMenu viewMenu = new JMenu("View");
        JMenu moreMenu = new JMenu("More..");

//        JMenu helpMenu = new JMenu("Help");
        menuBar.add(viewMenu);
        menuBar.add(moreMenu);
//        menuBar.add(helpMenu);


        // Create the menu bar and menus
        JMenuItem yellowItem = new JMenuItem("DarkGray");
        yellowItem.addActionListener(e -> {
         panel.setBackground(Color.darkGray);
            menuBar.setBackground(Color.darkGray);
            viewMenu.setForeground(Color.WHITE);
            moreMenu.setForeground(Color.WHITE);
         button.setBackground(Color.orange);
         label1.setForeground(Color.WHITE);
         label2.setForeground(Color.WHITE);
         label3.setForeground(Color.WHITE);
         label4.setForeground(Color.WHITE);
        });
        JMenuItem blackItem = new JMenuItem("Eye comfort");
        blackItem.addActionListener(e -> {
            panel.setBackground(Color.orange);
            menuBar.setBackground(Color.orange);

            viewMenu.setForeground(Color.WHITE);
            moreMenu.setForeground(Color.WHITE);

            panel.setForeground(Color.cyan);
            button.setBackground(Color.CYAN);
            label1.setForeground(Color.WHITE);
            label2.setForeground(Color.WHITE);
            label3.setForeground(Color.WHITE);
            label4.setForeground(Color.WHITE);
        });
        JMenuItem greenItem = new JMenuItem("Gray");
        greenItem.addActionListener(e -> {
            panel.setBackground(Color.LIGHT_GRAY);
            menuBar.setBackground(Color.GRAY);

            viewMenu.setForeground(Color.BLACK);
            moreMenu.setForeground(Color.BLACK);


            button.setBackground(Color.BLUE);
            label1.setForeground(Color.BLACK);
            label2.setForeground(Color.BLACK);
            label3.setForeground(Color.BLACK);
            label4.setForeground(Color.BLACK);
        });
        viewMenu.add(yellowItem);
        viewMenu.add(blackItem);
        viewMenu.add(greenItem);

        // Add options to the more menu
        JMenuItem hitoryItem = new JMenuItem("History");
        hitoryItem.addActionListener(new YearDayConverter.myActionListener());
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(e -> {
            ShowAbout showAbout = new ShowAbout();
        });
        moreMenu.add(hitoryItem);
        moreMenu.add(aboutItem);
        // Add the menu bar to the frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(menuBar, gbc);

        // Create the labels and text fields
        label1 = new JLabel(" Days:");

        field1 = new JTextField(20);


        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.2;
        gbc.weighty = 0.1;
        panel.add(label1, gbc);
        gbc.gridx = 1;
        gbc.weightx = 0.8;
        panel.add(field1, gbc);
        // Create the button
        button = new JButton("Convert");
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLUE);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                days = field1.getText();
                 converter = new ConversionProgram(days);
                 year = converter.day_to_year();
                 month = converter.day_to_month();
                 week = converter.day_to_week();
                 if(year != "error"){
                     field2.setText(year);
                     field3.setText(month);
                     field4.setText(week);
                 }else{
                     JOptionPane.showMessageDialog(panel,"Please enter valid number","Error Message",0);
                 }



                history =  new History_write_read( days + " days are converted in to " + year + " years " + month+" months "+week+" and weeks at: ");
                history.History_WRITE();

            }
        });
        label2 = new JLabel("Year:");
        field2 = new JTextField(20);
        field2.setEditable(false);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0.2;
        gbc.weighty = 0.1;
        panel.add(label2, gbc);
        gbc.gridx = 1;
        gbc.weightx = 0.8;
        panel.add(field2, gbc);

        label3 = new JLabel("Months:");
        field3 = new JTextField(20);
        field3.setEditable(false);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0.2;
        gbc.weighty = 0.1;
        panel.add(label3, gbc);
        gbc.gridx = 1;
        gbc.weightx = 0.8;
        panel.add(field3, gbc);
        label4 = new JLabel("Weeks:");
        field4 = new JTextField(20);

        field4.setEditable(false);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 0.2;
        gbc.weighty = 0.1;
        panel.add(label4, gbc);
        gbc.gridx = 1;
        gbc.weightx = 0.8;
        panel.add(field4, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 0.5;
        gbc.weighty = 0.2;
        panel.add(button, gbc);
        add(panel);

        // Set the frame properties
        pack();
//        setSize(500,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

}