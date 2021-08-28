public class class336 {
   static class397 field3920;
   public int field3908 = -1;
   public int field3909 = -1;
   public int field3910 = -1;
   public int field3911 = -1;
   public int field3912 = -1;
   public int field3913 = -1;
   public int field3914 = -1;
   public int field3915 = -1;
   public int field3916 = -1;
   public int field3917 = -1;
   public int field3918 = -1;

   public void method5362(class277 var1) {
      byte[] var3 = var1.method4419(class335.field3905.field3904);
      Buffer var4 = new Buffer(var3);

      while(true) {
         int var5 = var4.readUnsignedByte();
         if (var5 == 0) {
            return;
         }

         switch(var5) {
         case 1:
            var4.method5952();
            break;
         case 2:
            this.field3917 = var4.method5965();
            this.field3916 = var4.method5965();
            this.field3910 = var4.method5965();
            this.field3908 = var4.method5965();
            this.field3911 = var4.method5965();
            this.field3913 = var4.method5965();
            this.field3909 = var4.method5965();
            this.field3915 = var4.method5965();
            this.field3914 = var4.method5965();
            this.field3912 = var4.method5965();
            this.field3918 = var4.method5965();
         }
      }
   }

   static int method5365(int var0, class59 var1, boolean var2) {
      if (var0 == 6800) {
         class51.field738[++class2.field4 - 1] = "";
         return 1;
      } else if (var0 != 6801 && var0 != 6802) {
         if (6850 == var0) {
            class51.field738[++class2.field4 - 1] = "";
            return 1;
         } else if (var0 != 6851 && var0 != 6852) {
            if (6853 == var0) {
               class51.field747[++class51.field746 - 1] = 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            class51.field747[++class51.field746 - 1] = -1;
            return 1;
         }
      } else {
         class51.field747[++class51.field746 - 1] = -1;
         return 1;
      }
   }
}
