import java.io.File;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

public class class63 implements Callable {
   static File method1655(String var0) {
      if (!class133.field1483) {
         throw new RuntimeException("");
      } else {
         File var2 = (File)class133.field1484.get(var0);
         if (var2 != null) {
            return var2;
         } else {
            File var3 = new File(class133.field1482, var0);
            RandomAccessFile var4 = null;

            try {
               File var5 = new File(var3.getParent());
               if (!var5.exists()) {
                  throw new RuntimeException("");
               } else {
                  var4 = new RandomAccessFile(var3, "rw");
                  int var6 = var4.read();
                  var4.seek(0L);
                  var4.write(var6);
                  var4.seek(0L);
                  var4.close();
                  class133.field1484.put(var0, var3);
                  return var3;
               }
            } catch (Exception var8) {
               try {
                  if (null != var4) {
                     var4.close();
                     var4 = null;
                  }
               } catch (Exception var7) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   class63() {
   }

   public Object call() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   static final int method1654(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var4 = var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
      return var4;
   }

   static final void method1660(String var0) {
      if (class69.field972 != null) {
         PacketBufferNode var2 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2633, client.packetWriter.isaacCipher);
         var2.packetBuffer.writeByte(class281.method4532(var0));
         var2.packetBuffer.writeStringCP1252(var0);
         client.packetWriter.addNode(var2);
      }
   }

   static void method1659(Buffer var0, int var1) {
      class145.method2450(var0.payload, var1);
      InterfaceParent.method1681(var0, var1);
   }
}
