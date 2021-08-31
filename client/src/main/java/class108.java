public class class108 extends class104 {
   static int field1324;
   byte field1321;
   int field1322;
   // $FF: synthetic field
   final class107 this$0;

   class108(class107 var1) {
      this.this$0 = var1;
      this.field1322 = -1;
   }

   void method2083(Buffer var1) {
      this.field1322 = var1.readUnsignedShort();
      this.field1321 = var1.readByte();
   }

   void method2084(class115 var1) {
      var1.method2129(this.field1322, this.field1321);
   }

   static String method2106() {
      return class38.clientPreferences.field1117 ? class17.method141(class56.loginUsername) : class56.loginUsername;
   }

   static void method2103(boolean var0) {
      class56.field823 = class270.field3441;
      class56.field814 = class270.field3335;
      class56.field816 = class270.field3444;
      class56.field812 = 2;
      if (var0) {
         class56.field818 = "";
      }

      class81.method1871();
      if (client.isLoginUsernameRemembered && null != class56.loginUsername && class56.loginUsername.length() > 0) {
         class56.field822 = 1;
      } else {
         class56.field822 = 0;
      }

   }

   static final void method2104() {
      int[] var1 = PlayerList.localPlayerIndexes;

      int var2;
      for(var2 = 0; var2 < PlayerList.localPlayerCount; ++var2) {
         Player var3 = client.localPlayers[var1[var2]];
         if (null != var3 && var3.overheadTextCyclesRemaining > 0) {
            --var3.overheadTextCyclesRemaining;
            if (var3.overheadTextCyclesRemaining == 0) {
               var3.overheadText = null;
            }
         }
      }

      for(var2 = 0; var2 < client.npcCount; ++var2) {
         int var5 = client.npcIndexes[var2];
         Npc var4 = client.npcs[var5];
         if (null != var4 && var4.overheadTextCyclesRemaining > 0) {
            --var4.overheadTextCyclesRemaining;
            if (0 == var4.overheadTextCyclesRemaining) {
               var4.overheadText = null;
            }
         }
      }

   }

   static void method2105() {
      for(InterfaceParent var1 = (InterfaceParent)client.interfaceParents.method5736(); var1 != null; var1 = (InterfaceParent)client.interfaceParents.method5739()) {
         int var2 = var1.field950;
         if (class251.method4294(var2)) {
            boolean var3 = true;
            Interface[] var4 = Interface.components[var2];

            int var5;
            for(var5 = 0; var5 < var4.length; ++var5) {
               if (null != var4[var5]) {
                  var3 = var4[var5].field2993;
                  break;
               }
            }

            if (!var3) {
               var5 = (int)var1.field3966;
               Interface var6 = class87.getComponent(var5);
               if (null != var6) {
                  class81.invalidateComponent(var6);
               }
            }
         }
      }

   }

   static final void method2107() {
      for(int var1 = 0; var1 < PlayerList.localPlayerCount; ++var1) {
         Player var2 = client.localPlayers[PlayerList.localPlayerIndexes[var1]];
         var2.method1702();
      }

      MouseHandler.method306();
      if (class69.field972 != null) {
         class69.field972.method5107();
      }

   }
}
