public class class154 extends class349 {
   public static class277 field1703;
   static class223 field1704 = new class223(64);
   class363 field1705;

   class154() {
   }

   void method2569() {
   }

   void method2570(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (0 == var3) {
            return;
         }

         this.method2571(var1, var3);
      }
   }

   void method2571(Buffer var1, int var2) {
      if (var2 == 249) {
         this.field1705 = class50.method1392(var1, this.field1705);
      }

   }

   public int method2572(int var1, int var2) {
      class363 var5 = this.field1705;
      int var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class353 var6 = (class353)var5.method5716((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = var6.field3964;
         }
      }

      return var4;
   }

   public String method2573(int var1, String var2) {
      class363 var5 = this.field1705;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class350 var6 = (class350)var5.method5716((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = (String)var6.field3961;
         }
      }

      return var4;
   }

   static final void method2590(Interface var0, int var1) {
      if (null == var0.field2988) {
         throw new RuntimeException();
      } else {
         if (var0.field2967 == null) {
            var0.field2967 = new int[var0.field2988.length];
         }

         var0.field2967[var1] = Integer.MAX_VALUE;
      }
   }

   static final void method2586(Interface[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class394.method6279(var2, var3, var4, var5);
      Rasterizer3D.method3415();

      for(int var10 = 0; var10 < var0.length; ++var10) {
         Interface var11 = var0[var10];
         if (var11 != null && (var11.field3001 == var1 || -1412584499 == var1 && client.field581 == var11)) {
            int var12;
            if (-1 == var8) {
               client.field623[client.field591] = var6 + var11.field2971;
               client.field626[client.field591] = var7 + var11.field2972;
               client.field622[client.field591] = var11.field2973;
               client.field619[client.field591] = var11.field2990;
               var12 = ++client.field591 - 1;
            } else {
               var12 = var8;
            }

            var11.field2966 = var12;
            var11.field3100 = client.cycle;
            if (!var11.field2993 || !class151.method2531(var11)) {
               if (var11.field2962 > 0) {
                  class38.method726(var11);
               }

               int var13 = var11.field2971 + var6;
               int var14 = var11.field2972 + var7;
               int var15 = var11.field2989;
               int var16;
               int var17;
               if (var11 == client.field581) {
                  if (-1412584499 != var1 && !var11.field3053) {
                     class88.field1225 = var0;
                     class25.field192 = var6;
                     class69.field977 = var7;
                     continue;
                  }

                  if (client.field592 && client.field586) {
                     var16 = MouseHandler.field142;
                     var17 = MouseHandler.field145;
                     var16 -= client.field583;
                     var17 -= client.field525;
                     if (var16 < client.field587) {
                        var16 = client.field587;
                     }

                     if (var16 + var11.field2973 > client.field587 + client.field582.field2973) {
                        var16 = client.field587 + client.field582.field2973 - var11.field2973;
                     }

                     if (var17 < client.field588) {
                        var17 = client.field588;
                     }

                     if (var17 + var11.field2990 > client.field588 + client.field582.field2990) {
                        var17 = client.field588 + client.field582.field2990 - var11.field2990;
                     }

                     var13 = var16;
                     var14 = var17;
                  }

                  if (!var11.field3053) {
                     var15 = 128;
                  }
               }

               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               if (var11.field2977 == 2) {
                  var16 = var2;
                  var17 = var3;
                  var18 = var4;
                  var19 = var5;
               } else if (9 == var11.field2977) {
                  var20 = var13;
                  var21 = var14;
                  var22 = var11.field2973 + var13;
                  var23 = var11.field2990 + var14;
                  if (var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  if (var23 < var14) {
                     var21 = var23;
                     var23 = var14;
                  }

                  ++var22;
                  ++var23;
                  var16 = var20 > var2 ? var20 : var2;
                  var17 = var21 > var3 ? var21 : var3;
                  var18 = var22 < var4 ? var22 : var4;
                  var19 = var23 < var5 ? var23 : var5;
               } else {
                  var20 = var13 + var11.field2973;
                  var21 = var11.field2990 + var14;
                  var16 = var13 > var2 ? var13 : var2;
                  var17 = var14 > var3 ? var14 : var3;
                  var18 = var20 < var4 ? var20 : var4;
                  var19 = var21 < var5 ? var21 : var5;
               }

               if (!var11.field2993 || var16 < var18 && var17 < var19) {
                  if (var11.field2962 != 0) {
                     if (var11.field2962 == 1336) {
                        if (client.field422) {
                           var14 += 15;
                           class258.field3165.method4921("Fps:" + class19.field120, var13 + var11.field2973, var14, 16776960, -1);
                           var14 += 15;
                           Runtime var45 = Runtime.getRuntime();
                           var21 = (int)((var45.totalMemory() - var45.freeMemory()) / 1024L);
                           var22 = 16776960;
                           if (var21 > 327680 && !client.isLowDetailMode) {
                              var22 = 16711680;
                           }

                           class258.field3165.method4921("Mem:" + var21 + "k", var13 + var11.field2973, var14, var22, -1);
                           var14 += 15;
                        }
                        continue;
                     }

                     if (var11.field2962 == 1337) {
                        client.field557 = var13;
                        client.field558 = var14;
                        class186.method3219(var13, var14, var11.field2973, var11.field2990);
                        client.field617[var11.field2966] = true;
                        class394.method6279(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field2962 == 1338) {
                        class64.method1663(var11, var13, var14, var12);
                        class394.method6279(var2, var3, var4, var5);
                        continue;
                     }

                     if (1339 == var11.field2962) {
                        class346.method5428(var11, var13, var14, var12);
                        class394.method6279(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field2962 == 1400) {
                        class25.field202.method5501(var13, var14, var11.field2973, var11.field2990, client.cycle);
                     }

                     if (1401 == var11.field2962) {
                        class25.field202.method5504(var13, var14, var11.field2973, var11.field2990);
                     }

                     if (var11.field2962 == 1402) {
                        class7.field16.method1775(var13, client.cycle);
                     }
                  }

                  if (var11.field2977 == 0) {
                     if (!var11.field2993 && class151.method2531(var11) && class245.field2923 != var11) {
                        continue;
                     }

                     if (!var11.field2993) {
                        if (var11.field2968 > var11.field3091 - var11.field2990) {
                           var11.field2968 = var11.field3091 - var11.field2990;
                        }

                        if (var11.field2968 < 0) {
                           var11.field2968 = 0;
                        }
                     }

                     method2586(var0, var11.id, var16, var17, var18, var19, var13 - var11.field3054, var14 - var11.field2968, var12);
                     if (var11.field3061 != null) {
                        method2586(var11.field3061, var11.id, var16, var17, var18, var19, var13 - var11.field3054, var14 - var11.field2968, var12);
                     }

                     InterfaceParent var31 = (InterfaceParent)client.interfaceParents.get((long)var11.id);
                     if (var31 != null) {
                        class42.method765(var31.field950, var16, var17, var18, var19, var13, var14, var12);
                     }

                     class394.method6279(var2, var3, var4, var5);
                     Rasterizer3D.method3415();
                  }

                  if (client.isResizableMode || client.field509[var12] || client.field624 > 1) {
                     if (0 == var11.field2977 && !var11.field2993 && var11.field3091 > var11.field2990) {
                        class101.method2076(var13 + var11.field2973, var14, var11.field2968, var11.field2990, var11.field3091);
                     }

                     if (var11.field2977 != 1) {
                        int var26;
                        int var27;
                        int var39;
                        int var41;
                        if (var11.field2977 == 2) {
                           var20 = 0;

                           for(var21 = 0; var21 < var11.field2970; ++var21) {
                              for(var22 = 0; var22 < var11.field2969; ++var22) {
                                 var23 = (var11.field3025 + 32) * var22 + var13;
                                 var41 = var21 * (32 + var11.field3026) + var14;
                                 if (var20 < 20) {
                                    var23 += var11.field2946[var20];
                                    var41 += var11.field3028[var20];
                                 }

                                 if (var11.field3086[var20] <= 0) {
                                    if (var11.field3029 != null && var20 < 20) {
                                       class398 var48 = var11.method4225(var20);
                                       if (null != var48) {
                                          var48.method6404(var23, var41);
                                       } else if (Interface.field2956) {
                                          class81.invalidateComponent(var11);
                                       }
                                    }
                                 } else {
                                    boolean var46 = false;
                                    boolean var43 = false;
                                    var27 = var11.field3086[var20] - 1;
                                    if (var23 + 32 > var2 && var23 < var4 && 32 + var41 > var3 && var41 < var5 || var11 == client.field688 && var20 == client.field516) {
                                       class398 var44;
                                       if (1 == client.field561 && var20 == KeyHandler.field41 && var11.id == class62.field912) {
                                          var44 = class125.method2247(var27, var11.field3087[var20], 2, 0, 2, false);
                                       } else {
                                          var44 = class125.method2247(var27, var11.field3087[var20], 1, 3153952, 2, false);
                                       }

                                       if (null != var44) {
                                          if (var11 == client.field688 && var20 == client.field516) {
                                             var39 = MouseHandler.field142 - client.field404;
                                             var26 = MouseHandler.field145 - client.field584;
                                             if (var39 < 5 && var39 > -5) {
                                                var39 = 0;
                                             }

                                             if (var26 < 5 && var26 > -5) {
                                                var26 = 0;
                                             }

                                             if (client.field521 < 5) {
                                                var39 = 0;
                                                var26 = 0;
                                             }

                                             var44.method6385(var23 + var39, var41 + var26, 128);
                                             if (-1 != var1) {
                                                Interface var29 = var0[var1 & '\uffff'];
                                                int var30;
                                                if (var41 + var26 < class394.field4247 && var29.field2968 > 0) {
                                                   var30 = client.field556 * (class394.field4247 - var41 - var26) / 3;
                                                   if (var30 > client.field556 * 10) {
                                                      var30 = client.field556 * 10;
                                                   }

                                                   if (var30 > var29.field2968) {
                                                      var30 = var29.field2968;
                                                   }

                                                   var29.field2968 -= var30;
                                                   client.field584 += var30;
                                                   class81.invalidateComponent(var29);
                                                }

                                                if (var26 + var41 + 32 > class394.field4244 && var29.field2968 < var29.field3091 - var29.field2990) {
                                                   var30 = (32 + var26 + var41 - class394.field4244) * client.field556 / 3;
                                                   if (var30 > client.field556 * 10) {
                                                      var30 = client.field556 * 10;
                                                   }

                                                   if (var30 > var29.field3091 - var29.field2990 - var29.field2968) {
                                                      var30 = var29.field3091 - var29.field2990 - var29.field2968;
                                                   }

                                                   var29.field2968 += var30;
                                                   client.field584 -= var30;
                                                   class81.invalidateComponent(var29);
                                                }
                                             }
                                          } else if (var11 == class13.field78 && var20 == client.field514) {
                                             var44.method6385(var23, var41, 128);
                                          } else {
                                             var44.method6404(var23, var41);
                                          }
                                       } else {
                                          class81.invalidateComponent(var11);
                                       }
                                    }
                                 }

                                 ++var20;
                              }
                           }
                        } else if (3 == var11.field2977) {
                           if (class144.method2447(var11)) {
                              var20 = var11.field2984;
                              if (class245.field2923 == var11 && 0 != var11.field2986) {
                                 var20 = var11.field2986;
                              }
                           } else {
                              var20 = var11.field2983;
                              if (class245.field2923 == var11 && 0 != var11.field2985) {
                                 var20 = var11.field2985;
                              }
                           }

                           if (var11.field2987) {
                              switch(var11.field3071.field4258) {
                              case 1:
                                 class394.method6266(var13, var14, var11.field2973, var11.field2990, var11.field2983, var11.field2984);
                                 break;
                              case 2:
                                 class394.method6256(var13, var14, var11.field2973, var11.field2990, var11.field2983, var11.field2984, 255 - (var11.field2989 & 255), 255 - (var11.field3103 & 255));
                                 break;
                              default:
                                 if (0 == var15) {
                                    class394.method6265(var13, var14, var11.field2973, var11.field2990, var20);
                                 } else {
                                    class394.method6264(var13, var14, var11.field2973, var11.field2990, var20, 256 - (var15 & 255));
                                 }
                              }
                           } else if (0 == var15) {
                              class394.method6292(var13, var14, var11.field2973, var11.field2990, var20);
                           } else {
                              class394.method6270(var13, var14, var11.field2973, var11.field2990, var20, 256 - (var15 & 255));
                           }
                        } else {
                           class302 var32;
                           if (4 == var11.field2977) {
                              var32 = var11.method4224();
                              if (null == var32) {
                                 if (Interface.field2956) {
                                    class81.invalidateComponent(var11);
                                 }
                              } else {
                                 String var42 = var11.field3042;
                                 if (class144.method2447(var11)) {
                                    var21 = var11.field2984;
                                    if (var11 == class245.field2923 && var11.field2986 != 0) {
                                       var21 = var11.field2986;
                                    }

                                    if (var11.field3020.length() > 0) {
                                       var42 = var11.field3020;
                                    }
                                 } else {
                                    var21 = var11.field2983;
                                    if (class245.field2923 == var11 && 0 != var11.field2985) {
                                       var21 = var11.field2985;
                                    }
                                 }

                                 if (var11.field2993 && -1 != var11.field3088) {
                                    class157 var47 = KeyHandler.method93(var11.field3088);
                                    var42 = var47.field1836;
                                    if (null == var42) {
                                       var42 = class270.field3234;
                                    }

                                    if ((var47.field1806 == 1 || var11.field3089 != 1) && -1 != var11.field3089) {
                                       var42 = class44.method770(16748608) + var42 + class79.field1145 + " " + 'x' + class153.method2567(var11.field3089);
                                    }
                                 }

                                 if (var11 == client.field574) {
                                    var42 = class270.field3388;
                                    var21 = var11.field2983;
                                 }

                                 if (!var11.field2993) {
                                    var42 = Player.method1714(var42, var11);
                                 }

                                 var32.method4857(var42, var13, var14, var11.field2973, var11.field2990, var21, var11.field3024 ? 0 : -1, var11.field3022, var11.field3023, var11.field3021);
                              }
                           } else if (var11.field2977 == 5) {
                              class398 var36;
                              if (!var11.field2993) {
                                 var36 = var11.method4223(class144.method2447(var11));
                                 if (var36 != null) {
                                    var36.method6404(var13, var14);
                                 } else if (Interface.field2956) {
                                    class81.invalidateComponent(var11);
                                 }
                              } else {
                                 if (var11.field3088 != -1) {
                                    var36 = class125.method2247(var11.field3088, var11.field3089, var11.field2997, var11.field2998, var11.field2991, false);
                                 } else {
                                    var36 = var11.method4223(false);
                                 }

                                 if (var36 == null) {
                                    if (Interface.field2956) {
                                       class81.invalidateComponent(var11);
                                    }
                                 } else {
                                    var21 = var36.field4274;
                                    var22 = var36.field4275;
                                    if (!var11.field3027) {
                                       var23 = var11.field2973 * 4096 / var21;
                                       if (var11.field3077 != 0) {
                                          var36.method6398(var13 + var11.field2973 / 2, var11.field2990 / 2 + var14, var11.field3077, var23);
                                       } else if (var15 != 0) {
                                          var36.method6387(var13, var14, var11.field2973, var11.field2990, 256 - (var15 & 255));
                                       } else if (var11.field2973 == var21 && var22 == var11.field2990) {
                                          var36.method6404(var13, var14);
                                       } else {
                                          var36.method6381(var13, var14, var11.field2973, var11.field2990);
                                       }
                                    } else {
                                       class394.method6258(var13, var14, var13 + var11.field2973, var11.field2990 + var14);
                                       var23 = (var11.field2973 + (var21 - 1)) / var21;
                                       var41 = (var22 - 1 + var11.field2990) / var22;

                                       for(var39 = 0; var39 < var23; ++var39) {
                                          for(var26 = 0; var26 < var41; ++var26) {
                                             if (0 != var11.field3077) {
                                                var36.method6398(var39 * var21 + var13 + var21 / 2, var14 + var26 * var22 + var22 / 2, var11.field3077, 4096);
                                             } else if (0 != var15) {
                                                var36.method6385(var13 + var39 * var21, var14 + var26 * var22, 256 - (var15 & 255));
                                             } else {
                                                var36.method6404(var13 + var39 * var21, var26 * var22 + var14);
                                             }
                                          }
                                       }

                                       class394.method6279(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              class157 var24;
                              if (var11.field2977 == 6) {
                                 boolean var34 = class144.method2447(var11);
                                 if (var34) {
                                    var21 = var11.field3048;
                                 } else {
                                    var21 = var11.field3005;
                                 }

                                 class207 var38 = null;
                                 var23 = 0;
                                 if (-1 != var11.field3088) {
                                    var24 = KeyHandler.method93(var11.field3088);
                                    if (null != var24) {
                                       var24 = var24.method2694(var11.field3089);
                                       var38 = var24.method2721(1);
                                       if (var38 != null) {
                                          var38.method3721();
                                          var23 = var38.field2346 / 2;
                                       } else {
                                          class81.invalidateComponent(var11);
                                       }
                                    }
                                 } else if (var11.field2950 == 5) {
                                    if (var11.field3002 == 0) {
                                       var38 = client.field598.method4201((class159)null, -1, (class159)null, -1);
                                    } else {
                                       var38 = MouseHandler.localPlayer.method3687();
                                    }
                                 } else if (var21 == -1) {
                                    var38 = var11.method4226((class159)null, -1, var34, MouseHandler.localPlayer.field979);
                                    if (var38 == null && Interface.field2956) {
                                       class81.invalidateComponent(var11);
                                    }
                                 } else {
                                    class159 var40 = class48.method1312(var21);
                                    var38 = var11.method4226(var40, var11.field3094, var34, MouseHandler.localPlayer.field979);
                                    if (var38 == null && Interface.field2956) {
                                       class81.invalidateComponent(var11);
                                    }
                                 }

                                 Rasterizer3D.method3418(var13 + var11.field2973 / 2, var14 + var11.field2990 / 2);
                                 var41 = var11.field3000 * Rasterizer3D.sineTable[var11.field3009] >> 16;
                                 var39 = var11.field3000 * Rasterizer3D.cosineTable[var11.field3009] >> 16;
                                 if (var38 != null) {
                                    if (!var11.field2993) {
                                       var38.method3769(0, var11.field3010, 0, var11.field3009, 0, var41, var39);
                                    } else {
                                       var38.method3721();
                                       if (var11.field3015) {
                                          var38.method3734(0, var11.field3010, var11.field3011, var11.field3009, var11.field3007, var41 + var23 + var11.field2960, var11.field2960 + var39, var11.field3000);
                                       } else {
                                          var38.method3769(0, var11.field3010, var11.field3011, var11.field3009, var11.field3007, var41 + var23 + var11.field2960, var39 + var11.field2960);
                                       }
                                    }
                                 }

                                 Rasterizer3D.method3417();
                              } else {
                                 if (7 == var11.field2977) {
                                    var32 = var11.method4224();
                                    if (null == var32) {
                                       if (Interface.field2956) {
                                          class81.invalidateComponent(var11);
                                       }
                                       continue;
                                    }

                                    var21 = 0;

                                    for(var22 = 0; var22 < var11.field2970; ++var22) {
                                       for(var23 = 0; var23 < var11.field2969; ++var23) {
                                          if (var11.field3086[var21] > 0) {
                                             var24 = KeyHandler.method93(var11.field3086[var21] - 1);
                                             String var25;
                                             if (var24.field1806 != 1 && var11.field3087[var21] == 1) {
                                                var25 = class44.method770(16748608) + var24.field1836 + class79.field1145;
                                             } else {
                                                var25 = class44.method770(16748608) + var24.field1836 + class79.field1145 + " " + 'x' + class153.method2567(var11.field3087[var21]);
                                             }

                                             var26 = var23 * (var11.field3025 + 115) + var13;
                                             var27 = var14 + (12 + var11.field3026) * var22;
                                             if (var11.field3022 == 0) {
                                                var32.method4853(var25, var26, var27, var11.field2983, var11.field3024 ? 0 : -1);
                                             } else if (1 == var11.field3022) {
                                                var32.method4922(var25, var11.field2973 / 2 + var26, var27, var11.field2983, var11.field3024 ? 0 : -1);
                                             } else {
                                                var32.method4921(var25, var11.field2973 + var26 - 1, var27, var11.field2983, var11.field3024 ? 0 : -1);
                                             }
                                          }

                                          ++var21;
                                       }
                                    }
                                 }

                                 if (8 == var11.field2977 && var11 == class293.field3699 && client.field560 == client.field649) {
                                    var20 = 0;
                                    var21 = 0;
                                    class302 var33 = class258.field3165;
                                    String var37 = var11.field3042;

                                    String var35;
                                    for(var37 = Player.method1714(var37, var11); var37.length() > 0; var21 += var33.field3738 + 1) {
                                       var39 = var37.indexOf(class79.field1144);
                                       if (var39 != -1) {
                                          var35 = var37.substring(0, var39);
                                          var37 = var37.substring(4 + var39);
                                       } else {
                                          var35 = var37;
                                          var37 = "";
                                       }

                                       var26 = var33.method4848(var35);
                                       if (var26 > var20) {
                                          var20 = var26;
                                       }
                                    }

                                    var20 += 6;
                                    var21 += 7;
                                    var39 = var13 + var11.field2973 - 5 - var20;
                                    var26 = 5 + var11.field2990 + var14;
                                    if (var39 < var13 + 5) {
                                       var39 = var13 + 5;
                                    }

                                    if (var39 + var20 > var4) {
                                       var39 = var4 - var20;
                                    }

                                    if (var21 + var26 > var5) {
                                       var26 = var5 - var21;
                                    }

                                    class394.method6265(var39, var26, var20, var21, 16777120);
                                    class394.method6292(var39, var26, var20, var21, 0);
                                    var37 = var11.field3042;
                                    var27 = var26 + var33.field3738 + 2;

                                    for(var37 = Player.method1714(var37, var11); var37.length() > 0; var27 += 1 + var33.field3738) {
                                       int var28 = var37.indexOf(class79.field1144);
                                       if (-1 != var28) {
                                          var35 = var37.substring(0, var28);
                                          var37 = var37.substring(var28 + 4);
                                       } else {
                                          var35 = var37;
                                          var37 = "";
                                       }

                                       var33.method4853(var35, 3 + var39, var27, 0, -1);
                                    }
                                 }

                                 if (var11.field2977 == 9) {
                                    if (var11.field2992) {
                                       var20 = var13;
                                       var21 = var11.field2990 + var14;
                                       var22 = var11.field2973 + var13;
                                       var23 = var14;
                                    } else {
                                       var20 = var13;
                                       var21 = var14;
                                       var22 = var11.field2973 + var13;
                                       var23 = var11.field2990 + var14;
                                    }

                                    if (1 == var11.field2959) {
                                       class394.method6255(var20, var21, var22, var23, var11.field2983);
                                    } else {
                                       class71.method1745(var20, var21, var22, var23, var11.field2983, var11.field2959);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
