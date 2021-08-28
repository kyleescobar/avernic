public class class135 extends class137 {
   int field1500 = 256;
   int field1501 = 1;
   int field1504;
   int field1505 = 0;
   long field1503 = class87.method1989();
   long[] field1502 = new long[10];

   public class135() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1502[var1] = this.field1503;
      }

   }

   public void method2322() {
      for(int var2 = 0; var2 < 10; ++var2) {
         this.field1502[var2] = 0L;
      }

   }

   public int method2329(int var1, int var2) {
      int var4 = this.field1500;
      int var5 = this.field1501;
      this.field1500 = 300;
      this.field1501 = 1;
      this.field1503 = class87.method1989();
      if (this.field1502[this.field1504] == 0L) {
         this.field1500 = var4;
         this.field1501 = var5;
      } else if (this.field1503 > this.field1502[this.field1504]) {
         this.field1500 = (int)((long)(var1 * 2560) / (this.field1503 - this.field1502[this.field1504]));
      }

      if (this.field1500 < 25) {
         this.field1500 = 25;
      }

      if (this.field1500 > 256) {
         this.field1500 = 256;
         this.field1501 = (int)((long)var1 - (this.field1503 - this.field1502[this.field1504]) / 10L);
      }

      if (this.field1501 > var1) {
         this.field1501 = var1;
      }

      this.field1502[this.field1504] = this.field1503;
      this.field1504 = (1 + this.field1504) % 10;
      int var6;
      if (this.field1501 > 1) {
         for(var6 = 0; var6 < 10; ++var6) {
            if (0L != this.field1502[var6]) {
               this.field1502[var6] += (long)this.field1501;
            }
         }
      }

      if (this.field1501 < var2) {
         this.field1501 = var2;
      }

      class210.method3831((long)this.field1501);

      for(var6 = 0; this.field1505 < 256; this.field1505 += this.field1500) {
         ++var6;
      }

      this.field1505 &= 255;
      return var6;
   }

   public static void method2319() {
      class154.field1704.method3883();
   }

   static void savePreferences() {
      class369 var1 = null;

      try {
         var1 = class78.method1836("", class69.field976.field3208, true);
         Buffer var2 = class38.clientPreferences.method1820();
         var1.method5780(var2.payload, 0, var2.offset);
      } catch (Exception var4) {
      }

      try {
         if (var1 != null) {
            var1.method5788(true);
         }
      } catch (Exception var3) {
      }

   }
}
