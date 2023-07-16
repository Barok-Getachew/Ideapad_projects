import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

public class Signup extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public Signup() {
        initializeGUI();

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String status = "";
                // Perform signup logic here
                // You can store the entered data or perform any other actions as needed
                try {
                    Client client = new Client();
                     status = client.insertData(username,password);
                } catch (MalformedURLException ex) {
                    System.out.println(" error");
                }catch (Exception exception){
                   JOptionPane.showMessageDialog(Signup.this,
                            "this username has already taken!",
                            "Error",
                           0);
//                   Signup s = new Signup();
                }
                if (status != "") {

                    GroupChatUI gui = new GroupChatUI();
                }



            }
        });
    }

    private void initializeGUI() {
        setTitle("Signup Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300)); // Set the preferred size of the frame
        setLayout(new GridBagLayout()); // Use GridBagLayout for proportional positioning
        setVisible(true);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 5, 10); // Add vertical and horizontal spacing

        JLabel usernameLabel = new JLabel("Username:");
        add(usernameLabel, gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0; // Adjust the column weight to make the text field wider
        usernameField = new JTextField();
        add(usernameField, gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        JLabel passwordLabel = new JLabel("Password:");
        add(passwordLabel, gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        passwordField = new JPasswordField();
        add(passwordField, gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 0.0; // Reset the column weight for the button
        registerButton = new JButton("Signup");
        add(registerButton, gbc);

        pack();
        setLocationRelativeTo(null);
    }

}
