import java.awt.Color;
import java.awt.geom.Rectangle2D;

class Cegielka extends Rectangle2D.Float
{
   boolean isVisible;
   Color color;

   Cegielka(int x, int y, int width, int height, Color color)
   {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      this.isVisible = true;
      this.color = color;
   }

   void setVisible(boolean isVisible)
   {
      this.isVisible = isVisible;
   }

   boolean isVisible()
   {
      return this.isVisible;
   }

   Color getColor()
   {
      return this.color;
   }
}