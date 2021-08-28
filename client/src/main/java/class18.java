import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class class18 extends class395 {
   Component field94;
   Image field95;

   class18(int var1, int var2, Component var3) {
      super.field4254 = var1;
      super.field4253 = var2;
      super.field4252 = new int[var1 * var2 + 1];
      DataBufferInt var4 = new DataBufferInt(super.field4252, super.field4252.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.field4254, super.field4253), var4, (Point)null);
      this.field95 = new BufferedImage(var5, var6, false, new Hashtable());
      this.method144(var3);
      this.method6340();
   }

   final void method144(Component var1) {
      this.field94 = var1;
   }

   public final void method6333(int var1, int var2) {
      this.method150(this.field94.getGraphics(), var1, var2);
   }

   public final void method6332(int var1, int var2, int var3, int var4) {
      this.method145(this.field94.getGraphics(), var1, var2, var3, var4);
   }

   final void method150(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.field95, var2, var3, this.field94);
      } catch (Exception var6) {
         this.field94.repaint();
      }

   }

   final void method145(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var7 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field95, 0, 0, this.field94);
         var1.setClip(var7);
      } catch (Exception var8) {
         this.field94.repaint();
      }

   }
}
