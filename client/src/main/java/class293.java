import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Set;

public class class293 implements class290 {
   static Interface field3699;
   static class279 field3711;
   static int loginResponseLength;
   static final class293 field3697;
   static final class293 field3698;
   static final class293 field3700;
   static final class293 field3701;
   static final class293 field3703;
   static final class293 field3704;
   static final class293 field3705;
   static final class293 field3706;
   static final class293 field3707;
   static final class293 field3708;
   static final class293 field3709;
   static final class293 field3715;
   static final class293 field3716;
   final int field3702;
   final Set field3710 = new HashSet();

   static {
      field3716 = new class293("", 0, new class289[]{class289.field3674});
      field3697 = new class293("", 1, new class289[]{class289.field3675, class289.field3674});
      field3698 = new class293("", 2, new class289[]{class289.field3675, class289.field3673, class289.field3674});
      field3701 = new class293("", 3, new class289[]{class289.field3675});
      field3700 = new class293("", 4);
      field3709 = new class293("", 5, new class289[]{class289.field3675, class289.field3674});
      field3715 = new class293("", 6, new class289[]{class289.field3674});
      field3703 = new class293("", 8, new class289[]{class289.field3675, class289.field3674});
      field3704 = new class293("", 9, new class289[]{class289.field3675, class289.field3673});
      field3705 = new class293("", 10, new class289[]{class289.field3675});
      field3706 = new class293("", 11, new class289[]{class289.field3675});
      field3707 = new class293("", 12, new class289[]{class289.field3675, class289.field3674});
      field3708 = new class293("", 13, new class289[]{class289.field3675});
      method4648();
   }

   public static void method4646(class277 var0, class277 var1) {
      class12.field72 = var0;
      class144.field1591 = var1;
   }

   static class293[] method4648() {
      return new class293[]{field3706, field3703, field3708, field3701, field3704, field3697, field3715, field3716, field3698, field3700, field3709, field3707, field3705};
   }

   class293(String var1, int var2) {
      this.field3702 = var2;
   }

   class293(String var1, int var2, class289[] var3) {
      this.field3702 = var2;
      class289[] var4 = var3;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class289 var6 = var4[var5];
         this.field3710.add(var6);
      }

   }

   public static void method4655(class277 var0, class277 var1, class277 var2) {
      class155.field1711 = var0;
      class164.field1914 = var1;
      class155.field1733 = var2;
   }

   public int method4619() {
      return this.field3702;
   }

   public static String method4653(byte[] var0, int var1, int var2) {
      char[] var4 = new char[var2];
      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var0[var6 + var1] & 255;
         if (0 != var7) {
            if (var7 >= 128 && var7 < 160) {
               char var8 = class304.field3755[var7 - 128];
               if (0 == var8) {
                  var8 = '?';
               }

               var7 = var8;
            }

            var4[var5++] = (char)var7;
         }
      }

      return new String(var4, 0, var5);
   }

   static class397 method4652(boolean var0, boolean var1) {
      return var0 ? (var1 ? class336.field3920 : class173.field2014) : (var1 ? class92.field1240 : class47.field397);
   }

   static int method4650(int var0, class59 var1, boolean var2) {
      int var4 = -1;
      Interface var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class51.field747[--class51.field746];
         var5 = class87.getComponent(var4);
      } else {
         var5 = var2 ? class286.field3660 : class51.field750;
      }

      if (var0 == 1000) {
         class51.field746 -= 4;
         var5.field2947 = class51.field747[class51.field746];
         var5.field3019 = class51.field747[class51.field746 + 1];
         var5.field3063 = class51.field747[class51.field746 + 2];
         var5.field2964 = class51.field747[class51.field746 + 3];
         class81.invalidateComponent(var5);
         class59.field874.method834(var5);
         if (-1 != var4 && 0 == var5.field2977) {
            class81.revalidateComponent(Interface.components[var4 >> 16], var5, false);
         }

         return 1;
      } else if (1001 == var0) {
         class51.field746 -= 4;
         var5.field2969 = class51.field747[class51.field746];
         var5.field2970 = class51.field747[1 + class51.field746];
         var5.field3033 = class51.field747[class51.field746 + 2];
         var5.field3092 = class51.field747[class51.field746 + 3];
         class81.invalidateComponent(var5);
         class59.field874.method834(var5);
         if (-1 != var4 && 0 == var5.field2977) {
            class81.revalidateComponent(Interface.components[var4 >> 16], var5, false);
         }

         return 1;
      } else if (1003 == var0) {
         boolean var6 = class51.field747[--class51.field746] == 1;
         if (var6 != var5.field2978) {
            var5.field2978 = var6;
            class81.invalidateComponent(var5);
         }

         return 1;
      } else if (1005 == var0) {
         var5.field3102 = class51.field747[--class51.field746] == 1;
         return 1;
      } else if (1006 == var0) {
         var5.field3078 = class51.field747[--class51.field746] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   static void method4647() {
      class56.loginUsername = class56.loginUsername.trim();
      if (class56.loginUsername.length() == 0) {
         client.method1272(class270.field3514, class270.field3494, class270.field3495);
      } else {
         long var2;
         try {
            URL var4 = new URL(class92.method2031("services", false) + "m=accountappeal/login.ws");
            URLConnection var5 = var4.openConnection();
            var5.setRequestProperty("connection", "close");
            var5.setDoInput(true);
            var5.setDoOutput(true);
            var5.setConnectTimeout(5000);
            OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
            var6.write("data1=req");
            var6.flush();
            InputStream var7 = var5.getInputStream();
            Buffer var8 = new Buffer(new byte[1000]);

            while(true) {
               int var9 = var7.read(var8.payload, var8.offset, 1000 - var8.offset);
               if (-1 == var9) {
                  var8.offset = 0;
                  long var12 = var8.method5954();
                  var2 = var12;
                  break;
               }

               var8.offset += var9;
               if (var8.offset >= 1000) {
                  var2 = 0L;
                  break;
               }
            }
         } catch (Exception var11) {
            var2 = 0L;
         }

         int var1;
         if (var2 == 0L) {
            var1 = 5;
         } else {
            var1 = client.method1270(var2, class56.loginUsername);
         }

         switch(var1) {
         case 2:
            client.method1272(class270.field3496, class270.field3355, class270.field3320);
            class56.field812 = 6;
            break;
         case 3:
            client.method1272(class270.field3499, class270.field3500, class270.field3501);
            break;
         case 4:
            client.method1272(class270.field3396, class270.field3503, class270.field3446);
            break;
         case 5:
            client.method1272(class270.field3233, class270.field3506, class270.field3507);
            break;
         case 6:
            client.method1272(class270.field3508, class270.field3375, class270.field3330);
            break;
         case 7:
            client.method1272(class270.field3242, class270.field3512, class270.field3513);
         }

      }
   }

   static void method4657(class302 var0, class302 var1, class302 var2) {
      class56.field825 = (class69.canvasWidth - 765) / 2;
      class56.field817 = 202 + class56.field825;
      class167.field1932 = 180 + class56.field817;
      if (class56.field800) {
         class52.method1533(var0, var1);
      } else {
         class56.field815.method6446(class56.field825, 0);
         class56.field803.method6446(382 + class56.field825, 0);
         class89.field1229.method6349(class56.field825 + 382 - class89.field1229.field4263 / 2, 18);
         int var5;
         if (client.field413 == 0 || 5 == client.field413) {
            byte var4 = 20;
            var0.method4922(class270.field3440, class56.field817 + 180, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            class394.method6292(class56.field817 + 180 - 152, var5, 304, 34, 9179409);
            class394.method6292(class56.field817 + 180 - 151, var5 + 1, 302, 32, 0);
            class394.method6265(class56.field817 + 180 - 150, var5 + 2, class56.field806 * 3, 30, 9179409);
            class394.method6265(180 + class56.field817 - 150 + class56.field806 * 3, var5 + 2, 300 - class56.field806 * 3, 30, 0);
            var0.method4922(class56.field807, class56.field817 + 180, 276 - var4, 16777215, -1);
         }

         String var6;
         String var7;
         short var12;
         int var13;
         short var14;
         if (client.field413 == 20) {
            class305.field3760.method6349(180 + class56.field817 - class305.field3760.field4263 / 2, 271 - class305.field3760.field4264 / 2);
            var12 = 201;
            var0.method4922(class56.field823, class56.field817 + 180, var12, 16776960, 0);
            var13 = var12 + 15;
            var0.method4922(class56.field814, class56.field817 + 180, var13, 16776960, 0);
            var13 += 15;
            var0.method4922(class56.field816, class56.field817 + 180, var13, 16776960, 0);
            var13 += 15;
            var13 += 7;
            if (class56.field812 != 4) {
               var0.method4853(class270.field3475, 180 + class56.field817 - 110, var13, 16777215, 0);
               var14 = 200;

               for(var6 = class108.method2106(); var0.method4848(var6) > var14; var6 = var6.substring(0, var6.length() - 1)) {
               }

               var0.method4853(class303.escapeBrackets(var6), class56.field817 + 180 - 70, var13, 16777215, 0);
               var13 += 15;

               for(var7 = class17.method141(class56.loginPassword); var0.method4848(var7) > var14; var7 = var7.substring(1)) {
               }

               var0.method4853(class270.field3466 + var7, class56.field817 + 180 - 108, var13, 16777215, 0);
               var13 += 15;
            }
         }

         if (client.field413 == 10 || client.field413 == 11) {
            class305.field3760.method6349(class56.field817, 171);
            short var15;
            if (class56.field812 == 0) {
               var12 = 251;
               var0.method4922(class270.field3304, class56.field817 + 180, var12, 16776960, 0);
               var13 = var12 + 30;
               var5 = class56.field817 + 180 - 80;
               var15 = 291;
               class56.field801.method6349(var5 - 73, var15 - 20);
               var0.method4857(class270.field3472, var5 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = 80 + class56.field817 + 180;
               class56.field801.method6349(var5 - 73, var15 - 20);
               var0.method4857(class270.field3473, var5 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class56.field812 == 1) {
               var0.method4922(class56.field799, class56.field817 + 180, 201, 16776960, 0);
               var12 = 236;
               var0.method4922(class56.field823, class56.field817 + 180, var12, 16777215, 0);
               var13 = var12 + 15;
               var0.method4922(class56.field814, 180 + class56.field817, var13, 16777215, 0);
               var13 += 15;
               var0.method4922(class56.field816, 180 + class56.field817, var13, 16777215, 0);
               var13 += 15;
               var5 = class56.field817 + 180 - 80;
               var15 = 321;
               class56.field801.method6349(var5 - 73, var15 - 20);
               var0.method4922(class270.field3232, var5, var15 + 5, 16777215, 0);
               var5 = 80 + class56.field817 + 180;
               class56.field801.method6349(var5 - 73, var15 - 20);
               var0.method4922(class270.field3479, var5, var15 + 5, 16777215, 0);
            } else {
               int var8;
               if (class56.field812 == 2) {
                  var12 = 201;
                  var0.method4922(class56.field823, class167.field1932, var12, 16776960, 0);
                  var13 = var12 + 15;
                  var0.method4922(class56.field814, class167.field1932, var13, 16776960, 0);
                  var13 += 15;
                  var0.method4922(class56.field816, class167.field1932, var13, 16776960, 0);
                  var13 += 15;
                  var13 += 7;
                  var0.method4853(class270.field3475, class167.field1932 - 110, var13, 16777215, 0);
                  var14 = 200;

                  for(var6 = class108.method2106(); var0.method4848(var6) > var14; var6 = var6.substring(1)) {
                  }

                  var0.method4853(class303.escapeBrackets(var6) + (0 == class56.field822 & client.field452 % 40 < 20 ? class44.method770(16776960) + class79.field1138 : ""), class167.field1932 - 70, var13, 16777215, 0);
                  var13 += 15;

                  for(var7 = class17.method141(class56.loginPassword); var0.method4848(var7) > var14; var7 = var7.substring(1)) {
                  }

                  var0.method4853(class270.field3466 + var7 + (class56.field822 == 1 & client.field452 % 40 < 20 ? class44.method770(16776960) + class79.field1138 : ""), class167.field1932 - 108, var13, 16777215, 0);
                  var13 += 15;
                  var12 = 277;
                  var8 = class167.field1932 + -117;
                  class397 var9 = method4652(client.isLoginUsernameRemembered, class56.field830);
                  var9.method6349(var8, var12);
                  var8 += 5 + var9.field4263;
                  var1.method4853(class270.field3476, var8, 13 + var12, 16776960, 0);
                  var8 = class167.field1932 + 24;
                  var9 = method4652(class38.clientPreferences.field1117, class56.field820);
                  var9.method6349(var8, var12);
                  var8 += var9.field4263 + 5;
                  var1.method4853(class270.field3477, var8, 13 + var12, 16776960, 0);
                  var13 = var12 + 15;
                  int var10 = class167.field1932 - 80;
                  short var11 = 321;
                  class56.field801.method6349(var10 - 73, var11 - 20);
                  var0.method4922(class270.field3474, var10, var11 + 5, 16777215, 0);
                  var10 = 80 + class167.field1932;
                  class56.field801.method6349(var10 - 73, var11 - 20);
                  var0.method4922(class270.field3479, var10, var11 + 5, 16777215, 0);
                  var12 = 357;
                  switch(class56.field810) {
                  case 2:
                     class48.field704 = class270.field3489;
                     break;
                  default:
                     class48.field704 = class270.field3457;
                  }

                  class19.field128 = new class337(class167.field1932, var12, var1.method4848(class48.field704), 11);
                  class308.field3767 = new class337(class167.field1932, var12, var1.method4848(class270.field3488), 11);
                  var1.method4922(class48.field704, class167.field1932, var12, 16777215, 0);
               } else if (3 == class56.field812) {
                  var12 = 201;
                  var0.method4922(class270.field3478, 180 + class56.field817, var12, 16776960, 0);
                  var13 = var12 + 20;
                  var1.method4922(class270.field3428, 180 + class56.field817, var13, 16776960, 0);
                  var13 += 15;
                  var1.method4922(class270.field3480, 180 + class56.field817, var13, 16776960, 0);
                  var13 += 15;
                  var5 = 180 + class56.field817;
                  var15 = 276;
                  class56.field801.method6349(var5 - 73, var15 - 20);
                  var2.method4922(class270.field3336, var5, var15 + 5, 16777215, 0);
                  var5 = 180 + class56.field817;
                  var15 = 326;
                  class56.field801.method6349(var5 - 73, var15 - 20);
                  var2.method4922(class270.field3482, var5, 5 + var15, 16777215, 0);
               } else {
                  short var19;
                  if (4 == class56.field812) {
                     var0.method4922(class270.field3515, class56.field817 + 180, 201, 16776960, 0);
                     var12 = 236;
                     var0.method4922(class56.field823, 180 + class56.field817, var12, 16777215, 0);
                     var13 = var12 + 15;
                     var0.method4922(class56.field814, class56.field817 + 180, var13, 16777215, 0);
                     var13 += 15;
                     var0.method4922(class56.field816, class56.field817 + 180, var13, 16777215, 0);
                     var13 += 15;
                     var0.method4853(class270.field3442 + class17.method141(class147.field1615) + (client.field452 % 40 < 20 ? class44.method770(16776960) + class79.field1138 : ""), 180 + class56.field817 - 108, var13, 16777215, 0);
                     var13 -= 8;
                     var0.method4853(class270.field3235, 180 + class56.field817 - 9, var13, 16776960, 0);
                     var13 += 15;
                     var0.method4853(class270.field3236, 180 + class56.field817 - 9, var13, 16776960, 0);
                     var5 = 180 + class56.field817 - 9 + var0.method4848(class270.field3236) + 15;
                     int var17 = var13 - var0.field3738;
                     class397 var16;
                     if (class56.field821) {
                        var16 = class173.field2014;
                     } else {
                        var16 = class47.field397;
                     }

                     var16.method6349(var5, var17);
                     var13 += 15;
                     var8 = class56.field817 + 180 - 80;
                     var19 = 321;
                     class56.field801.method6349(var8 - 73, var19 - 20);
                     var0.method4922(class270.field3232, var8, var19 + 5, 16777215, 0);
                     var8 = 180 + class56.field817 + 80;
                     class56.field801.method6349(var8 - 73, var19 - 20);
                     var0.method4922(class270.field3479, var8, var19 + 5, 16777215, 0);
                     var1.method4922(class270.field3458, 180 + class56.field817, 36 + var19, 255, 0);
                  } else if (class56.field812 == 5) {
                     var0.method4922(class270.field3483, 180 + class56.field817, 201, 16776960, 0);
                     var12 = 221;
                     var2.method4922(class56.field823, class56.field817 + 180, var12, 16776960, 0);
                     var13 = var12 + 15;
                     var2.method4922(class56.field814, class56.field817 + 180, var13, 16776960, 0);
                     var13 += 15;
                     var2.method4922(class56.field816, class56.field817 + 180, var13, 16776960, 0);
                     var13 += 15;
                     var13 += 14;
                     var0.method4853(class270.field3244, 180 + class56.field817 - 145, var13, 16777215, 0);
                     var14 = 174;

                     for(var6 = class108.method2106(); var0.method4848(var6) > var14; var6 = var6.substring(1)) {
                     }

                     var0.method4853(class303.escapeBrackets(var6) + (client.field452 % 40 < 20 ? class44.method770(16776960) + class79.field1138 : ""), 180 + class56.field817 - 34, var13, 16777215, 0);
                     var13 += 15;
                     int var18 = class56.field817 + 180 - 80;
                     short var20 = 321;
                     class56.field801.method6349(var18 - 73, var20 - 20);
                     var0.method4922(class270.field3443, var18, 5 + var20, 16777215, 0);
                     var18 = class56.field817 + 180 + 80;
                     class56.field801.method6349(var18 - 73, var20 - 20);
                     var0.method4922(class270.field3486, var18, 5 + var20, 16777215, 0);
                     var20 = 356;
                     var1.method4922(class270.field3488, class167.field1932, var20, 268435455, 0);
                  } else if (6 == class56.field812) {
                     var12 = 201;
                     var0.method4922(class56.field823, class56.field817 + 180, var12, 16776960, 0);
                     var13 = var12 + 15;
                     var0.method4922(class56.field814, class56.field817 + 180, var13, 16776960, 0);
                     var13 += 15;
                     var0.method4922(class56.field816, class56.field817 + 180, var13, 16776960, 0);
                     var13 += 15;
                     var5 = class56.field817 + 180;
                     var15 = 321;
                     class56.field801.method6349(var5 - 73, var15 - 20);
                     var0.method4922(class270.field3486, var5, 5 + var15, 16777215, 0);
                  } else if (7 == class56.field812) {
                     var12 = 216;
                     var0.method4922(class270.field3332, 180 + class56.field817, var12, 16776960, 0);
                     var13 = var12 + 15;
                     var2.method4922(class270.field3252, 180 + class56.field817, var13, 16776960, 0);
                     var13 += 15;
                     var2.method4922(class270.field3516, class56.field817 + 180, var13, 16776960, 0);
                     var13 += 15;
                     var5 = class56.field817 + 180 - 80;
                     var15 = 321;
                     class56.field801.method6349(var5 - 73, var15 - 20);
                     var0.method4922(class270.field3435, var5, 5 + var15, 16777215, 0);
                     var5 = 80 + 180 + class56.field817;
                     class56.field801.method6349(var5 - 73, var15 - 20);
                     var0.method4922(class270.field3486, var5, 5 + var15, 16777215, 0);
                  } else if (class56.field812 == 8) {
                     var12 = 216;
                     var0.method4922(class270.field3511, class56.field817 + 180, var12, 16776960, 0);
                     var13 = var12 + 15;
                     var2.method4922(class270.field3481, 180 + class56.field817, var13, 16776960, 0);
                     var13 += 15;
                     var2.method4922(class270.field3366, 180 + class56.field817, var13, 16776960, 0);
                     var13 += 15;
                     var5 = 180 + class56.field817 - 80;
                     var15 = 321;
                     class56.field801.method6349(var5 - 73, var15 - 20);
                     var0.method4922(class270.field3367, var5, 5 + var15, 16777215, 0);
                     var5 = 80 + 180 + class56.field817;
                     class56.field801.method6349(var5 - 73, var15 - 20);
                     var0.method4922(class270.field3486, var5, 5 + var15, 16777215, 0);
                  } else if (12 == class56.field812) {
                     var12 = 201;
                     String var21 = "";
                     var6 = "";
                     var7 = "";
                     switch(class56.field805) {
                     case 0:
                        var21 = class270.field3280;
                        var6 = class270.field3299;
                        var7 = class270.field3282;
                        break;
                     case 1:
                        var21 = class270.field3319;
                        var6 = class270.field3468;
                        var7 = class270.field3321;
                        break;
                     default:
                        class108.method2103(false);
                     }

                     var0.method4922(var21, 180 + class56.field817, var12, 16776960, 0);
                     var13 = var12 + 15;
                     var2.method4922(var6, class56.field817 + 180, var13, 16776960, 0);
                     var13 += 15;
                     var2.method4922(var7, 180 + class56.field817, var13, 16776960, 0);
                     var13 += 15;
                     var8 = class56.field817 + 180;
                     var19 = 276;
                     class56.field801.method6349(var8 - 73, var19 - 20);
                     var0.method4922(class270.field3504, var8, 5 + var19, 16777215, 0);
                     var8 = class56.field817 + 180;
                     var19 = 326;
                     class56.field801.method6349(var8 - 73, var19 - 20);
                     var0.method4922(class270.field3486, var8, var19 + 5, 16777215, 0);
                  } else if (class56.field812 == 24) {
                     var12 = 221;
                     var0.method4922(class56.field823, 180 + class56.field817, var12, 16777215, 0);
                     var13 = var12 + 15;
                     var0.method4922(class56.field814, class56.field817 + 180, var13, 16777215, 0);
                     var13 += 15;
                     var0.method4922(class56.field816, 180 + class56.field817, var13, 16777215, 0);
                     var13 += 15;
                     var5 = class56.field817 + 180;
                     var15 = 301;
                     class56.field801.method6349(var5 - 73, var15 - 20);
                     var0.method4922(class270.field3230, var5, var15 + 5, 16777215, 0);
                  }
               }
            }
         }

         if (client.field413 >= 10) {
            int[] var24 = new int[4];
            class394.method6259(var24);
            class394.method6279(class56.field825, 0, class56.field825 + 765, client.canvasHeight);
            class7.field16.method1775(class56.field825 - 22, client.field452);
            class7.field16.method1775(22 + class56.field825 + 765 - 128, client.field452);
            class394.method6260(var24);
         }

         class133.field1486[class38.clientPreferences.field1114 ? 1 : 0].method6349(class56.field825 + 765 - 40, 463);
         if (client.field413 > 5 && class284.field3644 == class292.field3694) {
            if (class236.field2847 != null) {
               var13 = 5 + class56.field825;
               var14 = 463;
               byte var23 = 100;
               byte var22 = 35;
               class236.field2847.method6349(var13, var14);
               var0.method4922(class270.field3395 + " " + client.field405, var23 / 2 + var13, var22 / 2 + var14 - 2, 16777215, 0);
               if (class78.field1135 != null) {
                  var1.method4922(class270.field3527, var13 + var23 / 2, 12 + var14 + var22 / 2, 16777215, 0);
               } else {
                  var1.method4922(class270.field3528, var13 + var23 / 2, 12 + var14 + var22 / 2, 16777215, 0);
               }
            } else {
               class236.field2847 = class118.method2187(class271.archive8, "sl_button", "");
            }
         }

      }
   }

   static final boolean method4656() {
      return client.isMenuOpen;
   }
}
