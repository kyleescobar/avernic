public class class79 {
   static String field1138 = "|";
   static String field1139 = ")";
   static String SYMBOL_COMMA = ",";
   static String field1141 = " (";
   static String field1142 = "true";
   static String field1143 = "->";
   static String field1144 = "<br>";
   static String field1145 = "</col>";

   public static void method1840(class277 var0) {
      class139.field1525 = var0;
   }

   public static int method1843(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   static void method1844(ScriptEvent var0, int var1, int var2) {
      Object[] var4 = var0.args;
      class59 var5;
      int var26;
      if (class217.method3852(var0.field963)) {
         class331.field3879 = (class191)var4[0];
         class141 var6 = class73.method1770(class331.field3879.field2136);
         var5 = class169.method3070(var0.field963, var6.field1534, var6.field1553);
      } else {
         var26 = (Integer)var4[0];
         var5 = class8.method36(var26);
      }

      if (var5 != null) {
         class51.field746 = 0;
         class2.field4 = 0;
         var26 = -1;
         int[] var7 = var5.field865;
         int[] var8 = var5.field870;
         byte var9 = -1;
         class51.field748 = 0;
         class51.field753 = false;
         boolean var10 = false;
         int var11 = 0;
         boolean var23 = false;

         label988: {
            label989: {
               try {
                  int var14;
                  try {
                     var23 = true;
                     class325.field3854 = new int[var5.field864];
                     int var12 = 0;
                     class51.field742 = new String[var5.field868];
                     int var29 = 0;

                     int var15;
                     String var39;
                     for(var14 = 1; var14 < var4.length; ++var14) {
                        if (var4[var14] instanceof Integer) {
                           var15 = (Integer)var4[var14];
                           if (var15 == -2147483647) {
                              var15 = var0.field953;
                           }

                           if (var15 == -2147483646) {
                              var15 = var0.field956;
                           }

                           if (-2147483645 == var15) {
                              var15 = var0.field961 != null ? -1996852661 * var0.field961.id * 611927907 : -1;
                           }

                           if (var15 == -2147483644) {
                              var15 = var0.field957;
                           }

                           if (var15 == -2147483643) {
                              var15 = null != var0.field961 ? -1948690547 * var0.field961.field3031 * 1667744581 : -1;
                           }

                           if (-2147483642 == var15) {
                              var15 = null != var0.field958 ? var0.field958.id * 611927907 * -1996852661 : -1;
                           }

                           if (var15 == -2147483641) {
                              var15 = var0.field958 != null ? -1948690547 * var0.field958.field3031 * 1667744581 : -1;
                           }

                           if (-2147483640 == var15) {
                              var15 = var0.field959;
                           }

                           if (-2147483639 == var15) {
                              var15 = var0.field960;
                           }

                           class325.field3854[var12++] = var15;
                        } else if (var4[var14] instanceof String) {
                           var39 = (String)var4[var14];
                           if (var39.equals("event_opbase")) {
                              var39 = var0.field952;
                           }

                           class51.field742[var29++] = var39;
                        }
                     }

                     class51.field743 = var0.field962;

                     while(true) {
                        ++var11;
                        if (var11 > var1) {
                           throw new RuntimeException();
                        }

                        ++var26;
                        int var27 = var7[var26];
                        if (var27 >= 100) {
                           boolean var38;
                           if (1 == var5.field870[var26]) {
                              var38 = true;
                           } else {
                              var38 = false;
                           }

                           var15 = class80.method1848(var27, var5, var38);
                           switch(var15) {
                           case 0:
                              var23 = false;
                              break label989;
                           case 1:
                           default:
                              break;
                           case 2:
                              throw new IllegalStateException();
                           }
                        } else if (0 == var27) {
                           class51.field747[++class51.field746 - 1] = var8[var26];
                        } else if (1 == var27) {
                           var14 = var8[var26];
                           class51.field747[++class51.field746 - 1] = class244.field2911[var14];
                        } else if (2 == var27) {
                           var14 = var8[var26];
                           class244.field2911[var14] = class51.field747[--class51.field746];
                           ApproximateRouteStrategy.method801(var14);
                        } else if (var27 == 3) {
                           class51.field738[++class2.field4 - 1] = var5.field866[var26];
                        } else if (var27 == 6) {
                           var26 += var8[var26];
                        } else if (var27 == 7) {
                           class51.field746 -= 2;
                           if (class51.field747[class51.field746] != class51.field747[1 + class51.field746]) {
                              var26 += var8[var26];
                           }
                        } else if (8 == var27) {
                           class51.field746 -= 2;
                           if (class51.field747[class51.field746 + 1] == class51.field747[class51.field746]) {
                              var26 += var8[var26];
                           }
                        } else if (9 == var27) {
                           class51.field746 -= 2;
                           if (class51.field747[class51.field746] < class51.field747[1 + class51.field746]) {
                              var26 += var8[var26];
                           }
                        } else if (10 == var27) {
                           class51.field746 -= 2;
                           if (class51.field747[class51.field746] > class51.field747[1 + class51.field746]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 21) {
                           if (class51.field748 == 0) {
                              var23 = false;
                              break;
                           }

                           class44 var37 = class51.field749[--class51.field748];
                           var5 = var37.field368;
                           var7 = var5.field865;
                           var8 = var5.field870;
                           var26 = var37.field366;
                           class325.field3854 = var37.field374;
                           class51.field742 = var37.field369;
                        } else if (25 == var27) {
                           var14 = var8[var26];
                           class51.field747[++class51.field746 - 1] = class175.method3139(var14);
                        } else if (27 == var27) {
                           var14 = var8[var26];
                           class101.method2077(var14, class51.field747[--class51.field746]);
                        } else if (var27 == 31) {
                           class51.field746 -= 2;
                           if (class51.field747[class51.field746] <= class51.field747[class51.field746 + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 32) {
                           class51.field746 -= 2;
                           if (class51.field747[class51.field746] >= class51.field747[class51.field746 + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 33) {
                           class51.field747[++class51.field746 - 1] = class325.field3854[var8[var26]];
                        } else if (var27 == 34) {
                           class325.field3854[var8[var26]] = class51.field747[--class51.field746];
                        } else if (35 == var27) {
                           class51.field738[++class2.field4 - 1] = class51.field742[var8[var26]];
                        } else if (var27 == 36) {
                           class51.field742[var8[var26]] = class51.field738[--class2.field4];
                        } else if (37 == var27) {
                           var14 = var8[var26];
                           class2.field4 -= var14;
                           var39 = class182.method3190(class51.field738, class2.field4, var14);
                           class51.field738[++class2.field4 - 1] = var39;
                        } else if (38 == var27) {
                           --class51.field746;
                        } else if (var27 == 39) {
                           --class2.field4;
                        } else {
                           int var18;
                           if (var27 != 40) {
                              if (42 == var27) {
                                 class51.field747[++class51.field746 - 1] = class38.field311.method1889(var8[var26]);
                              } else if (43 == var27) {
                                 class38.field311.method1888(var8[var26], class51.field747[--class51.field746]);
                              } else if (44 == var27) {
                                 var14 = var8[var26] >> 16;
                                 var15 = var8[var26] & '\uffff';
                                 int var30 = class51.field747[--class51.field746];
                                 if (var30 < 0 || var30 > 5000) {
                                    throw new RuntimeException();
                                 }

                                 class51.field751[var14] = var30;
                                 byte var33 = -1;
                                 if (105 == var15) {
                                    var33 = 0;
                                 }

                                 for(var18 = 0; var18 < var30; ++var18) {
                                    class51.field744[var14][var18] = var33;
                                 }
                              } else if (45 == var27) {
                                 var14 = var8[var26];
                                 var15 = class51.field747[--class51.field746];
                                 if (var15 < 0 || var15 >= class51.field751[var14]) {
                                    throw new RuntimeException();
                                 }

                                 class51.field747[++class51.field746 - 1] = class51.field744[var14][var15];
                              } else if (var27 == 46) {
                                 var14 = var8[var26];
                                 class51.field746 -= 2;
                                 var15 = class51.field747[class51.field746];
                                 if (var15 < 0 || var15 >= class51.field751[var14]) {
                                    throw new RuntimeException();
                                 }

                                 class51.field744[var14][var15] = class51.field747[class51.field746 + 1];
                              } else {
                                 String var31;
                                 if (var27 == 47) {
                                    var31 = class38.field311.method1892(var8[var26]);
                                    if (null == var31) {
                                       var31 = class270.field3234;
                                    }

                                    class51.field738[++class2.field4 - 1] = var31;
                                 } else if (48 == var27) {
                                    class38.field311.method1891(var8[var26], class51.field738[--class2.field4]);
                                 } else if (49 == var27) {
                                    var31 = class38.field311.method1890(var8[var26]);
                                    class51.field738[++class2.field4 - 1] = var31;
                                 } else if (50 == var27) {
                                    class38.field311.method1918(var8[var26], class51.field738[--class2.field4]);
                                 } else if (var27 == 60) {
                                    class363 var34 = var5.field871[var8[var26]];
                                    class353 var42 = (class353)var34.method5716((long)class51.field747[--class51.field746]);
                                    if (null != var42) {
                                       var26 += var42.field3964;
                                    }
                                 } else {
                                    Integer var35;
                                    if (var27 == 74) {
                                       var35 = class150.field1669.method2141(var8[var26]);
                                       if (null == var35) {
                                          class51.field747[++class51.field746 - 1] = -1;
                                       } else {
                                          class51.field747[++class51.field746 - 1] = var35;
                                       }
                                    } else {
                                       if (76 != var27) {
                                          throw new IllegalStateException();
                                       }

                                       var35 = class44.field372.method5395(var8[var26]);
                                       if (null == var35) {
                                          class51.field747[++class51.field746 - 1] = -1;
                                       } else {
                                          class51.field747[++class51.field746 - 1] = var35;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var14 = var8[var26];
                              class59 var41 = class8.method36(var14);
                              int[] var16 = new int[var41.field864];
                              String[] var17 = new String[var41.field868];

                              for(var18 = 0; var18 < var41.field869; ++var18) {
                                 var16[var18] = class51.field747[class51.field746 - var41.field869 + var18];
                              }

                              for(var18 = 0; var18 < var41.field867; ++var18) {
                                 var17[var18] = class51.field738[var18 + (class2.field4 - var41.field867)];
                              }

                              class51.field746 -= var41.field869;
                              class2.field4 -= var41.field867;
                              class44 var36 = new class44();
                              var36.field368 = var5;
                              var36.field366 = var26;
                              var36.field374 = class325.field3854;
                              var36.field369 = class51.field742;
                              class51.field749[++class51.field748 - 1] = var36;
                              var5 = var41;
                              var7 = var41.field865;
                              var8 = var41.field870;
                              var26 = -1;
                              class325.field3854 = var16;
                              class51.field742 = var17;
                           }
                        }
                     }
                  } catch (Exception var24) {
                     var10 = true;
                     StringBuilder var13 = new StringBuilder(30);
                     var13.append("").append(var5.field3966).append(" ");

                     for(var14 = class51.field748 - 1; var14 >= 0; --var14) {
                        var13.append("").append(class51.field749[var14].field368.field3966).append(" ");
                     }

                     var13.append("").append(var9);
                     class333.method5330(var13.toString(), var24);
                     var23 = false;
                     break label988;
                  }
               } finally {
                  if (var23) {
                     if (class51.field753) {
                        class51.field741 = true;
                     }

                     while(class51.field755.size() > 0) {
                        class80 var20 = (class80)class51.field755.remove(0);
                        class184.method3200(var20.method1860(), var20.method1847(), var20.method1851(), var20.method1854(), "");
                     }

                     if (class51.field741) {
                        class25.method446();
                        class51.field741 = false;
                        class51.field753 = false;
                     }

                     if (!var10 && var2 > 0 && var11 >= var2) {
                        class333.method5330("Warning: Script " + var5.field863 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
                     }

                  }
               }

               if (class51.field753) {
                  class51.field741 = true;
               }

               while(class51.field755.size() > 0) {
                  class80 var40 = (class80)class51.field755.remove(0);
                  class184.method3200(var40.method1860(), var40.method1847(), var40.method1851(), var40.method1854(), "");
               }

               if (class51.field741) {
                  class25.method446();
                  class51.field741 = false;
                  class51.field753 = false;
               }

               if (!var10 && var2 > 0 && var11 >= var2) {
                  class333.method5330("Warning: Script " + var5.field863 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
               }

               return;
            }

            if (class51.field753) {
               class51.field741 = true;
            }

            while(class51.field755.size() > 0) {
               class80 var32 = (class80)class51.field755.remove(0);
               class184.method3200(var32.method1860(), var32.method1847(), var32.method1851(), var32.method1854(), "");
            }

            if (class51.field741) {
               class25.method446();
               class51.field741 = false;
               class51.field753 = false;
            }

            if (!var10 && var2 > 0 && var11 >= var2) {
               class333.method5330("Warning: Script " + var5.field863 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
            }

            return;
         }

         if (class51.field753) {
            class51.field741 = true;
         }

         while(class51.field755.size() > 0) {
            class80 var28 = (class80)class51.field755.remove(0);
            class184.method3200(var28.method1860(), var28.method1847(), var28.method1851(), var28.method1854(), "");
         }

         if (class51.field741) {
            class25.method446();
            class51.field741 = false;
            class51.field753 = false;
         }

         if (!var10 && var2 > 0 && var11 >= var2) {
            class333.method5330("Warning: Script " + var5.field863 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
         }

      }
   }
}
