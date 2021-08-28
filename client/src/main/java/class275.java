import java.util.zip.CRC32;

public class class275 extends class277 {
   static CRC32 field3569 = new CRC32();
   boolean field3567 = false;
   class334 field3564;
   class334 field3566;
   int field3561;
   int field3563;
   int field3570;
   int field3572 = -1;
   volatile boolean field3571 = false;
   volatile boolean[] field3568;

   public class275(class334 var1, class334 var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.field3564 = var1;
      this.field3566 = var2;
      this.field3563 = var3;
      this.field3567 = var6;
      int var8 = this.field3563;
      if (class278.field3603 != null) {
         class278.field3603.offset = var8 * 8 + 5;
         int var9 = class278.field3603.readInt();
         int var10 = class278.field3603.readInt();
         this.method4380(var9, var10);
      } else {
         class134.method2317((class275)null, 255, 255, 0, (byte)0, true);
         class278.field3612[var8] = this;
      }

   }

   public boolean method4378() {
      return this.field3571;
   }

   public int method4406() {
      if (this.field3571) {
         return 100;
      } else if (null != super.field3588) {
         return 99;
      } else {
         int var3 = this.field3563;
         long var4 = (long)(var3 + 16711680);
         int var2;
         if (null != class278.field3595 && class278.field3595.field3966 == var4) {
            var2 = class94.field1248.offset * 99 / (class94.field1248.payload.length - class278.field3595.field3573) + 1;
         } else {
            var2 = 0;
         }

         int var6 = var2;
         if (var2 >= 100) {
            var6 = 99;
         }

         return var6;
      }
   }

   void method4411(int var1) {
      class137.method2321(this.field3563, var1);
   }

   void method4422(int var1) {
      if (null != this.field3564 && null != this.field3568 && this.field3568[var1]) {
         class334 var3 = this.field3564;
         byte[] var5 = null;
         synchronized(class274.field3558) {
            for(class273 var7 = (class273)class274.field3558.method4687(); var7 != null; var7 = (class273)class274.field3558.method4678()) {
               if ((long)var1 == var7.field3966 && var7.field3552 == var3 && 0 == var7.field3555) {
                  var5 = var7.field3551;
                  break;
               }
            }
         }

         if (var5 != null) {
            this.method4382(var3, var1, var5, true);
         } else {
            byte[] var6 = var3.method5347(var1);
            this.method4382(var3, var1, var6, true);
         }
      } else {
         class134.method2317(this, this.field3563, var1, super.field3584[var1], (byte)2, true);
      }

   }

   public void method4380(int var1, int var2) {
      this.field3570 = var1;
      this.field3561 = var2;
      if (null != this.field3566) {
         int var4 = this.field3563;
         class334 var5 = this.field3566;
         byte[] var7 = null;
         synchronized(class274.field3558) {
            for(class273 var9 = (class273)class274.field3558.method4687(); null != var9; var9 = (class273)class274.field3558.method4678()) {
               if ((long)var4 == var9.field3966 && var9.field3552 == var5 && 0 == var9.field3555) {
                  var7 = var9.field3551;
                  break;
               }
            }
         }

         if (null != var7) {
            this.method4382(var5, var4, var7, true);
         } else {
            byte[] var8 = var5.method5347(var4);
            this.method4382(var5, var4, var8, true);
         }
      } else {
         class134.method2317(this, 255, this.field3563, this.field3570, (byte)0, true);
      }

   }

   public void method4398(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field3571) {
            throw new RuntimeException();
         }

         if (null != this.field3566) {
            int var6 = this.field3563;
            class334 var7 = this.field3566;
            class273 var8 = new class273();
            var8.field3555 = 0;
            var8.field3966 = (long)var6;
            var8.field3551 = var2;
            var8.field3552 = var7;
            synchronized(class274.field3558) {
               class274.field3558.method4672(var8);
            }

            synchronized(class274.field3559) {
               if (class274.field3557 == 0) {
                  class274.field3560 = new Thread(new class274());
                  class274.field3560.setDaemon(true);
                  class274.field3560.start();
                  class274.field3560.setPriority(5);
               }

               class274.field3557 = 600;
            }
         }

         this.method4410(var2);
         this.method4393();
      } else {
         var2[var2.length - 2] = (byte)(super.field3585[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field3585[var1];
         if (this.field3564 != null) {
            class334 var18 = this.field3564;
            class273 var20 = new class273();
            var20.field3555 = 0;
            var20.field3966 = (long)var1;
            var20.field3551 = var2;
            var20.field3552 = var18;
            synchronized(class274.field3558) {
               class274.field3558.method4672(var20);
            }

            synchronized(class274.field3559) {
               if (class274.field3557 == 0) {
                  class274.field3560 = new Thread(new class274());
                  class274.field3560.setDaemon(true);
                  class274.field3560.start();
                  class274.field3560.setPriority(5);
               }

               class274.field3557 = 600;
            }

            this.field3568[var1] = true;
         }

         if (var4) {
            Object[] var19 = super.field3588;
            Object var21;
            if (var2 == null) {
               var21 = null;
            } else if (var2.length > 136) {
               class255 var9 = new class255();
               var9.method4303(var2);
               var21 = var9;
            } else {
               var21 = var2;
            }

            var19[var1] = var21;
         }
      }

   }

   void method4382(class334 var1, int var2, byte[] var3, boolean var4) {
      int var6;
      if (var1 == this.field3566) {
         if (this.field3571) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            class134.method2317(this, 255, this.field3563, this.field3570, (byte)0, true);
            return;
         }

         field3569.reset();
         field3569.update(var3, 0, var3.length);
         var6 = (int)field3569.getValue();
         if (this.field3570 != var6) {
            class134.method2317(this, 255, this.field3563, this.field3570, (byte)0, true);
            return;
         }

         Buffer var12 = new Buffer(class47.method815(var3));
         int var13 = var12.readUnsignedByte();
         if (5 != var13 && 6 != var13) {
            throw new RuntimeException(var13 + "," + this.field3563 + "," + var2);
         }

         int var9 = 0;
         if (var13 >= 6) {
            var9 = var12.readInt();
         }

         if (this.field3561 != var9) {
            class134.method2317(this, 255, this.field3563, this.field3570, (byte)0, true);
            return;
         }

         this.method4410(var3);
         this.method4393();
      } else {
         if (!var4 && var2 == this.field3572) {
            this.field3571 = true;
         }

         if (var3 == null || var3.length <= 2) {
            this.field3568[var2] = false;
            if (this.field3567 || var4) {
               class134.method2317(this, this.field3563, var2, super.field3584[var2], (byte)2, var4);
            }

            return;
         }

         field3569.reset();
         field3569.update(var3, 0, var3.length - 2);
         var6 = (int)field3569.getValue();
         int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if (super.field3584[var2] != var6 || super.field3585[var2] != var7) {
            this.field3568[var2] = false;
            if (this.field3567 || var4) {
               class134.method2317(this, this.field3563, var2, super.field3584[var2], (byte)2, var4);
            }

            return;
         }

         this.field3568[var2] = true;
         if (var4) {
            Object[] var8 = super.field3588;
            Object var10;
            if (null == var3) {
               var10 = null;
            } else if (var3.length > 136) {
               class255 var11 = new class255();
               var11.method4303(var3);
               var10 = var11;
            } else {
               var10 = var3;
            }

            var8[var2] = var10;
         }
      }

   }

   void method4393() {
      this.field3568 = new boolean[super.field3588.length];

      int var2;
      for(var2 = 0; var2 < this.field3568.length; ++var2) {
         this.field3568[var2] = false;
      }

      if (null == this.field3564) {
         this.field3571 = true;
      } else {
         this.field3572 = -1;

         for(var2 = 0; var2 < this.field3568.length; ++var2) {
            if (super.field3583[var2] > 0) {
               class334 var3 = this.field3564;
               class273 var5 = new class273();
               var5.field3555 = 1;
               var5.field3966 = (long)var2;
               var5.field3552 = var3;
               var5.field3550 = this;
               synchronized(class274.field3558) {
                  class274.field3558.method4672(var5);
               }

               synchronized(class274.field3559) {
                  if (0 == class274.field3557) {
                     class274.field3560 = new Thread(new class274());
                     class274.field3560.setDaemon(true);
                     class274.field3560.start();
                     class274.field3560.setPriority(5);
                  }

                  class274.field3557 = 600;
               }

               this.field3572 = var2;
            }
         }

         if (-1 == this.field3572) {
            this.field3571 = true;
         }

      }
   }

   int method4471(int var1) {
      if (null != super.field3588[var1]) {
         return 100;
      } else if (this.field3568[var1]) {
         return 100;
      } else {
         int var4 = this.field3563;
         long var5 = (long)(var1 + (var4 << 16));
         int var3;
         if (null != class278.field3595 && var5 == class278.field3595.field3966) {
            var3 = 1 + class94.field1248.offset * 99 / (class94.field1248.payload.length - class278.field3595.field3573);
         } else {
            var3 = 0;
         }

         return var3;
      }
   }

   public boolean method4384(int var1) {
      return this.field3568[var1];
   }

   public boolean method4379(int var1) {
      return this.method4481(var1) != null;
   }

   public int method4385() {
      int var2 = 0;
      int var3 = 0;

      int var4;
      for(var4 = 0; var4 < super.field3588.length; ++var4) {
         if (super.field3583[var4] > 0) {
            var2 += 100;
            var3 += this.method4471(var4);
         }
      }

      if (0 == var2) {
         return 100;
      } else {
         var4 = 100 * var3 / var2;
         return var4;
      }
   }
}
