public class class237 {
   static final byte[] field2859 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   Buffer field2866 = new Buffer((byte[])null);
   int field2853;
   int field2854;
   int[] field2855;
   int[] field2856;
   int[] field2857;
   int[] field2858;
   long field2862;

   class237() {
   }

   class237(byte[] var1) {
      this.method4057(var1);
   }

   void method4057(byte[] var1) {
      this.field2866.payload = var1;
      this.field2866.offset = 10;
      int var2 = this.field2866.readUnsignedShort();
      this.field2854 = this.field2866.readUnsignedShort();
      this.field2853 = 500000;
      this.field2855 = new int[var2];

      Buffer var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.offset += var5) {
         int var4 = this.field2866.readInt();
         var5 = this.field2866.readInt();
         if (var4 == 1297379947) {
            this.field2855[var3] = this.field2866.offset;
            ++var3;
         }

         var10000 = this.field2866;
      }

      this.field2862 = 0L;
      this.field2856 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field2856[var3] = this.field2855[var3];
      }

      this.field2857 = new int[var2];
      this.field2858 = new int[var2];
   }

   void method4058() {
      this.field2866.payload = null;
      this.field2855 = null;
      this.field2856 = null;
      this.field2857 = null;
      this.field2858 = null;
   }

   boolean method4107() {
      return this.field2866.payload != null;
   }

   int method4060() {
      return this.field2856.length;
   }

   void method4069(int var1) {
      this.field2866.offset = this.field2856[var1];
   }

   void method4062(int var1) {
      this.field2856[var1] = this.field2866.offset;
   }

   void method4082() {
      this.field2866.offset = -1;
   }

   void method4064(int var1) {
      int var2 = this.field2866.method5966();
      int[] var10000 = this.field2857;
      var10000[var1] += var2;
   }

   int method4065(int var1) {
      int var2 = this.method4063(var1);
      return var2;
   }

   int method4063(int var1) {
      byte var2 = this.field2866.payload[this.field2866.offset];
      int var5;
      if (var2 < 0) {
         var5 = var2 & 255;
         this.field2858[var1] = var5;
         ++this.field2866.offset;
      } else {
         var5 = this.field2858[var1];
      }

      if (var5 != 240 && var5 != 247) {
         return this.method4067(var1, var5);
      } else {
         int var3 = this.field2866.method5966();
         if (var5 == 247 && var3 > 0) {
            int var4 = this.field2866.payload[this.field2866.offset] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.field2866.offset;
               this.field2858[var1] = var4;
               return this.method4067(var1, var4);
            }
         }

         Buffer var10000 = this.field2866;
         var10000.offset += var3;
         return 0;
      }
   }

   int method4067(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.field2866.readUnsignedByte();
         var4 = this.field2866.method5966();
         Buffer var10000;
         if (var7 == 47) {
            var10000 = this.field2866;
            var10000.offset += var4;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.field2866.method5952();
            var4 -= 3;
            int var6 = this.field2857[var1];
            this.field2862 += (long)var6 * (long)(this.field2853 - var5);
            this.field2853 = var5;
            var10000 = this.field2866;
            var10000.offset += var4;
            return 2;
         } else {
            var10000 = this.field2866;
            var10000.offset += var4;
            return 3;
         }
      } else {
         byte var3 = field2859[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.field2866.readUnsignedByte() << 8;
         }

         if (var3 >= 2) {
            var4 |= this.field2866.readUnsignedByte() << 16;
         }

         return var4;
      }
   }

   long method4066(int var1) {
      return this.field2862 + (long)var1 * (long)this.field2853;
   }

   int method4079() {
      int var1 = this.field2856.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field2856[var4] >= 0 && this.field2857[var4] < var3) {
            var2 = var4;
            var3 = this.field2857[var4];
         }
      }

      return var2;
   }

   boolean method4106() {
      int var1 = this.field2856.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field2856[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void method4071(long var1) {
      this.field2862 = var1;
      int var3 = this.field2856.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field2857[var4] = 0;
         this.field2858[var4] = 0;
         this.field2866.offset = this.field2855[var4];
         this.method4064(var4);
         this.field2856[var4] = this.field2866.offset;
      }

   }
}
