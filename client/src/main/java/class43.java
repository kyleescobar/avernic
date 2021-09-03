import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class43 extends class354 {
   byte[][][] field362;
   int field358;
   int field359;
   int[] field360;
   int[] field361;
   int[] field363;
   Field[] field364;
   Method[] field365;

   class43() {
   }

   static final void method768(class72 var0) {
      if (0 != var0.rotation) {
         if (var0.targetIndex != -1) {
            Object var2 = null;
            if (var0.targetIndex < 32768) {
               var2 = client.npcs[var0.targetIndex];
            } else if (var0.targetIndex >= 32768) {
               var2 = client.localPlayers[var0.targetIndex - '\u8000'];
            }

            if (null != var2) {
               int var3 = var0.x - ((class72)var2).x;
               int var4 = var0.y - ((class72)var2).y;
               if (var3 != 0 || 0 != var4) {
                  var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
               }
            } else if (var0.field1032) {
               var0.targetIndex = -1;
               var0.field1032 = false;
            }
         }

         if (-1 != var0.faceDegrees && (var0.pathLength == 0 || var0.field1079 > 0)) {
            var0.orientation = var0.faceDegrees;
            var0.faceDegrees = -1;
         }

         int var5 = var0.orientation - var0.movementDirection & 2047;
         if (var5 == 0 && var0.field1032) {
            var0.targetIndex = -1;
            var0.field1032 = false;
         }

         if (0 != var5) {
            ++var0.field1073;
            boolean var6;
            if (var5 > 1024) {
               var0.movementDirection -= var0.rotation;
               var6 = true;
               if (var5 < var0.rotation || var5 > 2048 - var0.rotation) {
                  var0.movementDirection = var0.orientation;
                  var6 = false;
               }

               if (var0.field1050 == var0.stanceAnimation && (var0.field1073 > 25 || var6)) {
                  if (-1 != var0.turnLeftAnimation) {
                     var0.field1050 = var0.turnLeftAnimation;
                  } else {
                     var0.field1050 = var0.walkForwardAnimation;
                  }
               }
            } else {
               var0.movementDirection += var0.rotation;
               var6 = true;
               if (var5 < var0.rotation || var5 > 2048 - var0.rotation) {
                  var0.movementDirection = var0.orientation;
                  var6 = false;
               }

               if (var0.stanceAnimation == var0.field1050 && (var0.field1073 > 25 || var6)) {
                  if (var0.turnRightAnimation != -1) {
                     var0.field1050 = var0.turnRightAnimation;
                  } else {
                     var0.field1050 = var0.walkForwardAnimation;
                  }
               }
            }

            var0.movementDirection &= 2047;
         } else {
            var0.field1073 = 0;
         }

      }
   }

   static boolean method767() {
      return client.field555;
   }
}
