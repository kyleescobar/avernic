import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.URL;

public class class156 extends class349 {
   public static class223 field1738 = new class223(500);
   static boolean field1742 = false;
   static class193[] field1741 = new class193[4];
   static class223 field1739 = new class223(30);
   static class223 field1740 = new class223(30);
   static class223 field1784 = new class223(4096);
   static class277 field1735;
   static class277 field1748;
   boolean field1760;
   boolean field1771;
   boolean field1785;
   class363 field1770;
   int field1736;
   int field1737;
   int field1755;
   int field1761;
   int field1767;
   int field1768;
   int field1772;
   int field1773;
   int field1776;
   int field1777;
   int field1778;
   int[] field1743;
   int[] field1744;
   short[] field1746;
   short[] field1747;
   short[] field1749;
   short[] field1774;
   public boolean field1734;
   public boolean field1757;
   public boolean field1759;
   public boolean field1765;
   public boolean field1779;
   public int field1745;
   public int field1750;
   public int field1751;
   public int field1752;
   public int field1753;
   public int field1754;
   public int field1756;
   public int field1758;
   public int field1763;
   public int field1764;
   public int field1766;
   public int field1775;
   public int field1780;
   public int field1782;
   public int[] field1762;
   public int[] field1781;
   public String field1769;
   public String[] field1783;

   public static class155 method2682(int var0) {
      class155 var2 = (class155)class155.field1709.method3880((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class155.field1711.method4412(32, var0);
         var2 = new class155();
         if (var3 != null) {
            var2.method2606(new Buffer(var3));
         }

         class155.field1709.method3882(var2, (long)var0);
         return var2;
      }
   }

   static boolean method2653(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!class17.field88.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var5 = 0; var5 < var0.length(); ++var5) {
                  if (var11.indexOf(var0.charAt(var5)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var6) {
            return false;
         }
      } else if (var1 == 1) {
         try {
            Object var4 = class15.method120(class17.field90, var2, new Object[]{(new URL(class17.field90.getCodeBase(), var0)).toString()});
            return var4 != null;
         } catch (Throwable var7) {
            return false;
         }
      } else if (2 == var1) {
         try {
            class17.field90.getAppletContext().showDocument(new URL(class17.field90.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else if (3 == var1) {
         try {
            class15.method113(class17.field90, "loggedout");
         } catch (Throwable var10) {
         }

         try {
            class17.field90.getAppletContext().showDocument(new URL(class17.field90.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var9) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   class156() {
      this.field1769 = class270.field3234;
      this.field1750 = 1;
      this.field1751 = 1;
      this.field1752 = 2;
      this.field1779 = true;
      this.field1754 = -1;
      this.field1755 = -1;
      this.field1771 = false;
      this.field1757 = false;
      this.field1758 = -1;
      this.field1745 = 16;
      this.field1737 = 0;
      this.field1761 = 0;
      this.field1783 = new String[5];
      this.field1763 = -1;
      this.field1764 = -1;
      this.field1760 = false;
      this.field1765 = true;
      this.field1767 = 128;
      this.field1768 = 128;
      this.field1776 = 128;
      this.field1736 = 0;
      this.field1773 = 0;
      this.field1772 = 0;
      this.field1759 = false;
      this.field1785 = false;
      this.field1775 = -1;
      this.field1777 = -1;
      this.field1778 = -1;
      this.field1766 = -1;
      this.field1780 = 0;
      this.field1756 = 0;
      this.field1782 = 0;
      this.field1734 = true;
   }

   void method2628() {
      if (-1 == this.field1754) {
         this.field1754 = 0;
         if (null != this.field1743 && (null == this.field1744 || this.field1744[0] == 10)) {
            this.field1754 = 1;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if (null != this.field1783[var2]) {
               this.field1754 = 1;
            }
         }
      }

      if (-1 == this.field1775) {
         this.field1775 = 0 != this.field1752 ? 1 : 0;
      }

   }

   void method2637(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method2630(var1, var3);
      }
   }

   void method2630(Buffer var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.readUnsignedByte();
         if (var4 > 0) {
            if (null != this.field1743 && !field1742) {
               var1.offset += var4 * 3;
            } else {
               this.field1744 = new int[var4];
               this.field1743 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field1743[var5] = var1.readUnsignedShort();
                  this.field1744[var5] = var1.readUnsignedByte();
               }
            }
         }
      } else if (var2 == 2) {
         this.field1769 = var1.readStringNullTerminated();
      } else if (var2 == 5) {
         var4 = var1.readUnsignedByte();
         if (var4 > 0) {
            if (null != this.field1743 && !field1742) {
               var1.offset += 2 * var4;
            } else {
               this.field1744 = null;
               this.field1743 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field1743[var5] = var1.readUnsignedShort();
               }
            }
         }
      } else if (14 == var2) {
         this.field1750 = var1.readUnsignedByte();
      } else if (var2 == 15) {
         this.field1751 = var1.readUnsignedByte();
      } else if (var2 == 17) {
         this.field1752 = 0;
         this.field1779 = false;
      } else if (18 == var2) {
         this.field1779 = false;
      } else if (19 == var2) {
         this.field1754 = var1.readUnsignedByte();
      } else if (21 == var2) {
         this.field1755 = 0;
      } else if (22 == var2) {
         this.field1771 = true;
      } else if (23 == var2) {
         this.field1757 = true;
      } else if (24 == var2) {
         this.field1758 = var1.readUnsignedShort();
         if (this.field1758 == 65535) {
            this.field1758 = -1;
         }
      } else if (var2 == 27) {
         this.field1752 = 1;
      } else if (28 == var2) {
         this.field1745 = var1.readUnsignedByte();
      } else if (var2 == 29) {
         this.field1737 = var1.readByte();
      } else if (var2 == 39) {
         this.field1761 = var1.readByte() * 25;
      } else if (var2 >= 30 && var2 < 35) {
         this.field1783[var2 - 30] = var1.readStringNullTerminated();
         if (this.field1783[var2 - 30].equalsIgnoreCase(class270.field3525)) {
            this.field1783[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.readUnsignedByte();
         this.field1746 = new short[var4];
         this.field1747 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1746[var5] = (short)var1.readUnsignedShort();
            this.field1747[var5] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 41) {
         var4 = var1.readUnsignedByte();
         this.field1774 = new short[var4];
         this.field1749 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1774[var5] = (short)var1.readUnsignedShort();
            this.field1749[var5] = (short)var1.readUnsignedShort();
         }
      } else if (61 == var2) {
         var1.readUnsignedShort();
      } else if (62 == var2) {
         this.field1760 = true;
      } else if (64 == var2) {
         this.field1765 = false;
      } else if (var2 == 65) {
         this.field1767 = var1.readUnsignedShort();
      } else if (var2 == 66) {
         this.field1768 = var1.readUnsignedShort();
      } else if (var2 == 67) {
         this.field1776 = var1.readUnsignedShort();
      } else if (var2 == 68) {
         this.field1764 = var1.readUnsignedShort();
      } else if (var2 == 69) {
         var1.readUnsignedByte();
      } else if (70 == var2) {
         this.field1736 = var1.method5951();
      } else if (var2 == 71) {
         this.field1773 = var1.method5951();
      } else if (72 == var2) {
         this.field1772 = var1.method5951();
      } else if (73 == var2) {
         this.field1759 = true;
      } else if (74 == var2) {
         this.field1785 = true;
      } else if (75 == var2) {
         this.field1775 = var1.readUnsignedByte();
      } else if (var2 != 77 && 92 != var2) {
         if (78 == var2) {
            this.field1766 = var1.readUnsignedShort();
            this.field1780 = var1.readUnsignedByte();
         } else if (var2 == 79) {
            this.field1756 = var1.readUnsignedShort();
            this.field1782 = var1.readUnsignedShort();
            this.field1780 = var1.readUnsignedByte();
            var4 = var1.readUnsignedByte();
            this.field1781 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1781[var5] = var1.readUnsignedShort();
            }
         } else if (81 == var2) {
            this.field1755 = var1.readUnsignedByte() * 256;
         } else if (82 == var2) {
            this.field1763 = var1.readUnsignedShort();
         } else if (89 == var2) {
            this.field1734 = false;
         } else if (249 == var2) {
            this.field1770 = class50.method1392(var1, this.field1770);
         }
      } else {
         this.field1777 = var1.readUnsignedShort();
         if (this.field1777 == 65535) {
            this.field1777 = -1;
         }

         this.field1778 = var1.readUnsignedShort();
         if (this.field1778 == 65535) {
            this.field1778 = -1;
         }

         var4 = -1;
         if (var2 == 92) {
            var4 = var1.readUnsignedShort();
            if (65535 == var4) {
               var4 = -1;
            }
         }

         var5 = var1.readUnsignedByte();
         this.field1762 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field1762[var6] = var1.readUnsignedShort();
            if (65535 == this.field1762[var6]) {
               this.field1762[var6] = -1;
            }
         }

         this.field1762[1 + var5] = var4;
      }

   }

   public static class397 method2684(class277 var0, int var1) {
      byte[] var4 = var0.method4419(var1);
      boolean var3;
      if (null == var4) {
         var3 = false;
      } else {
         class204.method3698(var4);
         var3 = true;
      }

      if (!var3) {
         return null;
      } else {
         class397 var5 = new class397();
         var5.field4267 = class399.field4281;
         var5.field4268 = class399.field4286;
         var5.field4265 = class399.field4284[0];
         var5.field4266 = class399.field4285[0];
         var5.field4263 = class106.field1308[0];
         var5.field4264 = class375.field4156[0];
         var5.field4261 = class119.field1407;
         var5.field4262 = class399.field4283[0];
         class399.field4284 = null;
         class399.field4285 = null;
         class106.field1308 = null;
         class375.field4156 = null;
         class119.field1407 = null;
         class399.field4283 = (byte[][])null;
         return var5;
      }
   }

   static void method2645(class19 var0) {
      int var3;
      int var4;
      int var25;
      if (class56.field800) {
         while(true) {
            if (!class317.method5085()) {
               if (1 != MouseHandler.lastButton && (class311.mouseCam || 4 != MouseHandler.lastButton)) {
                  break;
               }

               int var24 = class56.field825 + 280;
               if (MouseHandler.lastPressedX >= var24 && MouseHandler.lastPressedX <= var24 + 14 && MouseHandler.lastPressedY >= 4 && MouseHandler.lastPressedY <= 18) {
                  class292.method4644(0, 0);
                  break;
               }

               if (MouseHandler.lastPressedX >= 15 + var24 && MouseHandler.lastPressedX <= var24 + 80 && MouseHandler.lastPressedY >= 4 && MouseHandler.lastPressedY <= 18) {
                  class292.method4644(0, 1);
                  break;
               }

               var3 = class56.field825 + 390;
               if (MouseHandler.lastPressedX >= var3 && MouseHandler.lastPressedX <= 14 + var3 && MouseHandler.lastPressedY >= 4 && MouseHandler.lastPressedY <= 18) {
                  class292.method4644(1, 0);
                  break;
               }

               if (MouseHandler.lastPressedX >= var3 + 15 && MouseHandler.lastPressedX <= var3 + 80 && MouseHandler.lastPressedY >= 4 && MouseHandler.lastPressedY <= 18) {
                  class292.method4644(1, 1);
                  break;
               }

               var4 = class56.field825 + 500;
               if (MouseHandler.lastPressedX >= var4 && MouseHandler.lastPressedX <= 14 + var4 && MouseHandler.lastPressedY >= 4 && MouseHandler.lastPressedY <= 18) {
                  class292.method4644(2, 0);
                  break;
               }

               if (MouseHandler.lastPressedX >= var4 + 15 && MouseHandler.lastPressedX <= 80 + var4 && MouseHandler.lastPressedY >= 4 && MouseHandler.lastPressedY <= 18) {
                  class292.method4644(2, 1);
                  break;
               }

               var25 = 610 + class56.field825;
               if (MouseHandler.lastPressedX >= var25 && MouseHandler.lastPressedX <= var25 + 14 && MouseHandler.lastPressedY >= 4 && MouseHandler.lastPressedY <= 18) {
                  class292.method4644(3, 0);
                  break;
               }

               if (MouseHandler.lastPressedX >= 15 + var25 && MouseHandler.lastPressedX <= 80 + var25 && MouseHandler.lastPressedY >= 4 && MouseHandler.lastPressedY <= 18) {
                  class292.method4644(3, 1);
                  break;
               }

               if (MouseHandler.lastPressedX >= 708 + class56.field825 && MouseHandler.lastPressedY >= 4 && MouseHandler.lastPressedX <= 708 + class56.field825 + 50 && MouseHandler.lastPressedY <= 20) {
                  class115.method2184();
                  break;
               }

               if (-1 != class56.field826) {
                  class48 var42 = class16.field86[class56.field826];
                  class157.method2717(var42);
                  class115.method2184();
               } else {
                  if (class56.field827 > 0 && class138.field1520 != null && MouseHandler.lastPressedX >= 0 && MouseHandler.lastPressedX <= class138.field1520.field4263 && MouseHandler.lastPressedY >= client.canvasHeight / 2 - 50 && MouseHandler.lastPressedY <= 50 + client.canvasHeight / 2) {
                     --class56.field827;
                  }

                  if (class56.field827 < class56.field828 && class96.field1257 != null && MouseHandler.lastPressedX >= class69.canvasWidth - class96.field1257.field4263 - 5 && MouseHandler.lastPressedX <= class69.canvasWidth && MouseHandler.lastPressedY >= client.canvasHeight / 2 - 50 && MouseHandler.lastPressedY <= 50 + client.canvasHeight / 2) {
                     ++class56.field827;
                  }
               }
               break;
            }

            if (13 == class121.field1418) {
               class115.method2184();
               break;
            }

            if (96 == class121.field1418) {
               if (class56.field827 > 0 && null != class138.field1520) {
                  --class56.field827;
               }
            } else if (97 == class121.field1418 && class56.field827 < class56.field828 && null != class96.field1257) {
               ++class56.field827;
            }
         }

      } else {
         if ((MouseHandler.lastButton == 1 || !class311.mouseCam && MouseHandler.lastButton == 4) && MouseHandler.lastPressedX >= 765 + class56.field825 - 50 && MouseHandler.lastPressedY >= 453) {
            class38.clientPreferences.field1114 = !class38.clientPreferences.field1114;
            class135.savePreferences();
            if (!class38.clientPreferences.field1114) {
               class275 var2 = class109.archive6;
               var3 = var2.readGroup("scape main");
               var4 = var2.method4430(var3, "");
               PlayerList.method1886(var2, var3, var4, 255, false);
            } else {
               class60.method1610();
            }
         }

         if (client.field413 != 5) {
            if (class56.field829 == -1L) {
               class56.field829 = class87.method1989() + 1000L;
            }

            long var23 = class87.method1989();
            if (class17.method138() && -1L == class56.field813) {
               class56.field813 = var23;
               if (class56.field813 > class56.field829) {
                  class56.field829 = class56.field813;
               }
            }

            if (10 == client.field413 || client.field413 == 11) {
               if (class284.field3644 == class292.field3694) {
                  if (MouseHandler.lastButton == 1 || !class311.mouseCam && MouseHandler.lastButton == 4) {
                     var4 = class56.field825 + 5;
                     short var5 = 463;
                     byte var6 = 100;
                     byte var7 = 35;
                     if (MouseHandler.lastPressedX >= var4 && MouseHandler.lastPressedX <= var4 + var6 && MouseHandler.lastPressedY >= var5 && MouseHandler.lastPressedY <= var7 + var5) {
                        if (class270.method4359()) {
                           class56.field800 = true;
                           class56.field827 = 0;
                           class56.field828 = 0;
                        }

                        return;
                     }
                  }

                  if (class78.field1135 != null && class270.method4359()) {
                     class56.field800 = true;
                     class56.field827 = 0;
                     class56.field828 = 0;
                  }
               }

               var4 = MouseHandler.lastButton;
               var25 = MouseHandler.lastPressedX;
               int var26 = MouseHandler.lastPressedY;
               if (var4 == 0) {
                  var25 = MouseHandler.field142;
                  var26 = MouseHandler.field145;
               }

               if (!class311.mouseCam && var4 == 4) {
                  var4 = 1;
               }

               short var29;
               int var30;
               if (class56.field812 == 0) {
                  boolean var41 = false;

                  while(class317.method5085()) {
                     if (class121.field1418 == 84) {
                        var41 = true;
                     }
                  }

                  var30 = class167.field1932 - 80;
                  var29 = 291;
                  if (var4 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) {
                     class139.method2345(class92.method2031("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var30 = class167.field1932 + 80;
                  if (var4 == 1 && var25 >= var30 - 75 && var25 <= 75 + var30 && var26 >= var29 - 20 && var26 <= 20 + var29 || var41) {
                     if (0 != (client.field406 & 33554432)) {
                        class56.field799 = "";
                        class56.field823 = class270.field3454;
                        class56.field814 = class270.field3274;
                        class56.field816 = class270.field3456;
                        class56.field812 = 1;
                        if (client.isLoginUsernameRemembered && class56.loginUsername != null && class56.loginUsername.length() > 0) {
                           class56.field822 = 1;
                        } else {
                           class56.field822 = 0;
                        }
                     } else if (0 != (client.field406 & 4)) {
                        if (0 != (client.field406 & 1024)) {
                           class56.field823 = class270.field3451;
                           class56.field814 = class270.field3452;
                           class56.field816 = class270.field3453;
                        } else {
                           class56.field823 = class270.field3445;
                           class56.field814 = class270.field3470;
                           class56.field816 = class270.field3447;
                        }

                        class56.field799 = class270.field3301;
                        class56.field812 = 1;
                        if (client.isLoginUsernameRemembered && class56.loginUsername != null && class56.loginUsername.length() > 0) {
                           class56.field822 = 1;
                        } else {
                           class56.field822 = 0;
                        }
                     } else if ((client.field406 & 1024) != 0) {
                        class56.field823 = class270.field3448;
                        class56.field814 = class270.field3449;
                        class56.field816 = class270.field3308;
                        class56.field799 = class270.field3301;
                        class56.field812 = 1;
                        if (client.isLoginUsernameRemembered && class56.loginUsername != null && class56.loginUsername.length() > 0) {
                           class56.field822 = 1;
                        } else {
                           class56.field822 = 0;
                        }
                     } else {
                        class108.method2103(false);
                     }
                  }
               } else {
                  short var8;
                  int var27;
                  if (class56.field812 == 1) {
                     while(true) {
                        if (!class317.method5085()) {
                           var27 = class167.field1932 - 80;
                           var8 = 321;
                           if (var4 == 1 && var25 >= var27 - 75 && var25 <= 75 + var27 && var26 >= var8 - 20 && var26 <= 20 + var8) {
                              class108.method2103(false);
                           }

                           var27 = 80 + class167.field1932;
                           if (var4 == 1 && var25 >= var27 - 75 && var25 <= 75 + var27 && var26 >= var8 - 20 && var26 <= 20 + var8) {
                              class56.field812 = 0;
                           }
                           break;
                        }

                        if (class121.field1418 == 84) {
                           class108.method2103(false);
                        } else if (13 == class121.field1418) {
                           class56.field812 = 0;
                        }
                     }
                  } else {
                     short var28;
                     boolean var32;
                     if (class56.field812 == 2) {
                        var28 = 201;
                        var27 = var28 + 52;
                        if (1 == var4 && var26 >= var27 - 12 && var26 < var27 + 2) {
                           class56.field822 = 0;
                        }

                        var27 += 15;
                        if (1 == var4 && var26 >= var27 - 12 && var26 < var27 + 2) {
                           class56.field822 = 1;
                        }

                        var27 += 15;
                        var28 = 361;
                        if (null != class19.field128) {
                           var30 = class19.field128.field3923 / 2;
                           if (var4 == 1 && var25 >= class19.field128.field3925 - var30 && var25 <= var30 + class19.field128.field3925 && var26 >= var28 - 15 && var26 < var28) {
                              switch(class56.field810) {
                              case 1:
                                 client.method1272(class270.field3514, class270.field3494, class270.field3495);
                                 class56.field812 = 5;
                                 return;
                              case 2:
                                 class139.method2345("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var30 = class167.field1932 - 80;
                        var29 = 321;
                        if (1 == var4 && var25 >= var30 - 75 && var25 <= 75 + var30 && var26 >= var29 - 20 && var26 <= var29 + 20) {
                           class56.loginUsername = class56.loginUsername.trim();
                           if (class56.loginUsername.length() == 0) {
                              client.method1272(class270.field3260, class270.field3347, class270.field3239);
                              return;
                           }

                           if (class56.loginPassword.length() == 0) {
                              client.method1272(class270.field3377, class270.field3350, class270.field3351);
                              return;
                           }

                           client.method1272(class270.field3459, class270.field3460, class270.field3461);
                           class51.method1468(false);
                           class17.method128(20);
                           return;
                        }

                        var30 = 80 + 180 + class56.field817;
                        if (1 == var4 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= 20 + var29) {
                           class56.field812 = 0;
                           class56.loginUsername = "";
                           class56.loginPassword = "";
                           class283.mfaAuthCode = 0;
                           class147.field1615 = "";
                           class56.field821 = true;
                        }

                        var30 = class167.field1932 + -117;
                        var29 = 277;
                        class56.field830 = var25 >= var30 && var25 < var30 + class115.field1387 && var26 >= var29 && var26 < var29 + class48.field705;
                        if (var4 == 1 && class56.field830) {
                           client.isLoginUsernameRemembered = !client.isLoginUsernameRemembered;
                           if (!client.isLoginUsernameRemembered && class38.clientPreferences.rememberUsername != null) {
                              class38.clientPreferences.rememberUsername = null;
                              class135.savePreferences();
                           }
                        }

                        var30 = class167.field1932 + 24;
                        var29 = 277;
                        class56.field820 = var25 >= var30 && var25 < class115.field1387 + var30 && var26 >= var29 && var26 < class48.field705 + var29;
                        if (var4 == 1 && class56.field820) {
                           class38.clientPreferences.field1117 = !class38.clientPreferences.field1117;
                           if (!class38.clientPreferences.field1117) {
                              class56.loginUsername = "";
                              class38.clientPreferences.rememberUsername = null;
                              if (client.isLoginUsernameRemembered && null != class56.loginUsername && class56.loginUsername.length() > 0) {
                                 class56.field822 = 1;
                              } else {
                                 class56.field822 = 0;
                              }
                           }

                           class135.savePreferences();
                        }

                        label1268:
                        while(true) {
                           Transferable var34;
                           int var36;
                           do {
                              while(true) {
                                 char var33;
                                 label1182:
                                 do {
                                    while(true) {
                                       while(class317.method5085()) {
                                          if (class121.field1418 != 13) {
                                             if (0 != class56.field822) {
                                                continue label1182;
                                             }

                                             class178.method3182(class127.field1450);
                                             if (85 == class121.field1418 && class56.loginUsername.length() > 0) {
                                                class56.loginUsername = class56.loginUsername.substring(0, class56.loginUsername.length() - 1);
                                             }

                                             if (class121.field1418 == 84 || 80 == class121.field1418) {
                                                class56.field822 = 1;
                                             }

                                             var33 = class127.field1450;
                                             var32 = class56.field811.indexOf(var33) != -1;
                                             if (var32 && class56.loginUsername.length() < 320) {
                                                class56.loginUsername = class56.loginUsername + class127.field1450;
                                             }
                                          } else {
                                             class56.field812 = 0;
                                             class56.loginUsername = "";
                                             class56.loginPassword = "";
                                             class283.mfaAuthCode = 0;
                                             class147.field1615 = "";
                                             class56.field821 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(1 != class56.field822);

                                 if (class121.field1418 == 85 && class56.loginPassword.length() > 0) {
                                    class56.loginPassword = class56.loginPassword.substring(0, class56.loginPassword.length() - 1);
                                 } else if (class121.field1418 == 84 || class121.field1418 == 80) {
                                    class56.field822 = 0;
                                    if (class121.field1418 == 84) {
                                       class56.loginUsername = class56.loginUsername.trim();
                                       if (class56.loginUsername.length() == 0) {
                                          client.method1272(class270.field3260, class270.field3347, class270.field3239);
                                          return;
                                       }

                                       if (class56.loginPassword.length() == 0) {
                                          client.method1272(class270.field3377, class270.field3350, class270.field3351);
                                          return;
                                       }

                                       client.method1272(class270.field3459, class270.field3460, class270.field3461);
                                       class51.method1468(false);
                                       class17.method128(20);
                                       return;
                                    }
                                 }

                                 if ((KeyHandler.pressedKeys[82] || KeyHandler.pressedKeys[87]) && class121.field1418 == 67) {
                                    Clipboard var37 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var34 = var37.getContents(class59.field874);
                                    var36 = 20 - class56.loginPassword.length();
                                    break;
                                 }

                                 var33 = class127.field1450;
                                 if (var33 >= ' ' && var33 < 127 || var33 > 127 && var33 < 160 || var33 > 160 && var33 <= 255) {
                                    var32 = true;
                                 } else {
                                    label1411: {
                                       if (0 != var33) {
                                          char[] var12 = class304.field3755;

                                          for(int var13 = 0; var13 < var12.length; ++var13) {
                                             char var14 = var12[var13];
                                             if (var14 == var33) {
                                                var32 = true;
                                                break label1411;
                                             }
                                          }
                                       }

                                       var32 = false;
                                    }
                                 }

                                 if (var32) {
                                    char var38 = class127.field1450;
                                    boolean var35 = class56.field811.indexOf(var38) != -1;
                                    if (var35 && class56.loginPassword.length() < 20) {
                                       class56.loginPassword = class56.loginPassword + class127.field1450;
                                    }
                                 }
                              }
                           } while(var36 <= 0);

                           try {
                              String var39 = (String)var34.getTransferData(DataFlavor.stringFlavor);
                              int var40 = Math.min(var36, var39.length());
                              int var15 = 0;

                              while(true) {
                                 if (var15 >= var40) {
                                    class56.loginPassword = class56.loginPassword + var39.substring(0, var40);
                                    continue label1268;
                                 }

                                 char var17 = var39.charAt(var15);
                                 boolean var16;
                                 if (var17 >= ' ' && var17 < 127 || var17 > 127 && var17 < 160 || var17 > 160 && var17 <= 255) {
                                    var16 = true;
                                 } else {
                                    label1412: {
                                       if (var17 != 0) {
                                          char[] var18 = class304.field3755;

                                          for(int var19 = 0; var19 < var18.length; ++var19) {
                                             char var20 = var18[var19];
                                             if (var17 == var20) {
                                                var16 = true;
                                                break label1412;
                                             }
                                          }
                                       }

                                       var16 = false;
                                    }
                                 }

                                 if (!var16) {
                                    break;
                                 }

                                 char var44 = var39.charAt(var15);
                                 boolean var43 = class56.field811.indexOf(var44) != -1;
                                 if (!var43) {
                                    break;
                                 }

                                 ++var15;
                              }

                              class56.field812 = 3;
                              return;
                           } catch (UnsupportedFlavorException var21) {
                           } catch (IOException var22) {
                           }
                        }
                     } else if (3 == class56.field812) {
                        var27 = class56.field817 + 180;
                        var8 = 276;
                        if (1 == var4 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= 20 + var8) {
                           class108.method2103(false);
                        }

                        var27 = class56.field817 + 180;
                        var8 = 326;
                        if (var4 == 1 && var25 >= var27 - 75 && var25 <= 75 + var27 && var26 >= var8 - 20 && var26 <= 20 + var8) {
                           client.method1272(class270.field3514, class270.field3494, class270.field3495);
                           class56.field812 = 5;
                           return;
                        }
                     } else {
                        int var10;
                        if (4 == class56.field812) {
                           var27 = class56.field817 + 180 - 80;
                           var8 = 321;
                           if (var4 == 1 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= 20 + var8) {
                              class147.field1615.trim();
                              if (class147.field1615.length() != 6) {
                                 client.method1272(class270.field3265, class270.field3266, class270.field3485);
                                 return;
                              }

                              class283.mfaAuthCode = Integer.parseInt(class147.field1615);
                              class147.field1615 = "";
                              class51.method1468(true);
                              client.method1272(class270.field3459, class270.field3460, class270.field3461);
                              class17.method128(20);
                              return;
                           }

                           if (var4 == 1 && var25 >= 180 + class56.field817 - 9 && var25 <= class56.field817 + 180 + 130 && var26 >= 263 && var26 <= 296) {
                              class56.field821 = !class56.field821;
                           }

                           if (1 == var4 && var25 >= 180 + class56.field817 - 34 && var25 <= 34 + 180 + class56.field817 && var26 >= 351 && var26 <= 363) {
                              class139.method2345(class92.method2031("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var27 = class56.field817 + 180 + 80;
                           if (1 == var4 && var25 >= var27 - 75 && var25 <= 75 + var27 && var26 >= var8 - 20 && var26 <= var8 + 20) {
                              class56.field812 = 0;
                              class56.loginUsername = "";
                              class56.loginPassword = "";
                              class283.mfaAuthCode = 0;
                              class147.field1615 = "";
                           }

                           while(class317.method5085()) {
                              boolean var9 = false;

                              for(var10 = 0; var10 < class56.field824.length(); ++var10) {
                                 if (class127.field1450 == class56.field824.charAt(var10)) {
                                    var9 = true;
                                    break;
                                 }
                              }

                              if (class121.field1418 == 13) {
                                 class56.field812 = 0;
                                 class56.loginUsername = "";
                                 class56.loginPassword = "";
                                 class283.mfaAuthCode = 0;
                                 class147.field1615 = "";
                              } else {
                                 if (class121.field1418 == 85 && class147.field1615.length() > 0) {
                                    class147.field1615 = class147.field1615.substring(0, class147.field1615.length() - 1);
                                 }

                                 if (class121.field1418 == 84) {
                                    class147.field1615.trim();
                                    if (class147.field1615.length() != 6) {
                                       client.method1272(class270.field3265, class270.field3266, class270.field3485);
                                       return;
                                    }

                                    class283.mfaAuthCode = Integer.parseInt(class147.field1615);
                                    class147.field1615 = "";
                                    class51.method1468(true);
                                    client.method1272(class270.field3459, class270.field3460, class270.field3461);
                                    class17.method128(20);
                                    return;
                                 }

                                 if (var9 && class147.field1615.length() < 6) {
                                    class147.field1615 = class147.field1615 + class127.field1450;
                                 }
                              }
                           }
                        } else if (5 == class56.field812) {
                           var27 = class56.field817 + 180 - 80;
                           var8 = 321;
                           if (1 == var4 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
                              class293.method4647();
                              return;
                           }

                           var27 = class56.field817 + 180 + 80;
                           if (1 == var4 && var25 >= var27 - 75 && var25 <= 75 + var27 && var26 >= var8 - 20 && var26 <= var8 + 20) {
                              class108.method2103(true);
                           }

                           var29 = 361;
                           if (class308.field3767 != null) {
                              var10 = class308.field3767.field3923 / 2;
                              if (1 == var4 && var25 >= class308.field3767.field3925 - var10 && var25 <= class308.field3767.field3925 + var10 && var26 >= var29 - 15 && var26 < var29) {
                                 class139.method2345(class92.method2031("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                              }
                           }

                           while(class317.method5085()) {
                              var32 = false;

                              for(int var11 = 0; var11 < class56.field811.length(); ++var11) {
                                 if (class127.field1450 == class56.field811.charAt(var11)) {
                                    var32 = true;
                                    break;
                                 }
                              }

                              if (13 == class121.field1418) {
                                 class108.method2103(true);
                              } else {
                                 if (class121.field1418 == 85 && class56.loginUsername.length() > 0) {
                                    class56.loginUsername = class56.loginUsername.substring(0, class56.loginUsername.length() - 1);
                                 }

                                 if (class121.field1418 == 84) {
                                    class293.method4647();
                                    return;
                                 }

                                 if (var32 && class56.loginUsername.length() < 320) {
                                    class56.loginUsername = class56.loginUsername + class127.field1450;
                                 }
                              }
                           }
                        } else if (class56.field812 != 6) {
                           if (class56.field812 == 7) {
                              var27 = class56.field817 + 180 - 80;
                              var8 = 321;
                              if (1 == var4 && var25 >= var27 - 75 && var25 <= var27 + 75 && var26 >= var8 - 20 && var26 <= var8 + 20) {
                                 class139.method2345(class92.method2031("secure", true) + "m=dob/set_dob.ws", true, false);
                                 client.method1272(class270.field3490, class270.field3491, class270.field3493);
                                 class56.field812 = 6;
                                 return;
                              }

                              var27 = 180 + class56.field817 + 80;
                              if (var4 == 1 && var25 >= var27 - 75 && var25 <= 75 + var27 && var26 >= var8 - 20 && var26 <= 20 + var8) {
                                 class108.method2103(true);
                              }
                           } else if (8 == class56.field812) {
                              var27 = 180 + class56.field817 - 80;
                              var8 = 321;
                              if (var4 == 1 && var25 >= var27 - 75 && var25 <= 75 + var27 && var26 >= var8 - 20 && var26 <= var8 + 20) {
                                 class139.method2345("https://www.jagex.com/terms/privacy", true, false);
                                 client.method1272(class270.field3490, class270.field3491, class270.field3493);
                                 class56.field812 = 6;
                                 return;
                              }

                              var27 = 80 + 180 + class56.field817;
                              if (var4 == 1 && var25 >= var27 - 75 && var25 <= 75 + var27 && var26 >= var8 - 20 && var26 <= 20 + var8) {
                                 class108.method2103(true);
                              }
                           } else if (12 == class56.field812) {
                              String var31 = "";
                              switch(class56.field805) {
                              case 0:
                                 var31 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                 break;
                              case 1:
                                 var31 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                 break;
                              default:
                                 class108.method2103(false);
                              }

                              var30 = class56.field817 + 180;
                              var29 = 276;
                              if (1 == var4 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= var29 + 20) {
                                 class139.method2345(var31, true, false);
                                 client.method1272(class270.field3490, class270.field3491, class270.field3493);
                                 class56.field812 = 6;
                                 return;
                              }

                              var30 = 180 + class56.field817;
                              var29 = 326;
                              if (var4 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var29 - 20 && var26 <= 20 + var29) {
                                 class108.method2103(false);
                              }
                           } else if (class56.field812 == 24) {
                              var27 = class56.field817 + 180;
                              var8 = 301;
                              if (var4 == 1 && var25 >= var27 - 75 && var25 <= 75 + var27 && var26 >= var8 - 20 && var26 <= var8 + 20) {
                                 class108.method2103(false);
                              }
                           }
                        } else {
                           while(true) {
                              do {
                                 if (!class317.method5085()) {
                                    var28 = 321;
                                    if (1 == var4 && var26 >= var28 - 20 && var26 <= 20 + var28) {
                                       class108.method2103(true);
                                    }

                                    return;
                                 }
                              } while(class121.field1418 != 84 && class121.field1418 != 13);

                              class108.method2103(true);
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   public final boolean method2631(int var1) {
      if (null != this.field1744) {
         for(int var5 = 0; var5 < this.field1744.length; ++var5) {
            if (this.field1744[var5] == var1) {
               return field1748.method4500(this.field1743[var5] & '\uffff', 0);
            }
         }

         return true;
      } else if (this.field1743 == null) {
         return true;
      } else if (10 != var1) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.field1743.length; ++var4) {
            var3 &= field1748.method4500(this.field1743[var4] & '\uffff', 0);
         }

         return var3;
      }
   }

   public final boolean method2632() {
      if (this.field1743 == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field1743.length; ++var3) {
            var2 &= field1748.method4500(this.field1743[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   public final class201 method2633(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (this.field1744 == null) {
         var8 = (long)((this.field1753 << 10) + var2);
      } else {
         var8 = (long)((var1 << 3) + (this.field1753 << 10) + var2);
      }

      Object var10 = (class201)field1739.method3880(var8);
      if (null == var10) {
         class193 var11 = this.method2636(var1, var2);
         if (null == var11) {
            return null;
         }

         if (!this.field1771) {
            var10 = var11.method3336(64 + this.field1737, 768 + this.field1761, -50, -10, -50);
         } else {
            var11.field2175 = (short)(64 + this.field1737);
            var11.field2178 = (short)(this.field1761 + 768);
            var11.method3332();
            var10 = var11;
         }

         field1739.method3882((class349)var10, var8);
      }

      if (this.field1771) {
         var10 = ((class193)var10).method3320();
      }

      if (this.field1755 >= 0) {
         if (var10 instanceof class207) {
            var10 = ((class207)var10).method3716(var3, var4, var5, var6, true, this.field1755);
         } else if (var10 instanceof class193) {
            var10 = ((class193)var10).method3321(var3, var4, var5, var6, true, this.field1755);
         }
      }

      return (class201)var10;
   }

   public final class207 method2644(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (null == this.field1744) {
         var8 = (long)((this.field1753 << 10) + var2);
      } else {
         var8 = (long)(var2 + (var1 << 3) + (this.field1753 << 10));
      }

      class207 var10 = (class207)field1740.method3880(var8);
      if (null == var10) {
         class193 var11 = this.method2636(var1, var2);
         if (var11 == null) {
            return null;
         }

         var10 = var11.method3336(this.field1737 + 64, this.field1761 + 768, -50, -10, -50);
         field1740.method3882(var10, var8);
      }

      if (this.field1755 >= 0) {
         var10 = var10.method3716(var3, var4, var5, var6, true, this.field1755);
      }

      return var10;
   }

   public final class207 method2635(int var1, int var2, int[][] var3, int var4, int var5, int var6, class159 var7, int var8) {
      long var10;
      if (this.field1744 == null) {
         var10 = (long)((this.field1753 << 10) + var2);
      } else {
         var10 = (long)((this.field1753 << 10) + (var1 << 3) + var2);
      }

      class207 var12 = (class207)field1740.method3880(var10);
      if (null == var12) {
         class193 var13 = this.method2636(var1, var2);
         if (null == var13) {
            return null;
         }

         var12 = var13.method3336(64 + this.field1737, 768 + this.field1761, -50, -10, -50);
         field1740.method3882(var12, var10);
      }

      if (null == var7 && this.field1755 == -1) {
         return var12;
      } else {
         if (var7 != null) {
            var12 = var7.method2777(var12, var8, var2);
         } else {
            var12 = var12.method3717(true);
         }

         if (this.field1755 >= 0) {
            var12 = var12.method3716(var3, var4, var5, var6, false, this.field1755);
         }

         return var12;
      }
   }

   final class193 method2636(int var1, int var2) {
      class193 var4 = null;
      boolean var5;
      int var6;
      int var8;
      if (this.field1744 == null) {
         if (var1 != 10) {
            return null;
         }

         if (this.field1743 == null) {
            return null;
         }

         var5 = this.field1760;
         if (var1 == 2 && var2 > 3) {
            var5 = !var5;
         }

         var6 = this.field1743.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            var8 = this.field1743[var7];
            if (var5) {
               var8 += 65536;
            }

            var4 = (class193)field1738.method3880((long)var8);
            if (var4 == null) {
               var4 = class193.method3316(field1748, var8 & '\uffff', 0);
               if (var4 == null) {
                  return null;
               }

               if (var5) {
                  var4.method3330();
               }

               field1738.method3882(var4, (long)var8);
            }

            if (var6 > 1) {
               field1741[var7] = var4;
            }
         }

         if (var6 > 1) {
            var4 = new class193(field1741, var6);
         }
      } else {
         int var9 = -1;

         for(var6 = 0; var6 < this.field1744.length; ++var6) {
            if (var1 == this.field1744[var6]) {
               var9 = var6;
               break;
            }
         }

         if (-1 == var9) {
            return null;
         }

         var6 = this.field1743[var9];
         boolean var10 = this.field1760 ^ var2 > 3;
         if (var10) {
            var6 += 65536;
         }

         var4 = (class193)field1738.method3880((long)var6);
         if (var4 == null) {
            var4 = class193.method3316(field1748, var6 & '\uffff', 0);
            if (null == var4) {
               return null;
            }

            if (var10) {
               var4.method3330();
            }

            field1738.method3882(var4, (long)var6);
         }
      }

      if (this.field1767 == 128 && this.field1768 == 128 && this.field1776 == 128) {
         var5 = false;
      } else {
         var5 = true;
      }

      boolean var11;
      if (this.field1736 == 0 && this.field1773 == 0 && 0 == this.field1772) {
         var11 = false;
      } else {
         var11 = true;
      }

      class193 var12 = new class193(var4, 0 == var2 && !var5 && !var11, null == this.field1746, null == this.field1774, true);
      if (var1 == 4 && var2 > 3) {
         var12.method3379(256);
         var12.method3327(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var12.method3315();
      } else if (2 == var2) {
         var12.method3324();
      } else if (3 == var2) {
         var12.method3325();
      }

      if (this.field1746 != null) {
         for(var8 = 0; var8 < this.field1746.length; ++var8) {
            var12.method3362(this.field1746[var8], this.field1747[var8]);
         }
      }

      if (null != this.field1774) {
         for(var8 = 0; var8 < this.field1774.length; ++var8) {
            var12.method3329(this.field1774[var8], this.field1749[var8]);
         }
      }

      if (var5) {
         var12.method3368(this.field1767, this.field1768, this.field1776);
      }

      if (var11) {
         var12.method3327(this.field1736, this.field1773, this.field1772);
      }

      return var12;
   }

   public final class156 method2638() {
      int var2 = -1;
      if (-1 != this.field1777) {
         var2 = class175.method3139(this.field1777);
      } else if (this.field1778 != -1) {
         var2 = class244.field2911[this.field1778];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field1762.length - 1) {
         var3 = this.field1762[var2];
      } else {
         var3 = this.field1762[this.field1762.length - 1];
      }

      return -1 != var3 ? class124.method2243(var3) : null;
   }

   public int method2673(int var1, int var2) {
      class363 var5 = this.field1770;
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

   public String method2639(int var1, String var2) {
      class363 var5 = this.field1770;
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

   public boolean method2640() {
      if (null == this.field1762) {
         return -1 != this.field1766 || this.field1781 != null;
      } else {
         for(int var2 = 0; var2 < this.field1762.length; ++var2) {
            if (this.field1762[var2] != -1) {
               class156 var3 = class124.method2243(this.field1762[var2]);
               if (var3.field1766 != -1 || null != var3.field1781) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   static final void method2651(class72 var0) {
      var0.field1050 = var0.field1030;
      if (0 == var0.pathLength) {
         var0.field1079 = 0;
      } else {
         if (var0.sequence != -1 && 0 == var0.field1056) {
            class159 var2 = class48.method1312(var0.sequence);
            if (var0.field1067 > 0 && 0 == var2.field1868) {
               ++var0.field1079;
               return;
            }

            if (var0.field1067 <= 0 && var2.field1860 == 0) {
               ++var0.field1079;
               return;
            }
         }

         int var11 = var0.x;
         int var3 = var0.y;
         int var4 = var0.field1024 * 64 + var0.pathX[var0.pathLength - 1] * 128;
         int var5 = 128 * var0.pathY[var0.pathLength - 1] + var0.field1024 * 64;
         if (var11 < var4) {
            if (var3 < var5) {
               var0.orientation = 1280;
            } else if (var3 > var5) {
               var0.orientation = 1792;
            } else {
               var0.orientation = 1536;
            }
         } else if (var11 > var4) {
            if (var3 < var5) {
               var0.orientation = 768;
            } else if (var3 > var5) {
               var0.orientation = 256;
            } else {
               var0.orientation = 512;
            }
         } else if (var3 < var5) {
            var0.orientation = 1024;
         } else if (var3 > var5) {
            var0.orientation = 0;
         }

         byte var6 = var0.field1031[var0.pathLength - 1];
         if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
            int var7 = var0.orientation - var0.field1022 & 2047;
            if (var7 > 1024) {
               var7 -= 2048;
            }

            int var8 = var0.field1072;
            if (var7 >= -256 && var7 <= 256) {
               var8 = var0.field1029;
            } else if (var7 >= 256 && var7 < 768) {
               var8 = var0.field1021;
            } else if (var7 >= -768 && var7 <= -256) {
               var8 = var0.field1046;
            }

            if (-1 == var8) {
               var8 = var0.field1029;
            }

            var0.field1050 = var8;
            int var9 = 4;
            boolean var10 = true;
            if (var0 instanceof class78) {
               var10 = ((class78)var0).field1132.field1623;
            }

            if (var10) {
               if (var0.field1022 != var0.orientation && var0.targetIndex == -1 && var0.field1075 != 0) {
                  var9 = 2;
               }

               if (var0.pathLength > 2) {
                  var9 = 6;
               }

               if (var0.pathLength > 3) {
                  var9 = 8;
               }

               if (var0.field1079 > 0 && var0.pathLength > 1) {
                  var9 = 8;
                  --var0.field1079;
               }
            } else {
               if (var0.pathLength > 1) {
                  var9 = 6;
               }

               if (var0.pathLength > 2) {
                  var9 = 8;
               }

               if (var0.field1079 > 0 && var0.pathLength > 1) {
                  var9 = 8;
                  --var0.field1079;
               }
            }

            if (2 == var6) {
               var9 <<= 1;
            }

            if (var9 >= 8 && var0.field1050 == var0.field1029 && var0.field1033 != -1) {
               var0.field1050 = var0.field1033;
            }

            if (var4 != var11 || var5 != var3) {
               if (var11 < var4) {
                  var0.x += var9;
                  if (var0.x > var4) {
                     var0.x = var4;
                  }
               } else if (var11 > var4) {
                  var0.x -= var9;
                  if (var0.x < var4) {
                     var0.x = var4;
                  }
               }

               if (var3 < var5) {
                  var0.y += var9;
                  if (var0.y > var5) {
                     var0.y = var5;
                  }
               } else if (var3 > var5) {
                  var0.y -= var9;
                  if (var0.y < var5) {
                     var0.y = var5;
                  }
               }
            }

            if (var4 == var0.x && var0.y == var5) {
               --var0.pathLength;
               if (var0.field1067 > 0) {
                  --var0.field1067;
               }
            }

         } else {
            var0.x = var4;
            var0.y = var5;
            --var0.pathLength;
            if (var0.field1067 > 0) {
               --var0.field1067;
            }

         }
      }
   }
}
