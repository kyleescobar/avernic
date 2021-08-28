import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import javax.imageio.ImageIO;

public class class76 {
   public static class277 field1120;
   static int field1112 = 7;
   static String field1124;
   boolean field1113;
   boolean field1114;
   boolean field1117 = false;
   double field1118 = 0.8D;
   int field1116 = 127;
   int field1119 = 127;
   int field1121 = 127;
   int field1122 = 1;
   String rememberUsername = null;
   LinkedHashMap parameters = new LinkedHashMap();

   public static final class398 method1810(byte[] var0) {
      BufferedImage var2 = null;

      try {
         var2 = ImageIO.read(new ByteArrayInputStream(var0));
         int var3 = var2.getWidth();
         int var4 = var2.getHeight();
         int[] var5 = new int[var3 * var4];
         PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3);
         var6.grabPixels();
         return new class398(var5, var3, var4);
      } catch (IOException var7) {
      } catch (InterruptedException var8) {
      }

      return new class398(0, 0);
   }

   class76() {
      this.method1814(true);
   }

   class76(Buffer var1) {
      if (var1 != null && var1.payload != null) {
         int var2 = var1.readUnsignedByte();
         if (var2 >= 0 && var2 <= field1112) {
            if (var1.readUnsignedByte() == 1) {
               this.field1113 = true;
            }

            if (var2 > 1) {
               this.field1114 = var1.readUnsignedByte() == 1;
            }

            if (var2 > 3) {
               this.field1122 = var1.readUnsignedByte();
            }

            if (var2 > 2) {
               int var3 = var1.readUnsignedByte();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.readInt();
                  int var6 = var1.readInt();
                  this.parameters.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.rememberUsername = var1.method5956();
            }

            if (var2 > 5) {
               this.field1117 = var1.method6178();
            }

            if (var2 > 6) {
               this.field1118 = (double)var1.readUnsignedByte() / 100.0D;
               this.field1119 = var1.readUnsignedByte();
               this.field1121 = var1.readUnsignedByte();
               this.field1116 = var1.readUnsignedByte();
            }
         } else {
            this.method1814(true);
         }
      } else {
         this.method1814(true);
      }

   }

   void method1814(boolean var1) {
   }

   Buffer method1820() {
      Buffer var2 = new Buffer(100);
      var2.writeByte(field1112);
      var2.writeByte(this.field1113 ? 1 : 0);
      var2.writeByte(this.field1114 ? 1 : 0);
      var2.writeByte(this.field1122);
      var2.writeByte(this.parameters.size());
      Iterator var3 = this.parameters.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var2.writeInt((Integer)var4.getKey());
         var2.writeInt((Integer)var4.getValue());
      }

      var2.writeStringCP1252(this.rememberUsername != null ? this.rememberUsername : "");
      var2.writeBoolean(this.field1117);
      var2.writeByte((int)(this.field1118 * 100.0D));
      var2.writeByte(this.field1119);
      var2.writeByte(this.field1121);
      var2.writeByte(this.field1116);
      return var2;
   }

   public static int[] method1819() {
      int[] var1 = new int[KeyHandler.field65];

      for(int var2 = 0; var2 < KeyHandler.field65; ++var2) {
         var1[var2] = KeyHandler.field56[var2];
      }

      return var1;
   }
}
