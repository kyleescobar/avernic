import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class130 implements Runnable {
   public static String field1463;
   public static String field1469;
   static class302 field1468;
   boolean field1467 = false;
   class136 field1462 = null;
   class136 field1465 = null;
   Thread field1466;

   public class130() {
      field1469 = "Unknown";
      field1463 = "1.6";

      try {
         field1469 = System.getProperty("java.vendor");
         field1463 = System.getProperty("java.version");
      } catch (Exception var2) {
      }

      this.field1467 = false;
      this.field1466 = new Thread(this);
      this.field1466.setPriority(10);
      this.field1466.setDaemon(true);
      this.field1466.start();
   }

   static void method2276(int var0, String var1, String var2, String var3) {
      class61 var5 = (class61)class85.field1196.get(var0);
      if (null == var5) {
         var5 = new class61();
         class85.field1196.put(var0, var5);
      }

      class45 var6 = var5.method1616(var0, var1, var2, var3);
      class85.field1194.method5727(var6, (long)var6.field378);
      class85.field1195.method4812(var6);
      client.field602 = client.field593;
   }

   public final void method2268() {
      synchronized(this) {
         this.field1467 = true;
         this.notifyAll();
      }

      try {
         this.field1466.join();
      } catch (InterruptedException var4) {
      }

   }

   static class45 method2277(int var0) {
      return (class45)class85.field1194.method5716((long)var0);
   }

   public final void run() {
      while(true) {
         class136 var1;
         synchronized(this) {
            while(true) {
               if (this.field1467) {
                  return;
               }

               if (this.field1465 != null) {
                  var1 = this.field1465;
                  this.field1465 = this.field1465.field1507;
                  if (null == this.field1465) {
                     this.field1462 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var7) {
               }
            }
         }

         try {
            int var2 = var1.field1512;
            if (var2 == 1) {
               var1.field1510 = new Socket(InetAddress.getByName((String)var1.field1514), var1.field1515);
            } else if (var2 == 2) {
               Thread var3 = new Thread((Runnable)var1.field1514);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field1515);
               var1.field1510 = var3;
            } else if (4 == var2) {
               var1.field1510 = new DataInputStream(((URL)var1.field1514).openStream());
            }

            var1.field1511 = 1;
         } catch (ThreadDeath var5) {
            throw var5;
         } catch (Throwable var6) {
            var1.field1511 = 2;
         }
      }
   }

   final class136 method2274(int var1, int var2, int var3, Object var4) {
      class136 var6 = new class136();
      var6.field1512 = var1;
      var6.field1515 = var2;
      var6.field1514 = var4;
      synchronized(this) {
         if (null != this.field1462) {
            this.field1462.field1507 = var6;
            this.field1462 = var6;
         } else {
            this.field1462 = this.field1465 = var6;
         }

         this.notify();
         return var6;
      }
   }

   public final class136 method2258(String var1, int var2) {
      return this.method2274(1, var2, 0, var1);
   }

   public final class136 method2257(Runnable var1, int var2) {
      return this.method2274(2, var2, 0, var1);
   }

   static final void method2259(int var0) {
      var0 = Math.min(Math.max(var0, 0), 255);
      if (var0 != class38.clientPreferences.field1119) {
         if (0 == class38.clientPreferences.field1119 && client.field640 != -1) {
            PlayerList.method1886(class109.archive6, client.field640, 0, var0, false);
            client.field648 = false;
         } else if (var0 == 0) {
            class60.method1610();
            client.field648 = false;
         } else {
            class361.method5700(var0);
         }

         class38.clientPreferences.field1119 = var0;
         class135.savePreferences();
      }

   }
}
