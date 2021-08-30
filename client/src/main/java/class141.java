public class class141 extends class349 {
   public static int field1532;
   static class141[] field1544;
   static class223 field1541 = new class223(256);
   static class277 field1549;
   byte[] field1552;
   int field1536 = -1;
   int field1538 = Integer.MIN_VALUE;
   int field1545 = Integer.MAX_VALUE;
   int field1546 = Integer.MAX_VALUE;
   int field1547 = Integer.MIN_VALUE;
   int[] field1531;
   int[] field1551;
   public boolean field1530 = true;
   public boolean field1542 = false;
   public class147 field1540;
   public VerticalAlignment field1550;
   public int field1535 = -1;
   public int field1539 = 0;
   public int field1548;
   public int field1553;
   public String field1537;
   public String field1543;
   public String[] field1533 = new String[5];
   public final int field1534;

   class141(int var1) {
      this.field1540 = class147.field1608;
      this.field1550 = VerticalAlignment.field1654;
      this.field1553 = -1;
      this.field1534 = var1;
   }

   void method2377(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method2364(var1, var3);
      }
   }

   void method2364(Buffer var1, int var2) {
      if (1 == var2) {
         this.field1535 = var1.method5965();
      } else if (2 == var2) {
         this.field1536 = var1.method5965();
      } else if (var2 == 3) {
         this.field1537 = var1.readStringNullTerminated();
      } else if (4 == var2) {
         this.field1548 = var1.method5952();
      } else if (5 == var2) {
         var1.method5952();
      } else if (6 == var2) {
         this.field1539 = var1.readUnsignedByte();
      } else {
         int var4;
         if (var2 == 7) {
            var4 = var1.readUnsignedByte();
            if (0 == (var4 & 1)) {
               this.field1530 = false;
            }

            if (2 == (var4 & 2)) {
               this.field1542 = true;
            }
         } else if (8 == var2) {
            var1.readUnsignedByte();
         } else if (var2 >= 10 && var2 <= 14) {
            this.field1533[var2 - 10] = var1.readStringNullTerminated();
         } else if (var2 == 15) {
            var4 = var1.readUnsignedByte();
            this.field1531 = new int[2 * var4];

            int var5;
            for(var5 = 0; var5 < var4 * 2; ++var5) {
               this.field1531[var5] = var1.method5951();
            }

            var1.readInt();
            var5 = var1.readUnsignedByte();
            this.field1551 = new int[var5];

            int var6;
            for(var6 = 0; var6 < this.field1551.length; ++var6) {
               this.field1551[var6] = var1.readInt();
            }

            this.field1552 = new byte[var4];

            for(var6 = 0; var6 < var4; ++var6) {
               this.field1552[var6] = var1.readByte();
            }
         } else if (16 != var2) {
            if (var2 == 17) {
               this.field1543 = var1.readStringNullTerminated();
            } else if (18 == var2) {
               var1.method5965();
            } else if (19 == var2) {
               this.field1553 = var1.readUnsignedShort();
            } else if (21 == var2) {
               var1.readInt();
            } else if (var2 == 22) {
               var1.readInt();
            } else if (var2 == 23) {
               var1.readUnsignedByte();
               var1.readUnsignedByte();
               var1.readUnsignedByte();
            } else if (var2 == 24) {
               var1.method5951();
               var1.method5951();
            } else if (var2 == 25) {
               var1.method5965();
            } else if (var2 == 28) {
               var1.readUnsignedByte();
            } else if (29 == var2) {
               class147[] var7 = new class147[]{class147.field1608, class147.field1609, class147.field1613};
               this.field1540 = (class147)class251.enumeratedValueOf(var7, var1.readUnsignedByte());
            } else if (var2 == 30) {
               this.field1550 = (VerticalAlignment)class251.enumeratedValueOf(class5.method17(), var1.readUnsignedByte());
            }
         }
      }

   }

   void method2383() {
      if (this.field1531 != null) {
         for(int var2 = 0; var2 < this.field1531.length; var2 += 2) {
            if (this.field1531[var2] < this.field1545) {
               this.field1545 = this.field1531[var2];
            } else if (this.field1531[var2] > this.field1547) {
               this.field1547 = this.field1531[var2];
            }

            if (this.field1531[var2 + 1] < this.field1546) {
               this.field1546 = this.field1531[1 + var2];
            } else if (this.field1531[1 + var2] > this.field1538) {
               this.field1538 = this.field1531[var2 + 1];
            }
         }
      }

   }

   public class398 method2368(boolean var1) {
      int var3 = var1 ? this.field1536 * -308881427 * -559473179 : -1556885323 * this.field1535 * -1886216803;
      return this.method2372(var3);
   }

   class398 method2372(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         class398 var3 = (class398)field1541.method3880((long)var1);
         if (var3 != null) {
            return var3;
         } else {
            var3 = class208.method3828(field1549, var1, 0);
            if (null != var3) {
               field1541.method3882(var3, (long)var1);
            }

            return var3;
         }
      }
   }

   public int method2381() {
      return this.field1534;
   }
}
