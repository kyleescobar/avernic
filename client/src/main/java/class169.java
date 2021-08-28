import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class class169 {
   public static class221 field1962 = new class221(37748736, 256);
   class163 field1965;
   int field1963;
   int field1967;
   int field1968;
   int field1969;
   HashMap field1970;
   LinkedList field1966;
   List field1958;
   final HashMap field1971;

   public static int method3053(int var0, int var1, int var2, int var3, int var4, int var5) {
      if ((var5 & 1) == 1) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      var2 &= 3;
      if (0 == var2) {
         return var1;
      } else if (var2 == 1) {
         return 7 - var0 - (var3 - 1);
      } else {
         return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
      }
   }

   static class59 method3070(int var0, int var1, int var2) {
      int var4 = class267.method4350(var1, var0);
      class59 var5 = class117.method2186(var4, var0);
      if (var5 != null) {
         return var5;
      } else {
         int var6 = (-3 - var2 << 8) + var0;
         class59 var8 = (class59)class59.field862.method3880((long)(var6 << 16));
         class59 var7;
         if (var8 != null) {
            var7 = var8;
         } else {
            String var9 = String.valueOf(var6);
            int var10 = ApproximateRouteStrategy.archive12.readGroup(var9);
            if (-1 == var10) {
               var7 = null;
            } else {
               byte[] var11 = ApproximateRouteStrategy.archive12.method4419(var10);
               if (var11 != null) {
                  if (var11.length <= 1) {
                     var7 = null;
                     return var7 != null ? var7 : null;
                  }

                  var8 = class211.method3833(var11);
                  if (null != var8) {
                     class59.field862.method3882(var8, (long)(var6 << 16));
                     var7 = var8;
                     return var7 != null ? var7 : null;
                  }
               }

               var7 = null;
            }
         }

         return var7 != null ? var7 : null;
      }
   }

   class169(int var1, int var2, int var3, HashMap var4) {
      this.field1969 = var1;
      this.field1963 = var2;
      this.field1966 = new LinkedList();
      this.field1958 = new LinkedList();
      this.field1970 = new HashMap();
      this.field1967 = var3 | -16777216;
      this.field1971 = var4;
   }

   void method2959(int var1, int var2, int var3) {
      class398 var5 = class266.method4347(this.field1969, this.field1963, this.field1968);
      if (null != var5) {
         if (var3 == this.field1968 * 64) {
            var5.method6446(var1, var2);
         } else {
            var5.method6415(var1, var2, var3, var3);
         }

      }
   }

   void method2960(class163 var1, List var2) {
      this.field1970.clear();
      this.field1965 = var1;
      this.method2965(var2);
   }

   void method2961(HashSet var1, List var2) {
      this.field1970.clear();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         class171 var5 = (class171)var4.next();
         if (var5.method3157() == this.field1969 && var5.method3155() == this.field1963) {
            this.field1966.add(var5);
         }
      }

      this.method2965(var2);
   }

   static final void method3068(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class160[] var8) {
      int var11;
      for(int var10 = 0; var10 < 8; ++var10) {
         for(var11 = 0; var11 < 8; ++var11) {
            if (var10 + var2 > 0 && var2 + var10 < 103 && var11 + var3 > 0 && var11 + var3 < 103) {
               int[] var10000 = var8[var1].field1889[var2 + var10];
               var10000[var3 + var11] &= -16777217;
            }
         }
      }

      Buffer var29 = new Buffer(var0);

      for(var11 = 0; var11 < 4; ++var11) {
         for(int var12 = 0; var12 < 64; ++var12) {
            for(int var13 = 0; var13 < 64; ++var13) {
               if (var11 == var4 && var12 >= var5 && var12 < 8 + var5 && var13 >= var6 && var13 < var6 + 8) {
                  int var18 = var12 & 7;
                  int var19 = var13 & 7;
                  int var20 = var7 & 3;
                  int var17;
                  if (0 == var20) {
                     var17 = var18;
                  } else if (1 == var20) {
                     var17 = var19;
                  } else if (2 == var20) {
                     var17 = 7 - var18;
                  } else {
                     var17 = 7 - var19;
                  }

                  int var23 = var2 + var17;
                  int var26 = var12 & 7;
                  int var27 = var13 & 7;
                  int var28 = var7 & 3;
                  int var25;
                  if (var28 == 0) {
                     var25 = var27;
                  } else if (var28 == 1) {
                     var25 = 7 - var26;
                  } else if (var28 == 2) {
                     var25 = 7 - var27;
                  } else {
                     var25 = var26;
                  }

                  class126.method2253(var29, var1, var23, var25 + var3, 0, 0, var7);
               } else {
                  class126.method2253(var29, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   void method3065(int var1, int var2, int var3, int var4, class177 var5) {
      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         label49:
         for(int var8 = var2; var8 < var4 + var2; ++var8) {
            for(int var9 = 0; var9 < var5.field2052; ++var9) {
               class179[] var10 = var5.field2059[var9][var7][var8];
               if (null != var10 && var10.length != 0) {
                  class179[] var11 = var10;

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     class179 var13 = var11[var12];
                     class156 var14 = class124.method2243(var13.field2071);
                     if (class81.method1870(var14)) {
                        this.method2963(var14, var9, var7, var8, var5);
                        continue label49;
                     }
                  }
               }
            }
         }
      }

   }

   void method2963(class156 var1, int var2, int var3, int var4, class177 var5) {
      class245 var7 = new class245(var2, var3 + this.field1969 * 64, var4 + this.field1963 * 64);
      class245 var8 = null;
      if (this.field1965 != null) {
         var8 = new class245(var2 + this.field1965.field2061, this.field1965.field2051 * 64 + var3, this.field1965.field2048 * 64 + var4);
      } else {
         class171 var9 = (class171)var5;
         var8 = new class245(var2 + var9.field2061, var9.field2051 * 64 + var3 + var9.method3120() * 8, var9.field2048 * 64 + var4 + var9.method3116() * 8);
      }

      class141 var10;
      Object var11;
      if (var1.field1762 != null) {
         var11 = new class166(var8, var7, var1.field1753, this);
      } else {
         var10 = class73.method1770(var1.field1763);
         var11 = new class174(var8, var7, var10.field1534, this.method2989(var10));
      }

      var10 = class73.method1770(((class186)var11).method3208());
      if (var10.field1530) {
         this.field1970.put(new class245(0, var3, var4), var11);
      }

   }

   void method2964() {
      Iterator var2 = this.field1970.values().iterator();

      while(var2.hasNext()) {
         class186 var3 = (class186)var2.next();
         if (var3 instanceof class166) {
            ((class166)var3).method2874();
         }
      }

   }

   void method2965(List var1) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class174 var4 = (class174)var3.next();
         if (class73.method1770(var4.field2017).field1530 && var4.field2110.field2920 >> 6 == this.field1969 && this.field1963 == var4.field2110.field2922 >> 6) {
            class174 var5 = new class174(var4.field2110, var4.field2110, var4.field2017, this.method2988(var4.field2017));
            this.field1958.add(var5);
         }
      }

   }

   void method2966() {
      if (this.field1965 != null) {
         this.field1965.method3149();
      } else {
         Iterator var2 = this.field1966.iterator();

         while(var2.hasNext()) {
            class171 var3 = (class171)var2.next();
            var3.method3149();
         }
      }

   }

   boolean method2967(class277 var1) {
      this.field1970.clear();
      if (this.field1965 != null) {
         this.field1965.method3151(var1);
         if (this.field1965.method3161()) {
            this.method3065(0, 0, 64, 64, this.field1965);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var3 = true;

         Iterator var4;
         class171 var5;
         for(var4 = this.field1966.iterator(); var4.hasNext(); var3 &= var5.method3161()) {
            var5 = (class171)var4.next();
            var5.method3151(var1);
         }

         if (var3) {
            var4 = this.field1966.iterator();

            while(var4.hasNext()) {
               var5 = (class171)var4.next();
               this.method3065(var5.method3127() * 8, var5.method3117() * 8, 8, 8, var5);
            }
         }

         return var3;
      }
   }

   void method2968(int var1, class190 var2, class397[] var3, class277 var4, class277 var5) {
      this.field1968 = var1;
      if (this.field1965 != null || !this.field1966.isEmpty()) {
         if (class266.method4347(this.field1969, this.field1963, var1) == null) {
            boolean var7 = true;
            var7 &= this.method2967(var4);
            int var9;
            if (null != this.field1965) {
               var9 = this.field1965.field2047;
            } else {
               var9 = ((class177)this.field1966.getFirst()).field2047;
            }

            var7 &= var5.method4416(var9);
            if (var7) {
               byte[] var8 = var5.method4419(var9);
               class180 var10;
               if (var8 == null) {
                  var10 = new class180();
               } else {
                  var10 = new class180(class76.method1810(var8).field4280);
               }

               class398 var12 = new class398(this.field1968 * 64, this.field1968 * 64);
               var12.method6400();
               if (null != this.field1965) {
                  this.method2971(var2, var3, var10);
               } else {
                  this.method2972(var2, var3, var10);
               }

               int var13 = this.field1969;
               int var14 = this.field1963;
               int var15 = this.field1968;
               field1962.method3861(var12, class155.method2626(var13, var14, var15), var12.field4280.length * 4);
               this.method2966();
            }
         }
      }
   }

   void method2969(int var1, int var2, int var3, HashSet var4) {
      if (null == var4) {
         var4 = new HashSet();
      }

      this.method2979(var1, var2, var4, var3);
      this.method2985(var1, var2, var4, var3);
   }

   void method2983(HashSet var1, int var2, int var3) {
      Iterator var5 = this.field1970.values().iterator();

      while(var5.hasNext()) {
         class186 var6 = (class186)var5.next();
         if (var6.method3212()) {
            int var7 = var6.method3208();
            if (var1.contains(var7)) {
               class141 var8 = class73.method1770(var7);
               this.method2981(var8, var6.field2112, var6.field2109, var2, var3);
            }
         }
      }

      this.method2980(var1, var2, var3);
   }

   void method2971(class190 var1, class397[] var2, class180 var3) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method3054(var5, var6, this.field1965, var1, var3);
            this.method3005(var5, var6, this.field1965, var1);
         }
      }

      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method2970(var5, var6, this.field1965, var1, var2);
         }
      }

   }

   void method2972(class190 var1, class397[] var2, class180 var3) {
      Iterator var5 = this.field1966.iterator();

      class171 var6;
      int var7;
      int var8;
      while(var5.hasNext()) {
         var6 = (class171)var5.next();

         for(var7 = var6.method3127() * 8; var7 < var6.method3127() * 8 + 8; ++var7) {
            for(var8 = var6.method3117() * 8; var8 < var6.method3117() * 8 + 8; ++var8) {
               this.method3054(var7, var8, var6, var1, var3);
               this.method3005(var7, var8, var6, var1);
            }
         }
      }

      var5 = this.field1966.iterator();

      while(var5.hasNext()) {
         var6 = (class171)var5.next();

         for(var7 = var6.method3127() * 8; var7 < var6.method3127() * 8 + 8; ++var7) {
            for(var8 = var6.method3117() * 8; var8 < var6.method3117() * 8 + 8; ++var8) {
               this.method2970(var7, var8, var6, var1, var2);
            }
         }
      }

   }

   void method2970(int var1, int var2, class177 var3, class190 var4, class397[] var5) {
      this.method2974(var1, var2, var3);
      this.method2977(var1, var2, var3, var5);
   }

   void method3054(int var1, int var2, class177 var3, class190 var4, class180 var5) {
      int var7 = var3.field2055[0][var1][var2] - 1;
      int var8 = var3.field2062[0][var1][var2] - 1;
      if (var7 == -1 && -1 == var8) {
         class394.method6265(var1 * this.field1968, this.field1968 * (63 - var2), this.field1968, this.field1968, this.field1967);
      }

      int var9 = 16711935;
      if (var8 != -1) {
         var9 = class105.method2095(var8, this.field1967);
      }

      if (var8 > -1 && 0 == var3.field2057[0][var1][var2]) {
         class394.method6265(this.field1968 * var1, (63 - var2) * this.field1968, this.field1968, this.field1968, var9);
      } else {
         int var10 = this.method2976(var1, var2, var3, var5);
         if (-1 == var8) {
            class394.method6265(var1 * this.field1968, (63 - var2) * this.field1968, this.field1968, this.field1968, var10);
         } else {
            var4.method3280(var1 * this.field1968, this.field1968 * (63 - var2), var10, var9, this.field1968, this.field1968, var3.field2057[0][var1][var2], var3.field2058[0][var1][var2]);
         }
      }
   }

   void method3005(int var1, int var2, class177 var3, class190 var4) {
      for(int var6 = 1; var6 < var3.field2052; ++var6) {
         int var7 = var3.field2062[var6][var1][var2] - 1;
         if (var7 > -1) {
            int var8 = class105.method2095(var7, this.field1967);
            if (var3.field2057[var6][var1][var2] == 0) {
               class394.method6265(var1 * this.field1968, (63 - var2) * this.field1968, this.field1968, this.field1968, var8);
            } else {
               var4.method3280(this.field1968 * var1, (63 - var2) * this.field1968, 0, var8, this.field1968, this.field1968, var3.field2057[var6][var1][var2], var3.field2058[var6][var1][var2]);
            }
         }
      }

   }

   int method2976(int var1, int var2, class177 var3, class180 var4) {
      return 0 == var3.field2055[0][var1][var2] ? this.field1967 : var4.method3186(var1, var2);
   }

   void method2977(int var1, int var2, class177 var3, class397[] var4) {
      for(int var6 = 0; var6 < var3.field2052; ++var6) {
         class179[] var7 = var3.field2059[var6][var1][var2];
         if (var7 != null && 0 != var7.length) {
            class179[] var8 = var7;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class179 var10 = var8[var9];
               if (!class66.method1680(var10.field2069)) {
                  int var12 = var10.field2069;
                  boolean var11 = class258.field3162.field3163 == var12;
                  if (!var11) {
                     continue;
                  }
               }

               class156 var13 = class124.method2243(var10.field2071);
               if (-1 != var13.field1764) {
                  if (var13.field1764 != 46 && var13.field1764 != 52) {
                     var4[var13.field1764].method6347(this.field1968 * var1, (63 - var2) * this.field1968, this.field1968 * 2, this.field1968 * 2);
                  } else {
                     var4[var13.field1764].method6347(this.field1968 * var1, (63 - var2) * this.field1968, 1 + this.field1968 * 2, 1 + this.field1968 * 2);
                  }
               }
            }
         }
      }

   }

   void method2974(int var1, int var2, class177 var3) {
      for(int var5 = 0; var5 < var3.field2052; ++var5) {
         class179[] var6 = var3.field2059[var5][var1][var2];
         if (null != var6 && var6.length != 0) {
            class179[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class179 var9 = var7[var8];
               if (class115.method2183(var9.field2069)) {
                  class156 var10 = class124.method2243(var9.field2071);
                  int var11 = 0 != var10.field1754 ? -3407872 : -3355444;
                  if (var9.field2069 == class258.field3149.field3163) {
                     this.method2992(var1, var2, var9.field2068, var11);
                  }

                  if (class258.field3140.field3163 == var9.field2069) {
                     this.method2992(var1, var2, var9.field2068, -3355444);
                     this.method2992(var1, var2, 1 + var9.field2068, var11);
                  }

                  if (var9.field2069 == class258.field3143.field3163) {
                     if (0 == var9.field2068) {
                        class394.method6271(this.field1968 * var1, this.field1968 * (63 - var2), 1, var11);
                     }

                     if (var9.field2068 == 1) {
                        class394.method6271(this.field1968 + var1 * this.field1968 - 1, (63 - var2) * this.field1968, 1, var11);
                     }

                     if (2 == var9.field2068) {
                        class394.method6271(this.field1968 + this.field1968 * var1 - 1, this.field1968 + this.field1968 * (63 - var2) - 1, 1, var11);
                     }

                     if (var9.field2068 == 3) {
                        class394.method6271(var1 * this.field1968, this.field1968 + this.field1968 * (63 - var2) - 1, 1, var11);
                     }
                  }

                  if (var9.field2069 == class258.field3160.field3163) {
                     int var12 = var9.field2068 % 2;
                     int var13;
                     if (var12 == 0) {
                        for(var13 = 0; var13 < this.field1968; ++var13) {
                           class394.method6271(var1 * this.field1968 + var13, (64 - var2) * this.field1968 - 1 - var13, 1, var11);
                        }
                     } else {
                        for(var13 = 0; var13 < this.field1968; ++var13) {
                           class394.method6271(this.field1968 * var1 + var13, var13 + this.field1968 * (63 - var2), 1, var11);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void method2979(int var1, int var2, HashSet var3, int var4) {
      float var6 = (float)var4 / 64.0F;
      float var7 = var6 / 2.0F;
      Iterator var8 = this.field1970.entrySet().iterator();

      while(var8.hasNext()) {
         Entry var9 = (Entry)var8.next();
         class245 var10 = (class245)var9.getKey();
         int var11 = (int)((float)var1 + var6 * (float)var10.field2920 - var7);
         int var12 = (int)((float)(var2 + var4) - (float)var10.field2922 * var6 - var7);
         class186 var13 = (class186)var9.getValue();
         if (var13 != null && var13.method3212()) {
            var13.field2112 = var11;
            var13.field2109 = var12;
            class141 var14 = class73.method1770(var13.method3208());
            if (!var3.contains(var14.method2381())) {
               this.method2982(var13, var11, var12, var6);
            }
         }
      }

   }

   void method2980(HashSet var1, int var2, int var3) {
      Iterator var5 = this.field1958.iterator();

      while(var5.hasNext()) {
         class186 var6 = (class186)var5.next();
         if (var6.method3212()) {
            class141 var7 = class73.method1770(var6.method3208());
            if (var7 != null && var1.contains(var7.method2381())) {
               this.method2981(var7, var6.field2112, var6.field2109, var2, var3);
            }
         }
      }

   }

   void method2981(class141 var1, int var2, int var3, int var4, int var5) {
      class398 var7 = var1.method2368(false);
      if (var7 != null) {
         var7.method6404(var2 - var7.field4270 / 2, var3 - var7.field4271 / 2);
         if (var4 % var5 < var5 / 2) {
            class394.method6263(var2, var3, 15, 16776960, 128);
            class394.method6263(var2, var3, 7, 16777215, 256);
         }

      }
   }

   void method2982(class186 var1, int var2, int var3, float var4) {
      class141 var6 = class73.method1770(var1.method3208());
      this.method3032(var6, var2, var3);
      this.method2984(var1, var6, var2, var3, var4);
   }

   void method3032(class141 var1, int var2, int var3) {
      class398 var5 = var1.method2368(false);
      if (var5 != null) {
         int var6 = this.method3062(var5, var1.field1540);
         int var7 = this.method2987(var5, var1.field1550);
         var5.method6404(var6 + var2, var3 + var7);
      }

   }

   void method2984(class186 var1, class141 var2, int var3, int var4, float var5) {
      class181 var7 = var1.method3209();
      if (null != var7) {
         if (var7.field2082.method2865(var5)) {
            class302 var8 = (class302)this.field1971.get(var7.field2082);
            var8.method4857(var7.field2081, var3 - var7.field2079 / 2, var4, var7.field2079, var7.field2085, -16777216 | var2.field1548, 0, 1, 0, var8.field3738 / 2);
         }
      }
   }

   void method2985(int var1, int var2, HashSet var3, int var4) {
      float var6 = (float)var4 / 64.0F;
      Iterator var7 = this.field1958.iterator();

      while(var7.hasNext()) {
         class186 var8 = (class186)var7.next();
         if (var8.method3212()) {
            int var9 = var8.field2110.field2920 % 64;
            int var10 = var8.field2110.field2922 % 64;
            var8.field2112 = (int)((float)var9 * var6 + (float)var1);
            var8.field2109 = (int)((float)var2 + (float)(63 - var10) * var6);
            if (!var3.contains(var8.method3208())) {
               this.method2982(var8, var8.field2112, var8.field2109, var6);
            }
         }
      }

   }

   int method3062(class398 var1, class147 var2) {
      switch(var2.field1611) {
      case 0:
         return -var1.field4270 / 2;
      case 2:
         return 0;
      default:
         return -var1.field4270;
      }
   }

   int method2987(class398 var1, class149 var2) {
      switch(var2.field1658) {
      case 0:
         return -var1.field4271 / 2;
      case 1:
         return 0;
      default:
         return -var1.field4271;
      }
   }

   class181 method2988(int var1) {
      class141 var3 = class73.method1770(var1);
      return this.method2989(var3);
   }

   class181 method2989(class141 var1) {
      if (var1.field1537 != null && this.field1971 != null && this.field1971.get(class165.field1917) != null) {
         class165 var3 = class165.method2866(var1.field1539);
         if (null == var3) {
            return null;
         } else {
            class302 var4 = (class302)this.field1971.get(var3);
            if (var4 == null) {
               return null;
            } else {
               int var5 = var4.method4882(var1.field1537, 1000000);
               String[] var6 = new String[var5];
               var4.method4867(var1.field1537, (int[])null, var6);
               int var7 = var6.length * var4.field3738 / 2;
               int var8 = 0;
               String[] var9 = var6;

               for(int var10 = 0; var10 < var9.length; ++var10) {
                  String var11 = var9[var10];
                  int var12 = var4.method4848(var11);
                  if (var12 > var8) {
                     var8 = var12;
                  }
               }

               return new class181(var1.field1537, var8, var7, var3);
            }
         }
      } else {
         return null;
      }
   }

   List method2990(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var7 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var1 + var3 && var5 < var3 + var2) {
            Iterator var8 = this.field1970.values().iterator();

            class186 var9;
            while(var8.hasNext()) {
               var9 = (class186)var8.next();
               if (var9.method3212() && var9.method3206(var4, var5)) {
                  var7.add(var9);
               }
            }

            var8 = this.field1958.iterator();

            while(var8.hasNext()) {
               var9 = (class186)var8.next();
               if (var9.method3212() && var9.method3206(var4, var5)) {
                  var7.add(var9);
               }
            }

            return var7;
         } else {
            return var7;
         }
      } else {
         return var7;
      }
   }

   List method2991() {
      LinkedList var2 = new LinkedList();
      var2.addAll(this.field1958);
      var2.addAll(this.field1970.values());
      return var2;
   }

   void method2992(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         class394.method6317(var1 * this.field1968, (63 - var2) * this.field1968, this.field1968, var4);
      }

      if (1 == var3) {
         class394.method6271(this.field1968 * var1, this.field1968 * (63 - var2), this.field1968, var4);
      }

      if (2 == var3) {
         class394.method6317(this.field1968 + var1 * this.field1968 - 1, this.field1968 * (63 - var2), this.field1968, var4);
      }

      if (3 == var3) {
         class394.method6271(var1 * this.field1968, (63 - var2) * this.field1968 + this.field1968 - 1, this.field1968, var4);
      }

   }
}
