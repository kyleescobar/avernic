public abstract class class186 {
   int field2109;
   int field2112;
   public final class245 field2110;
   public final class245 field2111;

   class186(class245 var1, class245 var2) {
      this.field2111 = var1;
      this.field2110 = var2;
   }

   boolean method3206(int var1, int var2) {
      if (this.method3213(var1, var2)) {
         return true;
      } else {
         return this.method3234(var1, var2);
      }
   }

   static final boolean method3237(char var0) {
      if (Character.isISOControl(var0)) {
         return false;
      } else if (class268.method4353(var0)) {
         return true;
      } else {
         char[] var2 = class368.field4125;

         int var3;
         char var4;
         for(var3 = 0; var3 < var2.length; ++var3) {
            var4 = var2[var3];
            if (var0 == var4) {
               return true;
            }
         }

         var2 = class368.field4127;

         for(var3 = 0; var3 < var2.length; ++var3) {
            var4 = var2[var3];
            if (var4 == var0) {
               return true;
            }
         }

         return false;
      }
   }

   boolean method3212() {
      return this.method3208() >= 0;
   }

   boolean method3213(int var1, int var2) {
      if (!this.method3212()) {
         return false;
      } else {
         class141 var4 = class73.method1770(this.method3208());
         int var5 = this.method3227();
         int var6 = this.method3211();
         switch(var4.field1540.field1611) {
         case 0:
            if (var1 < this.field2112 - var5 / 2 || var1 > var5 / 2 + this.field2112) {
               return false;
            }
            break;
         case 1:
            if (var1 >= this.field2112 && var1 < this.field2112 + var5) {
               break;
            }

            return false;
         case 2:
            if (var1 <= this.field2112 - var5 || var1 > this.field2112) {
               return false;
            }
         }

         switch(var4.field1550.field1658) {
         case 0:
            if (var2 < this.field2109 - var6 / 2 || var2 > var6 / 2 + this.field2109) {
               return false;
            }
            break;
         case 1:
            if (var2 <= this.field2109 - var6 || var2 > this.field2109) {
               return false;
            }
            break;
         case 2:
            if (var2 < this.field2109 || var2 >= this.field2109 + var6) {
               return false;
            }
         }

         return true;
      }
   }

   boolean method3234(int var1, int var2) {
      class181 var4 = this.method3209();
      if (var4 == null) {
         return false;
      } else if (var1 >= this.field2112 - var4.field2079 / 2 && var1 <= this.field2112 + var4.field2079 / 2) {
         return var2 >= this.field2109 && var2 <= this.field2109 + var4.field2085;
      } else {
         return false;
      }
   }

   public static void method3242(class277 var0, class277 var1, boolean var2, class302 var3) {
      class27.field217 = var0;
      class340.field3935 = var1;
      class145.field1595 = var2;
      class151.field1687 = class27.field217.method4438(10);
      class64.field928 = var3;
   }

   static class359 method3221() {
      return class25.field202;
   }

   static void method3240() {
      int var12;
      if (client.field411 == 0) {
         class166.field1925 = new Scene(4, 104, 104, class62.field911);

         for(var12 = 0; var12 < 4; ++var12) {
            client.field465[var12] = new class160(104, 104);
         }

         class377.field4167 = new class398(512, 512);
         class56.field807 = class270.field3240;
         class56.field806 = 5;
         client.field411 = 20;
      } else if (client.field411 == 20) {
         class56.field807 = class270.field3241;
         class56.field806 = 10;
         client.field411 = 30;
      } else if (30 == client.field411) {
         class121.archive0 = class92.method2035(0, false, true, true);
         class292.archive1 = class92.method2035(1, false, true, true);
         class192.archive2 = class92.method2035(2, true, false, true);
         class38.archive3 = class92.method2035(3, false, true, true);
         class139.archive4 = class92.method2035(4, false, true, true);
         class199.archive5 = class92.method2035(5, true, true, true);
         class109.archive6 = class92.method2035(6, true, true, true);
         class75.archive7 = class92.method2035(7, false, true, true);
         class271.archive8 = class92.method2035(8, false, true, true);
         class127.archive9 = class92.method2035(9, false, true, true);
         class106.archive10 = class92.method2035(10, false, true, true);
         class340.archive11 = class92.method2035(11, false, true, true);
         ApproximateRouteStrategy.archive12 = class92.method2035(12, false, true, true);
         class124.archive13 = class92.method2035(13, true, false, true);
         class192.archive14 = class92.method2035(14, false, true, true);
         class62.archive15 = class92.method2035(15, false, true, true);
         class19.archive17 = class92.method2035(17, true, true, true);
         class16.archive18 = class92.method2035(18, false, true, true);
         class38.archive19 = class92.method2035(19, false, true, true);
         class323.archive20 = class92.method2035(20, false, true, true);
         class56.field807 = class270.field3437;
         class56.field806 = 20;
         client.field411 = 40;
      } else if (client.field411 != 40) {
         class275 var13;
         class275 var14;
         class275 var16;
         if (45 == client.field411) {
            class64.method1664(22050, !client.isLowDetailMode, 2);
            class236 var23 = new class236();
            var23.method3973(9, 128);
            class179.field2070 = class134.method2307(class19.field101, 0, 22050);
            class179.field2070.method406(var23);
            var13 = class62.archive15;
            var14 = class192.archive14;
            var16 = class139.archive4;
            class235.field2818 = var13;
            class235.field2815 = var14;
            class235.field2817 = var16;
            class235.field2816 = var23;
            class142.field1560 = class134.method2307(class19.field101, 1, 2048);
            class82.field1163 = new class21();
            class142.field1560.method406(class82.field1163);
            class158.field1842 = new class38(22050, class282.field3634);
            class56.field807 = class270.field3245;
            class56.field806 = 35;
            client.field411 = 50;
            ClientPacket.field2602 = new class360(class271.archive8, class124.archive13);
         } else {
            int var2;
            if (50 == client.field411) {
               class361[] var22 = new class361[]{class361.field4086, class361.field4093, class361.field4087, class361.field4085, class361.field4096, class361.field4088};
               var2 = var22.length;
               class360 var15 = ClientPacket.field2602;
               class361[] var20 = new class361[]{class361.field4086, class361.field4093, class361.field4087, class361.field4085, class361.field4096, class361.field4088};
               client.field495 = var15.method5694(var20);
               if (client.field495.size() < var2) {
                  class56.field807 = class270.field3288 + client.field495.size() * 100 / var2 + "%";
                  class56.field806 = 40;
               } else {
                  class47.field398 = (class302)client.field495.get(class361.field4085);
                  class258.field3165 = (class302)client.field495.get(class361.field4093);
                  class130.field1468 = (class302)client.field495.get(class361.field4086);
                  ServerPacket.platformInfo = client.field559.method5463();
                  class56.field807 = class270.field3247;
                  class56.field806 = 40;
                  client.field411 = 60;
               }
            } else {
               int var4;
               if (60 == client.field411) {
                  var13 = class106.archive10;
                  var14 = class271.archive8;
                  var4 = 0;
                  if (var13.method4468("title.jpg", "")) {
                     ++var4;
                  }

                  if (var14.method4468("logo", "")) {
                     ++var4;
                  }

                  if (var14.method4468("logo_deadman_mode", "")) {
                     ++var4;
                  }

                  if (var14.method4468("logo_seasonal_mode", "")) {
                     ++var4;
                  }

                  if (var14.method4468("titlebox", "")) {
                     ++var4;
                  }

                  if (var14.method4468("titlebutton", "")) {
                     ++var4;
                  }

                  if (var14.method4468("runes", "")) {
                     ++var4;
                  }

                  if (var14.method4468("title_mute", "")) {
                     ++var4;
                  }

                  if (var14.method4468("options_radio_buttons,0", "")) {
                     ++var4;
                  }

                  if (var14.method4468("options_radio_buttons,2", "")) {
                     ++var4;
                  }

                  if (var14.method4468("options_radio_buttons,4", "")) {
                     ++var4;
                  }

                  if (var14.method4468("options_radio_buttons,6", "")) {
                     ++var4;
                  }

                  var14.method4468("sl_back", "");
                  var14.method4468("sl_flags", "");
                  var14.method4468("sl_arrows", "");
                  var14.method4468("sl_stars", "");
                  var14.method4468("sl_button", "");
                  byte var18 = 12;
                  if (var4 < var18) {
                     class56.field807 = class270.field3248 + 100 * var4 / var18 + "%";
                     class56.field806 = 50;
                  } else {
                     class56.field807 = class270.field3249;
                     class56.field806 = 50;
                     class17.method128(5);
                     client.field411 = 70;
                  }
               } else if (70 == client.field411) {
                  if (!class192.archive2.method4417()) {
                     class56.field807 = class270.field3420 + class192.archive2.method4385() + "%";
                     class56.field806 = 60;
                  } else {
                     class275 var21 = class192.archive2;
                     class158.field1855 = var21;
                     class57.method1588(class192.archive2);
                     var13 = class192.archive2;
                     var14 = class75.archive7;
                     class143.field1565 = var13;
                     class76.field1120 = var14;
                     class143.field1564 = class143.field1565.method4438(3);
                     class111.method2111(class192.archive2, class75.archive7, client.isLowDetailMode);
                     var16 = class192.archive2;
                     class275 var17 = class75.archive7;
                     class148.field1637 = var16;
                     class148.field1617 = var17;
                     class275 var6 = class192.archive2;
                     class154.field1703 = var6;
                     method3242(class192.archive2, class75.archive7, client.field562, class47.field398);
                     class275 var7 = class192.archive2;
                     class275 var8 = class121.archive0;
                     class275 var9 = class292.archive1;
                     class159.field1875 = var7;
                     class159.field1859 = var8;
                     class159.field1871 = var9;
                     class88.method2005(class192.archive2, class75.archive7);
                     class49.method1341(class192.archive2);
                     class48.method1292(class192.archive2);
                     class138.method2334(class38.archive3, class75.archive7, class271.archive8, class124.archive13);
                     class79.method1840(class192.archive2);
                     class275 var10 = class192.archive2;
                     class146.field1601 = var10;
                     class275 var11 = class192.archive2;
                     class142.field1561 = var11;
                     class331.method5302(class192.archive2);
                     class100.field1272 = new class372(class69.field976, 54, class284.field3644, class192.archive2);
                     class287.field3664 = new class372(class69.field976, 47, class284.field3644, class192.archive2);
                     class38.field311 = new class84();
                     class293.method4655(class192.archive2, class271.archive8, class124.archive13);
                     class293.method4646(class192.archive2, class271.archive8);
                     class371.method5829(class192.archive2, class271.archive8);
                     class56.field807 = class270.field3251;
                     class56.field806 = 60;
                     client.field411 = 80;
                  }
               } else if (client.field411 == 80) {
                  var12 = 0;
                  if (null == class50.field736) {
                     class50.field736 = class208.method3828(class271.archive8, class189.field2122.field3917, 0);
                  } else {
                     ++var12;
                  }

                  if (null == class145.field1594) {
                     class145.field1594 = class208.method3828(class271.archive8, class189.field2122.field3916, 0);
                  } else {
                     ++var12;
                  }

                  if (class276.field3575 == null) {
                     class276.field3575 = class133.method2305(class271.archive8, class189.field2122.field3910, 0);
                  } else {
                     ++var12;
                  }

                  if (null == class89.field1230) {
                     class89.field1230 = class72.method1761(class271.archive8, class189.field2122.field3908, 0);
                  } else {
                     ++var12;
                  }

                  if (class266.field3211 == null) {
                     class266.field3211 = class72.method1761(class271.archive8, class189.field2122.field3911, 0);
                  } else {
                     ++var12;
                  }

                  if (null == class150.field1677) {
                     class150.field1677 = class72.method1761(class271.archive8, class189.field2122.field3913, 0);
                  } else {
                     ++var12;
                  }

                  if (null == class151.field1679) {
                     class151.field1679 = class72.method1761(class271.archive8, class189.field2122.field3909, 0);
                  } else {
                     ++var12;
                  }

                  if (class84.field1190 == null) {
                     class84.field1190 = class72.method1761(class271.archive8, class189.field2122.field3915, 0);
                  } else {
                     ++var12;
                  }

                  if (class127.field1452 == null) {
                     class127.field1452 = class72.method1761(class271.archive8, class189.field2122.field3914, 0);
                  } else {
                     ++var12;
                  }

                  if (null == class45.field386) {
                     class45.field386 = class133.method2305(class271.archive8, class189.field2122.field3912, 0);
                  } else {
                     ++var12;
                  }

                  if (null == class250.field3107) {
                     class250.field3107 = class133.method2305(class271.archive8, class189.field2122.field3918, 0);
                  } else {
                     ++var12;
                  }

                  if (var12 < 11) {
                     class56.field807 = class270.field3259 + var12 * 100 / 12 + "%";
                     class56.field806 = 70;
                  } else {
                     class303.field3741 = class250.field3107;
                     class145.field1594.method6371();
                     var2 = (int)(Math.random() * 21.0D) - 10;
                     int var3 = (int)(Math.random() * 21.0D) - 10;
                     var4 = (int)(Math.random() * 21.0D) - 10;
                     int var5 = (int)(Math.random() * 41.0D) - 20;
                     class276.field3575[0].method6351(var5 + var2, var5 + var3, var4 + var5);
                     class56.field807 = class270.field3253;
                     class56.field806 = 70;
                     client.field411 = 90;
                  }
               } else if (client.field411 == 90) {
                  if (!class127.archive9.method4417()) {
                     class56.field807 = class270.field3254 + "0%";
                     class56.field806 = 90;
                  } else {
                     class180.field2077 = new class205(class127.archive9, class271.archive8, 20, class38.clientPreferences.field1118, client.isLowDetailMode ? 64 : 128);
                     Rasterizer3D.method3419(class180.field2077);
                     Rasterizer3D.method3420(class38.clientPreferences.field1118);
                     client.field411 = 100;
                  }
               } else if (100 == client.field411) {
                  var12 = class180.field2077.method3699();
                  if (var12 < 100) {
                     class56.field807 = class270.field3254 + var12 + "%";
                     class56.field806 = 90;
                  } else {
                     class56.field807 = class270.field3455;
                     class56.field806 = 90;
                     client.field411 = 110;
                  }
               } else if (client.field411 == 110) {
                  class7.field14 = new class69();
                  class19.field101.method2257(class7.field14, 10);
                  class56.field807 = class270.field3256;
                  class56.field806 = 92;
                  client.field411 = 120;
               } else if (120 == client.field411) {
                  if (!class106.archive10.method4468("huffman", "")) {
                     class56.field807 = class270.field3257 + 0 + "%";
                     class56.field806 = 94;
                  } else {
                     class251 var19 = new class251(class106.archive10.method4432("huffman", ""));
                     class102.method2079(var19);
                     class56.field807 = class270.field3258;
                     class56.field806 = 94;
                     client.field411 = 130;
                  }
               } else if (client.field411 == 130) {
                  if (!class38.archive3.method4417()) {
                     class56.field807 = class270.field3484 + class38.archive3.method4385() * 4 / 5 + "%";
                     class56.field806 = 96;
                  } else if (!ApproximateRouteStrategy.archive12.method4417()) {
                     class56.field807 = class270.field3484 + (80 + ApproximateRouteStrategy.archive12.method4385() / 6) + "%";
                     class56.field806 = 96;
                  } else if (!class124.archive13.method4417()) {
                     class56.field807 = class270.field3484 + (96 + class124.archive13.method4385() / 50) + "%";
                     class56.field806 = 96;
                  } else {
                     class56.field807 = class270.field3517;
                     class56.field806 = 98;
                     client.field411 = 140;
                  }
               } else if (client.field411 == 140) {
                  class56.field806 = 100;
                  if (!class38.archive19.method4434(class187.field2118.field2114)) {
                     class56.field807 = class270.field3361 + class38.archive19.method4436(class187.field2118.field2114) / 10 + "%";
                  } else {
                     if (class25.field202 == null) {
                        class25.field202 = new class359();
                        class25.field202.method5544(class38.archive19, class16.archive18, class323.archive20, class130.field1468, client.field495, class276.field3575);
                     }

                     class56.field807 = class270.field3262;
                     client.field411 = 150;
                  }
               } else if (client.field411 == 150) {
                  class17.method128(10);
               }
            }
         }
      } else {
         byte var1 = 0;
         var12 = var1 + class121.archive0.method4406() * 4 / 100;
         var12 += class292.archive1.method4406() * 4 / 100;
         var12 += class192.archive2.method4406() * 2 / 100;
         var12 += class38.archive3.method4406() * 2 / 100;
         var12 += class139.archive4.method4406() * 6 / 100;
         var12 += class199.archive5.method4406() * 4 / 100;
         var12 += class109.archive6.method4406() * 2 / 100;
         var12 += class75.archive7.method4406() * 56 / 100;
         var12 += class271.archive8.method4406() * 2 / 100;
         var12 += class127.archive9.method4406() * 2 / 100;
         var12 += class106.archive10.method4406() * 2 / 100;
         var12 += class340.archive11.method4406() * 2 / 100;
         var12 += ApproximateRouteStrategy.archive12.method4406() * 2 / 100;
         var12 += class124.archive13.method4406() * 2 / 100;
         var12 += class192.archive14.method4406() * 2 / 100;
         var12 += class62.archive15.method4406() * 2 / 100;
         var12 += class38.archive19.method4406() / 100;
         var12 += class16.archive18.method4406() / 100;
         var12 += class323.archive20.method4406() / 100;
         var12 += class19.archive17.method4378() && class19.archive17.method4417() ? 1 : 0;
         if (var12 != 100) {
            if (0 != var12) {
               class56.field807 = class270.field3510 + var12 + "%";
            }

            class56.field806 = 30;
         } else {
            class89.method2007(class121.archive0, "Animations");
            class89.method2007(class292.archive1, "Skeletons");
            class89.method2007(class139.archive4, "Sound FX");
            class89.method2007(class199.archive5, "Maps");
            class89.method2007(class109.archive6, "Music Tracks");
            class89.method2007(class75.archive7, "Models");
            class89.method2007(class271.archive8, "Sprites");
            class89.method2007(class340.archive11, "Music Jingles");
            class89.method2007(class192.archive14, "Music Samples");
            class89.method2007(class62.archive15, "Music Patches");
            class89.method2007(class38.archive19, "World Map");
            class89.method2007(class16.archive18, "World Map Geography");
            class89.method2007(class323.archive20, "World Map Ground");
            class189.field2122 = new class336();
            class189.field2122.method5362(class19.archive17);
            class56.field807 = class270.field3433;
            class56.field806 = 30;
            client.field411 = 45;
         }
      }
   }

   static final void method3219(int var0, int var1, int var2, int var3) {
      ++client.field505;
      if (client.field644 == MouseHandler.localPlayer.x >> 7 && MouseHandler.localPlayer.y >> 7 == client.field597) {
         client.field644 = 0;
      }

      class89.method2013();
      if (client.field535 >= 0 && null != client.localPlayers[client.field535]) {
         ApproximateRouteStrategy.method802(client.localPlayers[client.field535], false);
      }

      class124.method2242(true);
      int var5 = PlayerList.localPlayerCount;
      int[] var6 = PlayerList.localPlayerIndexes;

      int var7;
      for(var7 = 0; var7 < var5; ++var7) {
         if (var6[var7] != client.field535 && var6[var7] != client.localPlayerIndex) {
            ApproximateRouteStrategy.method802(client.localPlayers[var6[var7]], true);
         }
      }

      class124.method2242(false);
      class65.method1676();
      class53.method1540();
      class51.method1525(var0, var1, var2, var3, true);
      var0 = client.field669;
      var1 = client.field479;
      var2 = client.field671;
      var3 = client.field672;
      class394.method6279(var0, var1, var0 + var2, var3 + var1);
      Rasterizer3D.method3415();
      int var8;
      int var9;
      int var10;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var19;
      int var20;
      int var29;
      if (!client.field615) {
         var5 = client.field476;
         if (client.field493 / 256 > var5) {
            var5 = client.field493 / 256;
         }

         if (client.field656[4] && client.field609[4] + 128 > var5) {
            var5 = 128 + client.field609[4];
         }

         var29 = client.cameraAngleY & 2047;
         var7 = KeyHandler.field66;
         var8 = class271.field3533;
         var9 = class273.field3553;
         var10 = 600 + var5 * 3;
         var13 = var3 - 334;
         if (var13 < 0) {
            var13 = 0;
         } else if (var13 > 100) {
            var13 = 100;
         }

         var14 = var13 * (client.field449 - client.field663) / 100 + client.field663;
         var12 = var14 * var10 / 256;
         var13 = 2048 - var5 & 2047;
         var14 = 2048 - var29 & 2047;
         var15 = 0;
         var16 = 0;
         var17 = var12;
         int var18;
         if (var13 != 0) {
            var18 = Rasterizer3D.sineTable[var13];
            var19 = Rasterizer3D.cosineTable[var13];
            var20 = var16 * var19 - var12 * var18 >> 16;
            var17 = var16 * var18 + var12 * var19 >> 16;
            var16 = var20;
         }

         if (var14 != 0) {
            var18 = Rasterizer3D.sineTable[var14];
            var19 = Rasterizer3D.cosineTable[var14];
            var20 = var18 * var17 + var15 * var19 >> 16;
            var17 = var17 * var19 - var18 * var15 >> 16;
            var15 = var20;
         }

         class65.field934 = var7 - var15;
         class337.field3924 = var8 - var16;
         class358.field4012 = var9 - var17;
         class117.field1398 = var5;
         class118.field1400 = var29;
         if (client.field482 == 1 && client.privilegeLevel >= 2 && 0 == client.field452 % 50 && (KeyHandler.field66 >> 7 != MouseHandler.localPlayer.x >> 7 || MouseHandler.localPlayer.y >> 7 != class273.field3553 >> 7)) {
            var18 = MouseHandler.localPlayer.plane;
            var19 = class281.baseX + (KeyHandler.field66 >> 7);
            var20 = class78.baseY + (class273.field3553 >> 7);
            class343.method5419(var19, var20, var18, true);
         }
      }

      if (!client.field615) {
         var5 = class89.method2014();
      } else {
         var5 = class192.method3314();
      }

      var29 = class65.field934;
      var7 = class337.field3924;
      var8 = class358.field4012;
      var9 = class117.field1398;
      var10 = class118.field1400;

      int var11;
      for(var11 = 0; var11 < 5; ++var11) {
         if (client.field656[var11]) {
            var12 = (int)(Math.random() * (double)(2 * client.field437[var11] + 1) - (double)client.field437[var11] + Math.sin((double)client.field659[var11] / 100.0D * (double)client.field660[var11]) * (double)client.field609[var11]);
            if (var11 == 0) {
               class65.field934 += var12;
            }

            if (var11 == 1) {
               class337.field3924 += var12;
            }

            if (var11 == 2) {
               class358.field4012 += var12;
            }

            if (var11 == 3) {
               class118.field1400 = class118.field1400 + var12 & 2047;
            }

            if (4 == var11) {
               class117.field1398 += var12;
               if (class117.field1398 < 128) {
                  class117.field1398 = 128;
               }

               if (class117.field1398 > 383) {
                  class117.field1398 = 383;
               }
            }
         }
      }

      var11 = MouseHandler.field142;
      var12 = MouseHandler.field145;
      if (0 != MouseHandler.lastButton) {
         var11 = MouseHandler.lastPressedX;
         var12 = MouseHandler.lastPressedY;
      }

      if (var11 >= var0 && var11 < var2 + var0 && var12 >= var1 && var12 < var1 + var3) {
         var13 = var11 - var0;
         var14 = var12 - var1;
         class208.field2488 = var13;
         class208.field2476 = var14;
         class208.field2490 = true;
         class208.field2484 = 0;
         class208.field2477 = false;
      } else {
         class65.method1666();
      }

      class263.method4333();
      class394.method6265(var0, var1, var2, var3, 0);
      class263.method4333();
      var13 = Rasterizer3D.field2262;
      Rasterizer3D.field2262 = client.field595;
      class166.field1925.method3615(class65.field934, class337.field3924, class358.field4012, class117.field1398, class118.field1400, var5);
      Rasterizer3D.field2262 = var13;
      class263.method4333();
      class166.field1925.method3587();
      client.field650 = 0;
      boolean var30 = false;
      var15 = -1;
      var16 = -1;
      var17 = PlayerList.localPlayerCount;
      int[] var32 = PlayerList.localPlayerIndexes;

      for(var19 = 0; var19 < client.field685 + var17; ++var19) {
         Object var33;
         if (var19 < var17) {
            var33 = client.localPlayers[var32[var19]];
            if (client.field535 == var32[var19]) {
               var30 = true;
               var15 = var19;
               continue;
            }

            if (var33 == MouseHandler.localPlayer) {
               var16 = var19;
               continue;
            }
         } else {
            var33 = client.field567[client.field450[var19 - var17]];
         }

         class209.method3829((class72)var33, var19, var0, var1, var2, var3);
      }

      if (client.field527 && -1 != var16) {
         class209.method3829(MouseHandler.localPlayer, var16, var0, var1, var2, var3);
      }

      if (var30) {
         class209.method3829(client.localPlayers[client.field535], var15, var0, var1, var2, var3);
      }

      for(var19 = 0; var19 < client.field650; ++var19) {
         var20 = client.field496[var19];
         int var21 = client.field497[var19];
         int var22 = client.field499[var19];
         int var23 = client.field442[var19];
         boolean var24 = true;

         while(var24) {
            var24 = false;

            for(int var25 = 0; var25 < var19; ++var25) {
               if (var21 + 2 > client.field497[var25] - client.field442[var25] && var21 - var23 < 2 + client.field497[var25] && var20 - var22 < client.field499[var25] + client.field496[var25] && var20 + var22 > client.field496[var25] - client.field499[var25] && client.field497[var25] - client.field442[var25] < var21) {
                  var21 = client.field497[var25] - client.field442[var25];
                  var24 = true;
               }
            }
         }

         client.field506 = client.field496[var19];
         client.field507 = client.field497[var19] = var21;
         String var34 = client.field503[var19];
         if (0 == client.field572) {
            int var26 = 16776960;
            if (client.field500[var19] < 6) {
               var26 = client.field627[client.field500[var19]];
            }

            if (client.field500[var19] == 6) {
               var26 = client.field505 % 20 < 10 ? 16711680 : 16776960;
            }

            if (7 == client.field500[var19]) {
               var26 = client.field505 % 20 < 10 ? 255 : '\uffff';
            }

            if (8 == client.field500[var19]) {
               var26 = client.field505 % 20 < 10 ? '\ub000' : 8454016;
            }

            int var27;
            if (9 == client.field500[var19]) {
               var27 = 150 - client.field664[var19];
               if (var27 < 50) {
                  var26 = 16711680 + 1280 * var27;
               } else if (var27 < 100) {
                  var26 = 16776960 - (var27 - 50) * 327680;
               } else if (var27 < 150) {
                  var26 = 5 * (var27 - 100) + '\uff00';
               }
            }

            if (client.field500[var19] == 10) {
               var27 = 150 - client.field664[var19];
               if (var27 < 50) {
                  var26 = 5 * var27 + 16711680;
               } else if (var27 < 100) {
                  var26 = 16711935 - (var27 - 50) * 327680;
               } else if (var27 < 150) {
                  var26 = 327680 * (var27 - 100) + 255 - (var27 - 100) * 5;
               }
            }

            if (client.field500[var19] == 11) {
               var27 = 150 - client.field664[var19];
               if (var27 < 50) {
                  var26 = 16777215 - var27 * 327685;
               } else if (var27 < 100) {
                  var26 = 327685 * (var27 - 50) + '\uff00';
               } else if (var27 < 150) {
                  var26 = 16777215 - 327680 * (var27 - 100);
               }
            }

            if (client.field662[var19] == 0) {
               class130.field1468.method4922(var34, client.field506 + var0, client.field507 + var1, var26, 0);
            }

            if (client.field662[var19] == 1) {
               class130.field1468.method4858(var34, var0 + client.field506, var1 + client.field507, var26, 0, client.field505);
            }

            if (client.field662[var19] == 2) {
               class130.field1468.method4873(var34, var0 + client.field506, client.field507 + var1, var26, 0, client.field505);
            }

            if (client.field662[var19] == 3) {
               class130.field1468.method4860(var34, client.field506 + var0, var1 + client.field507, var26, 0, client.field505, 150 - client.field664[var19]);
            }

            if (client.field662[var19] == 4) {
               var27 = (150 - client.field664[var19]) * (class130.field1468.method4848(var34) + 100) / 150;
               class394.method6258(var0 + client.field506 - 50, var1, 50 + client.field506 + var0, var1 + var3);
               class130.field1468.method4853(var34, client.field506 + var0 + 50 - var27, client.field507 + var1, var26, 0);
               class394.method6279(var0, var1, var0 + var2, var1 + var3);
            }

            if (client.field662[var19] == 5) {
               var27 = 150 - client.field664[var19];
               int var28 = 0;
               if (var27 < 25) {
                  var28 = var27 - 25;
               } else if (var27 > 125) {
                  var28 = var27 - 125;
               }

               class394.method6258(var0, client.field507 + var1 - class130.field1468.field3738 - 1, var0 + var2, 5 + client.field507 + var1);
               class130.field1468.method4922(var34, client.field506 + var0, client.field507 + var1 + var28, var26, 0);
               class394.method6279(var0, var1, var2 + var0, var1 + var3);
            }
         } else {
            class130.field1468.method4922(var34, client.field506 + var0, var1 + client.field507, 16776960, 0);
         }
      }

      if (client.field424 == 2) {
         class322.method5132((client.field477 - class281.baseX << 7) + client.field430, client.field553 + (client.field454 - class78.baseY << 7), client.field429 * 2);
         if (client.field506 > -1 && client.field452 % 20 < 10) {
            class150.field1677[0].method6404(client.field506 + var0 - 12, var1 + client.field507 - 28);
         }
      }

      ((class205) Rasterizer3D.field2269).method3701(client.field556);
      client.field522 = 0;
      var14 = class281.baseX + (MouseHandler.localPlayer.x >> 7);
      var15 = class78.baseY + (MouseHandler.localPlayer.y >> 7);
      if (var14 >= 3053 && var14 <= 3156 && var15 >= 3056 && var15 <= 3136) {
         client.field522 = 1;
      }

      if (var14 >= 3072 && var14 <= 3118 && var15 >= 9492 && var15 <= 9535) {
         client.field522 = 1;
      }

      if (1 == client.field522 && var14 >= 3139 && var14 <= 3199 && var15 >= 3008 && var15 <= 3062) {
         client.field522 = 0;
      }

      class65.field934 = var29;
      class337.field3924 = var7;
      class358.field4012 = var8;
      class117.field1398 = var9;
      class118.field1400 = var10;
      if (client.field415) {
         byte var31 = 0;
         var15 = var31 + class278.field3599 + class278.field3607;
         if (0 == var15) {
            client.field415 = false;
         }
      }

      if (client.field415) {
         class394.method6265(var0, var1, var2, var3, 0);
         class12.method98(class270.field3237, false);
      }

   }

   public abstract int method3208();

   abstract class181 method3209();

   abstract int method3211();

   abstract int method3227();
}
