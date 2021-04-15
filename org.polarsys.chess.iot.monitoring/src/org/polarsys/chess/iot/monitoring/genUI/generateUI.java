package org.polarsys.chess.iot.monitoring.genUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class generateUI extends JComponent {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private volatile int screenX = 0;
  private volatile int screenY = 0;
  private volatile int myX = 0;
  private volatile int myY = 0;

  public generateUI() {
    setBorder(new LineBorder(Color.BLUE, 3));
    setBackground(Color.WHITE);
    setBounds(0, 0, 100, 100);
    setOpaque(false);

    addMouseListener(new MouseListener() {

      public void mouseClicked(MouseEvent e) { }

      public void mousePressed(MouseEvent e) {
        screenX = e.getXOnScreen();
        screenY = e.getYOnScreen();

        myX = getX();
        myY = getY();
      }

      public void mouseReleased(MouseEvent e) { }

      public void mouseEntered(MouseEvent e) { }

      public void mouseExited(MouseEvent e) { }

    });
    addMouseMotionListener(new MouseMotionListener() {

      public void mouseDragged(MouseEvent e) {
        int deltaX = e.getXOnScreen() - screenX;
        int deltaY = e.getYOnScreen() - screenY;

        setLocation(myX + deltaX, myY + deltaY);
      }

      public void mouseMoved(MouseEvent e) { }

    });
  }
}