public class class209 {
   public static short[][] field2499;
   int field2493;
   int field2494;
   int field2495;
   int field2496;

   class209() {
   }

   class209(class209 var1) {
      this.field2496 = var1.field2496;
      this.field2494 = var1.field2494;
      this.field2495 = var1.field2495;
      this.field2493 = var1.field2493;
   }

   static final void method3829(class72 var0, int var1, int var2, int var3, int var4, int var5) {
      if (null != var0 && var0.method1748()) {
         if (var0 instanceof class78) {
            class148 var7 = ((class78)var0).field1132;
            if (null != var7.field1646) {
               var7 = var7.method2471();
            }

            if (null == var7) {
               return;
            }
         }

         int var76 = PlayerList.localPlayerCount;
         int[] var8 = PlayerList.localPlayerIndexes;
         byte var9 = 0;
         Player var11;
         if (var1 < var76 && var0.field1025 == client.field452) {
            var11 = (Player)var0;
            boolean var10;
            if (0 == client.field427) {
               var10 = false;
            } else if (MouseHandler.localPlayer == var11) {
               var10 = class45.method785();
            } else {
               boolean var12 = class261.method4332();
               boolean var13;
               if (!var12) {
                  var13 = (client.field427 & 1) != 0;
                  var12 = var13 && var11.method1701();
               }

               var13 = var12;
               if (!var12) {
                  boolean var14 = (client.field427 & 2) != 0;
                  var13 = var14 && var11.method1704();
               }

               var10 = var13;
            }

            if (var10) {
               Player var80 = (Player)var0;
               if (var1 < var76) {
                  class241.method4143(var0, 15 + var0.field1071);
                  class303 var84 = (class303)client.field495.get(class361.field4093);
                  byte var85 = 9;
                  var84.method4922(var80.username.getName(), var2 + client.field506, var3 + client.field507 - var85, 16777215, 0);
                  var9 = 18;
               }
            }
         }

         int var77 = -2;
         int var16;
         int var23;
         int var24;
         if (!var0.field1078.method4788()) {
            class241.method4143(var0, var0.field1071 + 15);

            for(class77 var78 = (class77)var0.field1078.method4724(); null != var78; var78 = (class77)var0.field1078.method4726()) {
               class73 var81 = var78.method1830(client.field452);
               if (var81 == null) {
                  if (var78.method1823()) {
                     var78.remove();
                  }
               } else {
                  class144 var86 = var78.field1129;
                  class398 var87 = var86.method2432();
                  class398 var15 = var86.method2443();
                  int var17 = 0;
                  if (var87 != null && var15 != null) {
                     if (var86.field1592 * 2 < var15.field4270) {
                        var17 = var86.field1592;
                     }

                     var16 = var15.field4270 - 2 * var17;
                  } else {
                     var16 = var86.field1590;
                  }

                  int var18 = 255;
                  boolean var19 = true;
                  int var20 = client.field452 - var81.field1081;
                  int var21 = var81.field1083 * var16 / var86.field1590;
                  int var22;
                  int var92;
                  if (var81.field1084 > var20) {
                     var22 = var86.field1586 == 0 ? 0 : var86.field1586 * (var20 / var86.field1586);
                     var23 = var16 * var81.field1082 / var86.field1590;
                     var92 = var22 * (var21 - var23) / var81.field1084 + var23;
                  } else {
                     var92 = var21;
                     var22 = var81.field1084 + var86.field1587 - var20;
                     if (var86.field1584 >= 0) {
                        var18 = (var22 << 8) / (var86.field1587 - var86.field1584);
                     }
                  }

                  if (var81.field1083 > 0 && var92 < 1) {
                     var92 = 1;
                  }

                  if (null != var87 && null != var15) {
                     if (var92 == var16) {
                        var92 += var17 * 2;
                     } else {
                        var92 += var17;
                     }

                     var22 = var87.field4271;
                     var77 += var22;
                     var23 = var2 + client.field506 - (var16 >> 1);
                     var24 = var3 + client.field507 - var77;
                     var23 -= var17;
                     if (var18 >= 0 && var18 < 255) {
                        var87.method6385(var23, var24, var18);
                        class394.method6258(var23, var24, var23 + var92, var24 + var22);
                        var15.method6385(var23, var24, var18);
                     } else {
                        var87.method6404(var23, var24);
                        class394.method6258(var23, var24, var92 + var23, var24 + var22);
                        var15.method6404(var23, var24);
                     }

                     class394.method6279(var2, var3, var2 + var4, var3 + var5);
                     var77 += 2;
                  } else {
                     var77 += 5;
                     if (client.field506 > -1) {
                        var22 = var2 + client.field506 - (var16 >> 1);
                        var23 = client.field507 + var3 - var77;
                        class394.method6265(var22, var23, var92, 5, 65280);
                        class394.method6265(var92 + var22, var23, var16 - var92, 5, 16711680);
                     }

                     var77 += 2;
                  }
               }
            }
         }

         if (-2 == var77) {
            var77 += 7;
         }

         var77 += var9;
         if (var1 < var76) {
            var11 = (Player)var0;
            if (var11.field998) {
               return;
            }

            if (var11.skullHeadIcon != -1 || var11.prayerHeadIcon != -1) {
               class241.method4143(var0, var0.field1071 + 15);
               if (client.field506 > -1) {
                  if (-1 != var11.skullHeadIcon) {
                     var77 += 25;
                     class89.field1230[var11.skullHeadIcon].method6404(var2 + client.field506 - 12, client.field507 + var3 - var77);
                  }

                  if (-1 != var11.prayerHeadIcon) {
                     var77 += 25;
                     class266.field3211[var11.prayerHeadIcon].method6404(client.field506 + var2 - 12, var3 + client.field507 - var77);
                  }
               }
            }

            if (var1 >= 0 && client.field424 == 10 && client.field426 == var8[var1]) {
               class241.method4143(var0, 15 + var0.field1071);
               if (client.field506 > -1) {
                  var77 += class150.field1677[1].field4271;
                  class150.field1677[1].method6404(var2 + client.field506 - 12, var3 + client.field507 - var77);
               }
            }
         } else {
            class148 var79 = ((class78)var0).field1132;
            if (null != var79.field1646) {
               var79 = var79.method2471();
            }

            if (var79.field1644 >= 0 && var79.field1644 < class266.field3211.length) {
               class241.method4143(var0, var0.field1071 + 15);
               if (client.field506 > -1) {
                  class266.field3211[var79.field1644].method6404(client.field506 + var2 - 12, var3 + client.field507 - 30);
               }
            }

            if (1 == client.field424 && client.field425 == client.field450[var1 - var76] && client.field452 % 20 < 10) {
               class241.method4143(var0, 15 + var0.field1071);
               if (client.field506 > -1) {
                  class150.field1677[0].method6404(client.field506 + var2 - 12, client.field507 + var3 - 28);
               }
            }
         }

         if (var0.overheadText != null && (var1 >= var76 || !var0.field1080 && (4 == client.field670 || !var0.isAutoChatting && (0 == client.field670 || 3 == client.field670 || 1 == client.field670 && ((Player)var0).method1701())))) {
            class241.method4143(var0, var0.field1071);
            if (client.field506 > -1 && client.field650 < client.field579) {
               client.field499[client.field650] = class130.field1468.method4848(var0.overheadText) / 2;
               client.field442[client.field650] = class130.field1468.field3738;
               client.field496[client.field650] = client.field506;
               client.field497[client.field650] = client.field507;
               client.field500[client.field650] = var0.overheadTextColor;
               client.field662[client.field650] = var0.overheadTextEffect;
               client.field664[client.field650] = var0.overheadTextCyclesRemaining;
               client.field503[client.field650] = var0.overheadText;
               ++client.field650;
            }
         }

         for(int var82 = 0; var82 < 4; ++var82) {
            int var83 = var0.field1026[var82];
            int var88 = var0.field1036[var82];
            class155 var89 = null;
            int var90 = 0;
            if (var88 >= 0) {
               if (var83 <= client.field452) {
                  continue;
               }

               var89 = class156.method2682(var0.field1036[var82]);
               var90 = var89.field1717;
               if (null != var89 && var89.field1730 != null) {
                  var89 = var89.method2595();
                  if (null == var89) {
                     var0.field1026[var82] = -1;
                     continue;
                  }
               }
            } else if (var83 < 0) {
               continue;
            }

            var16 = var0.field1041[var82];
            class155 var91 = null;
            if (var16 >= 0) {
               var91 = class156.method2682(var16);
               if (var91 != null && var91.field1730 != null) {
                  var91 = var91.method2595();
               }
            }

            if (var83 - var90 <= client.field452) {
               if (var89 == null) {
                  var0.field1026[var82] = -1;
               } else {
                  class241.method4143(var0, var0.field1071 / 2);
                  if (client.field506 > -1) {
                     if (1 == var82) {
                        client.field507 -= 20;
                     }

                     if (var82 == 2) {
                        client.field506 -= 15;
                        client.field507 -= 10;
                     }

                     if (var82 == 3) {
                        client.field506 += 15;
                        client.field507 -= 10;
                     }

                     class398 var95 = null;
                     class398 var93 = null;
                     class398 var94 = null;
                     class398 var96 = null;
                     var23 = 0;
                     var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     int var30 = 0;
                     class398 var31 = null;
                     class398 var32 = null;
                     class398 var33 = null;
                     class398 var34 = null;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     int var43 = 0;
                     var95 = var89.method2608();
                     int var44;
                     if (null != var95) {
                        var23 = var95.field4270;
                        var44 = var95.field4271;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var27 = var95.field4272;
                     }

                     var93 = var89.method2598();
                     if (null != var93) {
                        var24 = var93.field4270;
                        var44 = var93.field4271;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var28 = var93.field4272;
                     }

                     var94 = var89.method2599();
                     if (null != var94) {
                        var25 = var94.field4270;
                        var44 = var94.field4271;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var29 = var94.field4272;
                     }

                     var96 = var89.method2600();
                     if (null != var96) {
                        var26 = var96.field4270;
                        var44 = var96.field4271;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var30 = var96.field4272;
                     }

                     if (var91 != null) {
                        var31 = var91.method2608();
                        if (null != var31) {
                           var35 = var31.field4270;
                           var44 = var31.field4271;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var39 = var31.field4272;
                        }

                        var32 = var91.method2598();
                        if (var32 != null) {
                           var36 = var32.field4270;
                           var44 = var32.field4271;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var40 = var32.field4272;
                        }

                        var33 = var91.method2599();
                        if (null != var33) {
                           var37 = var33.field4270;
                           var44 = var33.field4271;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var41 = var33.field4272;
                        }

                        var34 = var91.method2600();
                        if (var34 != null) {
                           var38 = var34.field4270;
                           var44 = var34.field4271;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var42 = var34.field4272;
                        }
                     }

                     class302 var97 = var89.method2601();
                     if (null == var97) {
                        var97 = class47.field398;
                     }

                     class302 var45;
                     if (var91 != null) {
                        var45 = var91.method2601();
                        if (var45 == null) {
                           var45 = class47.field398;
                        }
                     } else {
                        var45 = class47.field398;
                     }

                     String var46 = null;
                     String var47 = null;
                     boolean var48 = false;
                     int var49 = 0;
                     var46 = var89.method2596(var0.field1048[var82]);
                     int var98 = var97.method4848(var46);
                     if (null != var91) {
                        var47 = var91.method2596(var0.field1045[var82]);
                        var49 = var45.method4848(var47);
                     }

                     int var50 = 0;
                     int var51 = 0;
                     if (var24 > 0) {
                        if (null == var94 && null == var96) {
                           var50 = 1;
                        } else {
                           var50 = 1 + var98 / var24;
                        }
                     }

                     if (null != var91 && var36 > 0) {
                        if (null == var33 && var34 == null) {
                           var51 = 1;
                        } else {
                           var51 = 1 + var49 / var36;
                        }
                     }

                     int var52 = 0;
                     int var53 = var52;
                     if (var23 > 0) {
                        var52 += var23;
                     }

                     var52 += 2;
                     int var54 = var52;
                     if (var25 > 0) {
                        var52 += var25;
                     }

                     int var55 = var52;
                     int var56 = var52;
                     int var57;
                     if (var24 > 0) {
                        var57 = var50 * var24;
                        var52 += var57;
                        var56 += (var57 - var98) / 2;
                     } else {
                        var52 += var98;
                     }

                     var57 = var52;
                     if (var26 > 0) {
                        var52 += var26;
                     }

                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62 = 0;
                     int var63;
                     if (null != var91) {
                        var52 += 2;
                        var58 = var52;
                        if (var35 > 0) {
                           var52 += var35;
                        }

                        var52 += 2;
                        var59 = var52;
                        if (var37 > 0) {
                           var52 += var37;
                        }

                        var60 = var52;
                        var62 = var52;
                        if (var36 > 0) {
                           var63 = var51 * var36;
                           var52 += var63;
                           var62 += (var63 - var49) / 2;
                        } else {
                           var52 += var49;
                        }

                        var61 = var52;
                        if (var38 > 0) {
                           var52 += var38;
                        }
                     }

                     var63 = var0.field1026[var82] - client.field452;
                     int var64 = var89.field1722 - var89.field1722 * var63 / var89.field1717;
                     int var65 = var89.field1723 * var63 / var89.field1717 + -var89.field1723;
                     int var66 = var64 + (client.field506 + var2 - (var52 >> 1));
                     int var67 = var65 + (var3 + client.field507 - 12);
                     int var68 = var67;
                     int var69 = var43 + var67;
                     int var70 = var89.field1727 + 15 + var67;
                     int var71 = var70 - var97.field3739;
                     int var72 = var97.field3740 + var70;
                     if (var71 < var67) {
                        var68 = var71;
                     }

                     if (var72 > var69) {
                        var69 = var72;
                     }

                     int var73 = 0;
                     int var74;
                     int var75;
                     if (null != var91) {
                        var73 = var91.field1727 + 15 + var67;
                        var74 = var73 - var45.field3739;
                        var75 = var73 + var45.field3740;
                        if (var74 < var68) {
                           ;
                        }

                        if (var75 > var69) {
                           ;
                        }
                     }

                     var74 = 255;
                     if (var89.field1707 >= 0) {
                        var74 = (var63 << 8) / (var89.field1717 - var89.field1707);
                     }

                     if (var74 >= 0 && var74 < 255) {
                        if (null != var95) {
                           var95.method6385(var66 + var53 - var27, var67, var74);
                        }

                        if (null != var94) {
                           var94.method6385(var54 + var66 - var29, var67, var74);
                        }

                        if (null != var93) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var93.method6385(var24 * var75 + (var55 + var66 - var28), var67, var74);
                           }
                        }

                        if (var96 != null) {
                           var96.method6385(var57 + var66 - var30, var67, var74);
                        }

                        var97.method4865(var46, var66 + var56, var70, var89.field1724, 0, var74);
                        if (var91 != null) {
                           if (var31 != null) {
                              var31.method6385(var66 + var58 - var39, var67, var74);
                           }

                           if (null != var33) {
                              var33.method6385(var59 + var66 - var41, var67, var74);
                           }

                           if (null != var32) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method6385(var36 * var75 + (var60 + var66 - var40), var67, var74);
                              }
                           }

                           if (null != var34) {
                              var34.method6385(var66 + var61 - var42, var67, var74);
                           }

                           var45.method4865(var47, var66 + var62, var73, var91.field1724, 0, var74);
                        }
                     } else {
                        if (null != var95) {
                           var95.method6404(var66 + var53 - var27, var67);
                        }

                        if (null != var94) {
                           var94.method6404(var54 + var66 - var29, var67);
                        }

                        if (var93 != null) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var93.method6404(var55 + var66 - var28 + var24 * var75, var67);
                           }
                        }

                        if (var96 != null) {
                           var96.method6404(var57 + var66 - var30, var67);
                        }

                        var97.method4853(var46, var56 + var66, var70, var89.field1724 | -16777216, 0);
                        if (var91 != null) {
                           if (var31 != null) {
                              var31.method6404(var58 + var66 - var39, var67);
                           }

                           if (var33 != null) {
                              var33.method6404(var66 + var59 - var41, var67);
                           }

                           if (var32 != null) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method6404(var66 + var60 - var40 + var75 * var36, var67);
                              }
                           }

                           if (null != var34) {
                              var34.method6404(var61 + var66 - var42, var67);
                           }

                           var45.method4853(var47, var66 + var62, var73, var91.field1724 | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
