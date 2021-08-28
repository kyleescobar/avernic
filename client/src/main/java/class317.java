public class class317 extends class326 {
   final class367 field3821;

   public class317(class367 var1) {
      super(400);
      this.field3821 = var1;
   }

   class324 method5187() {
      return new class327();
   }

   class324[] method5241(int var1) {
      return new class327[var1];
   }

   public void method5080(Buffer var1, int var2) {
      while(true) {
         if (var1.offset < var2) {
            int var4 = var1.readUnsignedByte();
            boolean var5 = (var4 & 1) == 1;
            class406 var6 = new class406(var1.readStringNullTerminated(), this.field3821);
            class406 var7 = new class406(var1.readStringNullTerminated(), this.field3821);
            var1.readStringNullTerminated();
            if (var6 != null && var6.method6523()) {
               class327 var8 = (class327)this.method5190(var6);
               if (var5) {
                  class327 var9 = (class327)this.method5190(var7);
                  if (null != var9 && var9 != var8) {
                     if (null != var8) {
                        this.method5193(var9);
                     } else {
                        var8 = var9;
                     }
                  }
               }

               if (var8 != null) {
                  this.method5198(var8, var6, var7);
                  continue;
               }

               if (this.method5200() < 400) {
                  int var10 = this.method5200();
                  var8 = (class327)this.method5242(var6, var7);
                  var8.field3863 = var10;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }

   public static final boolean method5085() {
      synchronized(KeyHandler.field59) {
         if (KeyHandler.field60 == KeyHandler.field58) {
            return false;
         } else {
            class121.field1418 = KeyHandler.field55[KeyHandler.field58];
            class127.field1450 = KeyHandler.field52[KeyHandler.field58];
            KeyHandler.field58 = 1 + KeyHandler.field58 & 127;
            return true;
         }
      }
   }
}
