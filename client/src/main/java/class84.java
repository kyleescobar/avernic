import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class84 {
   static class398[] field1190;
   boolean field1189 = false;
   boolean[] field1185;
   String[] field1187;
   Map field1186;
   long field1188;

   static class238 method1926(class277 var0, int var1) {
      byte[] var3 = var0.method4419(var1);
      return null == var3 ? null : new class238(var3);
   }

   class84() {
      int var1 = class192.archive2.method4438(19);
      this.field1186 = new HashMap();
      this.field1185 = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         class142 var3 = class58.method1590(var2);
         this.field1185[var2] = var3.field1557;
      }

      var2 = 0;
      if (class192.archive2.method4379(15)) {
         var2 = class192.archive2.method4438(15);
      }

      this.field1187 = new String[var2];
      this.method1896();
   }

   public static String method1928(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = class308.field3764[(int)(var6 - 37L * var0)];
               if (var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   void method1888(int var1, int var2) {
      this.field1186.put(var1, var2);
      if (this.field1185[var1]) {
         this.field1189 = true;
      }

   }

   int method1889(int var1) {
      Object var3 = this.field1186.get(var1);
      return var3 instanceof Integer ? (Integer)var3 : -1;
   }

   void method1918(int var1, String var2) {
      this.field1186.put(var1, var2);
   }

   String method1890(int var1) {
      Object var3 = this.field1186.get(var1);
      return var3 instanceof String ? (String)var3 : "";
   }

   void method1891(int var1, String var2) {
      this.field1187[var1] = var2;
   }

   String method1892(int var1) {
      return this.field1187[var1];
   }

   void method1887() {
      int var2;
      for(var2 = 0; var2 < this.field1185.length; ++var2) {
         if (!this.field1185[var2]) {
            this.field1186.remove(var2);
         }
      }

      for(var2 = 0; var2 < this.field1187.length; ++var2) {
         this.field1187[var2] = null;
      }

   }

   static void method1905(class48[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var6 = var1 - 1;
         int var7 = 1 + var2;
         int var8 = (var2 + var1) / 2;
         class48 var9 = var0[var8];
         var0[var8] = var0[var1];
         var0[var1] = var9;

         while(var6 < var7) {
            boolean var10 = true;

            int var11;
            int var12;
            int var13;
            do {
               --var7;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (var3[var11] == 2) {
                     var12 = var0[var7].field703;
                     var13 = var9.field703;
                  } else if (var3[var11] == 1) {
                     var12 = var0[var7].field699;
                     var13 = var9.field699;
                     if (var12 == -1 && 1 == var4[var11]) {
                        var12 = 2001;
                     }

                     if (-1 == var13 && var4[var11] == 1) {
                        var13 = 2001;
                     }
                  } else if (var3[var11] == 3) {
                     var12 = var0[var7].method1274() ? 1 : 0;
                     var13 = var9.method1274() ? 1 : 0;
                  } else {
                     var12 = var0[var7].field697;
                     var13 = var9.field697;
                  }

                  if (var13 != var12) {
                     if ((1 != var4[var11] || var12 <= var13) && (0 != var4[var11] || var12 >= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (3 == var11) {
                     var10 = false;
                  }
               }
            } while(var10);

            var10 = true;

            do {
               ++var6;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (2 == var3[var11]) {
                     var12 = var0[var6].field703;
                     var13 = var9.field703;
                  } else if (1 == var3[var11]) {
                     var12 = var0[var6].field699;
                     var13 = var9.field699;
                     if (var12 == -1 && 1 == var4[var11]) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && 1 == var4[var11]) {
                        var13 = 2001;
                     }
                  } else if (3 == var3[var11]) {
                     var12 = var0[var6].method1274() ? 1 : 0;
                     var13 = var9.method1274() ? 1 : 0;
                  } else {
                     var12 = var0[var6].field697;
                     var13 = var9.field697;
                  }

                  if (var13 != var12) {
                     if ((1 != var4[var11] || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (3 == var11) {
                     var10 = false;
                  }
               }
            } while(var10);

            if (var6 < var7) {
               class48 var14 = var0[var6];
               var0[var6] = var0[var7];
               var0[var7] = var14;
            }
         }

         method1905(var0, var1, var7, var3, var4);
         method1905(var0, 1 + var7, var2, var3, var4);
      }

   }

   class369 method1894(boolean var1) {
      return class78.method1836("2", class69.field976.field3208, var1);
   }

   void method1895() {
      class369 var2 = this.method1894(true);

      try {
         int var3 = 3;
         int var4 = 0;
         Iterator var5 = this.field1186.entrySet().iterator();

         while(var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            int var7 = (Integer)var6.getKey();
            if (this.field1185[var7]) {
               Object var8 = var6.getValue();
               var3 += 3;
               if (var8 instanceof Integer) {
                  var3 += 4;
               } else if (var8 instanceof String) {
                  var3 += class281.method4532((String)var8);
               }

               ++var4;
            }
         }

         Buffer var30 = new Buffer(var3);
         var30.writeByte(2);
         var30.writeShort(var4);
         Iterator var31 = this.field1186.entrySet().iterator();

         label187:
         while(true) {
            Entry var32;
            int var33;
            do {
               if (!var31.hasNext()) {
                  var2.method5780(var30.payload, 0, var30.offset);
                  break label187;
               }

               var32 = (Entry)var31.next();
               var33 = (Integer)var32.getKey();
            } while(!this.field1185[var33]);

            var30.writeShort(var33);
            Object var9 = var32.getValue();
            Class var11 = var9.getClass();
            class377[] var12 = new class377[]{class377.field4165, class377.field4164, class377.field4160};
            class377[] var13 = var12;
            int var14 = 0;

            class377 var10;
            class377 var15;
            while(true) {
               if (var14 >= var13.length) {
                  var10 = null;
                  break;
               }

               var15 = var13[var14];
               if (var15.field4161 == var11) {
                  var10 = var15;
                  break;
               }

               ++var14;
            }

            var30.writeByte(var10.field4159);
            Class var35 = var9.getClass();
            class377[] var16 = new class377[]{class377.field4165, class377.field4164, class377.field4160};
            class377[] var17 = var16;
            int var18 = 0;

            while(true) {
               if (var18 >= var17.length) {
                  var15 = null;
                  break;
               }

               class377 var19 = var17[var18];
               if (var35 == var19.field4161) {
                  var15 = var19;
                  break;
               }

               ++var18;
            }

            if (null == var15) {
               throw new IllegalArgumentException();
            }

            class373 var34 = var15.field4163;
            var34.method5843(var9, var30);
         }
      } catch (Exception var28) {
      } finally {
         try {
            var2.method5776();
         } catch (Exception var27) {
         }

      }

      this.field1189 = false;
      this.field1188 = class87.method1989();
   }

   void method1896() {
      class369 var2 = this.method1894(false);

      label231: {
         try {
            byte[] var3 = new byte[(int)var2.method5773()];

            int var5;
            for(int var4 = 0; var4 < var3.length; var4 += var5) {
               var5 = var2.method5779(var3, var4, var3.length - var4);
               if (-1 == var5) {
                  throw new EOFException();
               }
            }

            Buffer var26 = new Buffer(var3);
            if (var26.payload.length - var26.offset >= 1) {
               int var6 = var26.readUnsignedByte();
               if (var6 >= 0 && var6 <= 2) {
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  if (var6 >= 2) {
                     var7 = var26.readUnsignedShort();
                     var8 = 0;

                     while(true) {
                        if (var8 >= var7) {
                           break label231;
                        }

                        var9 = var26.readUnsignedShort();
                        var10 = var26.readUnsignedByte();
                        class377[] var11 = new class377[]{class377.field4165, class377.field4164, class377.field4160};
                        class377 var12 = (class377)class251.enumeratedValueOf(var11, var10);
                        Object var13 = var12.method5859(var26);
                        if (this.field1185[var9]) {
                           this.field1186.put(var9, var13);
                        }

                        ++var8;
                     }
                  } else {
                     var7 = var26.readUnsignedShort();

                     for(var8 = 0; var8 < var7; ++var8) {
                        var9 = var26.readUnsignedShort();
                        var10 = var26.readInt();
                        if (this.field1185[var9]) {
                           this.field1186.put(var9, var10);
                        }
                     }

                     var8 = var26.readUnsignedShort();
                     var9 = 0;

                     while(true) {
                        if (var9 >= var8) {
                           break label231;
                        }

                        var26.readUnsignedShort();
                        var26.readStringNullTerminated();
                        ++var9;
                     }
                  }
               }

               return;
            }
         } catch (Exception var24) {
            break label231;
         } finally {
            try {
               var2.method5776();
            } catch (Exception var23) {
            }

         }

         return;
      }

      this.field1189 = false;
   }

   void method1927() {
      if (this.field1189 && this.field1188 < class87.method1989() - 60000L) {
         this.method1895();
      }

   }

   boolean method1921() {
      return this.field1189;
   }

   static int method1901(int var0, class59 var1, boolean var2) {
      int var5 = -1;
      Interface var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = class51.field747[--class51.field746];
         var4 = class87.getComponent(var5);
      } else {
         var4 = var2 ? class286.field3660 : class51.field750;
      }

      if (var0 == 1100) {
         class51.field746 -= 2;
         var4.field3054 = class51.field747[class51.field746];
         if (var4.field3054 > var4.field2981 - var4.field2973) {
            var4.field3054 = var4.field2981 - var4.field2973;
         }

         if (var4.field3054 < 0) {
            var4.field3054 = 0;
         }

         var4.field2968 = class51.field747[1 + class51.field746];
         if (var4.field2968 > var4.field3091 - var4.field2990) {
            var4.field2968 = var4.field3091 - var4.field2990;
         }

         if (var4.field2968 < 0) {
            var4.field2968 = 0;
         }

         class81.invalidateComponent(var4);
         return 1;
      } else if (1101 == var0) {
         var4.field2983 = class51.field747[--class51.field746];
         class81.invalidateComponent(var4);
         return 1;
      } else if (1102 == var0) {
         var4.field2987 = class51.field747[--class51.field746] == 1;
         class81.invalidateComponent(var4);
         return 1;
      } else if (var0 == 1103) {
         var4.field2989 = class51.field747[--class51.field746];
         class81.invalidateComponent(var4);
         return 1;
      } else if (1104 == var0) {
         var4.field2959 = class51.field747[--class51.field746];
         class81.invalidateComponent(var4);
         return 1;
      } else if (1105 == var0) {
         var4.field3084 = class51.field747[--class51.field746];
         class81.invalidateComponent(var4);
         return 1;
      } else if (1106 == var0) {
         var4.field3077 = class51.field747[--class51.field746];
         class81.invalidateComponent(var4);
         return 1;
      } else if (1107 == var0) {
         var4.field3027 = class51.field747[--class51.field746] == 1;
         class81.invalidateComponent(var4);
         return 1;
      } else if (1108 == var0) {
         var4.field2950 = 1;
         var4.field3002 = class51.field747[--class51.field746];
         class81.invalidateComponent(var4);
         return 1;
      } else if (var0 == 1109) {
         class51.field746 -= 6;
         var4.field3007 = class51.field747[class51.field746];
         var4.field2960 = class51.field747[1 + class51.field746];
         var4.field3009 = class51.field747[2 + class51.field746];
         var4.field3010 = class51.field747[class51.field746 + 3];
         var4.field3011 = class51.field747[class51.field746 + 4];
         var4.field3000 = class51.field747[class51.field746 + 5];
         class81.invalidateComponent(var4);
         return 1;
      } else {
         int var8;
         if (var0 == 1110) {
            var8 = class51.field747[--class51.field746];
            if (var8 != var4.field3005) {
               var4.field3005 = var8;
               var4.field3094 = 0;
               var4.field3090 = 0;
               class81.invalidateComponent(var4);
            }

            return 1;
         } else if (1111 == var0) {
            var4.field3015 = class51.field747[--class51.field746] == 1;
            class81.invalidateComponent(var4);
            return 1;
         } else if (1112 == var0) {
            String var9 = class51.field738[--class2.field4];
            if (!var9.equals(var4.field3042)) {
               var4.field3042 = var9;
               class81.invalidateComponent(var4);
            }

            return 1;
         } else if (1113 == var0) {
            var4.field3018 = class51.field747[--class51.field746];
            class81.invalidateComponent(var4);
            return 1;
         } else if (1114 == var0) {
            class51.field746 -= 3;
            var4.field3022 = class51.field747[class51.field746];
            var4.field3023 = class51.field747[class51.field746 + 1];
            var4.field3021 = class51.field747[2 + class51.field746];
            class81.invalidateComponent(var4);
            return 1;
         } else if (var0 == 1115) {
            var4.field3024 = class51.field747[--class51.field746] == 1;
            class81.invalidateComponent(var4);
            return 1;
         } else if (1116 == var0) {
            var4.field2997 = class51.field747[--class51.field746];
            class81.invalidateComponent(var4);
            return 1;
         } else if (1117 == var0) {
            var4.field2998 = class51.field747[--class51.field746];
            class81.invalidateComponent(var4);
            return 1;
         } else if (var0 == 1118) {
            var4.field2945 = class51.field747[--class51.field746] == 1;
            class81.invalidateComponent(var4);
            return 1;
         } else if (1119 == var0) {
            var4.field2963 = class51.field747[--class51.field746] == 1;
            class81.invalidateComponent(var4);
            return 1;
         } else if (var0 == 1120) {
            class51.field746 -= 2;
            var4.field2981 = class51.field747[class51.field746];
            var4.field3091 = class51.field747[class51.field746 + 1];
            class81.invalidateComponent(var4);
            if (-1 != var5 && var4.field2977 == 0) {
               class81.revalidateComponent(Interface.components[var5 >> 16], var4, false);
            }

            return 1;
         } else if (1121 == var0) {
            class197.method3413(var4.id, var4.field3031);
            client.field574 = var4;
            class81.invalidateComponent(var4);
            return 1;
         } else if (var0 == 1122) {
            var4.field3006 = class51.field747[--class51.field746];
            class81.invalidateComponent(var4);
            return 1;
         } else if (1123 == var0) {
            var4.field2984 = class51.field747[--class51.field746];
            class81.invalidateComponent(var4);
            return 1;
         } else if (var0 == 1124) {
            var4.field3103 = class51.field747[--class51.field746];
            class81.invalidateComponent(var4);
            return 1;
         } else if (1125 == var0) {
            var8 = class51.field747[--class51.field746];
            class396 var7 = (class396)class251.enumeratedValueOf(ApproximateRouteStrategy.method804(), var8);
            if (var7 != null) {
               var4.field3071 = var7;
               class81.invalidateComponent(var4);
            }

            return 1;
         } else {
            boolean var6;
            if (var0 == 1126) {
               var6 = class51.field747[--class51.field746] == 1;
               var4.field2992 = var6;
               return 1;
            } else if (1127 == var0) {
               var6 = class51.field747[--class51.field746] == 1;
               var4.field3016 = var6;
               return 1;
            } else if (1128 == var0) {
               class51.field746 -= 2;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   static final void method1930(int var0, int var1, int var2, int var3, class398 var4, SpriteMask var5) {
      int var7 = var2 * var2 + var3 * var3;
      if (var7 > 4225 && var7 < 90000) {
         int var8 = client.cameraAngleY & 2047;
         int var9 = Rasterizer3D.sineTable[var8];
         int var10 = Rasterizer3D.cosineTable[var8];
         int var11 = var9 * var3 + var10 * var2 >> 16;
         int var12 = var3 * var10 - var9 * var2 >> 16;
         double var13 = Math.atan2((double)var11, (double)var12);
         int var15 = var5.width / 2 - 25;
         int var16 = (int)(Math.sin(var13) * (double)var15);
         int var17 = (int)(Math.cos(var13) * (double)var15);
         byte var18 = 20;
         class145.field1594.method6397(var16 + (var0 + var5.width / 2 - var18 / 2), var5.height / 2 + var1 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
      } else {
         class268.method4351(var0, var1, var2, var3, var4, var5);
      }

   }
}
