import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class newMainPanel extends JFrame {
    private JList jlist;
    private JButton renderItButton;
    private JPanel mainPanel;
    private JButton deleteButton;

    private ArrayList<Chat> subscribedChats = new ArrayList<>();

    public newMainPanel() {
        
        Chat chat1 = new Chat("Chat1","jestemChat1","src" + File.separator + "Icons" + File.separator + "eagle.jpg");
        Chat chat2 = new Chat("Chat2","jestemChat2","src" + File.separator + "Icons" + File.separator + "bear.jpg");
        Chat chat3 = new Chat("Chat3","JestemChat3","src" + File.separator + "Icons" + File.separator + "horse.jpg");

        ArrayList<Chat> chats = new ArrayList<>();
        chats.add(chat1);
        chats.add(chat2);
        chats.add(chat3);

        renderItButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChatRenderer czats = new ChatRenderer();

                jlist.setCellRenderer(czats);
                jlist.setModel(readAllChat(chats));
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Chat czat = ( Chat)jlist.getSelectedValue();
                chats.remove(czat);
                ChatRenderer chat = new ChatRenderer();
                jlist.setCellRenderer(chat);
                jlist.setModel(readAllChat(chats));
            }
        });
    }
    public DefaultListModel <Chat> readAllChat(ArrayList<Chat> arrayList) {
        DefaultListModel <Chat> chatList = new DefaultListModel<>();
        for(Chat x: arrayList){
            chatList.addElement(x);
        }
        

        return chatList;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("newMainPanel");
        frame.setContentPane(new newMainPanel().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
