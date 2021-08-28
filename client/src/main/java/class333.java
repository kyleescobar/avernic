import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;

public class class333 implements Runnable {
   static int[] field3897;
   boolean field3894;
   byte[] field3896;
   int field3887 = 0;
   int field3892 = 0;
   int field3895;
   IOException field3893;
   OutputStream field3891;
   Thread field3889;

   public static void method5330(String var0, Throwable var1) {
      try {
         String var3 = "";
         if (var1 != null) {
            var3 = class399.method6498(var1);
         }

         if (var0 != null) {
            if (null != var1) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         System.out.println("Error: " + var3);
         var3 = var3.replace(':', '.');
         var3 = var3.replace('@', '_');
         var3 = var3.replace('&', '_');
         var3 = var3.replace('#', '_');
         if (class409.field4318 == null) {
            return;
         }

         URL var4 = new URL(class409.field4318.getCodeBase(), "clienterror.ws?c=" + class409.field4317 + "&u=" + class409.field4316 + "&v1=" + class130.field1469 + "&v2=" + class130.field1463 + "&ct=" + class97.field1259 + "&e=" + var3);
         DataInputStream var5 = new DataInputStream(var4.openStream());
         var5.read();
         var5.close();
      } catch (Exception var6) {
      }

   }

   class333(OutputStream var1, int var2) {
      this.field3891 = var1;
      this.field3895 = var2 + 1;
      this.field3896 = new byte[this.field3895];
      this.field3889 = new Thread(this);
      this.field3889.setDaemon(true);
      this.field3889.start();
   }

   boolean method5336() {
      if (this.field3894) {
         try {
            this.field3891.close();
            if (null == this.field3893) {
               this.field3893 = new IOException("");
            }
         } catch (IOException var3) {
            if (this.field3893 == null) {
               this.field3893 = new IOException(var3);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.field3893 != null) {
                  return;
               }

               if (this.field3887 <= this.field3892) {
                  var1 = this.field3892 - this.field3887;
               } else {
                  var1 = this.field3892 + (this.field3895 - this.field3887);
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.field3891.flush();
               } catch (IOException var10) {
                  this.field3893 = var10;
                  return;
               }

               if (this.method5336()) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }
         }

         try {
            if (this.field3887 + var1 <= this.field3895) {
               this.field3891.write(this.field3896, this.field3887, var1);
            } else {
               int var13 = this.field3895 - this.field3887;
               this.field3891.write(this.field3896, this.field3887, var13);
               this.field3891.write(this.field3896, 0, var1 - var13);
            }
         } catch (IOException var9) {
            IOException var2 = var9;
            synchronized(this) {
               this.field3893 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field3887 = (this.field3887 + var1) % this.field3895;
         }
      } while(!this.method5336());

   }

   void method5344(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            if (this.field3893 != null) {
               throw new IOException(this.field3893.toString());
            } else {
               int var6;
               if (this.field3887 <= this.field3892) {
                  var6 = this.field3895 - this.field3892 + this.field3887 - 1;
               } else {
                  var6 = this.field3887 - this.field3892 - 1;
               }

               if (var6 < var3) {
                  throw new IOException("");
               } else {
                  if (var3 + this.field3892 <= this.field3895) {
                     System.arraycopy(var1, var2, this.field3896, this.field3892, var3);
                  } else {
                     int var7 = this.field3895 - this.field3892;
                     System.arraycopy(var1, var2, this.field3896, this.field3892, var7);
                     System.arraycopy(var1, var2 + var7, this.field3896, 0, var3 - var7);
                  }

                  this.field3892 = (this.field3892 + var3) % this.field3895;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method5331() {
      synchronized(this) {
         this.field3894 = true;
         this.notifyAll();
      }

      try {
         this.field3889.join();
      } catch (InterruptedException var4) {
      }

   }
}
