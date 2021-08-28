public class class320 extends class326 {
   public static class370[] field3840;
   int field3838 = 1;
   final class318 field3836;
   final class367 field3831;
   public byte field3832;
   public int field3837;
   public String field3833 = null;
   public String field3834 = null;

   public class320(class367 var1, class318 var2) {
      super(100);
      this.field3831 = var1;
      this.field3836 = var2;
   }

   class324 method5187() {
      return new class323();
   }

   class324[] method5241(int var1) {
      return new class323[var1];
   }

   final void method5103(String var1) {
      this.field3834 = class325.method5183(var1);
   }

   final void method5104(String var1) {
      this.field3833 = class325.method5183(var1);
   }

   public final void method5114(Buffer var1) {
      this.method5104(var1.readStringNullTerminated());
      long var3 = var1.method5954();
      long var6 = var3;
      String var5;
      int var8;
      if (var3 > 0L && var3 < 6582952005840035281L) {
         if (0L == var3 % 37L) {
            var5 = null;
         } else {
            var8 = 0;

            for(long var9 = var3; 0L != var9; var9 /= 37L) {
               ++var8;
            }

            StringBuilder var11 = new StringBuilder(var8);

            while(0L != var6) {
               long var12 = var6;
               var6 /= 37L;
               var11.append(class308.field3764[(int)(var12 - var6 * 37L)]);
            }

            var5 = var11.reverse().toString();
         }
      } else {
         var5 = null;
      }

      this.method5103(var5);
      this.field3832 = var1.readByte();
      var8 = var1.readUnsignedByte();
      if (var8 != 255) {
         this.method5185();

         for(int var14 = 0; var14 < var8; ++var14) {
            class323 var10 = (class323)this.method5194(new class406(var1.readStringNullTerminated(), this.field3831));
            int var15 = var1.readUnsignedShort();
            var10.method5275(var15, ++this.field3838 - 1);
            var10.field3866 = var1.readByte();
            var1.readStringNullTerminated();
            this.method5115(var10);
         }

      }
   }

   public final void method5106(Buffer var1) {
      class406 var3 = new class406(var1.readStringNullTerminated(), this.field3831);
      int var4 = var1.readUnsignedShort();
      byte var5 = var1.readByte();
      boolean var6 = false;
      if (var5 == -128) {
         var6 = true;
      }

      class323 var7;
      if (var6) {
         if (this.method5200() == 0) {
            return;
         }

         var7 = (class323)this.method5190(var3);
         if (var7 != null && var7.method5268() == var4) {
            this.method5193(var7);
         }
      } else {
         var1.readStringNullTerminated();
         var7 = (class323)this.method5190(var3);
         if (null == var7) {
            if (this.method5200() > super.field3860) {
               return;
            }

            var7 = (class323)this.method5194(var3);
         }

         var7.method5275(var4, ++this.field3838 - 1);
         var7.field3866 = var5;
         this.method5115(var7);
      }

   }

   public final void method5107() {
      for(int var2 = 0; var2 < this.method5200(); ++var2) {
         ((class323)this.method5196(var2)).method5151();
      }

   }

   public final void method5120() {
      for(int var2 = 0; var2 < this.method5200(); ++var2) {
         ((class323)this.method5196(var2)).method5138();
      }

   }

   final void method5115(class323 var1) {
      if (var1.method5167().equals(this.field3836.method5086())) {
         this.field3837 = var1.field3866;
      }

   }
}
