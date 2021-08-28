public class class60 extends class201 {
   class159 field885;
   int field880;
   int field881;
   int field882;
   int field883;
   int field884;
   int field886;
   int field887;
   int field890;

   class60(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class201 var9) {
      this.field884 = var1;
      this.field880 = var2;
      this.field881 = var3;
      this.field890 = var4;
      this.field883 = var5;
      this.field886 = var6;
      if (var7 != -1) {
         this.field885 = class48.method1312(var7);
         this.field882 = 0;
         this.field887 = client.field452 - 1;
         if (this.field885.field1876 == 0 && var9 != null && var9 instanceof class60) {
            class60 var10 = (class60)var9;
            if (var10.field885 == this.field885) {
               this.field882 = var10.field882;
               this.field887 = var10.field887;
               return;
            }
         }

         if (var8 && this.field885.field1862 != -1) {
            this.field882 = (int)(Math.random() * (double)this.field885.field1863.length);
            this.field887 -= (int)(Math.random() * (double)this.field885.field1865[this.field882]);
         }
      }

   }

   public static void method1610() {
      class235.field2816.method3972();
      class235.field2819 = 1;
      class235.field2820 = null;
   }

   protected final class207 method3687() {
      if (this.field885 != null) {
         int var2 = client.field452 - this.field887;
         if (var2 > 100 && this.field885.field1862 > 0) {
            var2 = 100;
         }

         label54: {
            do {
               do {
                  if (var2 <= this.field885.field1865[this.field882]) {
                     break label54;
                  }

                  var2 -= this.field885.field1865[this.field882];
                  ++this.field882;
               } while(this.field882 < this.field885.field1863.length);

               this.field882 -= this.field885.field1862;
            } while(this.field882 >= 0 && this.field882 < this.field885.field1863.length);

            this.field885 = null;
         }

         this.field887 = client.field452 - var2;
      }

      class156 var13 = class124.method2243(this.field884);
      if (null != var13.field1762) {
         var13 = var13.method2638();
      }

      if (null == var13) {
         return null;
      } else {
         int var3;
         int var4;
         if (1 != this.field881 && 3 != this.field881) {
            var3 = var13.field1750;
            var4 = var13.field1751;
         } else {
            var3 = var13.field1751;
            var4 = var13.field1750;
         }

         int var5 = (var3 >> 1) + this.field883;
         int var6 = this.field883 + (1 + var3 >> 1);
         int var7 = this.field886 + (var4 >> 1);
         int var8 = (var4 + 1 >> 1) + this.field886;
         int[][] var9 = class62.field911[this.field890];
         int var10 = var9[var6][var7] + var9[var5][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
         int var11 = (var3 << 6) + (this.field883 << 7);
         int var12 = (this.field886 << 7) + (var4 << 6);
         return var13.method2635(this.field880, this.field881, var9, var11, var10, var12, this.field885, this.field882);
      }
   }
}
