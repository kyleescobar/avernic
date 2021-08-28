public class class196 {
   static int[] field2213 = new int[500];
   static int[] field2214 = new int[500];
   static int[] field2215 = new int[500];
   static int[] field2221 = new int[500];
   boolean field2222 = false;
   class199 field2216 = null;
   int field2212 = -1;
   int[] field2217;
   int[] field2218;
   int[] field2219;
   int[] field2220;

   class196(byte[] var1, class199 var2) {
      this.field2216 = var2;
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      var3.offset = 2;
      int var5 = var3.readUnsignedByte();
      int var6 = -1;
      int var7 = 0;
      var4.offset = var3.offset + var5;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.readUnsignedByte();
         if (var9 > 0) {
            if (this.field2216.field2274[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.field2216.field2274[var10] == 0) {
                     field2221[var7] = var10;
                     field2213[var7] = 0;
                     field2214[var7] = 0;
                     field2215[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field2221[var7] = var8;
            short var11 = 0;
            if (this.field2216.field2274[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               field2213[var7] = var4.method5961();
            } else {
               field2213[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               field2214[var7] = var4.method5961();
            } else {
               field2214[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               field2215[var7] = var4.method5961();
            } else {
               field2215[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.field2216.field2274[var8] == 5) {
               this.field2222 = true;
            }
         }
      }

      if (var4.offset != var1.length) {
         throw new RuntimeException();
      } else {
         this.field2212 = var7;
         this.field2218 = new int[var7];
         this.field2217 = new int[var7];
         this.field2220 = new int[var7];
         this.field2219 = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.field2218[var8] = field2221[var8];
            this.field2217[var8] = field2213[var8];
            this.field2220[var8] = field2214[var8];
            this.field2219[var8] = field2215[var8];
         }

      }
   }
}
