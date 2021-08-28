public class class247 {
   static class223 field2938 = new class223(260);
   static final int[] field2933 = new int[]{8, 11, 4, 6, 9, 7, 10};
   boolean field2936 = false;
   class138[] field2935;
   int[] field2929;
   int[] field2932;
   long field2930;
   long field2934;
   public boolean field2931;
   public int field2937;

   public void method4177(int[] var1, class138[] var2, boolean var3, int[] var4, boolean var5, int var6) {
      this.field2935 = var2;
      this.field2936 = var3;
      this.method4197(var1, var4, var5, var6);
   }

   public void method4197(int[] var1, int[] var2, boolean var3, int var4) {
      if (var1 == null) {
         var1 = new int[12];

         for(int var6 = 0; var6 < 7; ++var6) {
            for(int var7 = 0; var7 < class143.field1564; ++var7) {
               class143 var8 = class71.method1746(var7);
               if (null != var8 && !var8.field1573 && var6 + (var3 ? 7 : 0) == var8.field1566) {
                  var1[field2933[var6]] = 256 + var7;
                  break;
               }
            }
         }
      }

      this.field2929 = var1;
      this.field2932 = var2;
      this.field2931 = var3;
      this.field2937 = var4;
      this.method4182();
   }

   public void method4190(int var1, boolean var2) {
      if (1 != var1 || !this.field2931) {
         int var4 = this.field2929[field2933[var1]];
         if (0 != var4) {
            var4 -= 256;

            class143 var5;
            do {
               if (!var2) {
                  --var4;
                  if (var4 < 0) {
                     var4 = class143.field1564 - 1;
                  }
               } else {
                  ++var4;
                  if (var4 >= class143.field1564) {
                     var4 = 0;
                  }
               }

               var5 = class71.method1746(var4);
            } while(null == var5 || var5.field1573 || var1 + (this.field2931 ? 7 : 0) != var5.field1566);

            this.field2929[field2933[var1]] = var4 + 256;
            this.method4182();
         }
      }
   }

   public void method4183(int var1, boolean var2) {
      int var4 = this.field2932[var1];
      if (!var2) {
         do {
            --var4;
            if (var4 < 0) {
               var4 = class244.field2915[var1].length - 1;
            }
         } while(!class16.method127(var1, var4));
      } else {
         do {
            ++var4;
            if (var4 >= class244.field2915[var1].length) {
               var4 = 0;
            }
         } while(!class16.method127(var1, var4));
      }

      this.field2932[var1] = var4;
      this.method4182();
   }

   static int method4213(int var0) {
      class45 var2 = (class45)class85.field1194.method5716((long)var0);
      if (null == var2) {
         return -1;
      } else {
         return class85.field1195.field3731 == var2.field3959 ? -1 : ((class45)var2.field3959).field378;
      }
   }

   public void method4180(boolean var1) {
      if (var1 != this.field2931) {
         this.method4197((int[])null, this.field2932, var1, -1);
      }
   }

   public void method4181(Buffer var1) {
      var1.writeByte(this.field2931 ? 1 : 0);

      int var3;
      for(var3 = 0; var3 < 7; ++var3) {
         int var4 = this.field2929[field2933[var3]];
         if (var4 == 0) {
            var1.writeByte(-1);
         } else {
            var1.writeByte(var4 - 256);
         }
      }

      for(var3 = 0; var3 < 5; ++var3) {
         var1.writeByte(this.field2932[var3]);
      }

   }

   void method4182() {
      long var2 = this.field2934;
      int var4 = this.field2929[5];
      int var5 = this.field2929[9];
      this.field2929[5] = var5;
      this.field2929[9] = var4;
      this.field2934 = 0L;

      int var6;
      for(var6 = 0; var6 < 12; ++var6) {
         this.field2934 <<= 4;
         if (this.field2929[var6] >= 256) {
            this.field2934 += (long)(this.field2929[var6] - 256);
         }
      }

      if (this.field2929[0] >= 256) {
         this.field2934 += (long)(this.field2929[0] - 256 >> 4);
      }

      if (this.field2929[1] >= 256) {
         this.field2934 += (long)(this.field2929[1] - 256 >> 8);
      }

      for(var6 = 0; var6 < 5; ++var6) {
         this.field2934 <<= 3;
         this.field2934 += (long)this.field2932[var6];
      }

      this.field2934 <<= 1;
      this.field2934 += (long)(this.field2931 ? 1 : 0);
      this.field2929[5] = var4;
      this.field2929[9] = var5;
      if (0L != var2 && var2 != this.field2934 || this.field2936) {
         field2938.method3889(var2);
      }

   }

   public class207 method4201(class159 var1, int var2, class159 var3, int var4) {
      if (-1 != this.field2937) {
         return class97.method2065(this.field2937).method2491(var1, var2, var3, var4);
      } else {
         long var6 = this.field2934;
         int[] var8 = this.field2929;
         if (var1 != null && (var1.field1867 >= 0 || var1.field1872 >= 0)) {
            var8 = new int[12];

            for(int var9 = 0; var9 < 12; ++var9) {
               var8[var9] = this.field2929[var9];
            }

            if (var1.field1867 >= 0) {
               var6 += (long)(var1.field1867 - this.field2929[5] << 40);
               var8[5] = var1.field1867;
            }

            if (var1.field1872 >= 0) {
               var6 += (long)(var1.field1872 - this.field2929[3] << 48);
               var8[3] = var1.field1872;
            }
         }

         class207 var19 = (class207)field2938.method3880(var6);
         if (var19 == null) {
            boolean var10 = false;

            int var12;
            for(int var11 = 0; var11 < 12; ++var11) {
               var12 = var8[var11];
               if (var12 >= 256 && var12 < 512 && !class71.method1746(var12 - 256).method2404()) {
                  var10 = true;
               }

               if (var12 >= 512 && !KeyHandler.method93(var12 - 512).method2698(this.field2931)) {
                  var10 = true;
               }
            }

            if (var10) {
               if (this.field2930 != -1L) {
                  var19 = (class207)field2938.method3880(this.field2930);
               }

               if (var19 == null) {
                  return null;
               }
            }

            if (var19 == null) {
               class193[] var21 = new class193[12];
               var12 = 0;

               int var14;
               for(int var13 = 0; var13 < 12; ++var13) {
                  var14 = var8[var13];
                  if (var14 >= 256 && var14 < 512) {
                     class193 var15 = class71.method1746(var14 - 256).method2426();
                     if (null != var15) {
                        var21[var12++] = var15;
                     }
                  }

                  if (var14 >= 512) {
                     class157 var23 = KeyHandler.method93(var14 - 512);
                     class193 var16 = var23.method2696(this.field2931);
                     if (var16 != null) {
                        if (null != this.field2935) {
                           class138 var17 = this.field2935[var13];
                           if (var17 != null) {
                              int var18;
                              if (null != var17.field1516 && var23.field1796 != null && var17.field1516.length == var23.field1797.length) {
                                 for(var18 = 0; var18 < var23.field1796.length; ++var18) {
                                    var16.method3362(var23.field1797[var18], var17.field1516[var18]);
                                 }
                              }

                              if (null != var17.field1519 && var23.field1798 != null && var23.field1799.length == var17.field1519.length) {
                                 for(var18 = 0; var18 < var23.field1798.length; ++var18) {
                                    var16.method3329(var23.field1799[var18], var17.field1519[var18]);
                                 }
                              }
                           }
                        }

                        var21[var12++] = var16;
                     }
                  }
               }

               class193 var22 = new class193(var21, var12);

               for(var14 = 0; var14 < 5; ++var14) {
                  if (this.field2932[var14] < class244.field2915[var14].length) {
                     var22.method3362(class283.field3635[var14], class244.field2915[var14][this.field2932[var14]]);
                  }

                  if (this.field2932[var14] < class209.field2499[var14].length) {
                     var22.method3362(class8.field26[var14], class209.field2499[var14][this.field2932[var14]]);
                  }
               }

               var19 = var22.method3336(64, 850, -30, -50, -30);
               field2938.method3882(var19, var6);
               this.field2930 = var6;
            }
         }

         if (null == var1 && var3 == null) {
            return var19;
         } else {
            class207 var20;
            if (var1 != null && null != var3) {
               var20 = var1.method2779(var19, var2, var3, var4);
            } else if (null != var1) {
               var20 = var1.method2791(var19, var2);
            } else {
               var20 = var3.method2791(var19, var4);
            }

            return var20;
         }
      }
   }

   class193 method4184() {
      if (this.field2937 != -1) {
         return class97.method2065(this.field2937).method2470();
      } else {
         boolean var2 = false;

         int var4;
         for(int var3 = 0; var3 < 12; ++var3) {
            var4 = this.field2929[var3];
            if (var4 >= 256 && var4 < 512 && !class71.method1746(var4 - 256).method2403()) {
               var2 = true;
            }

            if (var4 >= 512 && !KeyHandler.method93(var4 - 512).method2697(this.field2931)) {
               var2 = true;
            }
         }

         if (var2) {
            return null;
         } else {
            class193[] var8 = new class193[12];
            var4 = 0;

            int var6;
            for(int var5 = 0; var5 < 12; ++var5) {
               var6 = this.field2929[var5];
               class193 var7;
               if (var6 >= 256 && var6 < 512) {
                  var7 = class71.method1746(var6 - 256).method2409();
                  if (var7 != null) {
                     var8[var4++] = var7;
                  }
               }

               if (var6 >= 512) {
                  var7 = KeyHandler.method93(var6 - 512).method2685(this.field2931);
                  if (var7 != null) {
                     var8[var4++] = var7;
                  }
               }
            }

            class193 var9 = new class193(var8, var4);

            for(var6 = 0; var6 < 5; ++var6) {
               if (this.field2932[var6] < class244.field2915[var6].length) {
                  var9.method3362(class283.field3635[var6], class244.field2915[var6][this.field2932[var6]]);
               }

               if (this.field2932[var6] < class209.field2499[var6].length) {
                  var9.method3362(class8.field26[var6], class209.field2499[var6][this.field2932[var6]]);
               }
            }

            return var9;
         }
      }
   }

   public int method4198() {
      return this.field2937 == -1 ? this.field2929[1] + (this.field2929[11] << 5) + (this.field2929[0] << 15) + (this.field2932[0] << 25) + (this.field2932[4] << 20) + (this.field2929[8] << 10) : 305419896 + class97.method2065(this.field2937).field1627;
   }

   static int method4214(int var0, class59 var1, boolean var2) {
      int var4;
      int var5;
      int var7;
      if (var0 == 3400) {
         class51.field746 -= 2;
         var4 = class51.field747[class51.field746];
         var5 = class51.field747[1 + class51.field746];
         class146 var11 = class100.method2074(var4);
         if ('s' != var11.field1599) {
         }

         for(var7 = 0; var7 < var11.field1602; ++var7) {
            if (var5 == var11.field1603[var7]) {
               class51.field738[++class2.field4 - 1] = var11.field1605[var7];
               var11 = null;
               break;
            }
         }

         if (null != var11) {
            class51.field738[++class2.field4 - 1] = var11.field1600;
         }

         return 1;
      } else if (var0 != 3408) {
         if (var0 == 3411) {
            var4 = class51.field747[--class51.field746];
            class146 var10 = class100.method2074(var4);
            class51.field747[++class51.field746 - 1] = var10.method2459();
            return 1;
         } else {
            return 2;
         }
      } else {
         class51.field746 -= 4;
         var4 = class51.field747[class51.field746];
         var5 = class51.field747[1 + class51.field746];
         int var6 = class51.field747[class51.field746 + 2];
         var7 = class51.field747[class51.field746 + 3];
         class146 var8 = class100.method2074(var6);
         if (var8.field1596 == var4 && var8.field1599 == var5) {
            for(int var9 = 0; var9 < var8.field1602; ++var9) {
               if (var7 == var8.field1603[var9]) {
                  if (var5 == 115) {
                     class51.field738[++class2.field4 - 1] = var8.field1605[var9];
                  } else {
                     class51.field747[++class51.field746 - 1] = var8.field1606[var9];
                  }

                  var8 = null;
                  break;
               }
            }

            if (var8 != null) {
               if (var5 == 115) {
                  class51.field738[++class2.field4 - 1] = var8.field1600;
               } else {
                  class51.field747[++class51.field746 - 1] = var8.field1604;
               }
            }

            return 1;
         } else {
            if (115 == var5) {
               class51.field738[++class2.field4 - 1] = class270.field3234;
            } else {
               class51.field747[++class51.field746 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
