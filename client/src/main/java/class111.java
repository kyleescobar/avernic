public class class111 extends class104 {
   boolean field1343;
   byte field1339;
   byte field1340;
   byte field1341;
   byte field1342;
   // $FF: synthetic field
   final class107 this$0;

   public static boolean method2112(int var0) {
      return (var0 >> 21 & 1) != 0;
   }

   public static void method2111(class277 var0, class277 var1, boolean var2) {
      class156.field1735 = var0;
      class156.field1748 = var1;
      class156.field1742 = var2;
   }

   class111(class107 var1) {
      this.this$0 = var1;
   }

   void method2083(Buffer var1) {
      this.field1343 = var1.readUnsignedByte() == 1;
      this.field1340 = var1.readByte();
      this.field1341 = var1.readByte();
      this.field1342 = var1.readByte();
      this.field1339 = var1.readByte();
   }

   void method2084(class115 var1) {
      var1.field1367 = this.field1343;
      var1.field1360 = this.field1340;
      var1.field1369 = this.field1341;
      var1.field1370 = this.field1342;
      var1.field1384 = this.field1339;
   }

   static int method2113(int var0, class59 var1, boolean var2) {
      if (var0 != 6700 && 6702 != var0 && 6704 != var0 && var0 != 6706 && 6708 != var0) {
         if (var0 != 6701 && 6703 != var0 && 6705 != var0 && 6707 != var0 && 6709 != var0) {
            if (var0 == 6750) {
               class51.field738[++class2.field4 - 1] = "";
               return 1;
            } else if (6751 != var0 && var0 != 6752 && 6753 != var0) {
               if (var0 == 6754) {
                  int var4 = class51.field747[--class51.field746];
                  class148 var5 = class97.getNpcDefinition(var4);
                  class51.field738[++class2.field4 - 1] = null != var5 ? var5.field1620 : "";
                  return 1;
               } else {
                  return 2;
               }
            } else {
               class51.field747[++class51.field746 - 1] = -1;
               return 1;
            }
         } else {
            --class51.field746;
            return 1;
         }
      } else {
         class51.field746 -= 2;
         --class2.field4;
         return 1;
      }
   }
}
