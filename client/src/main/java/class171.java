public class class171 extends class177 {
   int field1993;
   int field1994;
   int field1995;
   int field1996;

   class171() {
   }

   void method3112(Buffer var1) {
      int var3 = var1.readUnsignedByte();
      if (var3 != class183.field2095.field2094) {
         throw new IllegalStateException("");
      } else {
         super.field2061 = var1.readUnsignedByte();
         super.field2052 = var1.readUnsignedByte();
         super.field2051 = var1.readUnsignedShort();
         super.field2048 = var1.readUnsignedShort();
         this.field1996 = var1.readUnsignedByte();
         this.field1994 = var1.readUnsignedByte();
         super.field2049 = var1.readUnsignedShort();
         super.field2053 = var1.readUnsignedShort();
         this.field1995 = var1.readUnsignedByte();
         this.field1993 = var1.readUnsignedByte();
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
      if (class182.field2090.field2089 != var3) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.readUnsignedByte();
         int var5 = var1.readUnsignedByte();
         int var6 = var1.readUnsignedByte();
         int var7 = var1.readUnsignedByte();
         if (var4 == super.field2049 && super.field2053 == var5 && var6 == this.field1995 && var7 == this.field1993) {
            for(int var8 = 0; var8 < 8; ++var8) {
               for(int var9 = 0; var9 < 8; ++var9) {
                  this.method3175(var8 + this.field1995 * 8, this.field1993 * 8 + var9, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class171)) {
         return false;
      } else {
         class171 var2 = (class171)var1;
         if (super.field2049 == var2.field2049 && super.field2053 == var2.field2053) {
            return var2.field1995 == this.field1995 && var2.field1993 == this.field1993;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return super.field2049 | super.field2053 << 8 | this.field1995 << 16 | this.field1993 << 24;
   }

   int method3120() {
      return this.field1996;
   }

   int method3116() {
      return this.field1994;
   }

   int method3127() {
      return this.field1995;
   }

   int method3117() {
      return this.field1993;
   }
}
