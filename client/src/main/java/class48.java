public class class48 {
   static int field692 = 0;
   static int field694 = 0;
   static int field705;
   static int[] field695 = new int[]{1, 1, 1, 1};
   static int[] field696 = new int[]{0, 1, 2, 3};
   static String field704;
   int field697;
   int field699;
   int field700;
   int field702;
   int field703;
   String field690;
   String field701;

   public static void method1292(class277 var0) {
      class140.field1529 = var0;
      class282.field3631 = class140.field1529.method4438(16);
   }

   class48() {
   }

   public static class159 method1312(int var0) {
      class159 var2 = (class159)class159.field1861.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class159.field1875.method4412(12, var0);
         var2 = new class159();
         if (null != var3) {
            var2.method2806(new Buffer(var3));
         }

         var2.method2776();
         class159.field1861.method3882(var2, (long)var0);
         return var2;
      }
   }

   public static final void method1317(class33 var0) {
      class182.field2087 = var0;
   }

   static void method1316(int var0, int var1, int var2, int var3) {
      for(class50 var5 = (class50)class50.field720.method4687(); var5 != null; var5 = (class50)class50.field720.method4678()) {
         if (-1 != var5.field734 || null != var5.field730) {
            int var6 = 0;
            if (var1 > var5.field723) {
               var6 += var1 - var5.field723;
            } else if (var1 < var5.field721) {
               var6 += var5.field721 - var1;
            }

            if (var2 > var5.field724) {
               var6 += var2 - var5.field724;
            } else if (var2 < var5.field731) {
               var6 += var5.field731 - var2;
            }

            if (var6 - 64 <= var5.field719 && class38.clientPreferences.field1116 != 0 && var0 == var5.field722) {
               var6 -= 64;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = (var5.field719 - var6) * class38.clientPreferences.field1116 / var5.field719;
               if (var5.field727 == null) {
                  if (var5.field734 >= 0) {
                     class22 var8 = class22.method357(class139.archive4, var5.field734, 0);
                     if (var8 != null) {
                        class23 var9 = var8.method351().method362(class158.field1842);
                        class30 var10 = class30.method537(var9, 100, var7);
                        var10.method566(-1);
                        class82.field1163.method329(var10);
                        var5.field727 = var10;
                     }
                  }
               } else {
                  var5.field727.method496(var7);
               }

               if (null == var5.field725) {
                  if (var5.field730 != null && (var5.field726 -= var3) <= 0) {
                     int var12 = (int)(Math.random() * (double)var5.field730.length);
                     class22 var13 = class22.method357(class139.archive4, var5.field730[var12], 0);
                     if (null != var13) {
                        class23 var14 = var13.method351().method362(class158.field1842);
                        class30 var11 = class30.method537(var14, 100, var7);
                        var11.method566(0);
                        class82.field1163.method329(var11);
                        var5.field725 = var11;
                        var5.field726 = var5.field728 + (int)(Math.random() * (double)(var5.field729 - var5.field728));
                     }
                  }
               } else {
                  var5.field725.method496(var7);
                  if (!var5.field725.method549()) {
                     var5.field725 = null;
                  }
               }
            } else {
               if (null != var5.field727) {
                  class82.field1163.method336(var5.field727);
                  var5.field727 = null;
               }

               if (var5.field725 != null) {
                  class82.field1163.method336(var5.field725);
                  var5.field725 = null;
               }
            }
         }
      }

   }

   boolean method1274() {
      return 0 != (1 & this.field700);
   }

   boolean method1275() {
      return (2 & this.field700) != 0;
   }

   boolean method1276() {
      return 0 != (4 & this.field700);
   }

   boolean method1277() {
      return (8 & this.field700) != 0;
   }

   boolean method1278() {
      return 0 != (536870912 & this.field700);
   }

   boolean method1290() {
      return 0 != (33554432 & this.field700);
   }

   boolean method1297() {
      return 0 != (1073741824 & this.field700);
   }

   static int method1293(int var0, class59 var1, boolean var2) {
      if (var0 == 5306) {
         class51.field747[++class51.field746 - 1] = class238.method4117();
         return 1;
      } else {
         int var4;
         if (var0 == 5307) {
            var4 = class51.field747[--class51.field746];
            if (var4 == 1 || 2 == var4) {
               class165.method2864(var4);
            }

            return 1;
         } else if (5308 == var0) {
            class51.field747[++class51.field746 - 1] = class38.clientPreferences.field1122;
            return 1;
         } else if (var0 != 5309) {
            if (var0 == 5310) {
               --class51.field746;
               return 1;
            } else if (5311 == var0) {
               class51.field746 -= 2;
               return 1;
            } else if (5312 == var0) {
               --class51.field746;
               return 1;
            } else if (5350 == var0) {
               class2.field4 -= 2;
               --class51.field746;
               return 1;
            } else if (5351 == var0) {
               --class2.field4;
               return 1;
            } else {
               return 2;
            }
         } else {
            var4 = class51.field747[--class51.field746];
            if (var4 == 1 || 2 == var4) {
               class38.clientPreferences.field1122 = var4;
               class135.savePreferences();
            }

            return 1;
         }
      }
   }

   static int method1309(int var0, class59 var1, boolean var2) {
      if (6500 == var0) {
         class51.field747[++class51.field746 - 1] = class270.method4359() ? 1 : 0;
         return 1;
      } else {
         class48 var9;
         if (6501 == var0) {
            var9 = class189.method3261();
            if (null != var9) {
               class51.field747[++class51.field746 - 1] = var9.field697;
               class51.field747[++class51.field746 - 1] = var9.field700;
               class51.field738[++class2.field4 - 1] = var9.field690;
               class51.field747[++class51.field746 - 1] = var9.field702;
               class51.field747[++class51.field746 - 1] = var9.field699;
               class51.field738[++class2.field4 - 1] = var9.field701;
            } else {
               class51.field747[++class51.field746 - 1] = -1;
               class51.field747[++class51.field746 - 1] = 0;
               class51.field738[++class2.field4 - 1] = "";
               class51.field747[++class51.field746 - 1] = 0;
               class51.field747[++class51.field746 - 1] = 0;
               class51.field738[++class2.field4 - 1] = "";
            }

            return 1;
         } else if (6502 == var0) {
            var9 = class113.method2115();
            if (var9 != null) {
               class51.field747[++class51.field746 - 1] = var9.field697;
               class51.field747[++class51.field746 - 1] = var9.field700;
               class51.field738[++class2.field4 - 1] = var9.field690;
               class51.field747[++class51.field746 - 1] = var9.field702;
               class51.field747[++class51.field746 - 1] = var9.field699;
               class51.field738[++class2.field4 - 1] = var9.field701;
            } else {
               class51.field747[++class51.field746 - 1] = -1;
               class51.field747[++class51.field746 - 1] = 0;
               class51.field738[++class2.field4 - 1] = "";
               class51.field747[++class51.field746 - 1] = 0;
               class51.field747[++class51.field746 - 1] = 0;
               class51.field738[++class2.field4 - 1] = "";
            }

            return 1;
         } else {
            int var4;
            class48 var5;
            int var11;
            if (var0 == 6506) {
               var4 = class51.field747[--class51.field746];
               var5 = null;

               for(var11 = 0; var11 < field692; ++var11) {
                  if (class16.field86[var11].field697 == var4) {
                     var5 = class16.field86[var11];
                     break;
                  }
               }

               if (var5 != null) {
                  class51.field747[++class51.field746 - 1] = var5.field697;
                  class51.field747[++class51.field746 - 1] = var5.field700;
                  class51.field738[++class2.field4 - 1] = var5.field690;
                  class51.field747[++class51.field746 - 1] = var5.field702;
                  class51.field747[++class51.field746 - 1] = var5.field699;
                  class51.field738[++class2.field4 - 1] = var5.field701;
               } else {
                  class51.field747[++class51.field746 - 1] = -1;
                  class51.field747[++class51.field746 - 1] = 0;
                  class51.field738[++class2.field4 - 1] = "";
                  class51.field747[++class51.field746 - 1] = 0;
                  class51.field747[++class51.field746 - 1] = 0;
                  class51.field738[++class2.field4 - 1] = "";
               }

               return 1;
            } else if (var0 == 6507) {
               class51.field746 -= 4;
               var4 = class51.field747[class51.field746];
               boolean var10 = class51.field747[class51.field746 + 1] == 1;
               var11 = class51.field747[2 + class51.field746];
               boolean var7 = class51.field747[class51.field746 + 3] == 1;
               class324.method5154(var4, var10, var11, var7);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == 6512) {
                  client.field408 = class51.field747[--class51.field746] == 1;
                  return 1;
               } else {
                  class153 var6;
                  int var8;
                  if (6513 == var0) {
                     class51.field746 -= 2;
                     var4 = class51.field747[class51.field746];
                     var8 = class51.field747[1 + class51.field746];
                     var6 = PacketBuffer.method5928(var8);
                     if (var6.method2548()) {
                        class51.field738[++class2.field4 - 1] = class97.method2065(var4).method2474(var8, var6.field1701);
                     } else {
                        class51.field747[++class51.field746 - 1] = class97.method2065(var4).method2475(var8, var6.field1696);
                     }

                     return 1;
                  } else if (var0 == 6514) {
                     class51.field746 -= 2;
                     var4 = class51.field747[class51.field746];
                     var8 = class51.field747[class51.field746 + 1];
                     var6 = PacketBuffer.method5928(var8);
                     if (var6.method2548()) {
                        class51.field738[++class2.field4 - 1] = class124.method2243(var4).method2639(var8, var6.field1701);
                     } else {
                        class51.field747[++class51.field746 - 1] = class124.method2243(var4).method2673(var8, var6.field1696);
                     }

                     return 1;
                  } else if (var0 == 6515) {
                     class51.field746 -= 2;
                     var4 = class51.field747[class51.field746];
                     var8 = class51.field747[class51.field746 + 1];
                     var6 = PacketBuffer.method5928(var8);
                     if (var6.method2548()) {
                        class51.field738[++class2.field4 - 1] = KeyHandler.method93(var4).method2700(var8, var6.field1701);
                     } else {
                        class51.field747[++class51.field746 - 1] = KeyHandler.method93(var4).method2741(var8, var6.field1696);
                     }

                     return 1;
                  } else if (var0 == 6516) {
                     class51.field746 -= 2;
                     var4 = class51.field747[class51.field746];
                     var8 = class51.field747[1 + class51.field746];
                     var6 = PacketBuffer.method5928(var8);
                     if (var6.method2548()) {
                        class51.field738[++class2.field4 - 1] = class102.method2080(var4).method2573(var8, var6.field1701);
                     } else {
                        class51.field747[++class51.field746 - 1] = class102.method2080(var4).method2572(var8, var6.field1696);
                     }

                     return 1;
                  } else if (var0 == 6518) {
                     class51.field747[++class51.field746 - 1] = client.field412 ? 1 : 0;
                     return 1;
                  } else if (var0 == 6519) {
                     class51.field747[++class51.field746 - 1] = client.field410 & 3;
                     return 1;
                  } else if (6520 == var0) {
                     return 1;
                  } else if (6521 == var0) {
                     return 1;
                  } else if (6522 == var0) {
                     --class2.field4;
                     --class51.field746;
                     return 1;
                  } else if (var0 == 6523) {
                     --class2.field4;
                     --class51.field746;
                     return 1;
                  } else if (6524 == var0) {
                     class51.field747[++class51.field746 - 1] = -1;
                     return 1;
                  } else if (var0 == 6525) {
                     class51.field747[++class51.field746 - 1] = 1;
                     return 1;
                  } else if (var0 == 6526) {
                     class51.field747[++class51.field746 - 1] = 1;
                     return 1;
                  } else if (6527 == var0) {
                     class51.field747[++class51.field746 - 1] = client.field474;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = class51.field747[--class51.field746];
               if (var4 >= 0 && var4 < field692) {
                  var5 = class16.field86[var4];
                  class51.field747[++class51.field746 - 1] = var5.field697;
                  class51.field747[++class51.field746 - 1] = var5.field700;
                  class51.field738[++class2.field4 - 1] = var5.field690;
                  class51.field747[++class51.field746 - 1] = var5.field702;
                  class51.field747[++class51.field746 - 1] = var5.field699;
                  class51.field738[++class2.field4 - 1] = var5.field701;
               } else {
                  class51.field747[++class51.field746 - 1] = -1;
                  class51.field747[++class51.field746 - 1] = 0;
                  class51.field738[++class2.field4 - 1] = "";
                  class51.field747[++class51.field746 - 1] = 0;
                  class51.field747[++class51.field746 - 1] = 0;
                  class51.field738[++class2.field4 - 1] = "";
               }

               return 1;
            }
         }
      }
   }

   static final void method1315(class72 var0) {
      int var2 = Math.max(1, var0.field1074 - client.field452);
      int var3 = var0.field1024 * 64 + var0.field1063 * 128;
      int var4 = var0.field1024 * 64 + var0.field1065 * 128;
      var0.x += (var3 - var0.x) / var2;
      var0.y += (var4 - var0.y) / var2;
      var0.field1079 = 0;
      var0.orientation = var0.field1051;
   }

   static void method1314(int var0) {
      for(class353 var2 = (class353)client.field469.method5736(); null != var2; var2 = (class353)client.field469.method5739()) {
         if ((long)var0 == (var2.field3966 >> 48 & 65535L)) {
            var2.remove();
         }
      }

   }
}
