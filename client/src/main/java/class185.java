public class class185 implements class188 {
   int field2103;
   int field2104;
   int field2105;
   int field2106;
   int field2107;
   int field2108;

   class185() {
   }

   public void method3245(class168 var1) {
      if (var1.field1953 > this.field2107) {
         var1.field1953 = this.field2107;
      }

      if (var1.field1951 < this.field2107) {
         var1.field1951 = this.field2107;
      }

      if (var1.field1952 > this.field2108) {
         var1.field1952 = this.field2108;
      }

      if (var1.field1957 < this.field2108) {
         var1.field1957 = this.field2108;
      }

   }

   public boolean method3248(int var1, int var2, int var3) {
      if (var1 >= this.field2105 && var1 < this.field2103 + this.field2105) {
         return var2 >> 6 == this.field2104 && this.field2106 == var3 >> 6;
      } else {
         return false;
      }
   }

   public boolean method3246(int var1, int var2) {
      return var1 >> 6 == this.field2107 && var2 >> 6 == this.field2108;
   }

   public int[] method3247(int var1, int var2, int var3) {
      if (!this.method3248(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{var2 + (this.field2107 * 64 - this.field2104 * 64), this.field2108 * 64 - this.field2106 * 64 + var3};
         return var5;
      }
   }

   public class245 method3249(int var1, int var2) {
      if (!this.method3246(var1, var2)) {
         return null;
      } else {
         int var4 = var1 + (this.field2104 * 64 - this.field2107 * 64);
         int var5 = var2 + (this.field2106 * 64 - this.field2108 * 64);
         return new class245(this.field2105, var4, var5);
      }
   }

   public void method3256(Buffer var1) {
      this.field2105 = var1.readUnsignedByte();
      this.field2103 = var1.readUnsignedByte();
      this.field2104 = var1.readUnsignedShort();
      this.field2106 = var1.readUnsignedShort();
      this.field2107 = var1.readUnsignedShort();
      this.field2108 = var1.readUnsignedShort();
      this.method3203();
   }

   void method3203() {
   }

   static void method3202(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var3 = new short[16];
      int var4 = 0;

      for(int var5 = 0; var5 < class151.field1687; ++var5) {
         class157 var6 = KeyHandler.method93(var5);
         if ((!var1 || var6.field1834) && -1 == var6.field1789 && var6.field1836.toLowerCase().indexOf(var0) != -1) {
            if (var4 >= 250) {
               class212.field2520 = -1;
               class78.field1137 = null;
               return;
            }

            if (var4 >= var3.length) {
               short[] var7 = new short[var3.length * 2];

               for(int var8 = 0; var8 < var4; ++var8) {
                  var7[var8] = var3[var8];
               }

               var3 = var7;
            }

            var3[var4++] = (short)var5;
         }
      }

      class78.field1137 = var3;
      class82.field1165 = 0;
      class212.field2520 = var4;
      String[] var9 = new String[class212.field2520];

      for(int var10 = 0; var10 < class212.field2520; ++var10) {
         var9[var10] = KeyHandler.method93(var3[var10]).field1836;
      }

      short[] var11 = class78.field1137;
      class292.method4640(var9, var11, 0, var9.length - 1);
   }
}
