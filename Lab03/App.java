package Lab03;

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
 * @author Jason Chu
 * @version 1.0
 */
public class App extends JFrame implements ActionListener {

    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField calcTF;

    /**
     * Main creates a new Lab03.App window and allows it to be seen and closed properly.
     */
    public static void main(String[]args){
        App window = new App();
        window.setSize(500,500);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Lab03.App constructor
     * Uses inheritance from JFrame to create a window with a menu and tabs
     * as specified by the requirements.
     * Each menu item has an associated ActionListener for callback to a dialog message.
     * First tab has an
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

        JPanel box = new JPanel();
        box.setLayout(new GridLayout(2,2));
        JButton button = new JButton("Click Here");
        button.addActionListener(this);
        tf1 = new JTextField("I can write here");
        tf2 = new JTextField("And here...");
        tf3 = new JTextField("Or here!");
        box.add(tf1);
        box.add(tf2);
        box.add(button);
        box.add(tf3);

        JPanel box2 = new JPanel();
        box2.setLayout(new GridLayout(4,3));
        calcTF = new JTextField("");
        JButton b1 = new JButton("1");
        b1.addActionListener(this);
        JButton b2 = new JButton("2");
        b2.addActionListener(this);
        JButton b3 = new JButton("3");
        b3.addActionListener(this);
        JButton b4 = new JButton("4");
        b4.addActionListener(this);
        JButton b5 = new JButton("5");
        b5.addActionListener(this);
        JButton b6 = new JButton("6");
        b6.addActionListener(this);
        JButton b7 = new JButton("7");
        b7.addActionListener(this);
        JButton b8 = new JButton("8");
        b8.addActionListener(this);
        JButton b9 = new JButton("9");
        b9.addActionListener(this);
        JButton b0 = new JButton("0");
        b0.addActionListener(this);
        JButton clear = new JButton("Clear");
        clear.addActionListener(this);
        box2.add(calcTF);
        box2.add(b1);
        box2.add(b2);
        box2.add(b3);
        box2.add(b4);
        box2.add(b5);
        box2.add(b6);
        box2.add(b7);
        box2.add(b8);
        box2.add(b9);
        box2.add(b0);
        box2.add(clear);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("One", box);
        tabbedPane.add("Two", box2);
        tabbedPane.add("Three", label1);
        tabbedPane.add("Four", label2);
        add(tabbedPane);
    }

    /**
     * actionPerformed - implementation from ActionListener interface
     *      Creates a unique dialog box message for menu items that are clicked
     *      Specifies actions for JButtons on tabs 1 & 2
     * @param e ActionEvent notifying that a JMenuItem has been selected
     */
    public void actionPerformed(ActionEvent e){
        switch((e.getActionCommand())){
            case "Open":
                JOptionPane.showMessageDialog(this, "Message for \'Open\'!");
                break;
            case "Save":
                JOptionPane.showMessageDialog(this, "Message for \'Save\'!");
                break;
            case "Quit":
                JOptionPane.showMessageDialog(this, "Message for \'Quit\'!");
                break;
            case "Click Here":
                tf3.setText(tf1.getText() + "," + tf2.getText());
                break;
            case "1":
                calcTF.setText(calcTF.getText() + "1");
                break;
            case "2":
                calcTF.setText(calcTF.getText() + "2");
                break;
            case "3":
                calcTF.setText(calcTF.getText() + "3");
                break;
            case "4":
                calcTF.setText(calcTF.getText() + "4");
                break;
            case "5":
                calcTF.setText(calcTF.getText() + "5");
                break;
            case "6":
                calcTF.setText(calcTF.getText() + "6");
                break;
            case "7":
                calcTF.setText(calcTF.getText() + "7");
                break;
            case "8":
                calcTF.setText(calcTF.getText() + "8");
                break;
            case "9":
                calcTF.setText(calcTF.getText() + "9");
                break;
            case "0":
                calcTF.setText(calcTF.getText() + "0");
                break;
            case "Clear":
                calcTF.setText("");
                break;
        }
    }
}

