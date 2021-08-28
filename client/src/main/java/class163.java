public class class163 extends class177 {
   class163() {
   }

   void method2853(Buffer var1) {
      int var3 = var1.readUnsignedByte();
      if (class183.field2096.field2094 != var3) {
         throw new IllegalStateException("");
      } else {
         super.field2061 = var1.readUnsignedByte();
         super.field2052 = var1.readUnsignedByte();
         super.field2051 = var1.readUnsignedShort();
         super.field2048 = var1.readUnsignedShort();
         super.field2049 = var1.readUnsignedShort();
         super.field2053 = var1.readUnsignedShort();
         super.field2047 = var1.method5965();
         super.field2054 = var1.method5965();
      }
   }

   void method3156(Buffer var1) {
      super.field2052 = Math.min(super.field2052, 4);
      super.field2055 = new short[1][64][64];
      super.field2062 = new short[super.field2052][64][64];
      super.field2057 = new byte[super.field2052][64][64];
      super.field2058 = new byte[super.field2052][64][64];
      super.field2059 = new class179[super.field2052][64][64][];
      int var3 = var1.readUnsignedByte();
      if (class182.field2091.field2089 != var3) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.readUnsignedByte();
         int var5 = var1.readUnsignedByte();
         if (var4 == super.field2049 && var5 == super.field2053) {
            for(int var6 = 0; var6 < 64; ++var6) {
               for(int var7 = 0; var7 < 64; ++var7) {
                  this.method3175(var6, var7, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class163)) {
         return false;
      } else {
         class163 var2 = (class163)var1;
         return var2.field2049 == super.field2049 && super.field2053 == var2.field2053;
      }
   }

   public int hashCode() {
      return super.field2049 | super.field2053 << 8;
   }

   static int method2861(int var0, class59 var1, boolean var2) {
      if (var0 >= 7200 && var0 < 7204) {
         class51.field746 -= 5;
         class51.field747[++class51.field746 - 1] = -1;
         return 1;
      } else if (var0 == 7204) {
         class51.field746 -= 6;
         class51.field747[++class51.field746 - 1] = -1;
         return 1;
      } else if (var0 >= 7205 && var0 < 7209) {
         class51.field747[class51.field746 - 1] = -1;
         return 1;
      } else if (var0 == 7209) {
         class51.field746 -= 2;
         class51.field747[++class51.field746 - 1] = -1;
         return 1;
      } else if (var0 >= 7210 && var0 < 7214) {
         --class51.field746;
         return 1;
      } else if (var0 == 7214) {
         class51.field746 -= 2;
         return 1;
      } else {
         return 2;
      }
   }

   static final void dispatchInterfaceCloseEvent(int var0, int var1) {
      if (class251.method4294(var0)) {
         class77.method1831(Interface.components[var0], var1);
      }
   }
}
