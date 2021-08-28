import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class10 implements class132, MouseWheelListener {
   int field31 = 0;

   class10() {
   }

   void method59(Component var1) {
      var1.addMouseWheelListener(this);
   }

   void method61(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field31 += var1.getWheelRotation();
   }

   public synchronized int method2295() {
      int var2 = this.field31;
      this.field31 = 0;
      return var2;
   }
}
