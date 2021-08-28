public final class Player extends class72 {
   boolean field1004;
   boolean field995;
   boolean field998;
   class207 field981;
   class247 field979;
   class329 field1001;
   class329 field1002;
   class329 field1003;
   class406 username;
   int index;
   int tileX;
   int tileY;
   int field1007;
   int field978;
   int field983;
   int field984;
   int field985;
   int field986;
   int field987;
   int field989;
   int field990;
   int field991;
   int prayerHeadIcon = -1;
   int field993;
   int field994;
   int skullHeadIcon = -1;
   int field997;
   int plane;
   String[] actions = new String[3];

   Player() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.actions[var1] = "";
      }

      this.field991 = 0;
      this.field1007 = 0;
      this.field986 = 0;
      this.field987 = 0;
      this.field995 = false;
      this.field997 = 0;
      this.field998 = false;
      this.field1001 = class329.field3874;
      this.field1002 = class329.field3874;
      this.field1003 = class329.field3874;
      this.field1004 = false;
   }

   final void decodePlayerAppearance(Buffer buf) {
      buf.offset = 0;
      int gender = buf.readUnsignedByte();
      this.skullHeadIcon = buf.readByte();
      this.prayerHeadIcon = buf.readByte();
      int var4 = -1;
      this.field997 = 0;
      int[] var5 = new int[12];

      int var7;
      int var8;
      int var9;
      for(int var6 = 0; var6 < 12; ++var6) {
         var7 = buf.readUnsignedByte();
         if (0 == var7) {
            var5[var6] = 0;
         } else {
            var8 = buf.readUnsignedByte();
            var5[var6] = (var7 << 8) + var8;
            if (0 == var6 && var5[0] == 65535) {
               var4 = buf.readUnsignedShort();
               break;
            }

            if (var5[var6] >= 512) {
               var9 = KeyHandler.method93(var5[var6] - 512).field1833;
               if (0 != var9) {
                  this.field997 = var9;
               }
            }
         }
      }

      int[] var25 = new int[5];

      for(var7 = 0; var7 < 5; ++var7) {
         var8 = buf.readUnsignedByte();
         if (var8 < 0 || var8 >= class244.field2915[var7].length) {
            var8 = 0;
         }

         var25[var7] = var8;
      }

      super.field1030 = buf.readUnsignedShort();
      if (super.field1030 == 65535) {
         super.field1030 = -1;
      }

      super.field1052 = buf.readUnsignedShort();
      if (65535 == super.field1052) {
         super.field1052 = -1;
      }

      super.field1020 = super.field1052;
      super.field1029 = buf.readUnsignedShort();
      if (65535 == super.field1029) {
         super.field1029 = -1;
      }

      super.field1072 = buf.readUnsignedShort();
      if (super.field1072 == 65535) {
         super.field1072 = -1;
      }

      super.field1046 = buf.readUnsignedShort();
      if (65535 == super.field1046) {
         super.field1046 = -1;
      }

      super.field1021 = buf.readUnsignedShort();
      if (65535 == super.field1021) {
         super.field1021 = -1;
      }

      super.field1033 = buf.readUnsignedShort();
      if (65535 == super.field1033) {
         super.field1033 = -1;
      }

      this.username = new class406(buf.readStringNullTerminated(), class52.field761);
      this.method1702();
      this.method1705();
      this.method1708();
      if (this == MouseHandler.localPlayer) {
         class409.field4316 = this.username.getName();
      }

      this.field991 = buf.readUnsignedByte();
      this.field1007 = buf.readUnsignedShort();
      this.field998 = buf.readUnsignedByte() == 1;
      if (client.field407 == 0 && client.privilegeLevel >= 2) {
         this.field998 = false;
      }

      class138[] var26 = null;
      boolean var27 = false;
      if (buf.offset < buf.payload.length) {
         var9 = buf.readUnsignedShort();
         var27 = (var9 >> 15 & 1) == 1;
         if (var9 > 0 && 32768 != var9) {
            var26 = new class138[12];

            for(int var10 = 0; var10 < 12; ++var10) {
               int var11 = var9 >> 12 - var10 & 1;
               if (1 == var11) {
                  int var15 = var5[var10] - 512;
                  int var16 = buf.readUnsignedByte();
                  boolean var17 = (var16 & 1) != 0;
                  boolean var18 = (var16 & 2) != 0;
                  class138 var19 = new class138(var15);
                  int var20;
                  int[] var21;
                  boolean var22;
                  int var23;
                  short var24;
                  if (var17) {
                     var20 = buf.readUnsignedByte();
                     var21 = new int[]{var20 & 15, var20 >> 4 & 15};
                     var22 = null != var19.field1516 && var21.length == var19.field1516.length;

                     for(var23 = 0; var23 < 2; ++var23) {
                        if (15 != var21[var23]) {
                           var24 = (short)buf.readUnsignedShort();
                           if (var22) {
                              var19.field1516[var21[var23]] = var24;
                           }
                        }
                     }
                  }

                  if (var18) {
                     var20 = buf.readUnsignedByte();
                     var21 = new int[]{var20 & 15, var20 >> 4 & 15};
                     var22 = null != var19.field1519 && var21.length == var19.field1519.length;

                     for(var23 = 0; var23 < 2; ++var23) {
                        if (var21[var23] != 15) {
                           var24 = (short)buf.readUnsignedShort();
                           if (var22) {
                              var19.field1519[var21[var23]] = var24;
                           }
                        }
                     }
                  }

                  var26[var10] = var19;
               }
            }
         }
      }

      if (this.field979 == null) {
         this.field979 = new class247();
      }

      this.field979.method4177(var5, var26, var27, var25, 1 == gender, var4);
   }

   boolean method1701() {
      if (this.field1001 == class329.field3874) {
         this.method1736();
      }

      return this.field1001 == class329.field3872;
   }

   void method1702() {
      this.field1001 = class329.field3874;
   }

   void method1736() {
      this.field1001 = class13.field80.method1318(this.username) ? class329.field3872 : class329.field3873;
   }

   boolean method1704() {
      if (class329.field3874 == this.field1002) {
         this.method1706();
      }

      return class329.field3872 == this.field1002;
   }

   void method1705() {
      this.field1002 = class329.field3874;
   }

   void method1706() {
      this.field1002 = null != class69.field972 && class69.field972.method5210(this.username) ? class329.field3872 : class329.field3873;
   }

   void method1707() {
      this.field1003 = null != client.field637[0] && client.field637[0].method2120(this.username.getName()) != -1 ? class329.field3872 : class329.field3873;
   }

   void method1708() {
      this.field1003 = class329.field3874;
   }

   boolean method1709() {
      if (class329.field3874 == this.field1003) {
         this.method1707();
      }

      return this.field1003 == class329.field3872;
   }

   int getTransformedSize() {
      return this.field979 != null && this.field979.field2937 != -1 ? class97.method2065(this.field979.field2937).field1622 : 1;
   }

   protected final class207 method3687() {
      if (this.field979 == null) {
         return null;
      } else {
         class159 var2 = super.sequence != -1 && super.field1056 == 0 ? class48.method1312(super.sequence) : null;
         class159 var3 = -1 == super.field1050 || this.field995 || super.field1050 == super.field1030 && null != var2 ? null : class48.method1312(super.field1050);
         class207 var4 = this.field979.method4201(var2, super.field1054, var3, super.field1042);
         if (var4 == null) {
            return null;
         } else {
            var4.method3721();
            super.field1071 = var4.field2346;
            class207 var5;
            class207[] var6;
            if (!this.field995 && -1 != super.spotAnimation && -1 != super.field1028) {
               var5 = class25.method403(super.spotAnimation).method2498(super.field1028);
               if (null != var5) {
                  var5.method3731(0, -super.field1062, 0);
                  var6 = new class207[]{var4, var5};
                  var4 = new class207(var6, 2);
               }
            }

            if (!this.field995 && this.field981 != null) {
               if (client.field452 >= this.field987) {
                  this.field981 = null;
               }

               if (client.field452 >= this.field986 && client.field452 < this.field987) {
                  var5 = this.field981;
                  var5.method3731(this.field983 - super.x, this.field984 - this.field985, this.field990 - super.y);
                  if (512 == super.orientation) {
                     var5.method3744();
                     var5.method3744();
                     var5.method3744();
                  } else if (1024 == super.orientation) {
                     var5.method3744();
                     var5.method3744();
                  } else if (1536 == super.orientation) {
                     var5.method3744();
                  }

                  var6 = new class207[]{var4, var5};
                  var4 = new class207(var6, 2);
                  if (512 == super.orientation) {
                     var5.method3744();
                  } else if (super.orientation == 1024) {
                     var5.method3744();
                     var5.method3744();
                  } else if (super.orientation == 1536) {
                     var5.method3744();
                     var5.method3744();
                     var5.method3744();
                  }

                  var5.method3731(super.x - this.field983, this.field985 - this.field984, super.y - this.field990);
               }
            }

            var4.field2430 = true;
            return var4;
         }
      }
   }

   final void pathfindClientSideApproximate(int tileX, int tileY, byte var3) {
      if (super.sequence != -1 && class48.method1312(super.sequence).field1860 == 1) {
         super.sequence = -1;
      }

      super.field1049 = -1;
      if (tileX >= 0 && tileX < 104 && tileY >= 0 && tileY < 104) {
         if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
            if (var3 == 2) {
               Player currentPlayer = this;
               int var6 = super.pathX[0];
               int var7 = super.pathY[0];
               int var8 = this.getTransformedSize();
               if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && tileX >= var8 && tileX < 104 - var8 && tileY >= var8 && tileY < 104 - var8) {
                  int var11 = this.getTransformedSize();
                  client.field494.field1894 = tileX;
                  client.field494.field1892 = tileY;
                  client.field494.field1893 = 1;
                  client.field494.field1891 = 1;
                  ApproximateRouteStrategy pathRoute = client.field494;
                  int var13 = class124.method2218(var6, var7, var11, pathRoute, client.field465[this.plane], true, client.field684, client.field666);
                  if (var13 >= 1) {
                     for(int var14 = 0; var14 < var13 - 1; ++var14) {
                        currentPlayer.method1712(client.field684[var14], client.field666[var14], (byte)2);
                     }
                  }
               }
            }

            this.method1712(tileX, tileY, var3);
         } else {
            this.resetPath(tileX, tileY);
         }
      } else {
         this.resetPath(tileX, tileY);
      }

   }

   void resetPath(int var1, int var2) {
      super.pathLength = 0;
      super.field1067 = 0;
      super.field1079 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      int var4 = this.getTransformedSize();
      super.x = 128 * super.pathX[0] + var4 * 64;
      super.y = 64 * var4 + super.pathY[0] * 128;
   }

   final void method1712(int var1, int var2, byte var3) {
      if (super.pathLength < 9) {
         ++super.pathLength;
      }

      for(int var5 = super.pathLength; var5 > 0; --var5) {
         super.pathX[var5] = super.pathX[var5 - 1];
         super.pathY[var5] = super.pathY[var5 - 1];
         super.field1031[var5] = super.field1031[var5 - 1];
      }

      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.field1031[0] = var3;
   }

   final boolean method1748() {
      return null != this.field979;
   }

   static String method1714(String var0, Interface var1) {
      if (var0.indexOf("%") != -1) {
         for(int var3 = 1; var3 <= 5; ++var3) {
            while(true) {
               int var4 = var0.indexOf("%" + var3);
               if (var4 == -1) {
                  break;
               }

               var0 = var0.substring(0, var4) + KeyHandler.method71(class131.method2294(var1, var3 - 1)) + var0.substring(var4 + 2);
            }
         }
      }

      return var0;
   }
}
