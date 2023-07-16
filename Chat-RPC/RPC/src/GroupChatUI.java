import org.apache.xmlrpc.XmlRpcException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Vector;

public class GroupChatUI extends JFrame {
    private JTextArea chatTextArea;
    private JTextField messageTextField;
    private JButton sendButton;
    private JButton refreshButton;
    Client client;
    JScrollPane scrollPane;

    public GroupChatUI() {
        setTitle("Group Chat");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        try {
            client = new Client();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        Vector data = client.showData();
        JList list = new JList<>(data);
         scrollPane = new JScrollPane(list);
        add(scrollPane, BorderLayout.CENTER);
        Thread thread = new Thread();




        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());

        messageTextField = new JTextField();
        bottomPanel.add(messageTextField, BorderLayout.CENTER);

        sendButton = new JButton("Send");
        bottomPanel.add(sendButton, BorderLayout.EAST);
        refreshButton = new JButton("Refresh");
        bottomPanel.add(sendButton, BorderLayout.EAST);
        bottomPanel.add(refreshButton, BorderLayout.AFTER_LAST_LINE);
        add(bottomPanel, BorderLayout.SOUTH);

         refreshButton.addActionListener(e->{
             Vector<String> data1 = new Vector<>();
             try {
                 client = new Client();
             } catch (MalformedURLException ex) {
                 throw new RuntimeException(ex);
             }


             data1 = client.showData();
             swapPanel(data1);
         });
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = messageTextField.getText();
                messageTextField.setText("");
                Client cl;
                Vector<String> data = new Vector<>();

                try {
                    client = new Client();
                    client.insertMessage(message);


                        data = client.showData();
                        swapPanel(data);

                } catch (MalformedURLException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (XmlRpcException ex) {
                    throw new RuntimeException(ex);
                }

            }

        });


    }
    protected void swapPanel(Vector data) {


                    JList list = null;
                    remove(scrollPane);
                     invalidate();
                     list = new JList<>(data);
                    JScrollPane scrollPane = new JScrollPane(list);
                    add(scrollPane, BorderLayout.CENTER);
                    revalidate();

                }



        //    public static void main(String[] args) {
//        GroupChatUI singup = new GroupChatUI();
//    }


}





