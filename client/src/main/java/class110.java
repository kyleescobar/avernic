public class class110 extends class120 {
   byte field1334;
   int field1335;
   int field1336;
   String field1333;
   // $FF: synthetic field
   final class121 this$0;

   class110(class121 var1) {
      this.this$0 = var1;
      this.field1335 = -1;
   }

   void method2191(Buffer var1) {
      this.field1335 = var1.readUnsignedShort();
      this.field1334 = var1.readByte();
      this.field1336 = var1.readUnsignedShort();
      var1.method5954();
      this.field1333 = var1.readStringNullTerminated();
   }

   void method2192(class124 var1) {
      class106 var3 = (class106)var1.field1436.get(this.field1335);
      var3.field1306 = this.field1334;
      var3.field1302 = this.field1336;
      var3.field1303 = new class406(this.field1333);
   }

   static final void method2110(class72 var0) {
      var0.field1023 = false;
      class159 var2;
      if (-1 != var0.field1050) {
         var2 = class48.method1312(var0.field1050);
         if (var2 != null && var2.field1863 != null) {
            ++var0.field1044;
            if (var0.field1042 < var2.field1863.length && var0.field1044 > var2.field1865[var0.field1042]) {
               var0.field1044 = 1;
               ++var0.field1042;
               ParamComposition.method2564(var2, var0.field1042, var0.x, var0.y);
            }

            if (var0.field1042 >= var2.field1863.length) {
               var0.field1044 = 0;
               var0.field1042 = 0;
               ParamComposition.method2564(var2, var0.field1042, var0.x, var0.y);
            }
         } else {
            var0.field1050 = -1;
         }
      }

      if (-1 != var0.spotAnimation && client.cycle >= var0.spotAnimationStartTick) {
         if (var0.isSpotAnimationRunning < 0) {
            var0.isSpotAnimationRunning = 0;
         }

         int var4 = class25.method403(var0.spotAnimation).field1664;
         if (var4 != -1) {
            class159 var3 = class48.method1312(var4);
            if (null != var3 && null != var3.field1863) {
               ++var0.field1060;
               if (var0.isSpotAnimationRunning < var3.field1863.length && var0.field1060 > var3.field1865[var0.isSpotAnimationRunning]) {
                  var0.field1060 = 1;
                  ++var0.isSpotAnimationRunning;
                  ParamComposition.method2564(var3, var0.isSpotAnimationRunning, var0.x, var0.y);
               }

               if (var0.isSpotAnimationRunning >= var3.field1863.length && (var0.isSpotAnimationRunning < 0 || var0.isSpotAnimationRunning >= var3.field1863.length)) {
                  var0.spotAnimation = -1;
               }
            } else {
               var0.spotAnimation = -1;
            }
         } else {
            var0.spotAnimation = -1;
         }
      }

      if (-1 != var0.animation && var0.animationDelay <= 1) {
         var2 = class48.method1312(var0.animation);
         if (1 == var2.field1868 && var0.field1067 > 0 && var0.field1074 <= client.cycle && var0.field1068 < client.cycle) {
            var0.animationDelay = 1;
            return;
         }
      }

      if (-1 != var0.animation && 0 == var0.animationDelay) {
         var2 = class48.method1312(var0.animation);
         if (var2 != null && var2.field1863 != null) {
            ++var0.animationCycle;
            if (var0.animationFrame < var2.field1863.length && var0.animationCycle > var2.field1865[var0.animationFrame]) {
               var0.animationCycle = 1;
               ++var0.animationFrame;
               ParamComposition.method2564(var2, var0.animationFrame, var0.x, var0.y);
            }

            if (var0.animationFrame >= var2.field1863.length) {
               var0.animationFrame -= var2.field1862;
               ++var0.field1057;
               if (var0.field1057 >= var2.field1873) {
                  var0.animation = -1;
               } else if (var0.animationFrame >= 0 && var0.animationFrame < var2.field1863.length) {
                  ParamComposition.method2564(var2, var0.animationFrame, var0.x, var0.y);
               } else {
                  var0.animation = -1;
               }
            }

            var0.field1023 = var2.field1869;
         } else {
            var0.animation = -1;
         }
      }

      if (var0.animationDelay > 0) {
         --var0.animationDelay;
      }

   }
}
