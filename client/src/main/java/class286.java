public class class286 {
   static Interface field3660;
   byte field3655;
   public int field3653;
   public int field3654;
   public int field3656;
   public int field3657;
   public int field3659;

   public class286() {
   }

   public class286(Buffer var1, boolean var2) {
      this.field3655 = var1.readByte();
      this.field3654 = var1.readUnsignedShort();
      this.field3656 = var1.readInt();
      this.field3653 = var1.readInt();
      this.field3657 = var1.readInt();
      this.field3659 = var1.readInt();
      if (var2) {
         int var4 = 0;
         boolean var5 = false;

         while(true) {
            int var6 = var1.readUnsignedByte();
            if (255 == var6) {
               Integer var3 = var5 ? var4 : null;
               this.method4568(var3);
               break;
            }

            if (0 != var6) {
               throw new IllegalStateException("");
            }

            while(true) {
               int var7 = var1.readUnsignedByte();
               if (var7 == 255) {
                  break;
               }

               --var1.offset;
               if (var1.readUnsignedShort() != 0) {
                  throw new IllegalStateException("");
               }

               if (var5) {
                  throw new IllegalStateException("");
               }

               var4 = var1.readInt();
               var5 = true;
            }
         }
      }

   }

   void method4568(Integer var1) {
   }

   public int method4570() {
      return this.field3655 & 7;
   }

   public int method4573() {
      return (this.field3655 & 8) == 8 ? 1 : 0;
   }

   static void method4582() {
      class85.field1196.clear();
      class85.field1194.method5715();
      class85.field1195.method4811();
      class85.field1200 = 0;
   }

   void method4571(int var1) {
      this.field3655 &= -8;
      this.field3655 = (byte)(this.field3655 | var1 & 7);
   }

   void method4572(int var1) {
      this.field3655 &= -9;
      if (var1 == 1) {
         this.field3655 = (byte)(this.field3655 | 8);
      }

   }

   public static String method4581(String var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];
      byte var4 = 2;

      for(int var5 = 0; var5 < var2; ++var5) {
         char var6 = var0.charAt(var5);
         if (var4 == 0) {
            var6 = Character.toLowerCase(var6);
         } else if (2 == var4 || Character.isUpperCase(var6)) {
            var6 = class137.method2327(var6);
         }

         if (Character.isLetter(var6)) {
            var4 = 0;
         } else if ('.' != var6 && var6 != '?' && '!' != var6) {
            if (Character.isSpaceChar(var6)) {
               if (var4 != 2) {
                  var4 = 1;
               }
            } else {
               var4 = 1;
            }
         } else {
            var4 = 2;
         }

         var3[var5] = var6;
      }

      return new String(var3);
   }
}
