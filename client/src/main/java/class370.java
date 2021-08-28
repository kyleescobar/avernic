import java.io.EOFException;
import java.io.IOException;

public class class370 {
   byte[] field4135;
   byte[] field4138;
   class369 field4134;
   int field4140 = 0;
   int field4141;
   long field4133 = -1L;
   long field4137;
   long field4139 = -1L;
   long field4142;
   long field4143;
   long field4144;

   public class370(class369 var1, int var2, int var3) throws IOException {
      this.field4134 = var1;
      this.field4143 = this.field4144 = var1.method5773();
      this.field4135 = new byte[var2];
      this.field4138 = new byte[var3];
      this.field4142 = 0L;
   }

   public void method5815() throws IOException {
      this.method5800();
      this.field4134.method5776();
   }

   public void method5795(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field4142 = var1;
      }
   }

   public long method5813() {
      return this.field4143;
   }

   public void method5797(byte[] var1) throws IOException {
      this.method5811(var1, 0, var1.length);
   }

   public void method5811(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (this.field4139 != -1L && this.field4142 >= this.field4139 && (long)var3 + this.field4142 <= (long)this.field4140 + this.field4139) {
            System.arraycopy(this.field4138, (int)(this.field4142 - this.field4139), var1, var2, var3);
            this.field4142 += (long)var3;
            return;
         }

         long var5 = this.field4142;
         int var8 = var3;
         int var9;
         if (this.field4142 >= this.field4133 && this.field4142 < (long)this.field4141 + this.field4133) {
            var9 = (int)((long)this.field4141 - (this.field4142 - this.field4133));
            if (var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(this.field4135, (int)(this.field4142 - this.field4133), var1, var2, var9);
            this.field4142 += (long)var9;
            var2 += var9;
            var3 -= var9;
         }

         if (var3 > this.field4135.length) {
            this.field4134.method5774(this.field4142);

            for(this.field4137 = this.field4142; var3 > 0; var3 -= var9) {
               var9 = this.field4134.method5779(var1, var2, var3);
               if (var9 == -1) {
                  break;
               }

               this.field4137 += (long)var9;
               this.field4142 += (long)var9;
               var2 += var9;
            }
         } else if (var3 > 0) {
            this.method5799();
            var9 = var3;
            if (var3 > this.field4141) {
               var9 = this.field4141;
            }

            System.arraycopy(this.field4135, 0, var1, var2, var9);
            var2 += var9;
            var3 -= var9;
            this.field4142 += (long)var9;
         }

         if (this.field4139 != -1L) {
            if (this.field4139 > this.field4142 && var3 > 0) {
               var9 = (int)(this.field4139 - this.field4142) + var2;
               if (var9 > var2 + var3) {
                  var9 = var3 + var2;
               }

               while(var2 < var9) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field4142;
               }
            }

            long var15 = -1L;
            long var11 = -1L;
            if (this.field4139 >= var5 && this.field4139 < var5 + (long)var8) {
               var15 = this.field4139;
            } else if (var5 >= this.field4139 && var5 < (long)this.field4140 + this.field4139) {
               var15 = var5;
            }

            if ((long)this.field4140 + this.field4139 > var5 && (long)this.field4140 + this.field4139 <= var5 + (long)var8) {
               var11 = (long)this.field4140 + this.field4139;
            } else if (var5 + (long)var8 > this.field4139 && var5 + (long)var8 <= (long)this.field4140 + this.field4139) {
               var11 = var5 + (long)var8;
            }

            if (var15 > -1L && var11 > var15) {
               int var13 = (int)(var11 - var15);
               System.arraycopy(this.field4138, (int)(var15 - this.field4139), var1, (int)(var15 - var5) + var2, var13);
               if (var11 > this.field4142) {
                  var3 = (int)((long)var3 - (var11 - this.field4142));
                  this.field4142 = var11;
               }
            }
         }
      } catch (IOException var14) {
         this.field4137 = -1L;
         throw var14;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   void method5799() throws IOException {
      this.field4141 = 0;
      if (this.field4142 != this.field4137) {
         this.field4134.method5774(this.field4142);
         this.field4137 = this.field4142;
      }

      int var3;
      for(this.field4133 = this.field4142; this.field4141 < this.field4135.length; this.field4141 += var3) {
         int var2 = this.field4135.length - this.field4141;
         if (var2 > 200000000) {
            var2 = 200000000;
         }

         var3 = this.field4134.method5779(this.field4135, this.field4141, var2);
         if (var3 == -1) {
            break;
         }

         this.field4137 += (long)var3;
      }

   }

   public void method5801(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.field4142 > this.field4143) {
            this.field4143 = this.field4142 + (long)var3;
         }

         if (-1L != this.field4139 && (this.field4142 < this.field4139 || this.field4142 > (long)this.field4140 + this.field4139)) {
            this.method5800();
         }

         if (-1L != this.field4139 && this.field4142 + (long)var3 > this.field4139 + (long)this.field4138.length) {
            int var5 = (int)((long)this.field4138.length - (this.field4142 - this.field4139));
            System.arraycopy(var1, var2, this.field4138, (int)(this.field4142 - this.field4139), var5);
            this.field4142 += (long)var5;
            var2 += var5;
            var3 -= var5;
            this.field4140 = this.field4138.length;
            this.method5800();
         }

         if (var3 <= this.field4138.length) {
            if (var3 > 0) {
               if (this.field4139 == -1L) {
                  this.field4139 = this.field4142;
               }

               System.arraycopy(var1, var2, this.field4138, (int)(this.field4142 - this.field4139), var3);
               this.field4142 += (long)var3;
               if (this.field4142 - this.field4139 > (long)this.field4140) {
                  this.field4140 = (int)(this.field4142 - this.field4139);
               }

            }
         } else {
            if (this.field4137 != this.field4142) {
               this.field4134.method5774(this.field4142);
               this.field4137 = this.field4142;
            }

            this.field4134.method5780(var1, var2, var3);
            this.field4137 += (long)var3;
            if (this.field4137 > this.field4144) {
               this.field4144 = this.field4137;
            }

            long var11 = -1L;
            long var7 = -1L;
            if (this.field4142 >= this.field4133 && this.field4142 < this.field4133 + (long)this.field4141) {
               var11 = this.field4142;
            } else if (this.field4133 >= this.field4142 && this.field4133 < this.field4142 + (long)var3) {
               var11 = this.field4133;
            }

            if (this.field4142 + (long)var3 > this.field4133 && this.field4142 + (long)var3 <= (long)this.field4141 + this.field4133) {
               var7 = this.field4142 + (long)var3;
            } else if ((long)this.field4141 + this.field4133 > this.field4142 && this.field4133 + (long)this.field4141 <= this.field4142 + (long)var3) {
               var7 = this.field4133 + (long)this.field4141;
            }

            if (var11 > -1L && var7 > var11) {
               int var9 = (int)(var7 - var11);
               System.arraycopy(var1, (int)((long)var2 + var11 - this.field4142), this.field4135, (int)(var11 - this.field4133), var9);
            }

            this.field4142 += (long)var3;
         }
      } catch (IOException var10) {
         this.field4137 = -1L;
         throw var10;
      }
   }

   void method5800() throws IOException {
      if (-1L != this.field4139) {
         if (this.field4139 != this.field4137) {
            this.field4134.method5774(this.field4139);
            this.field4137 = this.field4139;
         }

         this.field4134.method5780(this.field4138, 0, this.field4140);
         this.field4137 += (long)this.field4140;
         if (this.field4137 > this.field4144) {
            this.field4144 = this.field4137;
         }

         long var2 = -1L;
         long var4 = -1L;
         if (this.field4139 >= this.field4133 && this.field4139 < (long)this.field4141 + this.field4133) {
            var2 = this.field4139;
         } else if (this.field4133 >= this.field4139 && this.field4133 < this.field4139 + (long)this.field4140) {
            var2 = this.field4133;
         }

         if (this.field4139 + (long)this.field4140 > this.field4133 && this.field4139 + (long)this.field4140 <= this.field4133 + (long)this.field4141) {
            var4 = this.field4139 + (long)this.field4140;
         } else if (this.field4133 + (long)this.field4141 > this.field4139 && this.field4133 + (long)this.field4141 <= this.field4139 + (long)this.field4140) {
            var4 = this.field4133 + (long)this.field4141;
         }

         if (var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.field4138, (int)(var2 - this.field4139), this.field4135, (int)(var2 - this.field4133), var6);
         }

         this.field4139 = -1L;
         this.field4140 = 0;
      }

   }
}
