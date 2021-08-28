public class class28 {
   class277 field222;
   class277 field223;
   class364 field221 = new class364(256);
   class364 field228 = new class364(256);

   public class28(class277 var1, class277 var2) {
      this.field223 = var1;
      this.field222 = var2;
   }

   class23 method472(int var1, int var2, int[] var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5;
      class23 var8 = (class23)this.field221.get(var6);
      if (null != var8) {
         return var8;
      } else if (null != var3 && var3[0] <= 0) {
         return null;
      } else {
         class22 var9 = class22.method357(this.field223, var1, var2);
         if (var9 == null) {
            return null;
         } else {
            var8 = var9.method351();
            this.field221.put(var8, var6);
            if (var3 != null) {
               var3[0] -= var8.field165.length;
            }

            return var8;
         }
      }
   }

   class23 method476(int var1, int var2, int[] var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5 ^ 4294967296L;
      class23 var8 = (class23)this.field221.get(var6);
      if (null != var8) {
         return var8;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class35 var9 = (class35)this.field228.get(var6);
         if (var9 == null) {
            var9 = class35.method687(this.field222, var1, var2);
            if (var9 == null) {
               return null;
            }

            this.field228.put(var9, var6);
         }

         var8 = var9.method677(var3);
         if (null == var8) {
            return null;
         } else {
            var9.remove();
            this.field221.put(var8, var6);
            return var8;
         }
      }
   }

   public class23 method474(int var1, int[] var2) {
      if (this.field223.method4424() == 1) {
         return this.method472(0, var1, var2);
      } else if (this.field223.method4438(var1) == 1) {
         return this.method472(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   public class23 method475(int var1, int[] var2) {
      if (this.field222.method4424() == 1) {
         return this.method476(0, var1, var2);
      } else if (this.field222.method4438(var1) == 1) {
         return this.method476(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   static final void method482(class54 var0, int var1, int var2) {
      class122.method2214(var0.field791, var0.field787, var0.field786, var0.field789, var0.field790, var0.field790, var1, var2);
   }

   static void method483(Interface var0, int var1, int var2) {
      if (0 == var0.field3063) {
         var0.field2971 = var0.field2947;
      } else if (var0.field3063 == 1) {
         var0.field2971 = (var1 - var0.field2973) / 2 + var0.field2947;
      } else if (2 == var0.field3063) {
         var0.field2971 = var1 - var0.field2973 - var0.field2947;
      } else if (var0.field3063 == 3) {
         var0.field2971 = var1 * var0.field2947 >> 14;
      } else if (var0.field3063 == 4) {
         var0.field2971 = (var1 - var0.field2973) / 2 + (var0.field2947 * var1 >> 14);
      } else {
         var0.field2971 = var1 - var0.field2973 - (var0.field2947 * var1 >> 14);
      }

      if (var0.field2964 == 0) {
         var0.field2972 = var0.field3019;
      } else if (1 == var0.field2964) {
         var0.field2972 = (var2 - var0.field2990) / 2 + var0.field3019;
      } else if (2 == var0.field2964) {
         var0.field2972 = var2 - var0.field2990 - var0.field3019;
      } else if (var0.field2964 == 3) {
         var0.field2972 = var0.field3019 * var2 >> 14;
      } else if (var0.field2964 == 4) {
         var0.field2972 = (var2 - var0.field2990) / 2 + (var2 * var0.field3019 >> 14);
      } else {
         var0.field2972 = var2 - var0.field2990 - (var0.field3019 * var2 >> 14);
      }

   }
}
