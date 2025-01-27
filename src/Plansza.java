import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class Plansza extends JPanel implements MouseMotionListener
{
   Belka b;
   Kulka a;
   SilnikKulki s;
   Cegielka[] cegielki;
   int punkty;

   Plansza()
   {
      super();
      addMouseMotionListener(this);

      b = new Belka(100);
      a = new Kulka(this, 200, 250, 1, 1); // Ustawienie piłeczki bliżej dołu planszy
      s = new SilnikKulki(a);

      // Inicjalizacja cegiełek
      cegielki = new Cegielka[50]; // Zwiększenie liczby cegiełek
      Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE};
      for (int i = 0; i < cegielki.length; i++) {
         cegielki[i] = new Cegielka(30 + (i % 10) * 35, 30 + (i / 10) * 25, 30, 15, colors[i % colors.length]); // Dostosowanie rozmieszczenia cegiełek
      }

      punkty = 0;
   }

   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;

      g2d.fill(a);
      g2d.fill(b);

      for (Cegielka cegielka : cegielki) {
         if (cegielka.isVisible()) {
            g2d.setColor(cegielka.getColor());
            g2d.fill(cegielka);
         }
      }

      // Wyświetlanie liczby punktów
      g2d.setColor(Color.BLACK);
      g2d.drawString("Punkty: " + punkty, 10, 20);
   }

   public void mouseMoved(MouseEvent e)
   {
      b.setX(e.getX() - 50);
      repaint();
   }

   public void mouseDragged(MouseEvent e)
   {

   }
}