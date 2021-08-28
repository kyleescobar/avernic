public class class22 {
   class40[] field161 = new class40[10];
   int field162;
   int field163;

   public static class22 method357(class277 var0, int var1, int var2) {
      byte[] var3 = var0.method4412(var1, var2);
      return var3 == null ? null : new class22(new Buffer(var3));
   }

   class22(Buffer var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.readUnsignedByte();
         if (var3 != 0) {
            --var1.offset;
            this.field161[var2] = new class40();
            this.field161[var2].method746(var1);
         }
      }

      this.field163 = var1.readUnsignedShort();
      this.field162 = var1.readUnsignedShort();
   }

   public class23 method351() {
      byte[] var1 = this.method353();
      return new class23(22050, var1, 22050 * this.field163 / 1000, 22050 * this.field162 / 1000);
   }

   public final int method361() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field161[var2] != null && this.field161[var2].field340 / 20 < var1) {
            var1 = this.field161[var2].field340 / 20;
         }
      }

      if (this.field163 < this.field162 && this.field163 / 20 < var1) {
         var1 = this.field163 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.field161[var2] != null) {
               class40 var10000 = this.field161[var2];
               var10000.field340 -= var1 * 20;
            }
         }

         if (this.field163 < this.field162) {
            this.field163 -= var1 * 20;
            this.field162 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] method353() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field161[var2] != null && this.field161[var2].field344 + this.field161[var2].field340 > var1) {
            var1 = this.field161[var2].field344 + this.field161[var2].field340;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.field161[var4] != null) {
               int var5 = this.field161[var4].field344 * 22050 / 1000;
               int var6 = this.field161[var4].field340 * 22050 / 1000;
               int[] var7 = this.field161[var4].method755(var5, this.field161[var4].field344);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }
}
