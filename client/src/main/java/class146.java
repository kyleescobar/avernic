public class class146 extends class349 {
   public static boolean field1598;
   public static class277 field1601;
   static class223 field1597 = new class223(64);
   public char field1596;
   public char field1599;
   public int field1602;
   public int field1604;
   public int[] field1603;
   public int[] field1606;
   public String field1600;
   public String[] field1605;

   class146() {
      this.field1600 = class270.field3234;
      this.field1602 = 0;
   }

   void method2454(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (0 == var3) {
            return;
         }

         this.method2461(var1, var3);
      }
   }

   void method2461(Buffer var1, int var2) {
      if (1 == var2) {
         this.field1596 = (char)var1.readUnsignedByte();
      } else if (var2 == 2) {
         this.field1599 = (char)var1.readUnsignedByte();
      } else if (3 == var2) {
         this.field1600 = var1.readStringNullTerminated();
      } else if (4 == var2) {
         this.field1604 = var1.readInt();
      } else {
         int var4;
         if (var2 == 5) {
            this.field1602 = var1.readUnsignedShort();
            this.field1603 = new int[this.field1602];
            this.field1605 = new String[this.field1602];

            for(var4 = 0; var4 < this.field1602; ++var4) {
               this.field1603[var4] = var1.readInt();
               this.field1605[var4] = var1.readStringNullTerminated();
            }
         } else if (var2 == 6) {
            this.field1602 = var1.readUnsignedShort();
            this.field1603 = new int[this.field1602];
            this.field1606 = new int[this.field1602];

            for(var4 = 0; var4 < this.field1602; ++var4) {
               this.field1603[var4] = var1.readInt();
               this.field1606[var4] = var1.readInt();
            }
         }
      }

   }

   public int method2459() {
      return this.field1602;
   }
}
