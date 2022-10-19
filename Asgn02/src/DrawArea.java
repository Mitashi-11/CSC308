package Asgn02.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Assignment 02
 * @author Andrew Estrada
 * @author Jamie Luna
 * @author Mitashi Parikh
 * @version 1.0
 * DrawArea Class - a dot plotting panel section of a GUI
 */
public class DrawArea extends JPanel implements MouseListener {

    private List<Dot> data = new ArrayList<>();
    List<String> optionsSelected = new ArrayList<>();

    /**
     * DrawArea constructor
     * Uses inheritance from JPanel to create a panel that is notified about mouse actions.
     */
    public DrawArea(){
        addMouseListener(this);
    }

    /**
     * setOptionsSelected - setter for allowing communication of the desired operations
     * @param optionsSelected - list of string representations of the desired operations
     */
    public void setOptionsSelected(List<String> optionsSelected) {
        this.optionsSelected = optionsSelected;
    }

    /**
     * paintComponent - overridden method to draw cities to the window
     * @param g - Graphics object used by the parent to create what is shown on screen
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (Dot city: data){
            city.drawDot(g);
        }
    }

    /**
     * drawLines - function to translate the data retrieved from the ConnectDots Class
     *      into a line visible in the window
     * @param g - Graphics object used to create what is shown on screen
     */
    public void drawLines(Graphics g){
        g.setColor(Color.ORANGE);
        for(int i = 0; i < data.size()-1; i++){
            g.drawLine(data.get(i).getX_coord(), data.get(i).getY_coord(),
                        data.get(i+1).getX_coord(), data.get(i+1).getY_coord());
        }
    }

    /**
     * mousePressed - overridden method used to add a city to the GUI
     * @param e - MouseEvent with information of mouse position
     */
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("(" + e.getX() + ", " + e.getY() + ")");
        data.add(new Dot(e.getX(), e.getY(), Color.BLACK));
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
