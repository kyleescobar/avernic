public class class319 extends class326 {
   int field3829 = 1;
   final class367 field3827;
   public class299 field3830 = new class299();

   public class319(class367 var1) {
      super(400);
      this.field3827 = var1;
   }

   class324 method5187() {
      return new class321();
   }

   class324[] method5241(int var1) {
      return new class321[var1];
   }

   public boolean method5094(class406 var1, boolean var2) {
      class321 var4 = (class321)this.method5189(var1);
      if (null == var4) {
         return false;
      } else {
         return !var2 || var4.field3865 != 0;
      }
   }

   public void method5091(Buffer var1, int var2) {
      while(true) {
         if (var1.offset < var2) {
            boolean var4 = var1.readUnsignedByte() == 1;
            class406 var5 = new class406(var1.readStringNullTerminated(), this.field3827);
            class406 var6 = new class406(var1.readStringNullTerminated(), this.field3827);
            int var7 = var1.readUnsignedShort();
            int var8 = var1.readUnsignedByte();
            int var9 = var1.readUnsignedByte();
            boolean var10 = (var9 & 2) != 0;
            boolean var11 = (var9 & 1) != 0;
            if (var7 > 0) {
               var1.readStringNullTerminated();
               var1.readUnsignedByte();
               var1.readInt();
            }

            var1.readStringNullTerminated();
            if (null != var5 && var5.method6523()) {
               class321 var12 = (class321)this.method5190(var5);
               if (var4) {
                  class321 var13 = (class321)this.method5190(var6);
                  if (var13 != null && var13 != var12) {
                     if (null != var12) {
                        this.method5193(var13);
                     } else {
                        var12 = var13;
                     }
                  }
               }

               if (var12 != null) {
                  this.method5198(var12, var5, var6);
                  if (var7 != var12.field3865) {
                     boolean var15 = true;

                     for(class322 var14 = (class322)this.field3830.method4797(); null != var14; var14 = (class322)this.field3830.method4798()) {
                        if (var14.field3844.equals(var5)) {
                           if (0 != var7 && 0 == var14.field3846) {
                              var14.method5432();
                              var15 = false;
                           } else if (0 == var7 && 0 != var14.field3846) {
                              var14.method5432();
                              var15 = false;
                           }
                        }
                     }

                     if (var15) {
                        this.field3830.method4795(new class322(var5, var7));
                     }
                  }
               } else {
                  if (this.method5200() >= 400) {
                     continue;
                  }

                  var12 = (class321)this.method5242(var5, var6);
               }

               if (var12.field3865 != var7) {
                  var12.field3869 = ++this.field3829 - 1;
                  if (-1 == var12.field3865 && var7 == 0) {
                     var12.field3869 = -(var12.field3869 * 723168297) * -2065584103;
                  }

                  var12.field3865 = var7;
               }

               var12.field3866 = var8;
               var12.field3843 = var10;
               var12.field3842 = var11;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method5197();
         return;
      }
   }
}
