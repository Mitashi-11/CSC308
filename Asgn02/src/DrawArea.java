package Asgn02.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawArea extends JPanel implements MouseListener {

    /**
     * DrawArea constructor
     * Uses inheritance from JPanel to create a panel that is notified about mouse actions.
     */
    public DrawArea(){
        addMouseListener(this);
    }
    /**
     * paintComponent - overridden method to draw the shapes to the window
     * @param g - Graphics object used by the parent to create what is shown on screen
     */

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //TODO
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("(" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
