public class class159 extends class349 {
   public static class277 field1859;
   public static class277 field1871;
   public static class277 field1875;
   static class223 field1858 = new class223(100);
   static class223 field1861 = new class223(64);
   int[] field1870;
   int[] field1874;
   public boolean field1869 = false;
   public int field1860 = -1;
   public int field1862 = -1;
   public int field1864 = 5;
   public int field1867 = -1;
   public int field1868 = -1;
   public int field1872 = -1;
   public int field1873 = 99;
   public int field1876 = 2;
   public int[] field1863;
   public int[] field1865;
   public int[] field1866;

   class159() {
   }

   void method2806(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method2775(var1, var3);
      }
   }

   void method2775(Buffer var1, int var2) {
      int var4;
      int var5;
      if (1 == var2) {
         var4 = var1.readUnsignedShort();
         this.field1865 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1865[var5] = var1.readUnsignedShort();
         }

         this.field1863 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1863[var5] = var1.readUnsignedShort();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1863[var5] += var1.readUnsignedShort() << 16;
         }
      } else if (2 == var2) {
         this.field1862 = var1.readUnsignedShort();
      } else if (var2 == 3) {
         var4 = var1.readUnsignedByte();
         this.field1870 = new int[var4 + 1];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1870[var5] = var1.readUnsignedByte();
         }

         this.field1870[var4] = 9999999;
      } else if (var2 == 4) {
         this.field1869 = true;
      } else if (var2 == 5) {
         this.field1864 = var1.readUnsignedByte();
      } else if (6 == var2) {
         this.field1867 = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.field1872 = var1.readUnsignedShort();
      } else if (8 == var2) {
         this.field1873 = var1.readUnsignedByte();
      } else if (var2 == 9) {
         this.field1868 = var1.readUnsignedByte();
      } else if (var2 == 10) {
         this.field1860 = var1.readUnsignedByte();
      } else if (11 == var2) {
         this.field1876 = var1.readUnsignedByte();
      } else if (12 == var2) {
         var4 = var1.readUnsignedByte();
         this.field1874 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1874[var5] = var1.readUnsignedShort();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1874[var5] += var1.readUnsignedShort() << 16;
         }
      } else if (var2 == 13) {
         var4 = var1.readUnsignedByte();
         this.field1866 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1866[var5] = var1.method5952();
         }
      }

   }

   void method2776() {
      if (this.field1868 == -1) {
         if (this.field1870 != null) {
            this.field1868 = 2;
         } else {
            this.field1868 = 0;
         }
      }

      if (-1 == this.field1860) {
         if (null != this.field1870) {
            this.field1860 = 2;
         } else {
            this.field1860 = 0;
         }
      }

   }

   public class207 method2791(class207 var1, int var2) {
      var2 = this.field1863[var2];
      class203 var4 = class120.method2198(var2 >> 16);
      var2 &= 65535;
      if (null == var4) {
         return var1.method3717(true);
      } else {
         class207 var5 = var1.method3717(!var4.method3696(var2));
         var5.method3725(var4, var2);
         return var5;
      }
   }

   class207 method2777(class207 var1, int var2, int var3) {
      var2 = this.field1863[var2];
      class203 var5 = class120.method2198(var2 >> 16);
      var2 &= 65535;
      if (var5 == null) {
         return var1.method3717(true);
      } else {
         class207 var6 = var1.method3717(!var5.method3696(var2));
         var3 &= 3;
         if (var3 == 1) {
            var6.method3764();
         } else if (var3 == 2) {
            var6.method3728();
         } else if (var3 == 3) {
            var6.method3744();
         }

         var6.method3725(var5, var2);
         if (1 == var3) {
            var6.method3744();
         } else if (2 == var3) {
            var6.method3728();
         } else if (3 == var3) {
            var6.method3764();
         }

         return var6;
      }
   }

   static final void method2805() {
      MouseHandler.method326(class270.field3272);
   }

   class207 method2778(class207 var1, int var2) {
      var2 = this.field1863[var2];
      class203 var4 = class120.method2198(var2 >> 16);
      var2 &= 65535;
      if (null == var4) {
         return var1.method3718(true);
      } else {
         class207 var5 = var1.method3718(!var4.method3696(var2));
         var5.method3725(var4, var2);
         return var5;
      }
   }

   public class207 method2779(class207 var1, int var2, class159 var3, int var4) {
      var2 = this.field1863[var2];
      class203 var6 = class120.method2198(var2 >> 16);
      var2 &= 65535;
      if (var6 == null) {
         return var3.method2791(var1, var4);
      } else {
         var4 = var3.field1863[var4];
         class203 var7 = class120.method2198(var4 >> 16);
         var4 &= 65535;
         class207 var8;
         if (var7 == null) {
            var8 = var1.method3717(!var6.method3696(var2));
            var8.method3725(var6, var2);
            return var8;
         } else {
            var8 = var1.method3717(!var6.method3696(var2) & !var7.method3696(var4));
            var8.method3756(var6, var2, var7, var4, this.field1870);
            return var8;
         }
      }
   }

   public class207 method2795(class207 var1, int var2) {
      int var4 = this.field1863[var2];
      class203 var5 = class120.method2198(var4 >> 16);
      var4 &= 65535;
      if (var5 == null) {
         return var1.method3717(true);
      } else {
         class203 var6 = null;
         int var7 = 0;
         if (this.field1874 != null && var2 < this.field1874.length) {
            var7 = this.field1874[var2];
            var6 = class120.method2198(var7 >> 16);
            var7 &= 65535;
         }

         class207 var8;
         if (null != var6 && 65535 != var7) {
            var8 = var1.method3717(!var5.method3696(var4) & !var6.method3696(var7));
            var8.method3725(var5, var4);
            var8.method3725(var6, var7);
            return var8;
         } else {
            var8 = var1.method3717(!var5.method3696(var4));
            var8.method3725(var5, var4);
            return var8;
         }
      }
   }

   static int method2803(int var0, class59 var1, boolean var2) {
      int var4;
      if (3903 == var0) {
         var4 = class51.field747[--class51.field746];
         class51.field747[++class51.field746 - 1] = client.field620[var4].method4573();
         return 1;
      } else if (3904 == var0) {
         var4 = class51.field747[--class51.field746];
         class51.field747[++class51.field746 - 1] = client.field620[var4].field3654;
         return 1;
      } else if (var0 == 3905) {
         var4 = class51.field747[--class51.field746];
         class51.field747[++class51.field746 - 1] = client.field620[var4].field3656;
         return 1;
      } else if (var0 == 3906) {
         var4 = class51.field747[--class51.field746];
         class51.field747[++class51.field746 - 1] = client.field620[var4].field3653;
         return 1;
      } else if (var0 == 3907) {
         var4 = class51.field747[--class51.field746];
         class51.field747[++class51.field746 - 1] = client.field620[var4].field3657;
         return 1;
      } else if (3908 == var0) {
         var4 = class51.field747[--class51.field746];
         class51.field747[++class51.field746 - 1] = client.field620[var4].field3659;
         return 1;
      } else {
         int var14;
         if (3910 == var0) {
            var4 = class51.field747[--class51.field746];
            var14 = client.field620[var4].method4570();
            class51.field747[++class51.field746 - 1] = 0 == var14 ? 1 : 0;
            return 1;
         } else if (3911 == var0) {
            var4 = class51.field747[--class51.field746];
            var14 = client.field620[var4].method4570();
            class51.field747[++class51.field746 - 1] = var14 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var4 = class51.field747[--class51.field746];
            var14 = client.field620[var4].method4570();
            class51.field747[++class51.field746 - 1] = var14 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var4 = class51.field747[--class51.field746];
            var14 = client.field620[var4].method4570();
            class51.field747[++class51.field746 - 1] = var14 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == 3914) {
               var12 = class51.field747[--class51.field746] == 1;
               if (class293.field3711 != null) {
                  class293.field3711.method4510(class279.field3620, var12);
               }

               return 1;
            } else if (3915 == var0) {
               var12 = class51.field747[--class51.field746] == 1;
               if (null != class293.field3711) {
                  class293.field3711.method4510(class279.field3618, var12);
               }

               return 1;
            } else if (3916 == var0) {
               class51.field746 -= 2;
               var12 = class51.field747[class51.field746] == 1;
               boolean var13 = class51.field747[class51.field746 + 1] == 1;
               if (null != class293.field3711) {
                  client.field518.field399 = var13;
                  class293.field3711.method4510(client.field518, var12);
               }

               return 1;
            } else if (var0 == 3917) {
               var12 = class51.field747[--class51.field746] == 1;
               if (null != class293.field3711) {
                  class293.field3711.method4510(class279.field3616, var12);
               }

               return 1;
            } else if (3918 == var0) {
               var12 = class51.field747[--class51.field746] == 1;
               if (class293.field3711 != null) {
                  class293.field3711.method4510(class279.field3619, var12);
               }

               return 1;
            } else if (var0 == 3919) {
               class51.field747[++class51.field746 - 1] = class293.field3711 == null ? 0 : class293.field3711.field3617.size();
               return 1;
            } else {
               class285 var5;
               if (3920 == var0) {
                  var4 = class51.field747[--class51.field746];
                  var5 = (class285)class293.field3711.field3617.get(var4);
                  class51.field747[++class51.field746 - 1] = var5.field3648;
                  return 1;
               } else if (var0 == 3921) {
                  var4 = class51.field747[--class51.field746];
                  var5 = (class285)class293.field3711.field3617.get(var4);
                  class51.field738[++class2.field4 - 1] = var5.method4557();
                  return 1;
               } else if (3922 == var0) {
                  var4 = class51.field747[--class51.field746];
                  var5 = (class285)class293.field3711.field3617.get(var4);
                  class51.field738[++class2.field4 - 1] = var5.method4558();
                  return 1;
               } else if (var0 == 3923) {
                  var4 = class51.field747[--class51.field746];
                  var5 = (class285)class293.field3711.field3617.get(var4);
                  long var6 = class87.method1989() - class178.field2067 - var5.field3646;
                  int var8 = (int)(var6 / 3600000L);
                  int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
                  int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * '\uea60')) / 1000L);
                  String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                  class51.field738[++class2.field4 - 1] = var11;
                  return 1;
               } else if (var0 == 3924) {
                  var4 = class51.field747[--class51.field746];
                  var5 = (class285)class293.field3711.field3617.get(var4);
                  class51.field747[++class51.field746 - 1] = var5.field3647.field3653;
                  return 1;
               } else if (3925 == var0) {
                  var4 = class51.field747[--class51.field746];
                  var5 = (class285)class293.field3711.field3617.get(var4);
                  class51.field747[++class51.field746 - 1] = var5.field3647.field3656;
                  return 1;
               } else if (var0 == 3926) {
                  var4 = class51.field747[--class51.field746];
                  var5 = (class285)class293.field3711.field3617.get(var4);
                  class51.field747[++class51.field746 - 1] = var5.field3647.field3654;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
