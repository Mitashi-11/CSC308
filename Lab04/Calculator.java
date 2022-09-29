import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Lab 04
 * @author Andrew Estrada
 * @author Jamie Luna
 * @author Teja Kandibanda
 * @author Bret Craig
 * @author Mitashi Parikh
 * @author Jason Chu
 * @version 1.0
 */

public class Calculator extends JFrame implements ActionListener{

    JTextField calcTF;
    int numberA, numberB;
    char operator;
    boolean isFirst = true;


    public static void main(String[]args){
        Calculator window = new Calculator();
        window.setSize(300,600);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Calculator() {
        super("Pseudo Calculator");
        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        calcTF = new JTextField("0");
        add(calcTF, BorderLayout.NORTH);

        JPanel box = new JPanel();
        add(box, BorderLayout.CENTER);
        box.setLayout(new GridLayout(4,4));
        JButton numbers[] = new JButton [15];
        for (int i = 0; i<10; i++){
            numbers[i] = new JButton (i  + "");
            numbers[i].addActionListener(this);
            box.add(numbers[i]);
        }
        //String operators[] = new String[5]("+", "-", );
        numbers[10] = new JButton("+");
        numbers[10].addActionListener(this);
        numbers[11] = new JButton("-");
        numbers[11].addActionListener(this);
        numbers[12] = new JButton("*");
        numbers[12].addActionListener(this);
        numbers[13] = new JButton("/");
        numbers[13].addActionListener(this);
        numbers[14] = new JButton("=");
        numbers[14].addActionListener(this);
        for (int i = 10; i<15; i++){
            box.add(numbers[i]);
        }




    }

    public void actionPerformed(ActionEvent e){
        if(Integer.___(e.getActionCommand())){
            if (!calcTF.getText().equals("0")){
                calcTF.setText(calcTF.getText() + e.getActionCommand());
            }
            else{
                calcTF.setText(e.getActionCommand());
            }
        }
        else{
            if (isFirst) {
                numberA = Integer.parseInt(calcTF.getText());
                isFirst = false;
            } else{
                numberB = Integer.parseInt(calcTF.getText());
            }
            calcTF.setText("0");
            if(!e.getActionCommand().equals("=")) {
                if(<there is not a second number using some flag>){
                    operator = e.getActionCommand().charAt(0);
                } else {
                    <implement a private method for calculating the result>
                }
            } else {
                int result;
                <implement a calulate method>
                switch (operator){
                    case'+':
                        result = numberA + numberB;
                        break;
                    //case '-', '*', '/'

                }
                calcTF.setText("" + result);
            }

        }

//        switch((e.getActionCommand())){
//            default:
//                if (!calcTF.getText().equals("0")){
//                    calcTF.setText(calcTF.getText() + e.getActionCommand());
//                }
//                else{
//                    calcTF.setText(e.getActionCommand());
//                }
//        }
    }
}
