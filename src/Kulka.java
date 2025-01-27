import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;

class Kulka extends Ellipse2D.Float
{
   Plansza p;
   int dx, dy;

   Kulka(Plansza p, int x, int y, int dx, int dy)
   {
      this.x = x;
      this.y = y;
      this.width = 10;
      this.height = 10;

      this.p = p;
      this.dx = dx * 2;
      this.dy = dy * 2;
   }

   void nextKrok()
   {
      x += dx;
      y += dy;

      if (getMinX() < 0 || getMaxX() > p.getWidth()) dx = -dx;
      if (getMinY() < 0 || getMaxY() > p.getHeight()) dy = -dy;

      if (this.intersects(p.b)) {
         dy = -dy;
      }

      for (Cegielka cegielka : p.cegielki) {
         if (cegielka.isVisible() && this.intersects(cegielka)) {
            cegielka.setVisible(false);
            dy = -dy;
            p.punkty += 10; 
            break;
         }
      }

      p.repaint();
      Toolkit.getDefaultToolkit().sync();
   }
}