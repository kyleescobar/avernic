import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class332 implements Runnable {
   byte[] field3881;
   int field3882;
   int field3884 = 0;
   int field3885 = 0;
   IOException field3886;
   InputStream field3880;
   Thread field3883;

   public static void method5327() {
      class42.field356 = new class298();
   }

   class332(InputStream var1, int var2) {
      this.field3880 = var1;
      this.field3882 = 1 + var2;
      this.field3881 = new byte[this.field3882];
      this.field3883 = new Thread(this);
      this.field3883.setDaemon(true);
      this.field3883.start();
   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.field3886 != null) {
                  return;
               }

               if (0 == this.field3884) {
                  var1 = this.field3882 - this.field3885 - 1;
               } else if (this.field3884 <= this.field3885) {
                  var1 = this.field3882 - this.field3885;
               } else {
                  var1 = this.field3884 - this.field3885 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
               }
            }
         }

         int var2;
         try {
            var2 = this.field3880.read(this.field3881, this.field3885, var1);
            if (var2 == -1) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.field3886 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field3885 = (var2 + this.field3885) % this.field3882;
         }
      }
   }

   boolean method5305(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < this.field3882) {
         synchronized(this) {
            int var4;
            if (this.field3884 <= this.field3885) {
               var4 = this.field3885 - this.field3884;
            } else {
               var4 = this.field3882 - this.field3884 + this.field3885;
            }

            if (var4 < var1) {
               if (this.field3886 != null) {
                  throw new IOException(this.field3886.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int method5325() throws IOException {
      synchronized(this) {
         int var3;
         if (this.field3884 <= this.field3885) {
            var3 = this.field3885 - this.field3884;
         } else {
            var3 = this.field3882 - this.field3884 + this.field3885;
         }

         if (var3 <= 0 && this.field3886 != null) {
            throw new IOException(this.field3886.toString());
         } else {
            this.notifyAll();
            return var3;
         }
      }
   }

   int method5303() throws IOException {
      synchronized(this) {
         if (this.field3885 == this.field3884) {
            if (this.field3886 != null) {
               throw new IOException(this.field3886.toString());
            } else {
               return -1;
            }
         } else {
            int var3 = this.field3881[this.field3884] & 255;
            this.field3884 = (1 + this.field3884) % this.field3882;
            this.notifyAll();
            return var3;
         }
      }
   }

   int method5307(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var6;
            if (this.field3884 <= this.field3885) {
               var6 = this.field3885 - this.field3884;
            } else {
               var6 = this.field3882 - this.field3884 + this.field3885;
            }

            if (var3 > var6) {
               var3 = var6;
            }

            if (0 == var3 && this.field3886 != null) {
               throw new IOException(this.field3886.toString());
            } else {
               if (this.field3884 + var3 <= this.field3882) {
                  System.arraycopy(this.field3881, this.field3884, var1, var2, var3);
               } else {
                  int var7 = this.field3882 - this.field3884;
                  System.arraycopy(this.field3881, this.field3884, var1, var2, var7);
                  System.arraycopy(this.field3881, 0, var1, var7 + var2, var3 - var7);
               }

               this.field3884 = (var3 + this.field3884) % this.field3882;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method5310() {
      synchronized(this) {
         if (null == this.field3886) {
            this.field3886 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field3883.join();
      } catch (InterruptedException var4) {
      }

   }
}
