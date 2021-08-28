public abstract class class277 {
   static class403 field3590 = new class403();
   static int field3592 = 0;
   boolean field3587;
   boolean field3593;
   class404 field3581;
   class404[] field3586;
   int field3594;
   int[] field3579;
   int[] field3580;
   int[] field3583;
   int[] field3584;
   int[] field3585;
   int[][] field3578;
   int[][] field3582;
   Object[] field3588;
   Object[][] field3589;
   public int crc;

   class277(boolean var1, boolean var2) {
      this.field3587 = var1;
      this.field3593 = var2;
   }

   void method4410(byte[] var1) {
      this.crc = PacketBufferNode.method3911(var1, var1.length);
      Buffer var3 = new Buffer(class47.method815(var1));
      int var4 = var3.readUnsignedByte();
      if (var4 >= 5 && var4 <= 7) {
         if (var4 >= 6) {
            var3.readInt();
         }

         int var5 = var3.readUnsignedByte();
         if (var4 >= 7) {
            this.field3594 = var3.method6129();
         } else {
            this.field3594 = var3.readUnsignedShort();
         }

         int var6 = 0;
         int var7 = -1;
         this.field3579 = new int[this.field3594];
         int var8;
         if (var4 >= 7) {
            for(var8 = 0; var8 < this.field3594; ++var8) {
               this.field3579[var8] = var6 += var3.method6129();
               if (this.field3579[var8] > var7) {
                  var7 = this.field3579[var8];
               }
            }
         } else {
            for(var8 = 0; var8 < this.field3594; ++var8) {
               this.field3579[var8] = var6 += var3.readUnsignedShort();
               if (this.field3579[var8] > var7) {
                  var7 = this.field3579[var8];
               }
            }
         }

         this.field3584 = new int[var7 + 1];
         this.field3585 = new int[1 + var7];
         this.field3583 = new int[var7 + 1];
         this.field3582 = new int[1 + var7][];
         this.field3588 = new Object[1 + var7];
         this.field3589 = new Object[1 + var7][];
         if (0 != var5) {
            this.field3580 = new int[1 + var7];

            for(var8 = 0; var8 < this.field3594; ++var8) {
               this.field3580[this.field3579[var8]] = var3.readInt();
            }

            this.field3581 = new class404(this.field3580);
         }

         for(var8 = 0; var8 < this.field3594; ++var8) {
            this.field3584[this.field3579[var8]] = var3.readInt();
         }

         for(var8 = 0; var8 < this.field3594; ++var8) {
            this.field3585[this.field3579[var8]] = var3.readInt();
         }

         for(var8 = 0; var8 < this.field3594; ++var8) {
            this.field3583[this.field3579[var8]] = var3.readUnsignedShort();
         }

         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         if (var4 >= 7) {
            for(var8 = 0; var8 < this.field3594; ++var8) {
               var9 = this.field3579[var8];
               var10 = this.field3583[var9];
               var6 = 0;
               var11 = -1;
               this.field3582[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field3582[var9][var12] = var6 += var3.method6129();
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field3589[var9] = new Object[1 + var11];
            }
         } else {
            for(var8 = 0; var8 < this.field3594; ++var8) {
               var9 = this.field3579[var8];
               var10 = this.field3583[var9];
               var6 = 0;
               var11 = -1;
               this.field3582[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field3582[var9][var12] = var6 += var3.readUnsignedShort();
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field3589[var9] = new Object[var11 + 1];
            }
         }

         if (0 != var5) {
            this.field3578 = new int[var7 + 1][];
            this.field3586 = new class404[var7 + 1];

            for(var8 = 0; var8 < this.field3594; ++var8) {
               var9 = this.field3579[var8];
               var10 = this.field3583[var9];
               this.field3578[var9] = new int[this.field3589[var9].length];

               for(var11 = 0; var11 < var10; ++var11) {
                  this.field3578[var9][this.field3582[var9][var11]] = var3.readInt();
               }

               this.field3586[var9] = new class404(this.field3578[var9]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method4411(int var1) {
   }

   public byte[] method4412(int var1, int var2) {
      return this.method4413(var1, var2, (int[])null);
   }

   public byte[] method4413(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.field3589.length && this.field3589[var1] != null && var2 >= 0 && var2 < this.field3589[var1].length) {
         if (null == this.field3589[var1][var2]) {
            boolean var5 = this.method4472(var1, var3);
            if (!var5) {
               this.method4422(var1);
               var5 = this.method4472(var1, var3);
               if (!var5) {
                  return null;
               }
            }
         }

         byte[] var6 = class241.method4142(this.field3589[var1][var2], false);
         if (this.field3593) {
            this.field3589[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   public boolean method4500(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field3589.length && null != this.field3589[var1] && var2 >= 0 && var2 < this.field3589[var1].length) {
         if (null != this.field3589[var1][var2]) {
            return true;
         } else if (this.field3588[var1] != null) {
            return true;
         } else {
            this.method4422(var1);
            return this.field3588[var1] != null;
         }
      } else {
         return false;
      }
   }

   public boolean method4439(int var1) {
      if (1 == this.field3589.length) {
         return this.method4500(0, var1);
      } else if (1 == this.field3589[var1].length) {
         return this.method4500(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public boolean method4416(int var1) {
      if (this.field3588[var1] != null) {
         return true;
      } else {
         this.method4422(var1);
         return null != this.field3588[var1];
      }
   }

   public boolean method4417() {
      boolean var2 = true;

      for(int var3 = 0; var3 < this.field3579.length; ++var3) {
         int var4 = this.field3579[var3];
         if (null == this.field3588[var4]) {
            this.method4422(var4);
            if (null == this.field3588[var4]) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   int method4471(int var1) {
      return null != this.field3588[var1] ? 100 : 0;
   }

   public byte[] method4419(int var1) {
      if (this.field3589.length == 1) {
         return this.method4412(0, var1);
      } else if (this.field3589[var1].length == 1) {
         return this.method4412(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] method4420(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field3589.length && this.field3589[var1] != null && var2 >= 0 && var2 < this.field3589[var1].length) {
         if (this.field3589[var1][var2] == null) {
            boolean var4 = this.method4472(var1, (int[])null);
            if (!var4) {
               this.method4422(var1);
               var4 = this.method4472(var1, (int[])null);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class241.method4142(this.field3589[var1][var2], false);
         return var5;
      } else {
         return null;
      }
   }

   public byte[] method4479(int var1) {
      if (this.field3589.length == 1) {
         return this.method4420(0, var1);
      } else if (this.field3589[var1].length == 1) {
         return this.method4420(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   void method4422(int var1) {
   }

   public int[] method4481(int var1) {
      return var1 >= 0 && var1 < this.field3582.length ? this.field3582[var1] : null;
   }

   public int method4438(int var1) {
      return this.field3589[var1].length;
   }

   public int method4424() {
      return this.field3589.length;
   }

   public void method4425() {
      for(int var2 = 0; var2 < this.field3588.length; ++var2) {
         this.field3588[var2] = null;
      }

   }

   public void method4470(int var1) {
      for(int var3 = 0; var3 < this.field3589[var1].length; ++var3) {
         this.field3589[var1][var3] = null;
      }

   }

   public void method4427() {
      for(int var2 = 0; var2 < this.field3589.length; ++var2) {
         if (null != this.field3589[var2]) {
            for(int var3 = 0; var3 < this.field3589[var2].length; ++var3) {
               this.field3589[var2][var3] = null;
            }
         }
      }

   }

   boolean method4472(int var1, int[] var2) {
      if (null == this.field3588[var1]) {
         return false;
      } else {
         int var4 = this.field3583[var1];
         int[] var5 = this.field3582[var1];
         Object[] var6 = this.field3589[var1];
         boolean var7 = true;

         for(int var8 = 0; var8 < var4; ++var8) {
            if (null == var6[var5[var8]]) {
               var7 = false;
               break;
            }
         }

         if (var7) {
            return true;
         } else {
            byte[] var22;
            if (null == var2 || 0 == var2[0] && var2[1] == 0 && 0 == var2[2] && 0 == var2[3]) {
               var22 = class241.method4142(this.field3588[var1], false);
            } else {
               var22 = class241.method4142(this.field3588[var1], true);
               Buffer var9 = new Buffer(var22);
               var9.method6042(var2, 5, var9.payload.length);
            }

            byte[] var23 = class47.method815(var22);
            if (this.field3587) {
               this.field3588[var1] = null;
            }

            int var11;
            if (var4 > 1) {
               int var10 = var23.length;
               --var10;
               var11 = var23[var10] & 255;
               var10 -= 4 * var11 * var4;
               Buffer var12 = new Buffer(var23);
               int[] var13 = new int[var4];
               var12.offset = var10;

               int var15;
               int var16;
               for(int var14 = 0; var14 < var11; ++var14) {
                  var15 = 0;

                  for(var16 = 0; var16 < var4; ++var16) {
                     var15 += var12.readInt();
                     var13[var16] += var15;
                  }
               }

               byte[][] var26 = new byte[var4][];

               for(var15 = 0; var15 < var4; ++var15) {
                  var26[var15] = new byte[var13[var15]];
                  var13[var15] = 0;
               }

               var12.offset = var10;
               var15 = 0;

               int var18;
               for(var16 = 0; var16 < var11; ++var16) {
                  int var17 = 0;

                  for(var18 = 0; var18 < var4; ++var18) {
                     var17 += var12.readInt();
                     System.arraycopy(var23, var15, var26[var18], var13[var18], var17);
                     var13[var18] += var17;
                     var15 += var17;
                  }
               }

               for(var16 = 0; var16 < var4; ++var16) {
                  if (!this.field3593) {
                     var18 = var5[var16];
                     byte[] var20 = var26[var16];
                     Object var19;
                     if (var20 == null) {
                        var19 = null;
                     } else if (var20.length > 136) {
                        class255 var21 = new class255();
                        var21.method4303(var20);
                        var19 = var21;
                     } else {
                        var19 = var20;
                     }

                     var6[var18] = var19;
                  } else {
                     var6[var5[var16]] = var26[var16];
                  }
               }
            } else if (!this.field3593) {
               var11 = var5[0];
               Object var24;
               if (var23 == null) {
                  var24 = null;
               } else if (var23.length > 136) {
                  class255 var25 = new class255();
                  var25.method4303(var23);
                  var24 = var25;
               } else {
                  var24 = var23;
               }

               var6[var11] = var24;
            } else {
               var6[var5[0]] = var23;
            }

            return true;
         }
      }
   }

   public int readGroup(String var1) {
      var1 = var1.toLowerCase();
      return this.field3581.method6516(class19.method303(var1));
   }

   public int method4430(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field3586[var1].method6516(class19.method303(var2));
   }

   public boolean method4431(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3581.method6516(class19.method303(var1));
      if (var4 < 0) {
         return false;
      } else {
         int var5 = this.field3586[var4].method6516(class19.method303(var2));
         return var5 >= 0;
      }
   }

   public byte[] method4432(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3581.method6516(class19.method303(var1));
      int var5 = this.field3586[var4].method6516(class19.method303(var2));
      return this.method4412(var4, var5);
   }

   public boolean method4468(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3581.method6516(class19.method303(var1));
      int var5 = this.field3586[var4].method6516(class19.method303(var2));
      return this.method4500(var4, var5);
   }

   public boolean method4434(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field3581.method6516(class19.method303(var1));
      return this.method4416(var3);
   }

   public void method4435(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field3581.method6516(class19.method303(var1));
      if (var3 >= 0) {
         this.method4411(var3);
      }
   }

   public int method4436(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field3581.method6516(class19.method303(var1));
      return this.method4471(var3);
   }
}
