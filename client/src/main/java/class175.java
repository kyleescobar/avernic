public class class175 implements class188 {
   int field2022;
   int field2023;
   int field2024;
   int field2025;
   int field2026;
   int field2027;
   int field2028;
   int field2029;
   int field2030;
   int field2031;
   int field2032;
   int field2033;
   int field2034;
   int field2035;

   public static class377 method3143(int var0) {
      int var2 = class375.field4155[var0];
      if (1 == var2) {
         return class377.field4164;
      } else if (var2 == 2) {
         return class377.field4165;
      } else {
         return 3 == var2 ? class377.field4160 : null;
      }
   }

   class175() {
   }

   public void method3245(class168 var1) {
      if (var1.field1953 > this.field2026) {
         var1.field1953 = this.field2026;
      }

      if (var1.field1951 < this.field2026) {
         var1.field1951 = this.field2026;
      }

      if (var1.field1952 > this.field2033) {
         var1.field1952 = this.field2033;
      }

      if (var1.field1957 < this.field2033) {
         var1.field1957 = this.field2033;
      }

   }

   public static int method3139(int var0) {
      class152 var3 = (class152)class152.field1689.method3880((long)var0);
      class152 var2;
      if (null != var3) {
         var2 = var3;
      } else {
         byte[] var4 = class152.field1692.method4412(14, var0);
         var3 = new class152();
         if (null != var4) {
            var3.method2534(new Buffer(var4));
         }

         class152.field1689.method3882(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.field1690;
      int var5 = var2.field1695;
      int var6 = var2.field1688;
      int var7 = class244.field2917[var6 - var5];
      return class244.field2911[var8] >> var5 & var7;
   }

   public boolean method3248(int var1, int var2, int var3) {
      if (var1 >= this.field2032 && var1 < this.field2032 + this.field2023) {
         return var2 >= (this.field2028 << 3) + (this.field2029 << 6) && var2 <= 7 + (this.field2029 << 6) + (this.field2030 << 3) && var3 >= (this.field2027 << 6) + (this.field2031 << 3) && var3 <= 7 + (this.field2027 << 6) + (this.field2025 << 3);
      } else {
         return false;
      }
   }

   public boolean method3246(int var1, int var2) {
      return var1 >= (this.field2022 << 3) + (this.field2026 << 6) && var1 <= (this.field2026 << 6) + (this.field2034 << 3) + 7 && var2 >= (this.field2033 << 6) + (this.field2024 << 3) && var2 <= 7 + (this.field2035 << 3) + (this.field2033 << 6);
   }

   public int[] method3247(int var1, int var2, int var3) {
      if (!this.method3248(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{var2 + (this.field2026 * 64 - this.field2029 * 64) + (this.field2022 * 8 - this.field2028 * 8), this.field2024 * 8 - this.field2031 * 8 + this.field2033 * 64 - this.field2027 * 64 + var3};
         return var5;
      }
   }

   public class245 method3249(int var1, int var2) {
      if (!this.method3246(var1, var2)) {
         return null;
      } else {
         int var4 = this.field2028 * 8 - this.field2022 * 8 + this.field2029 * 64 - this.field2026 * 64 + var1;
         int var5 = this.field2027 * 64 - this.field2033 * 64 + var2 + (this.field2031 * 8 - this.field2024 * 8);
         return new class245(this.field2032, var4, var5);
      }
   }

   public void method3256(Buffer var1) {
      this.field2032 = var1.readUnsignedByte();
      this.field2023 = var1.readUnsignedByte();
      this.field2029 = var1.readUnsignedShort();
      this.field2028 = var1.readUnsignedByte();
      this.field2030 = var1.readUnsignedByte();
      this.field2027 = var1.readUnsignedShort();
      this.field2031 = var1.readUnsignedByte();
      this.field2025 = var1.readUnsignedByte();
      this.field2026 = var1.readUnsignedShort();
      this.field2022 = var1.readUnsignedByte();
      this.field2034 = var1.readUnsignedByte();
      this.field2033 = var1.readUnsignedShort();
      this.field2024 = var1.readUnsignedByte();
      this.field2035 = var1.readUnsignedByte();
      this.method3141();
   }

   void method3141() {
   }

   static final void method3140() {
      if (client.field571 > 0) {
         class145.method2449();
      } else {
         client.field458.method5056();
         class17.method128(40);
         client.field645 = client.packetWriter.method1968();
         client.packetWriter.method1961();
      }
   }
}
