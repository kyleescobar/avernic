import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class369 {
   RandomAccessFile field4131;
   long field4129;
   final long field4130;

   public class369(File var1, String var2, long var3) throws IOException {
      if (-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() > var3) {
         var1.delete();
      }

      this.field4131 = new RandomAccessFile(var1, var2);
      this.field4130 = var3;
      this.field4129 = 0L;
      int var5 = this.field4131.read();
      if (var5 != -1 && !var2.equals("r")) {
         this.field4131.seek(0L);
         this.field4131.write(var5);
      }

      this.field4131.seek(0L);
   }

   final void method5774(long var1) throws IOException {
      this.field4131.seek(var1);
      this.field4129 = var1;
   }

   public final void method5780(byte[] var1, int var2, int var3) throws IOException {
      if ((long)var3 + this.field4129 > this.field4130) {
         this.field4131.seek(this.field4130);
         this.field4131.write(1);
         throw new EOFException();
      } else {
         this.field4131.write(var1, var2, var3);
         this.field4129 += (long)var3;
      }
   }

   public final void method5776() throws IOException {
      this.method5788(false);
   }

   public final void method5788(boolean var1) throws IOException {
      if (this.field4131 != null) {
         if (var1) {
            try {
               this.field4131.getFD().sync();
            } catch (SyncFailedException var4) {
            }
         }

         this.field4131.close();
         this.field4131 = null;
      }

   }

   public final long method5773() throws IOException {
      return this.field4131.length();
   }

   public final int method5779(byte[] var1, int var2, int var3) throws IOException {
      int var5 = this.field4131.read(var1, var2, var3);
      if (var5 > 0) {
         this.field4129 += (long)var5;
      }

      return var5;
   }

   protected void finalize() throws Throwable {
      if (this.field4131 != null) {
         System.out.println("");
         this.method5776();
      }

   }
}
