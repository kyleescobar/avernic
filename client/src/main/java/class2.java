import java.util.concurrent.Callable;

public class class2 implements Callable {
   static int field4;
   final Buffer field2;
   final class4 field1;
   // $FF: synthetic field
   final class8 this$0;

   static class45 method9(int var0, int var1) {
      class61 var3 = (class61)class85.field1196.get(var0);
      return var3.method1613(var1);
   }

   class2(class8 var1, Buffer var2, class4 var3) {
      this.this$0 = var1;
      this.field2 = var2;
      this.field1 = var3;
   }

   public Object call() {
      return this.field1.method11(this.field2);
   }

   static final void method6(Player var0, int var1, int var2, int var3) {
      if (MouseHandler.localPlayer != var0) {
         if (client.field545 < 400) {
            String var5;
            int var8;
            if (var0.field1007 == 0) {
               String var6 = var0.actions[0] + var0.username + var0.actions[1];
               var8 = var0.field991;
               int var9 = MouseHandler.localPlayer.field991;
               int var10 = var9 - var8;
               String var7;
               if (var10 < -9) {
                  var7 = class44.method770(16711680);
               } else if (var10 < -6) {
                  var7 = class44.method770(16723968);
               } else if (var10 < -3) {
                  var7 = class44.method770(16740352);
               } else if (var10 < 0) {
                  var7 = class44.method770(16756736);
               } else if (var10 > 9) {
                  var7 = class44.method770(65280);
               } else if (var10 > 6) {
                  var7 = class44.method770(4259584);
               } else if (var10 > 3) {
                  var7 = class44.method770(8453888);
               } else if (var10 > 0) {
                  var7 = class44.method770(12648192);
               } else {
                  var7 = class44.method770(16776960);
               }

               var5 = var6 + var7 + " " + class79.field1141 + class270.field3386 + var0.field991 + class79.field1139 + var0.actions[2];
            } else {
               var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + class79.field1141 + class270.field3387 + var0.field1007 + class79.field1139 + var0.actions[2];
            }

            int var11;
            if (1 == client.field561) {
               class8.method38(class270.field3380, client.field530 + " " + class79.field1143 + " " + class44.method770(16777215) + var5, 14, var1, var2, var3);
            } else if (client.field563) {
               if ((class208.field2474 & 8) == 8) {
                  class8.method38(client.field566, client.field466 + " " + class79.field1143 + " " + class44.method770(16777215) + var5, 15, var1, var2, var3);
               }
            } else {
               for(var11 = 7; var11 >= 0; --var11) {
                  if (null != client.field532[var11]) {
                     short var13 = 0;
                     if (client.field532[var11].equalsIgnoreCase(class270.field3382)) {
                        if (class81.field1160 == client.field459) {
                           continue;
                        }

                        if (class81.field1156 == client.field459 || class81.field1154 == client.field459 && var0.field991 > MouseHandler.localPlayer.field991) {
                           var13 = 2000;
                        }

                        if (0 != MouseHandler.localPlayer.field997 && 0 != var0.field997) {
                           if (MouseHandler.localPlayer.field997 == var0.field997) {
                              var13 = 2000;
                           } else {
                              var13 = 0;
                           }
                        } else if (class81.field1158 == client.field459 && var0.method1709()) {
                           var13 = 2000;
                        }
                     } else if (client.field533[var11]) {
                        var13 = 2000;
                     }

                     boolean var12 = false;
                     var8 = var13 + client.field531[var11];
                     class8.method38(client.field532[var11], class44.method770(16777215) + var5, var8, var1, var2, var3);
                  }
               }
            }

            for(var11 = 0; var11 < client.field545; ++var11) {
               if (23 == client.field548[var11]) {
                  client.field551[var11] = class44.method770(16777215) + var5;
                  break;
               }
            }

         }
      }
   }
}
