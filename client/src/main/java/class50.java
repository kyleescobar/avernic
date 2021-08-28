public final class class50 extends class354 {
   static class296 field720 = new class296();
   static class398 field736;
   class156 field733;
   class30 field725;
   class30 field727;
   int field719;
   int field721;
   int field722;
   int field723;
   int field724;
   int field726;
   int field728;
   int field729;
   int field731;
   int field734;
   int[] field730;

   static final class363 method1392(Buffer var0, class363 var1) {
      int var3 = var0.readUnsignedByte();
      int var4;
      if (var1 == null) {
         var4 = class27.method470(var3);
         var1 = new class363(var4);
      }

      for(var4 = 0; var4 < var3; ++var4) {
         boolean var5 = var0.readUnsignedByte() == 1;
         int var6 = var0.method5952();
         Object var7;
         if (var5) {
            var7 = new class350(var0.readStringNullTerminated());
         } else {
            var7 = new class353(var0.readInt());
         }

         var1.method5727((class354)var7, (long)var6);
      }

      return var1;
   }

   class50() {
   }

   void method1386() {
      int var2 = this.field734;
      class156 var3 = this.field733.method2638();
      if (null != var3) {
         this.field734 = var3.field1766;
         this.field719 = var3.field1780 * 128;
         this.field728 = var3.field1756;
         this.field729 = var3.field1782;
         this.field730 = var3.field1781;
      } else {
         this.field734 = -1;
         this.field719 = 0;
         this.field728 = 0;
         this.field729 = 0;
         this.field730 = null;
      }

      if (var2 != this.field734 && this.field727 != null) {
         class82.field1163.method336(this.field727);
         this.field727 = null;
      }

   }

   public static Interface method1394(int var0, int var1) {
      Interface var3 = class87.getComponent(var0);
      if (var1 == -1) {
         return var3;
      } else {
         return var3 != null && var3.field3061 != null && var1 < var3.field3061.length ? var3.field3061[var1] : null;
      }
   }
}
