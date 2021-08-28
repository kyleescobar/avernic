public class class49 {
   int field714 = 0;
   final class367 field711;
   public final class317 field713;
   public final class319 field712;

   public static class140 method1383(int var0) {
      class140 var2 = (class140)class140.field1526.method3880((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class140.field1529.method4412(16, var0);
         var2 = new class140();
         if (null != var3) {
            var2.method2347(new Buffer(var3));
         }

         class140.field1526.method3882(var2, (long)var0);
         return var2;
      }
   }

   class49(class367 var1) {
      this.field711 = var1;
      this.field712 = new class319(var1);
      this.field713 = new class317(var1);
   }

   public static void method1341(class277 var0) {
      class152.field1692 = var0;
   }

   boolean method1362() {
      return 2 == this.field714;
   }

   final void method1329() {
      this.field714 = 1;
   }

   final void method1319(Buffer var1, int var2) {
      this.field712.method5091(var1, var2);
      this.field714 = 2;
      class108.method2107();
   }

   final void method1322() {
      for(class322 var2 = (class322)this.field712.field3830.method4797(); var2 != null; var2 = (class322)this.field712.field3830.method4798()) {
         if ((long)var2.field3847 < class87.method1989() / 1000L - 5L) {
            if (var2.field3846 > 0) {
               class121.addGameMessage(5, "", var2.field3844 + class270.field3372);
            }

            if (var2.field3846 == 0) {
               class121.addGameMessage(5, "", var2.field3844 + class270.field3378);
            }

            var2.method5432();
         }
      }

   }

   final void method1323() {
      this.field714 = 0;
      this.field712.method5185();
      this.field713.method5185();
   }

   final boolean method1324(class406 var1, boolean var2) {
      if (null == var1) {
         return false;
      } else if (var1.equals(MouseHandler.localPlayer.username)) {
         return true;
      } else {
         return this.field712.method5094(var1, var2);
      }
   }

   final boolean method1325(class406 var1) {
      if (null == var1) {
         return false;
      } else {
         return this.field713.method5210(var1);
      }
   }

   final void method1326(String var1) {
      if (null != var1) {
         class406 var3 = new class406(var1, this.field711);
         if (var3.method6523()) {
            if (this.method1337()) {
               class159.method2805();
            } else if (MouseHandler.localPlayer.username.equals(var3)) {
               MouseHandler.method326(class270.field3400);
            } else if (this.method1324(var3, false)) {
               MouseHandler.method326(var1 + class270.field3397);
            } else if (this.method1325(var3)) {
               MouseHandler.method326(class270.field3402 + var1 + class270.field3403);
            } else {
               PacketBufferNode var4 = class149.getPacketBufferNode(ClientPacket.field2565, client.packetWriter.isaacCipher);
               var4.packetBuffer.writeByte(class281.method4532(var1));
               var4.packetBuffer.writeStringCP1252(var1);
               client.packetWriter.addNode(var4);
            }
         }
      }
   }

   final boolean method1337() {
      return this.field712.method5253() || this.field712.method5200() >= 200 && 1 != client.isMember;
   }

   final void method1384(String var1) {
      if (null != var1) {
         class406 var3 = new class406(var1, this.field711);
         if (var3.method6523()) {
            if (this.method1328()) {
               class316.method5079();
            } else if (MouseHandler.localPlayer.username.equals(var3)) {
               class271.method4360();
            } else if (this.method1325(var3)) {
               MouseHandler.method326(var1 + class270.field3399);
            } else if (this.method1324(var3, false)) {
               MouseHandler.method326(class270.field3404 + var1 + class270.field3509);
            } else {
               class377.method5860(var1);
            }
         }
      }
   }

   final boolean method1328() {
      return this.field713.method5253() || this.field713.method5200() >= 100 && 1 != client.isMember;
   }

   final void method1330(String var1) {
      if (var1 != null) {
         class406 var3 = new class406(var1, this.field711);
         if (var3.method6523()) {
            if (this.field712.method5192(var3)) {
               client.field610 = client.field593;
               PacketBufferNode var4 = class149.getPacketBufferNode(ClientPacket.field2637, client.packetWriter.isaacCipher);
               var4.packetBuffer.writeByte(class281.method4532(var1));
               var4.packetBuffer.writeStringCP1252(var1);
               client.packetWriter.addNode(var4);
            }

            class108.method2107();
         }
      }
   }

   final void method1370(String var1) {
      if (null != var1) {
         class406 var3 = new class406(var1, this.field711);
         if (var3.method6523()) {
            if (this.field713.method5192(var3)) {
               class125.method2249();
               PacketBufferNode var4 = class149.getPacketBufferNode(ClientPacket.field2579, client.packetWriter.isaacCipher);
               var4.packetBuffer.writeByte(class281.method4532(var1));
               var4.packetBuffer.writeStringCP1252(var1);
               client.packetWriter.addNode(var4);
            }

            class253.method4302();
         }
      }
   }

   final boolean method1318(class406 var1) {
      class321 var3 = (class321)this.field712.method5189(var1);
      return var3 != null && var3.method5276();
   }

   static final void method1382(int var0, int var1) {
      class296 var3 = client.field536[class285.plane][var0][var1];
      if (var3 == null) {
         class166.field1925.method3518(class285.plane, var0, var1);
      } else {
         long var4 = -99999999L;
         class82 var6 = null;

         class82 var7;
         for(var7 = (class82)var3.method4687(); var7 != null; var7 = (class82)var3.method4678()) {
            class157 var8 = KeyHandler.method93(var7.field1167);
            long var9 = (long)var8.field1807;
            if (1 == var8.field1806) {
               var9 *= (long)(1 + var7.field1164);
            }

            if (var9 > var4) {
               var4 = var9;
               var6 = var7;
            }
         }

         if (null == var6) {
            class166.field1925.method3518(class285.plane, var0, var1);
         } else {
            var3.method4673(var6);
            class82 var12 = null;
            class82 var13 = null;

            for(var7 = (class82)var3.method4687(); var7 != null; var7 = (class82)var3.method4678()) {
               if (var7.field1167 != var6.field1167) {
                  if (null == var12) {
                     var12 = var7;
                  }

                  if (var7.field1167 != var12.field1167 && var13 == null) {
                     var13 = var7;
                  }
               }
            }

            long var10 = class172.method3133(var0, var1, 3, false, 0);
            class166.field1925.method3504(class285.plane, var0, var1, class123.method2216(64 + 128 * var0, 64 + var1 * 128, class285.plane), var6, var10, var12, var13);
         }
      }
   }
}
