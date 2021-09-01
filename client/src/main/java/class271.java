public class class271 implements class290 {
   static class275 archive8;
   static int field3533;
   static final class271 field3531 = new class271(-1);
   static final class271 field3532 = new class271(1);
   static final class271 field3534 = new class271(0);
   static final class271 field3537 = new class271(2);
   final int field3530;

   class271(int var1) {
      this.field3530 = var1;
   }

   public int method4619() {
      return this.field3530;
   }

   static final void method4360() {
      MouseHandler.method326(class270.field3401);
   }

   static final void method4364(Interface[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var9 = 0; var9 < var0.length; ++var9) {
         Interface var10 = var0[var9];
         if (var10 != null && var10.field3001 == var1 && (!var10.field2993 || 0 == var10.field2977 || var10.field3044 || class241.method4140(var10) != 0 || client.field582 == var10 || var10.field2962 == 1338)) {
            if (var10.field2993) {
               if (class151.method2531(var10)) {
                  continue;
               }
            } else if (var10.field2977 == 0 && var10 != class245.field2923 && class151.method2531(var10)) {
               continue;
            }

            int var11 = var6 + var10.field2971;
            int var12 = var10.field2972 + var7;
            int var13;
            int var14;
            int var15;
            int var16;
            int var18;
            int var19;
            if (2 == var10.field2977) {
               var13 = var2;
               var14 = var3;
               var15 = var4;
               var16 = var5;
            } else {
               int var17;
               if (9 == var10.field2977) {
                  var17 = var11;
                  var18 = var12;
                  var19 = var11 + var10.field2973;
                  int var20 = var12 + var10.field2990;
                  if (var19 < var11) {
                     var17 = var19;
                     var19 = var11;
                  }

                  if (var20 < var12) {
                     var18 = var20;
                     var20 = var12;
                  }

                  ++var19;
                  ++var20;
                  var13 = var17 > var2 ? var17 : var2;
                  var14 = var18 > var3 ? var18 : var3;
                  var15 = var19 < var4 ? var19 : var4;
                  var16 = var20 < var5 ? var20 : var5;
               } else {
                  var17 = var10.field2973 + var11;
                  var18 = var12 + var10.field2990;
                  var13 = var11 > var2 ? var11 : var2;
                  var14 = var12 > var3 ? var12 : var3;
                  var15 = var17 < var4 ? var17 : var4;
                  var16 = var18 < var5 ? var18 : var5;
               }
            }

            if (var10 == client.field581) {
               client.field589 = true;
               client.field679 = var11;
               client.field677 = var12;
            }

            boolean var27 = false;
            if (var10.field3032) {
               switch(client.field570) {
               case 0:
                  var27 = true;
               case 1:
               default:
                  break;
               case 2:
                  if (var10.id >>> 16 == client.field484) {
                     var27 = true;
                  }
                  break;
               case 3:
                  if (client.field484 == var10.id) {
                     var27 = true;
                  }
               }
            }

            if (var27 || !var10.field2993 || var13 < var15 && var14 < var16) {
               if (var10.field2993) {
                  ScriptEvent var28;
                  if (var10.field3102) {
                     if (MouseHandler.field142 >= var13 && MouseHandler.field145 >= var14 && MouseHandler.field142 < var15 && MouseHandler.field145 < var16) {
                        for(var28 = (ScriptEvent)client.field611.method4687(); var28 != null; var28 = (ScriptEvent)client.field611.method4678()) {
                           if (var28.field964) {
                              var28.remove();
                              var28.field961.field3093 = false;
                           }
                        }

                        if (0 == class107.field1319) {
                           client.field581 = null;
                           client.field582 = null;
                        }

                        if (!client.isMenuOpen) {
                           KeyHandler.method94();
                        }
                     }
                  } else if (var10.field3078 && MouseHandler.field142 >= var13 && MouseHandler.field145 >= var14 && MouseHandler.field142 < var15 && MouseHandler.field145 < var16) {
                     for(var28 = (ScriptEvent)client.field611.method4687(); var28 != null; var28 = (ScriptEvent)client.field611.method4678()) {
                        if (var28.field964 && var28.args == var28.field961.field3065) {
                           var28.remove();
                        }
                     }
                  }
               }

               var18 = MouseHandler.field142;
               var19 = MouseHandler.field145;
               if (0 != MouseHandler.lastButton) {
                  var18 = MouseHandler.lastPressedX;
                  var19 = MouseHandler.lastPressedY;
               }

               boolean var29 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
               if (var10.field2962 == 1337) {
                  if (!client.field415 && !client.isMenuOpen && var29) {
                     class265.method4342(var18, var19, var13, var14);
                  }
               } else if (1338 == var10.field2962) {
                  class54.method1541(var10, var11, var12);
               } else {
                  if (1400 == var10.field2962) {
                     class25.field202.method5484(MouseHandler.field142, MouseHandler.field145, var29, var11, var12, var10.field2973, var10.field2990);
                  }

                  if (!client.isMenuOpen && var29) {
                     if (1400 == var10.field2962) {
                        class25.field202.method5496(var11, var12, var10.field2973, var10.field2990, var18, var19);
                     } else {
                        class19.method301(var10, var18 - var11, var19 - var12);
                     }
                  }

                  boolean var22;
                  int var24;
                  if (var27) {
                     for(int var21 = 0; var21 < var10.field2988.length; ++var21) {
                        var22 = false;
                        boolean var23 = false;
                        if (!var22 && var10.field2988[var21] != null) {
                           for(var24 = 0; var24 < var10.field2988[var21].length; ++var24) {
                              boolean var25 = false;
                              if (null != var10.field2967) {
                                 var25 = KeyHandler.pressedKeys[var10.field2988[var21][var24]];
                              }

                              if (class311.method5053(var10.field2988[var21][var24]) || var25) {
                                 var22 = true;
                                 if (var10.field2967 != null && var10.field2967[var21] > client.cycle) {
                                    break;
                                 }

                                 byte var26 = var10.field3034[var21][var24];
                                 if (0 == var26 || (0 == (var26 & 8) || !KeyHandler.pressedKeys[86] && !KeyHandler.pressedKeys[82] && !KeyHandler.pressedKeys[81]) && (0 == (var26 & 2) || KeyHandler.pressedKeys[86]) && ((var26 & 1) == 0 || KeyHandler.pressedKeys[82]) && ((var26 & 4) == 0 || KeyHandler.pressedKeys[81])) {
                                    var23 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var23) {
                           if (var21 < 10) {
                              class184.method3200(var21 + 1, var10.id, var10.field3031, var10.field3088, "");
                           } else if (var21 == 10) {
                              class166.method2877();
                              ApproximateRouteStrategy.method803(var10.id, var10.field3031, class104.method2082(class241.method4140(var10)), var10.field3088);
                              client.field566 = class25.method413(var10);
                              if (client.field566 == null) {
                                 client.field566 = class270.field3234;
                              }

                              client.field466 = var10.field3037 + class44.method770(16777215);
                           }

                           var24 = var10.field2994[var21];
                           if (var10.field2967 == null) {
                              var10.field2967 = new int[var10.field2988.length];
                           }

                           if (var10.field3036 == null) {
                              var10.field3036 = new int[var10.field2988.length];
                           }

                           if (var24 != 0) {
                              if (0 == var10.field2967[var21]) {
                                 var10.field2967[var21] = client.cycle + var24 + var10.field3036[var21];
                              } else {
                                 var10.field2967[var21] = client.cycle + var24;
                              }
                           } else {
                              var10.field2967[var21] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var22 && null != var10.field2967) {
                           var10.field2967[var21] = 0;
                        }
                     }
                  }

                  if (var10.field2993) {
                     if (MouseHandler.field142 >= var13 && MouseHandler.field145 >= var14 && MouseHandler.field142 < var15 && MouseHandler.field145 < var16) {
                        var29 = true;
                     } else {
                        var29 = false;
                     }

                     boolean var30 = false;
                     if ((MouseHandler.field141 == 1 || !class311.mouseCam && MouseHandler.field141 == 4) && var29) {
                        var30 = true;
                     }

                     var22 = false;
                     if ((MouseHandler.lastButton == 1 || !class311.mouseCam && 4 == MouseHandler.lastButton) && MouseHandler.lastPressedX >= var13 && MouseHandler.lastPressedY >= var14 && MouseHandler.lastPressedX < var15 && MouseHandler.lastPressedY < var16) {
                        var22 = true;
                     }

                     if (var22) {
                        class65.method1677(var10, MouseHandler.lastPressedX - var11, MouseHandler.lastPressedY - var12);
                     }

                     if (var10.field2962 == 1400) {
                        class25.field202.method5485(var18, var19, var29 & var30, var29 & var22);
                     }

                     if (null != client.field581 && var10 != client.field581 && var29 && PlayerList.method1885(class241.method4140(var10))) {
                        client.field585 = var10;
                     }

                     if (client.field582 == var10) {
                        client.field586 = true;
                        client.field587 = var11;
                        client.field588 = var12;
                     }

                     if (var10.field3044) {
                        ScriptEvent var32;
                        if (var29 && 0 != client.field657 && null != var10.field3065) {
                           var32 = new ScriptEvent();
                           var32.field964 = true;
                           var32.field961 = var10;
                           var32.field956 = client.field657;
                           var32.args = var10.field3065;
                           client.field611.method4672(var32);
                        }

                        if (client.field581 != null || null != client.field688 || client.isMenuOpen) {
                           var22 = false;
                           var30 = false;
                           var29 = false;
                        }

                        if (!var10.field2980 && var22) {
                           var10.field2980 = true;
                           if (var10.field3046 != null) {
                              var32 = new ScriptEvent();
                              var32.field964 = true;
                              var32.field961 = var10;
                              var32.field953 = MouseHandler.lastPressedX - var11;
                              var32.field956 = MouseHandler.lastPressedY - var12;
                              var32.args = var10.field3046;
                              client.field611.method4672(var32);
                           }
                        }

                        if (var10.field2980 && var30 && null != var10.field3047) {
                           var32 = new ScriptEvent();
                           var32.field964 = true;
                           var32.field961 = var10;
                           var32.field953 = MouseHandler.field142 - var11;
                           var32.field956 = MouseHandler.field145 - var12;
                           var32.args = var10.field3047;
                           client.field611.method4672(var32);
                        }

                        if (var10.field2980 && !var30) {
                           var10.field2980 = false;
                           if (var10.field2955 != null) {
                              var32 = new ScriptEvent();
                              var32.field964 = true;
                              var32.field961 = var10;
                              var32.field953 = MouseHandler.field142 - var11;
                              var32.field956 = MouseHandler.field145 - var12;
                              var32.args = var10.field2955;
                              client.field686.method4672(var32);
                           }
                        }

                        if (var30 && null != var10.field3049) {
                           var32 = new ScriptEvent();
                           var32.field964 = true;
                           var32.field961 = var10;
                           var32.field953 = MouseHandler.field142 - var11;
                           var32.field956 = MouseHandler.field145 - var12;
                           var32.args = var10.field3049;
                           client.field611.method4672(var32);
                        }

                        if (!var10.field3093 && var29) {
                           var10.field3093 = true;
                           if (null != var10.field3050) {
                              var32 = new ScriptEvent();
                              var32.field964 = true;
                              var32.field961 = var10;
                              var32.field953 = MouseHandler.field142 - var11;
                              var32.field956 = MouseHandler.field145 - var12;
                              var32.args = var10.field3050;
                              client.field611.method4672(var32);
                           }
                        }

                        if (var10.field3093 && var29 && null != var10.field3051) {
                           var32 = new ScriptEvent();
                           var32.field964 = true;
                           var32.field961 = var10;
                           var32.field953 = MouseHandler.field142 - var11;
                           var32.field956 = MouseHandler.field145 - var12;
                           var32.args = var10.field3051;
                           client.field611.method4672(var32);
                        }

                        if (var10.field3093 && !var29) {
                           var10.field3093 = false;
                           if (null != var10.field3052) {
                              var32 = new ScriptEvent();
                              var32.field964 = true;
                              var32.field961 = var10;
                              var32.field953 = MouseHandler.field142 - var11;
                              var32.field956 = MouseHandler.field145 - var12;
                              var32.args = var10.field3052;
                              client.field686.method4672(var32);
                           }
                        }

                        if (var10.field3017 != null) {
                           var32 = new ScriptEvent();
                           var32.field961 = var10;
                           var32.args = var10.field3017;
                           client.field612.method4672(var32);
                        }

                        int var34;
                        ScriptEvent var36;
                        int var37;
                        if (var10.field3057 != null && client.field552 > var10.field3096) {
                           if (var10.field3058 != null && client.field552 - var10.field3096 <= 32) {
                              label820:
                              for(var37 = var10.field3096; var37 < client.field552; ++var37) {
                                 var24 = client.field594[var37 & 31];

                                 for(var34 = 0; var34 < var10.field3058.length; ++var34) {
                                    if (var24 == var10.field3058[var34]) {
                                       var36 = new ScriptEvent();
                                       var36.field961 = var10;
                                       var36.args = var10.field3057;
                                       client.field611.method4672(var36);
                                       break label820;
                                    }
                                 }
                              }
                           } else {
                              var32 = new ScriptEvent();
                              var32.field961 = var10;
                              var32.args = var10.field3057;
                              client.field611.method4672(var32);
                           }

                           var10.field3096 = client.field552;
                        }

                        if (var10.field3083 != null && client.field575 > var10.field3097) {
                           if (null != var10.field3060 && client.field575 - var10.field3097 <= 32) {
                              label796:
                              for(var37 = var10.field3097; var37 < client.field575; ++var37) {
                                 var24 = client.field641[var37 & 31];

                                 for(var34 = 0; var34 < var10.field3060.length; ++var34) {
                                    if (var24 == var10.field3060[var34]) {
                                       var36 = new ScriptEvent();
                                       var36.field961 = var10;
                                       var36.args = var10.field3083;
                                       client.field611.method4672(var36);
                                       break label796;
                                    }
                                 }
                              }
                           } else {
                              var32 = new ScriptEvent();
                              var32.field961 = var10;
                              var32.args = var10.field3083;
                              client.field611.method4672(var32);
                           }

                           var10.field3097 = client.field575;
                        }

                        if (var10.field2996 != null && client.field599 > var10.field3098) {
                           if (null != var10.field3062 && client.field599 - var10.field3098 <= 32) {
                              label772:
                              for(var37 = var10.field3098; var37 < client.field599; ++var37) {
                                 var24 = client.field428[var37 & 31];

                                 for(var34 = 0; var34 < var10.field3062.length; ++var34) {
                                    if (var10.field3062[var34] == var24) {
                                       var36 = new ScriptEvent();
                                       var36.field961 = var10;
                                       var36.args = var10.field2996;
                                       client.field611.method4672(var36);
                                       break label772;
                                    }
                                 }
                              }
                           } else {
                              var32 = new ScriptEvent();
                              var32.field961 = var10;
                              var32.args = var10.field2996;
                              client.field611.method4672(var32);
                           }

                           var10.field3098 = client.field599;
                        }

                        if (client.field602 > var10.field3095 && null != var10.field3066) {
                           var32 = new ScriptEvent();
                           var32.field961 = var10;
                           var32.args = var10.field3066;
                           client.field611.method4672(var32);
                        }

                        if (client.field610 > var10.field3095 && var10.field3070 != null) {
                           var32 = new ScriptEvent();
                           var32.field961 = var10;
                           var32.args = var10.field3070;
                           client.field611.method4672(var32);
                        }

                        if (client.field604 > var10.field3095 && null != var10.field3059) {
                           var32 = new ScriptEvent();
                           var32.field961 = var10;
                           var32.args = var10.field3059;
                           client.field611.method4672(var32);
                        }

                        if (client.field605 > var10.field3095 && null != var10.field3075) {
                           var32 = new ScriptEvent();
                           var32.field961 = var10;
                           var32.args = var10.field3075;
                           client.field611.method4672(var32);
                        }

                        if (client.field606 > var10.field3095 && var10.field3073 != null) {
                           var32 = new ScriptEvent();
                           var32.field961 = var10;
                           var32.args = var10.field3073;
                           client.field611.method4672(var32);
                        }

                        if (client.field607 > var10.field3095 && null != var10.field2982) {
                           var32 = new ScriptEvent();
                           var32.field961 = var10;
                           var32.args = var10.field2982;
                           client.field611.method4672(var32);
                        }

                        if (client.field480 > var10.field3095 && var10.field3079 != null) {
                           var32 = new ScriptEvent();
                           var32.field961 = var10;
                           var32.args = var10.field3079;
                           client.field611.method4672(var32);
                        }

                        if (client.field517 > var10.field3095 && null != var10.field3074) {
                           var32 = new ScriptEvent();
                           var32.field961 = var10;
                           var32.args = var10.field3074;
                           client.field611.method4672(var32);
                        }

                        var10.field3095 = client.field593;
                        if (null != var10.field3067) {
                           for(var37 = 0; var37 < client.field451; ++var37) {
                              ScriptEvent var35 = new ScriptEvent();
                              var35.field961 = var10;
                              var35.field959 = client.field431[var37];
                              var35.field960 = client.field634[var37];
                              var35.args = var10.field3067;
                              client.field611.method4672(var35);
                           }
                        }

                        ScriptEvent var38;
                        int[] var39;
                        if (null != var10.field3068) {
                           var39 = class137.method2330();

                           for(var24 = 0; var24 < var39.length; ++var24) {
                              var38 = new ScriptEvent();
                              var38.field961 = var10;
                              var38.field959 = var39[var24];
                              var38.args = var10.field3068;
                              client.field611.method4672(var38);
                           }
                        }

                        if (var10.field3069 != null) {
                           var39 = class76.method1819();

                           for(var24 = 0; var24 < var39.length; ++var24) {
                              var38 = new ScriptEvent();
                              var38.field961 = var10;
                              var38.field959 = var39[var24];
                              var38.args = var10.field3069;
                              client.field611.method4672(var38);
                           }
                        }
                     }
                  }

                  if (!var10.field2993) {
                     if (null != client.field581 || null != client.field688 || client.isMenuOpen) {
                        continue;
                     }

                     if ((var10.field3012 >= 0 || 0 != var10.field2985) && MouseHandler.field142 >= var13 && MouseHandler.field145 >= var14 && MouseHandler.field142 < var15 && MouseHandler.field145 < var16) {
                        if (var10.field3012 >= 0) {
                           class245.field2923 = var0[var10.field3012];
                        } else {
                           class245.field2923 = var10;
                        }
                     }

                     if (8 == var10.field2977 && MouseHandler.field142 >= var13 && MouseHandler.field145 >= var14 && MouseHandler.field142 < var15 && MouseHandler.field145 < var16) {
                        class293.field3699 = var10;
                     }

                     if (var10.field3091 > var10.field2990) {
                        class125.method2246(var10, var11 + var10.field2973, var12, var10.field2990, var10.field3091, MouseHandler.field142, MouseHandler.field145);
                     }
                  }

                  if (0 == var10.field2977) {
                     method4364(var0, var10.id, var13, var14, var15, var16, var11 - var10.field3054, var12 - var10.field2968);
                     if (var10.field3061 != null) {
                        method4364(var10.field3061, var10.id, var13, var14, var15, var16, var11 - var10.field3054, var12 - var10.field2968);
                     }

                     InterfaceParent var31 = (InterfaceParent)client.interfaceParents.get((long)var10.id);
                     if (var31 != null) {
                        if (0 == var31.field949 && MouseHandler.field142 >= var13 && MouseHandler.field145 >= var14 && MouseHandler.field142 < var15 && MouseHandler.field145 < var16 && !client.isMenuOpen) {
                           for(ScriptEvent var33 = (ScriptEvent)client.field611.method4687(); null != var33; var33 = (ScriptEvent)client.field611.method4678()) {
                              if (var33.field964) {
                                 var33.remove();
                                 var33.field961.field3093 = false;
                              }
                           }

                           if (class107.field1319 == 0) {
                              client.field581 = null;
                              client.field582 = null;
                           }

                           if (!client.isMenuOpen) {
                              KeyHandler.method94();
                           }
                        }

                        class246.method4174(var31.field950, var13, var14, var15, var16, var11, var12);
                     }
                  }
               }
            }
         }
      }

   }
}
