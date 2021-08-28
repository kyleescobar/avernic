import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class class87 implements Runnable {
   Queue field1220 = new LinkedList();
   final Thread field1217 = new Thread(this);
   volatile boolean field1218;

   public static final synchronized long method1989() {
      long var1 = System.currentTimeMillis();
      if (var1 < class281.field3626) {
         class382.field4174 += class281.field3626 - var1;
      }

      class281.field3626 = var1;
      return class382.field4174 + var1;
   }

   public class87() {
      this.field1217.setPriority(1);
      this.field1217.start();
   }

   public void run() {
      while(!this.field1218) {
         try {
            class88 var1;
            synchronized(this) {
               var1 = (class88)this.field1220.poll();
               if (null == var1) {
                  try {
                     this.wait();
                  } catch (InterruptedException var12) {
                  }
                  continue;
               }
            }

            DataInputStream var2 = null;
            URLConnection var3 = null;

            try {
               var3 = var1.field1222.openConnection();
               var3.setConnectTimeout(5000);
               var3.setReadTimeout(5000);
               var3.setUseCaches(false);
               var3.setRequestProperty("Connection", "close");
               int var4 = var3.getContentLength();
               if (var4 >= 0) {
                  byte[] var5 = new byte[var4];
                  var2 = new DataInputStream(var3.getInputStream());
                  var2.readFully(var5);
                  var1.field1224 = var5;
               }

               var1.field1223 = true;
            } catch (IOException var13) {
               var1.field1223 = true;
            } finally {
               if (var2 != null) {
                  var2.close();
               }

               if (var3 != null && var3 instanceof HttpURLConnection) {
                  ((HttpURLConnection)var3).disconnect();
               }

            }
         } catch (Exception var16) {
            class333.method5330((String)null, var16);
         }
      }

   }

   public class88 method1983(URL var1) {
      class88 var3 = new class88(var1);
      synchronized(this) {
         this.field1220.add(var3);
         this.notify();
         return var3;
      }
   }

   public void method1984() {
      this.field1218 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1217.join();
      } catch (InterruptedException var5) {
      }

   }

   public static Interface getComponent(int var0) {
      int var2 = var0 >> 16;
      int var3 = var0 & '\uffff';
      if (null == Interface.components[var2] || Interface.components[var2][var3] == null) {
         boolean var4 = class251.method4294(var2);
         if (!var4) {
            return null;
         }
      }

      return Interface.components[var2][var3];
   }

   public static void method1990() {
      class247.field2938.method3883();
   }
}
