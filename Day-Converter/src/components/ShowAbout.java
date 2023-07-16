package components;

import javax.swing.*;

public class ShowAbout extends JDialog {
   public ShowAbout(){
        setVisible(true);
        setSize(250,300);
        setResizable(false);
        String[] members = {"  ...........Group Members............",
                            "    name                              id",
                            "Yaikob zeray.................ugr/171655/12",
                            "Biruk Getachew...............ugr/172812/12",
                            "Solomon Sitotaw..............ugr/172813/12",
                            "Yordanos Bogale..............ugr/171808/12",
                            "Bitaniya Ayenew..............ugr/171931/12"
                           };
        JList list = new JList(members);
        add(list);
    }
}
