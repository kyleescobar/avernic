public class class143 extends class349 {
   public static class277 field1565;
   public static class28 field1576;
   public static int field1564;
   static class223 field1568 = new class223(64);
   static int field1578;
   int[] field1563 = new int[]{-1, -1, -1, -1, -1};
   int[] field1567;
   short[] field1569;
   short[] field1570;
   short[] field1571;
   short[] field1572;
   public boolean field1573 = false;
   public int field1566 = -1;

   class143() {
   }

   void method2405(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (0 == var3) {
            return;
         }

         this.method2407(var1, var3);
      }
   }

   void method2407(Buffer var1, int var2) {
      if (var2 == 1) {
         this.field1566 = var1.readUnsignedByte();
      } else {
         int var4;
         int var5;
         if (2 == var2) {
            var4 = var1.readUnsignedByte();
            this.field1567 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1567[var5] = var1.readUnsignedShort();
            }
         } else if (var2 == 3) {
            this.field1573 = true;
         } else if (40 == var2) {
            var4 = var1.readUnsignedByte();
            this.field1572 = new short[var4];
            this.field1569 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1572[var5] = (short)var1.readUnsignedShort();
               this.field1569[var5] = (short)var1.readUnsignedShort();
            }
         } else if (41 == var2) {
            var4 = var1.readUnsignedByte();
            this.field1570 = new short[var4];
            this.field1571 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1570[var5] = (short)var1.readUnsignedShort();
               this.field1571[var5] = (short)var1.readUnsignedShort();
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.field1563[var2 - 60] = var1.readUnsignedShort();
         }
      }

   }

   public boolean method2404() {
      if (null == this.field1567) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field1567.length; ++var3) {
            if (!class76.field1120.method4500(this.field1567[var3], 0)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public class193 method2426() {
      if (this.field1567 == null) {
         return null;
      } else {
         class193[] var2 = new class193[this.field1567.length];

         for(int var3 = 0; var3 < this.field1567.length; ++var3) {
            var2[var3] = class193.method3316(class76.field1120, this.field1567[var3], 0);
         }

         class193 var5;
         if (var2.length == 1) {
            var5 = var2[0];
         } else {
            var5 = new class193(var2, var2.length);
         }

         int var4;
         if (this.field1572 != null) {
            for(var4 = 0; var4 < this.field1572.length; ++var4) {
               var5.method3362(this.field1572[var4], this.field1569[var4]);
            }
         }

         if (null != this.field1570) {
            for(var4 = 0; var4 < this.field1570.length; ++var4) {
               var5.method3329(this.field1570[var4], this.field1571[var4]);
            }
         }

         return var5;
      }
   }

   public boolean method2403() {
      boolean var2 = true;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.field1563[var3] != -1 && !class76.field1120.method4500(this.field1563[var3], 0)) {
            var2 = false;
         }
      }

      return var2;
   }

   public class193 method2409() {
      class193[] var2 = new class193[5];
      int var3 = 0;

      for(int var4 = 0; var4 < 5; ++var4) {
         if (this.field1563[var4] != -1) {
            var2[var3++] = class193.method3316(class76.field1120, this.field1563[var4], 0);
         }
      }

      class193 var6 = new class193(var2, var3);
      int var5;
      if (null != this.field1572) {
         for(var5 = 0; var5 < this.field1572.length; ++var5) {
            var6.method3362(this.field1572[var5], this.field1569[var5]);
         }
      }

      if (this.field1570 != null) {
         for(var5 = 0; var5 < this.field1570.length; ++var5) {
            var6.method3329(this.field1570[var5], this.field1571[var5]);
         }
      }

      return var6;
   }

   public static boolean method2427() {
      return client.privilegeLevel >= 2;
   }
}
