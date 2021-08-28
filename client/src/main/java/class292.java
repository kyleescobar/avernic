import java.util.Locale;

public class class292 implements class290 {
   public static final class292 field3686;
   public static final class292 field3691;
   public static final class292 field3694;
   static class275 archive1;
   static int field3695;
   static final class292 field3682;
   static final class292 field3684;
   static final class292 field3685;
   static final class292 field3687;
   static final class292[] field3683;
   final int field3681;
   final String field3688;
   final String field3689;

   public static void method4640(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var5 = (var2 + var3) / 2;
         int var6 = var2;
         String var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         short var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if (var7 == null || null != var0[var9] && var0[var9].compareTo(var7) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               short var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method4640(var0, var1, var2, var6 - 1);
         method4640(var0, var1, var6 + 1, var3);
      }

   }

   static {
      field3694 = new class292("EN", "en", "English", class293.field3716, 0, "GB");
      field3682 = new class292("DE", "de", "German", class293.field3716, 1, "DE");
      field3691 = new class292("FR", "fr", "French", class293.field3716, 2, "FR");
      field3684 = new class292("PT", "pt", "Portuguese", class293.field3716, 3, "BR");
      field3685 = new class292("NL", "nl", "Dutch", class293.field3701, 4, "NL");
      field3686 = new class292("ES", "es", "Spanish", class293.field3701, 5, "ES");
      field3687 = new class292("ES_MX", "es-mx", "Spanish (Latin American)", class293.field3716, 6, "MX");
      class292[] var0 = method4630();
      field3683 = new class292[var0.length];
      class292[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class292 var3 = var1[var2];
         if (null != field3683[var3.field3681]) {
            throw new IllegalStateException();
         }

         field3683[var3.field3681] = var3;
      }

   }

   static class292[] method4630() {
      return new class292[]{field3684, field3691, field3682, field3686, field3694, field3687, field3685};
   }

   class292(String var1, String var2, String var3, class293 var4, int var5, String var6) {
      this.field3688 = var1;
      this.field3689 = var2;
      this.field3681 = var5;
      if (var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   String method4626() {
      return this.field3689;
   }

   public int method4619() {
      return this.field3681;
   }

   static void method4644(int var0, int var1) {
      int[] var3 = new int[4];
      int[] var4 = new int[4];
      var3[0] = var0;
      var4[0] = var1;
      int var5 = 1;

      for(int var6 = 0; var6 < 4; ++var6) {
         if (var0 != class48.field696[var6]) {
            var3[var5] = class48.field696[var6];
            var4[var5] = class48.field695[var6];
            ++var5;
         }
      }

      class48.field696 = var3;
      class48.field695 = var4;
      class84.method1905(class16.field86, 0, class16.field86.length - 1, class48.field696, class48.field695);
   }

   public static class292 method4628(int var0) {
      return var0 >= 0 && var0 < field3683.length ? field3683[var0] : null;
   }

   public String toString() {
      return this.method4626().toLowerCase(Locale.ENGLISH);
   }

   static final void method4645(int var0, int var1, int var2) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            class62.field911[var0][var1 + var4][var2 + var5] = 0;
         }
      }

      if (var1 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            class62.field911[var0][var1][var2 + var4] = class62.field911[var0][var1 - 1][var4 + var2];
         }
      }

      if (var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            class62.field911[var0][var1 + var4][var2] = class62.field911[var0][var1 + var4][var2 - 1];
         }
      }

      if (var1 > 0 && class62.field911[var0][var1 - 1][var2] != 0) {
         class62.field911[var0][var1][var2] = class62.field911[var0][var1 - 1][var2];
      } else if (var2 > 0 && 0 != class62.field911[var0][var1][var2 - 1]) {
         class62.field911[var0][var1][var2] = class62.field911[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && 0 != class62.field911[var0][var1 - 1][var2 - 1]) {
         class62.field911[var0][var1][var2] = class62.field911[var0][var1 - 1][var2 - 1];
      }

   }

   static class81[] method4643() {
      return new class81[]{class81.field1154, class81.field1158, class81.field1156, class81.field1157, class81.field1160};
   }
}
