package Lab04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Lab 04
 * @author Andrew Estrada
 * @author Jamie Luna
 * @author Teja Kandibanda
 * @author Mitashi Parikh
 * @author Jason Chu
 * @version 1.0
 */

public class Calculator extends JFrame implements ActionListener{

    JTextField calcTF;
    int numberA, numberB;
    char operator;
    boolean isFirst = true;
    boolean secondNum = false;

    /**
     * Main creates a new Calculator window and allows it to be seen and closed properly.
     */
    public static void main(String[]args){
        Calculator window = new Calculator();
        window.setSize(300,600);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Lab03.App constructor
     * Uses inheritance from JFrame to create a window with the elements
     * neccessary for a calculator.
     */
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

    /**
     * actionPerformed - implementation from ActionListener interface
     *      provides interactiveity for the calculator buttons
     * @param e ActionEvent notifying that a screen item has been selected
     */
    public void actionPerformed(ActionEvent e){
        if(isNum(e.getActionCommand())){
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
            } else {
                numberB = Integer.parseInt(calcTF.getText());
                secondNum = true;
            }
            calcTF.setText("0");
            if(!e.getActionCommand().equals("=")) {
                if(!secondNum){
                    operator = e.getActionCommand().charAt(0);
                } else {
                    int result = performCalulation();
                    numberA = result;
                    operator = e.getActionCommand().charAt(0);
                    //calcTF.setText("" + result);
                    secondNum = false;
                }
            } else {
                int result = performCalulation();
                calcTF.setText("" + result);
                isFirst = true;
                secondNum = false;
            }

        }
    }

    /**
     * performCalculation - method to perform the math operation
     *      using numberA, numberB, and operator
     * @return int - the result of the math operation
     */
    private int performCalulation(){
        return 0;
        //commented out code to please my JDK
//        return switch (operator) {
//            case '+' -> numberA + numberB;
//            case '-' -> numberA - numberB;
//            case '*' -> numberA * numberB;
//            case '/' -> numberA / numberB;
//            default -> numberA;
//        };
    }

    /**
     * isNum - method to determine if the string is numeric
     * @param number - String in question
     * @return - true if the string is numeric, false otherwise
     */
    private boolean isNum(String number) {
        return number.matches("[-+]?\\d*\\.?\\d+");
    }
}
