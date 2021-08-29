import java.io.IOException;

public class class238 extends class354 {
   byte[] field2868 = new byte[128];
   byte[] field2873 = new byte[128];
   byte[] field2874 = new byte[128];
   class234[] field2872 = new class234[128];
   class23[] field2870 = new class23[128];
   int field2871;
   int[] field2875 = new int[128];
   short[] field2869 = new short[128];

   class238(byte[] var1) {
      Buffer var2 = new Buffer(var1);

      int var3;
      for(var3 = 0; 0 != var2.payload[var2.offset + var3]; ++var3) {
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.readByte();
      }

      ++var2.offset;
      ++var3;
      var5 = var2.offset;
      var2.offset += var3;

      int var6;
      for(var6 = 0; 0 != var2.payload[var2.offset + var6]; ++var6) {
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var2.readByte();
      }

      ++var2.offset;
      ++var6;
      var8 = var2.offset;
      var2.offset += var6;

      int var9;
      for(var9 = 0; var2.payload[var2.offset + var9] != 0; ++var9) {
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.readByte();
      }

      ++var2.offset;
      ++var9;
      byte[] var36 = new byte[var9];
      int var12;
      int var14;
      if (var9 > 1) {
         var36[1] = 1;
         int var13 = 1;
         var12 = 2;

         for(var14 = 2; var14 < var9; ++var14) {
            int var15 = var2.readUnsignedByte();
            if (0 == var15) {
               var13 = var12++;
            } else {
               if (var15 <= var13) {
                  --var15;
               }

               var13 = var15;
            }

            var36[var14] = (byte)var13;
         }
      } else {
         var12 = var9;
      }

      class234[] var37 = new class234[var12];

      class234 var38;
      for(var14 = 0; var14 < var37.length; ++var14) {
         var38 = var37[var14] = new class234();
         int var16 = var2.readUnsignedByte();
         if (var16 > 0) {
            var38.field2809 = new byte[2 * var16];
         }

         var16 = var2.readUnsignedByte();
         if (var16 > 0) {
            var38.field2812 = new byte[2 + var16 * 2];
            var38.field2812[1] = 64;
         }
      }

      var14 = var2.readUnsignedByte();
      byte[] var39 = var14 > 0 ? new byte[2 * var14] : null;
      var14 = var2.readUnsignedByte();
      byte[] var40 = var14 > 0 ? new byte[2 * var14] : null;

      int var17;
      for(var17 = 0; 0 != var2.payload[var17 + var2.offset]; ++var17) {
      }

      byte[] var18 = new byte[var17];

      int var19;
      for(var19 = 0; var19 < var17; ++var19) {
         var18[var19] = var2.readByte();
      }

      ++var2.offset;
      ++var17;
      var19 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.readUnsignedByte();
         this.field2869[var20] = (short)var19;
      }

      var19 = 0;

      short[] var48;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.readUnsignedByte();
         var48 = this.field2869;
         var48[var20] = (short)(var48[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for(var23 = 0; var23 < 128; ++var23) {
         if (0 == var20) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            var22 = var2.method5966();
         }

         var48 = this.field2869;
         var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
         this.field2875[var23] = var22;
         --var20;
      }

      var20 = 0;
      var21 = 0;
      var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if (0 != this.field2875[var24]) {
            if (var20 == 0) {
               if (var21 < var4.length) {
                  var20 = var4[var21++];
               } else {
                  var20 = -1;
               }

               var23 = var2.payload[var5++] - 1;
            }

            this.field2873[var24] = (byte)var23;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var24 = 0;

      for(int var25 = 0; var25 < 128; ++var25) {
         if (0 != this.field2875[var25]) {
            if (0 == var20) {
               if (var21 < var7.length) {
                  var20 = var7[var21++];
               } else {
                  var20 = -1;
               }

               var24 = var2.payload[var8++] + 16 << 2;
            }

            this.field2868[var25] = (byte)var24;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      class234 var42 = null;

      int var26;
      for(var26 = 0; var26 < 128; ++var26) {
         if (this.field2875[var26] != 0) {
            if (0 == var20) {
               var42 = var37[var36[var21]];
               if (var21 < var10.length) {
                  var20 = var10[var21++];
               } else {
                  var20 = -1;
               }
            }

            this.field2872[var26] = var42;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var26 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if (var20 == 0) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            if (this.field2875[var27] > 0) {
               var26 = var2.readUnsignedByte() + 1;
            }
         }

         this.field2874[var27] = (byte)var26;
         --var20;
      }

      this.field2871 = var2.readUnsignedByte() + 1;

      class234 var28;
      int var29;
      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (null != var28.field2809) {
            for(var29 = 1; var29 < var28.field2809.length; var29 += 2) {
               var28.field2809[var29] = var2.readByte();
            }
         }

         if (null != var28.field2812) {
            for(var29 = 3; var29 < var28.field2812.length - 2; var29 += 2) {
               var28.field2812[var29] = var2.readByte();
            }
         }
      }

      if (null != var39) {
         for(var27 = 1; var27 < var39.length; var27 += 2) {
            var39[var27] = var2.readByte();
         }
      }

      if (null != var40) {
         for(var27 = 1; var27 < var40.length; var27 += 2) {
            var40[var27] = var2.readByte();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (null != var28.field2812) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field2812.length; var29 += 2) {
               var19 = 1 + var19 + var2.readUnsignedByte();
               var28.field2812[var29] = (byte)var19;
            }
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field2809 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field2809.length; var29 += 2) {
               var19 = var19 + 1 + var2.readUnsignedByte();
               var28.field2809[var29] = (byte)var19;
            }
         }
      }

      byte var30;
      int var32;
      int var33;
      int var34;
      int var45;
      byte var47;
      if (null != var39) {
         var19 = var2.readUnsignedByte();
         var39[0] = (byte)var19;

         for(var27 = 2; var27 < var39.length; var27 += 2) {
            var19 = var19 + 1 + var2.readUnsignedByte();
            var39[var27] = (byte)var19;
         }

         var47 = var39[0];
         byte var43 = var39[1];

         for(var29 = 0; var29 < var47; ++var29) {
            this.field2874[var29] = (byte)(this.field2874[var29] * var43 + 32 >> 6);
         }

         for(var29 = 2; var29 < var39.length; var29 += 2) {
            var30 = var39[var29];
            byte var31 = var39[1 + var29];
            var32 = (var30 - var47) / 2 + (var30 - var47) * var43;

            for(var33 = var47; var33 < var30; ++var33) {
               var34 = class56.method1545(var32, var30 - var47);
               this.field2874[var33] = (byte)(32 + this.field2874[var33] * var34 >> 6);
               var32 += var31 - var43;
            }

            var47 = var30;
            var43 = var31;
         }

         for(var45 = var47; var45 < 128; ++var45) {
            this.field2874[var45] = (byte)(32 + this.field2874[var45] * var43 >> 6);
         }

         var38 = null;
      }

      if (null != var40) {
         var19 = var2.readUnsignedByte();
         var40[0] = (byte)var19;

         for(var27 = 2; var27 < var40.length; var27 += 2) {
            var19 = var19 + 1 + var2.readUnsignedByte();
            var40[var27] = (byte)var19;
         }

         var47 = var40[0];
         int var44 = var40[1] << 1;

         for(var29 = 0; var29 < var47; ++var29) {
            var45 = var44 + (this.field2868[var29] & 255);
            if (var45 < 0) {
               var45 = 0;
            }

            if (var45 > 128) {
               var45 = 128;
            }

            this.field2868[var29] = (byte)var45;
         }

         int var46;
         for(var29 = 2; var29 < var40.length; var29 += 2) {
            var30 = var40[var29];
            var46 = var40[var29 + 1] << 1;
            var32 = (var30 - var47) / 2 + (var30 - var47) * var44;

            for(var33 = var47; var33 < var30; ++var33) {
               var34 = class56.method1545(var32, var30 - var47);
               int var35 = var34 + (this.field2868[var33] & 255);
               if (var35 < 0) {
                  var35 = 0;
               }

               if (var35 > 128) {
                  var35 = 128;
               }

               this.field2868[var33] = (byte)var35;
               var32 += var46 - var44;
            }

            var47 = var30;
            var44 = var46;
         }

         for(var45 = var47; var45 < 128; ++var45) {
            var46 = var44 + (this.field2868[var45] & 255);
            if (var46 < 0) {
               var46 = 0;
            }

            if (var46 > 128) {
               var46 = 128;
            }

            this.field2868[var45] = (byte)var46;
         }

         Object var41 = null;
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var37[var27].field2807 = var2.readUnsignedByte();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field2809 != null) {
            var28.field2808 = var2.readUnsignedByte();
         }

         if (var28.field2812 != null) {
            var28.field2806 = var2.readUnsignedByte();
         }

         if (var28.field2807 > 0) {
            var28.field2810 = var2.readUnsignedByte();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var37[var27].field2811 = var2.readUnsignedByte();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field2811 > 0) {
            var28.field2805 = var2.readUnsignedByte();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field2805 > 0) {
            var28.field2813 = var2.readUnsignedByte();
         }
      }

   }

   static void method4112(class277 var0, class277 var1, boolean var2, int var3) {
      if (class56.field798) {
         if (var3 == 4) {
            class56.field812 = 4;
         }

      } else {
         class56.field812 = var3;
         class394.method6261();
         byte[] var5 = var0.method4432("title.jpg", "");
         class56.field815 = class76.method1810(var5);
         class56.field803 = class56.field815.method6368();
         int var6 = client.field406;
         if (0 != (var6 & 536870912)) {
            class89.field1229 = class118.method2187(var1, "logo_deadman_mode", "");
         } else if (0 != (var6 & 1073741824)) {
            class89.field1229 = class118.method2187(var1, "logo_seasonal_mode", "");
         } else {
            class89.field1229 = class118.method2187(var1, "logo", "");
         }

         class305.field3760 = class118.method2187(var1, "titlebox", "");
         class56.field801 = class118.method2187(var1, "titlebutton", "");
         int var8 = var1.readGroup("runes");
         int var9 = var1.method4430(var8, "");
         class397[] var7 = class133.method2305(var1, var8, var9);
         class56.field797 = var7;
         var9 = var1.readGroup("title_mute");
         int var10 = var1.method4430(var9, "");
         class397[] var13 = class133.method2305(var1, var9, var10);
         class133.field1486 = var13;
         class47.field397 = class118.method2187(var1, "options_radio_buttons,0", "");
         class92.field1240 = class118.method2187(var1, "options_radio_buttons,4", "");
         class173.field2014 = class118.method2187(var1, "options_radio_buttons,2", "");
         class336.field3920 = class118.method2187(var1, "options_radio_buttons,6", "");
         class115.field1387 = class47.field397.field4263;
         class48.field705 = class47.field397.field4264;
         class7.field16 = new class74(class56.field797);
         if (var2) {
            class56.loginUsername = "";
            class56.field818 = "";
         }

         class283.field3640 = 0;
         class147.field1615 = "";
         class56.field821 = true;
         class56.field800 = false;
         if (!class38.clientPreferences.field1114) {
            class150.method2513(2, class109.archive6, "scape main", "", 255, false);
         } else {
            class235.field2819 = 1;
            class235.field2820 = null;
            class235.field2822 = -1;
            class97.field1264 = -1;
            class147.field1612 = 0;
            class146.field1598 = false;
            class124.field1439 = 2;
         }

         if (null != class278.field3614) {
            try {
               Buffer var14 = new Buffer(4);
               var14.writeByte(3);
               var14.writeMedium(0);
               class278.field3614.write(var14.payload, 0, 4);
            } catch (IOException var12) {
               try {
                  class278.field3614.method5279();
               } catch (Exception var11) {
               }

               ++class278.field3605;
               class278.field3614 = null;
            }
         }

         class56.field798 = true;
         class56.field825 = (class69.canvasWidth - 765) / 2;
         class56.field817 = class56.field825 + 202;
         class167.field1932 = class56.field817 + 180;
         class56.field815.method6446(class56.field825, 0);
         class56.field803.method6446(382 + class56.field825, 0);
         class89.field1229.method6349(382 + class56.field825 - class89.field1229.field4263 / 2, 18);
      }
   }

   boolean method4111(class28 var1, byte[] var2, int[] var3) {
      boolean var5 = true;
      int var6 = 0;
      class23 var7 = null;

      for(int var8 = 0; var8 < 128; ++var8) {
         if (null == var2 || 0 != var2[var8]) {
            int var9 = this.field2875[var8];
            if (0 != var9) {
               if (var6 != var9) {
                  var6 = var9--;
                  if (0 == (var9 & 1)) {
                     var7 = var1.method474(var9 >> 2, var3);
                  } else {
                     var7 = var1.method475(var9 >> 2, var3);
                  }

                  if (var7 == null) {
                     var5 = false;
                  }
               }

               if (var7 != null) {
                  this.field2870[var8] = var7;
                  this.field2875[var8] = 0;
               }
            }
         }
      }

      return var5;
   }

   void method4110() {
      this.field2875 = null;
   }

   static int method4117() {
      return client.isResizableMode ? 2 : 1;
   }
}
