public class class80 {
   int field1147;
   int field1148;
   int field1149;
   int field1150;

   class80(int var1, int var2, int var3, int var4) {
      this.field1148 = var1;
      this.field1150 = var2;
      this.field1149 = var3;
      this.field1147 = var4;
   }

   int method1860() {
      return this.field1148;
   }

   int method1847() {
      return this.field1150;
   }

   int method1851() {
      return this.field1149;
   }

   int method1854() {
      return this.field1147;
   }

   public static int method1861(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }

   static final void updatePlayers(PacketBuffer buf, int length) {
      int var3 = buf.offset;
      PlayerList.pendingUpdateCount = 0;
      class62.processPlayerUpdateGpi(buf);

      for(int i = 0; i < PlayerList.pendingUpdateCount; ++i) {
         int playerIndex = PlayerList.pendingUpdateIndexes[i];
         Player player = client.localPlayers[playerIndex];
         int updateMask = buf.readUnsignedByte();
         if ((updateMask & 32) != 0) {
            updateMask += buf.readUnsignedByte() << 8;
         }

         class167.processPlayerUpdateFlags(buf, playerIndex, player, updateMask);
      }

      if (buf.offset - var3 != length) {
         throw new RuntimeException(buf.offset - var3 + " " + length);
      }
   }

   static int method1848(int var0, class59 var1, boolean var2) {
      if (var0 < 1000) {
         return class256.method4323(var0, var1, var2);
      } else if (var0 < 1100) {
         return class293.method4650(var0, var1, var2);
      } else if (var0 < 1200) {
         return class84.method1901(var0, var1, var2);
      } else if (var0 < 1300) {
         return class65.method1668(var0, var1, var2);
      } else if (var0 < 1400) {
         return class361.method5702(var0, var1, var2);
      } else if (var0 < 1500) {
         return class139.method2339(var0, var1, var2);
      } else if (var0 < 1600) {
         return class81.method1863(var0, var1, var2);
      } else if (var0 < 1700) {
         return class7.method34(var0, var1, var2);
      } else if (var0 < 1800) {
         return class268.method4357(var0, var1, var2);
      } else if (var0 < 1900) {
         return class214.method3846(var0, var1, var2);
      } else if (var0 < 2000) {
         return class215.method3850(var0, var1, var2);
      } else if (var0 < 2100) {
         return class293.method4650(var0, var1, var2);
      } else if (var0 < 2200) {
         return class84.method1901(var0, var1, var2);
      } else if (var0 < 2300) {
         return class65.method1668(var0, var1, var2);
      } else if (var0 < 2400) {
         return class361.method5702(var0, var1, var2);
      } else if (var0 < 2500) {
         return class139.method2339(var0, var1, var2);
      } else if (var0 < 2600) {
         return class148.method2484(var0, var1, var2);
      } else if (var0 < 2700) {
         return class273.method4367(var0, var1, var2);
      } else if (var0 < 2800) {
         return class328.method5277(var0, var1, var2);
      } else if (var0 < 2900) {
         return class361.method5701(var0, var1, var2);
      } else if (var0 < 3000) {
         return class215.method3850(var0, var1, var2);
      } else if (var0 < 3200) {
         return class72.method1764(var0, var1, var2);
      } else if (var0 < 3300) {
         return class123.method2217(var0, var1, var2);
      } else if (var0 < 3400) {
         return class13.method109(var0, var1, var2);
      } else if (var0 < 3500) {
         return class247.method4214(var0, var1, var2);
      } else if (var0 < 3600) {
         return class144.method2446(var0, var1, var2);
      } else if (var0 < 3700) {
         return class285.method4562(var0, var1, var2);
      } else if (var0 < 3800) {
         return class8.method43(var0, var1, var2);
      } else if (var0 < 3900) {
         return class99.method2071(var0, var1, var2);
      } else if (var0 < 4000) {
         return class159.method2803(var0, var1, var2);
      } else if (var0 < 4100) {
         return class235.method3956(var0, var1, var2);
      } else if (var0 < 4200) {
         return class120.method2200(var0, var1, var2);
      } else if (var0 < 4300) {
         return class210.method3832(var0, var1, var2);
      } else if (var0 < 5100) {
         return class126.method2252(var0, var1, var2);
      } else if (var0 < 5400) {
         return class48.method1293(var0, var1, var2);
      } else if (var0 < 5600) {
         return class360.method5693(var0, var1, var2);
      } else if (var0 < 5700) {
         return class54.method1543(var0, var1, var2);
      } else if (var0 < 6300) {
         return class157.method2733(var0, var1, var2);
      } else if (var0 < 6600) {
         return class48.method1309(var0, var1, var2);
      } else if (var0 < 6700) {
         return class167.method2883(var0, var1, var2);
      } else if (var0 < 6800) {
         return class111.method2113(var0, var1, var2);
      } else if (var0 < 6900) {
         return class336.method5365(var0, var1, var2);
      } else if (var0 < 7000) {
         return class69.method1694(var0, var1, var2);
      } else if (var0 < 7100) {
         return class133.method2298(var0, var1, var2);
      } else if (var0 < 7200) {
         return class178.method3184(var0, var1, var2);
      } else {
         return var0 < 7300 ? class163.method2861(var0, var1, var2) : 2;
      }
   }

   static boolean method1850() {
      return client.field555 || KeyHandler.pressedKeys[81];
   }
}
