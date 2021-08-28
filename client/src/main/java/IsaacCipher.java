public final class IsaacCipher {
   int field4292;
   int field4293;
   int field4296;
   int field4297;
   int[] field4291 = new int[256];
   int[] field4294 = new int[256];

   public IsaacCipher(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field4291[var2] = var1[var2];
      }

      this.method6505();
   }

   public final int nextInt() {
      if (0 == this.field4292) {
         this.method6502();
         this.field4292 = 256;
      }

      return this.field4291[--this.field4292];
   }

   public final int method6499() {
      if (this.field4292 == 0) {
         this.method6502();
         this.field4292 = 256;
      }

      return this.field4291[this.field4292 - 1];
   }

   final void method6502() {
      this.field4296 += ++this.field4297;

      for(int var2 = 0; var2 < 256; ++var2) {
         int var3 = this.field4294[var2];
         if (0 == (var2 & 2)) {
            if (0 == (var2 & 1)) {
               this.field4293 ^= this.field4293 << 13;
            } else {
               this.field4293 ^= this.field4293 >>> 6;
            }
         } else if (0 == (var2 & 1)) {
            this.field4293 ^= this.field4293 << 2;
         } else {
            this.field4293 ^= this.field4293 >>> 16;
         }

         this.field4293 += this.field4294[var2 + 128 & 255];
         int var4;
         this.field4294[var2] = var4 = this.field4296 + this.field4293 + this.field4294[(var3 & 1020) >> 2];
         this.field4291[var2] = this.field4296 = this.field4294[(var4 >> 8 & 1020) >> 2] + var3;
      }

   }

   final void method6505() {
      int var10 = -1640531527;
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;

      int var2;
      for(var2 = 0; var2 < 4; ++var2) {
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
      }

      for(var2 = 0; var2 < 256; var2 += 8) {
         var3 += this.field4291[var2];
         var4 += this.field4291[1 + var2];
         var5 += this.field4291[var2 + 2];
         var6 += this.field4291[var2 + 3];
         var7 += this.field4291[4 + var2];
         var8 += this.field4291[5 + var2];
         var9 += this.field4291[6 + var2];
         var10 += this.field4291[7 + var2];
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
         this.field4294[var2] = var3;
         this.field4294[1 + var2] = var4;
         this.field4294[2 + var2] = var5;
         this.field4294[var2 + 3] = var6;
         this.field4294[4 + var2] = var7;
         this.field4294[5 + var2] = var8;
         this.field4294[6 + var2] = var9;
         this.field4294[7 + var2] = var10;
      }

      for(var2 = 0; var2 < 256; var2 += 8) {
         var3 += this.field4294[var2];
         var4 += this.field4294[1 + var2];
         var5 += this.field4294[var2 + 2];
         var6 += this.field4294[3 + var2];
         var7 += this.field4294[var2 + 4];
         var8 += this.field4294[5 + var2];
         var9 += this.field4294[var2 + 6];
         var10 += this.field4294[var2 + 7];
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
         this.field4294[var2] = var3;
         this.field4294[1 + var2] = var4;
         this.field4294[var2 + 2] = var5;
         this.field4294[var2 + 3] = var6;
         this.field4294[4 + var2] = var7;
         this.field4294[5 + var2] = var8;
         this.field4294[6 + var2] = var9;
         this.field4294[var2 + 7] = var10;
      }

      this.method6502();
      this.field4292 = 256;
   }
}
