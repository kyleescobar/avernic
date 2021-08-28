import java.util.LinkedList;

public abstract class class177 {
   boolean field2056;
   boolean field2060;
   byte[][][] field2057;
   byte[][][] field2058;
   class179[][][][] field2059;
   int field2047 = -1;
   int field2048;
   int field2049;
   int field2051;
   int field2052;
   int field2053;
   int field2054 = -1;
   int field2061;
   short[][][] field2055;
   short[][][] field2062;

   class177() {
      new LinkedList();
      this.field2060 = false;
      this.field2056 = false;
   }

   boolean method3161() {
      return this.field2060 && this.field2056;
   }

   void method3151(class277 var1) {
      if (!this.method3161()) {
         byte[] var3 = var1.method4412(this.field2047, this.field2054);
         if (var3 != null) {
            this.method3156(new Buffer(var3));
            this.field2060 = true;
            this.field2056 = true;
         }

      }
   }

   void method3149() {
      this.field2055 = (short[][][])null;
      this.field2062 = (short[][][])null;
      this.field2057 = (byte[][][])null;
      this.field2058 = (byte[][][])null;
      this.field2059 = (class179[][][][])null;
      this.field2060 = false;
      this.field2056 = false;
   }

   void method3175(int var1, int var2, Buffer var3) {
      int var5 = var3.readUnsignedByte();
      if (0 != var5) {
         if (0 != (var5 & 1)) {
            this.method3154(var1, var2, var3, var5);
         } else {
            this.method3153(var1, var2, var3, var5);
         }

      }
   }

   void method3154(int var1, int var2, Buffer var3, int var4) {
      boolean var6 = (var4 & 2) != 0;
      if (var6) {
         this.field2062[0][var1][var2] = (short)var3.readUnsignedByte();
      }

      this.field2055[0][var1][var2] = (short)var3.readUnsignedByte();
   }

   void method3153(int var1, int var2, Buffer var3, int var4) {
      int var6 = 1 + ((var4 & 24) >> 3);
      boolean var7 = 0 != (var4 & 2);
      boolean var8 = 0 != (var4 & 4);
      this.field2055[0][var1][var2] = (short)var3.readUnsignedByte();
      int var9;
      int var10;
      int var12;
      if (var7) {
         var9 = var3.readUnsignedByte();

         for(var10 = 0; var10 < var9; ++var10) {
            int var11 = var3.readUnsignedByte();
            if (var11 != 0) {
               this.field2062[var10][var1][var2] = (short)var11;
               var12 = var3.readUnsignedByte();
               this.field2057[var10][var1][var2] = (byte)(var12 >> 2);
               this.field2058[var10][var1][var2] = (byte)(var12 & 3);
            }
         }
      }

      if (var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            var10 = var3.readUnsignedByte();
            if (var10 != 0) {
               class179[] var15 = this.field2059[var9][var1][var2] = new class179[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  int var13 = var3.method5965();
                  int var14 = var3.readUnsignedByte();
                  var15[var12] = new class179(var13, var14 >> 2, var14 & 3);
               }
            }
         }
      }

   }

   int method3157() {
      return this.field2049;
   }

   int method3155() {
      return this.field2053;
   }

   abstract void method3156(Buffer var1);
}
