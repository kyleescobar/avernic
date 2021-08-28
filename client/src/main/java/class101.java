public class class101 extends class104 {
   static boolean[] field1282;
   int field1278;
   int field1279;
   int field1280;
   int field1281;
   // $FF: synthetic field
   final class107 this$0;

   public static class139 method2078(int var0) {
      class139 var2 = (class139)class139.field1522.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class139.field1525.method4412(5, var0);
         var2 = new class139();
         if (var3 != null) {
            var2.method2336(new Buffer(var3));
         }

         class139.field1522.method3882(var2, (long)var0);
         return var2;
      }
   }

   public static void method2077(int var0, int var1) {
      class152 var4 = (class152)class152.field1689.method3880((long)var0);
      class152 var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = class152.field1692.method4412(14, var0);
         var4 = new class152();
         if (var5 != null) {
            var4.method2534(new Buffer(var5));
         }

         class152.field1689.method3882(var4, (long)var0);
         var3 = var4;
      }

      int var9 = var3.field1690;
      int var6 = var3.field1695;
      int var7 = var3.field1688;
      int var8 = class244.field2917[var7 - var6];
      if (var1 < 0 || var1 > var8) {
         var1 = 0;
      }

      var8 <<= var6;
      class244.field2911[var9] = class244.field2911[var9] & ~var8 | var1 << var6 & var8;
   }

   class101(class107 var1) {
      this.this$0 = var1;
      this.field1279 = -1;
   }

   void method2083(Buffer var1) {
      this.field1279 = var1.readUnsignedShort();
      this.field1280 = var1.readInt();
      this.field1278 = var1.readUnsignedByte();
      this.field1281 = var1.readUnsignedByte();
   }

   void method2084(class115 var1) {
      var1.method2132(this.field1279, this.field1280, this.field1278, this.field1281);
   }

   static final void method2075(boolean var0, PacketBuffer var1) {
      while(true) {
         if (var1.method5901(client.packetWriter.serverPacketLength) >= 27) {
            int var3 = var1.readBits(15);
            if (32767 != var3) {
               boolean var4 = false;
               if (null == client.field567[var3]) {
                  client.field567[var3] = new class78();
                  var4 = true;
               }

               class78 var5 = client.field567[var3];
               client.field450[++client.field685 - 1] = var3;
               var5.field1070 = client.field452;
               int var9 = var1.readBits(1);
               if (var9 == 1) {
                  client.field475[++client.field501 - 1] = var3;
               }

               int var10 = client.field534[var1.readBits(3)];
               if (var4) {
                  var5.orientation = var5.field1022 = var10;
               }

               int var7;
               if (var0) {
                  var7 = var1.readBits(8);
                  if (var7 > 127) {
                     var7 -= 256;
                  }
               } else {
                  var7 = var1.readBits(5);
                  if (var7 > 15) {
                     var7 -= 32;
                  }
               }

               int var8;
               if (var0) {
                  var8 = var1.readBits(8);
                  if (var8 > 127) {
                     var8 -= 256;
                  }
               } else {
                  var8 = var1.readBits(5);
                  if (var8 > 15) {
                     var8 -= 32;
                  }
               }

               boolean var11 = var1.readBits(1) == 1;
               if (var11) {
                  var1.readBits(32);
               }

               var5.field1132 = class97.method2065(var1.readBits(14));
               int var6 = var1.readBits(1);
               var5.field1024 = var5.field1132.field1622;
               var5.field1075 = var5.field1132.field1645;
               if (var5.field1075 == 0) {
                  var5.field1022 = 0;
               }

               var5.field1029 = var5.field1132.field1628;
               var5.field1072 = var5.field1132.field1629;
               var5.field1046 = var5.field1132.field1630;
               var5.field1021 = var5.field1132.field1631;
               var5.field1030 = var5.field1132.field1625;
               var5.field1052 = var5.field1132.field1626;
               var5.field1020 = var5.field1132.field1624;
               var5.method1833(var7 + MouseHandler.localPlayer.pathX[0], MouseHandler.localPlayer.pathY[0] + var8, var6 == 1);
               continue;
            }
         }

         var1.switchToByteMode();
         return;
      }
   }

   static final void method2076(int var0, int var1, int var2, int var3, int var4) {
      class45.field386[0].method6349(var0, var1);
      class45.field386[1].method6349(var0, var3 + var1 - 16);
      class394.method6265(var0, var1 + 16, 16, var3 - 32, client.field470);
      int var6 = (var3 - 32) * var3 / var4;
      if (var6 < 8) {
         var6 = 8;
      }

      int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
      class394.method6265(var0, var7 + var1 + 16, 16, var6, client.field471);
      class394.method6317(var0, var7 + 16 + var1, var6, client.field633);
      class394.method6317(1 + var0, var1 + 16 + var7, var6, client.field633);
      class394.method6271(var0, var7 + var1 + 16, 16, client.field633);
      class394.method6271(var0, var7 + var1 + 17, 16, client.field633);
      class394.method6317(var0 + 15, var1 + 16 + var7, var6, client.field472);
      class394.method6317(14 + var0, var1 + 17 + var7, var6 - 1, client.field472);
      class394.method6271(var0, var7 + 15 + var1 + var6, 16, client.field472);
      class394.method6271(var0 + 1, var6 + 14 + var1 + var7, 15, client.field472);
   }
}
