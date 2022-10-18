import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Lab 02
 * @author Andrew Estrada
 * @author Jamie Luna
 * @author Teja Kandibanda
 * @author Bret Craig
 * @author Mitashi Parikh
 * @version 1.0
 */
public class App extends JFrame implements ActionListener {
    /**
     * Main creates a new Lab03.App window and allows it to be seen and closed properly.
     */
    public static void main(String[]args){
        Lab03.App window = new Lab03.App();
        window.setSize(500,500);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Lab03.App constructor
     * Uses inheritance from JFrame to create a window with a menu and tabs
     * as specified by the requirements.
     * Each menu item has an associated ActionListener for callback to a dialog message.
     * Each tab has a unique color and label to match.
     */
    public App(){
        super("Lab03.App Window");

        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("About");
        JMenuItem item1 = new JMenuItem("Open");
        item1.addActionListener(this);
        JMenuItem item2 = new JMenuItem("Save");
        item2.addActionListener(this);
        JMenuItem item3 = new JMenuItem("Quit");
        item3.addActionListener(this);

        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menuBar.add(menu1);
        menuBar.add(menu2);
        setJMenuBar(menuBar);

        JLabel label1 = new JLabel("Green");
        label1.setBackground(Color.GREEN);
        label1.setOpaque(true);
        JLabel label2 = new JLabel("Magenta");
        label2.setBackground(Color.MAGENTA);
        label2.setOpaque(true);
        JLabel label3 = new JLabel("Blue");
        label3.setBackground(Color.CYAN);
        label3.setOpaque(true);
        JLabel label4 = new JLabel("Orange");
        label4.setBackground(Color.ORANGE);
        label4.setOpaque(true);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("One", label1);
        tabbedPane.add("Two", label2);
        tabbedPane.add("Three", label3);
        tabbedPane.add("Four", label4);
        add(tabbedPane);
    }

    /**
     * actionPerformed - implementation from ActionListener interface
     *      Creates a unique dialog box message for menu items that are clicked
     * @param e ActionEvent notifying that a JMenuItem has been selected
     */
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Open")){
            JOptionPane.showMessageDialog(this, "Message for \'Open\'!");
        }
        else if (e.getActionCommand().equals("Save")){
            JOptionPane.showMessageDialog(this, "Message for \'Save\'!");
        }
        else if (e.getActionCommand().equals("Quit")){
            JOptionPane.showMessageDialog(this, "Message for \'Quit\'!");
        }
    }
}
