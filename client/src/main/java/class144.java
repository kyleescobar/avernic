public class class144 extends class349 {
   public static class223 field1580 = new class223(64);
   public static class223 field1581 = new class223(64);
   static class277 field1591;
   int field1585 = -1;
   int field1588 = -1;
   public int field1579;
   public int field1583 = 255;
   public int field1584 = -1;
   public int field1586 = 1;
   public int field1587 = 70;
   public int field1589 = 255;
   public int field1590 = 30;
   public int field1592 = 0;

   class144() {
   }

   void method2439(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (0 == var3) {
            return;
         }

         this.method2430(var1, var3);
      }
   }

   void method2430(Buffer var1, int var2) {
      if (1 == var2) {
         var1.readUnsignedShort();
      } else if (2 == var2) {
         this.field1583 = var1.readUnsignedByte();
      } else if (3 == var2) {
         this.field1589 = var1.readUnsignedByte();
      } else if (var2 == 4) {
         this.field1584 = 0;
      } else if (5 == var2) {
         this.field1587 = var1.readUnsignedShort();
      } else if (var2 == 6) {
         var1.readUnsignedByte();
      } else if (var2 == 7) {
         this.field1588 = var1.method5965();
      } else if (8 == var2) {
         this.field1585 = var1.method5965();
      } else if (11 == var2) {
         this.field1584 = var1.readUnsignedShort();
      } else if (14 == var2) {
         this.field1590 = var1.readUnsignedByte();
      } else if (var2 == 15) {
         this.field1592 = var1.readUnsignedByte();
      }

   }

   public class398 method2443() {
      if (this.field1588 < 0) {
         return null;
      } else {
         class398 var2 = (class398)field1581.method3880((long)this.field1588);
         if (null != var2) {
            return var2;
         } else {
            var2 = class208.method3828(field1591, this.field1588, 0);
            if (var2 != null) {
               field1581.method3882(var2, (long)this.field1588);
            }

            return var2;
         }
      }
   }

   public class398 method2432() {
      if (this.field1585 < 0) {
         return null;
      } else {
         class398 var2 = (class398)field1581.method3880((long)this.field1585);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class208.method3828(field1591, this.field1585, 0);
            if (var2 != null) {
               field1581.method3882(var2, (long)this.field1585);
            }

            return var2;
         }
      }
   }

   static int method2446(int var0, class59 var1, boolean var2) {
      int var4;
      if (3500 == var0) {
         var4 = class51.field747[--class51.field746];
         class51.field747[++class51.field746 - 1] = class115.method2179(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3501) {
         var4 = class51.field747[--class51.field746];
         class51.field747[++class51.field746 - 1] = class268.method4355(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3502) {
         var4 = class51.field747[--class51.field746];
         class51.field747[++class51.field746 - 1] = class121.method2212(var4) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   static final boolean method2447(Interface var0) {
      if (null == var0.field3099) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.field3099.length; ++var2) {
            int var3 = class131.method2294(var0, var2);
            int var4 = var0.field3082[var2];
            if (2 == var0.field3099[var2]) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (var0.field3099[var2] == 3) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var0.field3099[var2] == 4) {
               if (var3 == var4) {
                  return false;
               }
            } else if (var4 != var3) {
               return false;
            }
         }

         return true;
      }
   }
}
