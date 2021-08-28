import java.io.File;
import java.io.IOException;

public final class class78 extends class72 {
   static class88 field1135;
   static int baseY;
   static short[] field1137;
   class148 field1132;

   class78() {
   }

   final void method1832(int var1, byte var2) {
      int var4 = super.pathX[0];
      int var5 = super.pathY[0];
      if (0 == var1) {
         --var4;
         ++var5;
      }

      if (1 == var1) {
         ++var5;
      }

      if (var1 == 2) {
         ++var4;
         ++var5;
      }

      if (3 == var1) {
         --var4;
      }

      if (var1 == 4) {
         ++var4;
      }

      if (5 == var1) {
         --var4;
         --var5;
      }

      if (6 == var1) {
         --var5;
      }

      if (var1 == 7) {
         ++var4;
         --var5;
      }

      if (super.sequence != -1 && class48.method1312(super.sequence).field1860 == 1) {
         super.sequence = -1;
      }

      if (super.pathLength < 9) {
         ++super.pathLength;
      }

      for(int var6 = super.pathLength; var6 > 0; --var6) {
         super.pathX[var6] = super.pathX[var6 - 1];
         super.pathY[var6] = super.pathY[var6 - 1];
         super.field1031[var6] = super.field1031[var6 - 1];
      }

      super.pathX[0] = var4;
      super.pathY[0] = var5;
      super.field1031[0] = var2;
   }

   public static int method1834() {
      return class208.field2484;
   }

   final void method1833(int var1, int var2, boolean var3) {
      if (-1 != super.sequence && class48.method1312(super.sequence).field1860 == 1) {
         super.sequence = -1;
      }

      if (!var3) {
         int var5 = var1 - super.pathX[0];
         int var6 = var2 - super.pathY[0];
         if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
            if (super.pathLength < 9) {
               ++super.pathLength;
            }

            for(int var7 = super.pathLength; var7 > 0; --var7) {
               super.pathX[var7] = super.pathX[var7 - 1];
               super.pathY[var7] = super.pathY[var7 - 1];
               super.field1031[var7] = super.field1031[var7 - 1];
            }

            super.pathX[0] = var1;
            super.pathY[0] = var2;
            super.field1031[0] = 1;
            return;
         }
      }

      super.pathLength = 0;
      super.field1067 = 0;
      super.field1079 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.x = super.pathX[0] * 128 + super.field1024 * 64;
      super.y = 128 * super.pathY[0] + super.field1024 * 64;
   }

   protected final class207 method3687() {
      if (this.field1132 == null) {
         return null;
      } else {
         class159 var2 = -1 != super.sequence && super.field1056 == 0 ? class48.method1312(super.sequence) : null;
         class159 var3 = -1 == super.field1050 || super.field1030 == super.field1050 && null != var2 ? null : class48.method1312(super.field1050);
         class207 var4 = this.field1132.method2491(var2, super.field1054, var3, super.field1042);
         if (var4 == null) {
            return null;
         } else {
            var4.method3721();
            super.field1071 = var4.field2346;
            if (-1 != super.spotAnimation && -1 != super.field1028) {
               class207 var5 = class25.method403(super.spotAnimation).method2498(super.field1028);
               if (null != var5) {
                  var5.method3731(0, -super.field1062, 0);
                  class207[] var6 = new class207[]{var4, var5};
                  var4 = new class207(var6, 2);
               }
            }

            if (1 == this.field1132.field1622) {
               var4.field2430 = true;
            }

            return var4;
         }
      }
   }

   final boolean method1748() {
      return null != this.field1132;
   }

   public static class369 method1836(String var0, String var1, boolean var2) {
      File var4 = new File(class131.field1475, "preferences" + var0 + ".dat");
      if (var4.exists()) {
         try {
            class369 var11 = new class369(var4, "rw", 10000L);
            return var11;
         } catch (IOException var10) {
         }
      }

      String var5 = "";
      if (33 == class81.field1161) {
         var5 = "_rc";
      } else if (class81.field1161 == 34) {
         var5 = "_wip";
      }

      File var6 = new File(class235.field2823, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      class369 var7;
      if (!var2 && var6.exists()) {
         try {
            var7 = new class369(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
         }
      }

      try {
         var7 = new class369(var4, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }
}
