public class class157 extends class349 {
   public static class223 field1837 = new class223(200);
   static class223 field1790 = new class223(64);
   static class223 field1791 = new class223(50);
   class363 field1831;
   int field1786;
   int field1792;
   int field1795;
   int field1811;
   int field1812;
   int field1813;
   int field1815;
   int field1816;
   int field1817;
   int field1818;
   int field1819;
   int field1821;
   int field1823;
   int field1826;
   int field1829;
   int field1830;
   int field1835;
   int field1839;
   int field1841;
   int[] field1824;
   int[] field1825;
   public boolean field1808;
   public boolean field1834;
   public int field1789;
   public int field1793;
   public int field1800;
   public int field1801;
   public int field1802;
   public int field1803;
   public int field1804;
   public int field1805;
   public int field1806;
   public int field1807;
   public int field1820;
   public int field1822;
   public int field1827;
   public int field1832;
   public int field1833;
   public int field1838;
   public String field1836;
   public String[] field1809;
   public String[] field1810;
   public short[] field1796;
   public short[] field1797;
   public short[] field1798;
   public short[] field1799;

   class157() {
      this.field1836 = class270.field3234;
      this.field1800 = 2000;
      this.field1801 = 0;
      this.field1822 = 0;
      this.field1803 = 0;
      this.field1804 = 0;
      this.field1805 = 0;
      this.field1806 = 0;
      this.field1807 = 1;
      this.field1808 = false;
      this.field1809 = new String[]{null, null, class270.field3227, null, null};
      this.field1810 = new String[]{null, null, null, null, class270.field3228};
      this.field1792 = -2;
      this.field1812 = -1;
      this.field1813 = -1;
      this.field1841 = 0;
      this.field1815 = -1;
      this.field1811 = -1;
      this.field1817 = 0;
      this.field1818 = -1;
      this.field1819 = -1;
      this.field1816 = -1;
      this.field1821 = -1;
      this.field1835 = -1;
      this.field1823 = -1;
      this.field1827 = -1;
      this.field1789 = -1;
      this.field1839 = 128;
      this.field1826 = 128;
      this.field1830 = 128;
      this.field1793 = 0;
      this.field1832 = 0;
      this.field1833 = 0;
      this.field1834 = false;
      this.field1829 = -1;
      this.field1786 = -1;
      this.field1838 = -1;
      this.field1820 = -1;
   }

   void method2686() {
   }

   void method2687(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method2688(var1, var3);
      }
   }

   void method2688(Buffer var1, int var2) {
      if (1 == var2) {
         this.field1795 = var1.readUnsignedShort();
      } else if (var2 == 2) {
         this.field1836 = var1.readStringNullTerminated();
      } else if (var2 == 4) {
         this.field1800 = var1.readUnsignedShort();
      } else if (5 == var2) {
         this.field1801 = var1.readUnsignedShort();
      } else if (var2 == 6) {
         this.field1822 = var1.readUnsignedShort();
      } else if (7 == var2) {
         this.field1804 = var1.readUnsignedShort();
         if (this.field1804 > 32767) {
            this.field1804 -= 65536;
         }
      } else if (8 == var2) {
         this.field1805 = var1.readUnsignedShort();
         if (this.field1805 > 32767) {
            this.field1805 -= 65536;
         }
      } else if (9 == var2) {
         var1.readStringNullTerminated();
      } else if (var2 == 11) {
         this.field1806 = 1;
      } else if (var2 == 12) {
         this.field1807 = var1.readInt();
      } else if (16 == var2) {
         this.field1808 = true;
      } else if (23 == var2) {
         this.field1812 = var1.readUnsignedShort();
         this.field1841 = var1.readUnsignedByte();
      } else if (var2 == 24) {
         this.field1813 = var1.readUnsignedShort();
      } else if (25 == var2) {
         this.field1815 = var1.readUnsignedShort();
         this.field1817 = var1.readUnsignedByte();
      } else if (var2 == 26) {
         this.field1811 = var1.readUnsignedShort();
      } else if (var2 >= 30 && var2 < 35) {
         this.field1809[var2 - 30] = var1.readStringNullTerminated();
         if (this.field1809[var2 - 30].equalsIgnoreCase(class270.field3525)) {
            this.field1809[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.field1810[var2 - 35] = var1.readStringNullTerminated();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.readUnsignedByte();
            this.field1796 = new short[var4];
            this.field1797 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1796[var5] = (short)var1.readUnsignedShort();
               this.field1797[var5] = (short)var1.readUnsignedShort();
            }
         } else if (41 == var2) {
            var4 = var1.readUnsignedByte();
            this.field1798 = new short[var4];
            this.field1799 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1798[var5] = (short)var1.readUnsignedShort();
               this.field1799[var5] = (short)var1.readUnsignedShort();
            }
         } else if (42 == var2) {
            this.field1792 = var1.readByte();
         } else if (var2 == 65) {
            this.field1834 = true;
         } else if (78 == var2) {
            this.field1818 = var1.readUnsignedShort();
         } else if (var2 == 79) {
            this.field1819 = var1.readUnsignedShort();
         } else if (90 == var2) {
            this.field1816 = var1.readUnsignedShort();
         } else if (91 == var2) {
            this.field1835 = var1.readUnsignedShort();
         } else if (92 == var2) {
            this.field1821 = var1.readUnsignedShort();
         } else if (var2 == 93) {
            this.field1823 = var1.readUnsignedShort();
         } else if (var2 == 94) {
            var1.readUnsignedShort();
         } else if (95 == var2) {
            this.field1803 = var1.readUnsignedShort();
         } else if (var2 == 97) {
            this.field1827 = var1.readUnsignedShort();
         } else if (var2 == 98) {
            this.field1789 = var1.readUnsignedShort();
         } else if (var2 >= 100 && var2 < 110) {
            if (this.field1824 == null) {
               this.field1824 = new int[10];
               this.field1825 = new int[10];
            }

            this.field1824[var2 - 100] = var1.readUnsignedShort();
            this.field1825[var2 - 100] = var1.readUnsignedShort();
         } else if (var2 == 110) {
            this.field1839 = var1.readUnsignedShort();
         } else if (var2 == 111) {
            this.field1826 = var1.readUnsignedShort();
         } else if (var2 == 112) {
            this.field1830 = var1.readUnsignedShort();
         } else if (113 == var2) {
            this.field1793 = var1.readByte();
         } else if (114 == var2) {
            this.field1832 = var1.readByte() * 5;
         } else if (115 == var2) {
            this.field1833 = var1.readUnsignedByte();
         } else if (var2 == 139) {
            this.field1829 = var1.readUnsignedShort();
         } else if (var2 == 140) {
            this.field1786 = var1.readUnsignedShort();
         } else if (var2 == 148) {
            this.field1838 = var1.readUnsignedShort();
         } else if (149 == var2) {
            this.field1820 = var1.readUnsignedShort();
         } else if (var2 == 249) {
            this.field1831 = class50.method1392(var1, this.field1831);
         }
      }

   }

   void method2689(class157 var1, class157 var2) {
      this.field1795 = var1.field1795;
      this.field1800 = var1.field1800;
      this.field1801 = var1.field1801;
      this.field1822 = var1.field1822;
      this.field1803 = var1.field1803;
      this.field1804 = var1.field1804;
      this.field1805 = var1.field1805;
      this.field1796 = var1.field1796;
      this.field1797 = var1.field1797;
      this.field1798 = var1.field1798;
      this.field1799 = var1.field1799;
      this.field1836 = var2.field1836;
      this.field1808 = var2.field1808;
      this.field1807 = var2.field1807;
      this.field1806 = 1;
   }

   void method2690(class157 var1, class157 var2) {
      this.field1795 = var1.field1795;
      this.field1800 = var1.field1800;
      this.field1801 = var1.field1801;
      this.field1822 = var1.field1822;
      this.field1803 = var1.field1803;
      this.field1804 = var1.field1804;
      this.field1805 = var1.field1805;
      this.field1796 = var2.field1796;
      this.field1797 = var2.field1797;
      this.field1798 = var2.field1798;
      this.field1799 = var2.field1799;
      this.field1836 = var2.field1836;
      this.field1808 = var2.field1808;
      this.field1806 = var2.field1806;
      this.field1812 = var2.field1812;
      this.field1813 = var2.field1813;
      this.field1818 = var2.field1818;
      this.field1815 = var2.field1815;
      this.field1811 = var2.field1811;
      this.field1819 = var2.field1819;
      this.field1816 = var2.field1816;
      this.field1821 = var2.field1821;
      this.field1835 = var2.field1835;
      this.field1823 = var2.field1823;
      this.field1833 = var2.field1833;
      this.field1809 = var2.field1809;
      this.field1810 = new String[5];
      if (null != var2.field1810) {
         for(int var4 = 0; var4 < 4; ++var4) {
            this.field1810[var4] = var2.field1810[var4];
         }
      }

      this.field1810[4] = class270.field3408;
      this.field1807 = 0;
   }

   void method2691(class157 var1, class157 var2) {
      this.field1795 = var1.field1795;
      this.field1800 = var1.field1800;
      this.field1801 = var1.field1801;
      this.field1822 = var1.field1822;
      this.field1803 = var1.field1803;
      this.field1804 = var1.field1804;
      this.field1805 = var1.field1805;
      this.field1796 = var1.field1796;
      this.field1797 = var1.field1797;
      this.field1798 = var1.field1798;
      this.field1799 = var1.field1799;
      this.field1806 = var1.field1806;
      this.field1836 = var2.field1836;
      this.field1807 = 0;
      this.field1808 = false;
      this.field1834 = false;
   }

   public final class193 method2692(int var1) {
      int var4;
      if (this.field1824 != null && var1 > 1) {
         int var3 = -1;

         for(var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field1825[var4] && this.field1825[var4] != 0) {
               var3 = this.field1824[var4];
            }
         }

         if (-1 != var3) {
            return KeyHandler.method93(var3).method2692(1);
         }
      }

      class193 var5 = class193.method3316(class340.field3935, this.field1795, 0);
      if (var5 == null) {
         return null;
      } else {
         if (128 != this.field1839 || 128 != this.field1826 || 128 != this.field1830) {
            var5.method3368(this.field1839, this.field1826, this.field1830);
         }

         if (null != this.field1796) {
            for(var4 = 0; var4 < this.field1796.length; ++var4) {
               var5.method3362(this.field1796[var4], this.field1797[var4]);
            }
         }

         if (this.field1798 != null) {
            for(var4 = 0; var4 < this.field1798.length; ++var4) {
               var5.method3329(this.field1798[var4], this.field1799[var4]);
            }
         }

         return var5;
      }
   }

   public final class207 method2721(int var1) {
      if (this.field1824 != null && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field1825[var4] && this.field1825[var4] != 0) {
               var3 = this.field1824[var4];
            }
         }

         if (var3 != -1) {
            return KeyHandler.method93(var3).method2721(1);
         }
      }

      class207 var6 = (class207)field1791.method3880((long)this.field1802);
      if (var6 != null) {
         return var6;
      } else {
         class193 var7 = class193.method3316(class340.field3935, this.field1795, 0);
         if (var7 == null) {
            return null;
         } else {
            if (128 != this.field1839 || this.field1826 != 128 || 128 != this.field1830) {
               var7.method3368(this.field1839, this.field1826, this.field1830);
            }

            int var5;
            if (this.field1796 != null) {
               for(var5 = 0; var5 < this.field1796.length; ++var5) {
                  var7.method3362(this.field1796[var5], this.field1797[var5]);
               }
            }

            if (null != this.field1798) {
               for(var5 = 0; var5 < this.field1798.length; ++var5) {
                  var7.method3329(this.field1798[var5], this.field1799[var5]);
               }
            }

            var6 = var7.method3336(this.field1793 + 64, 768 + this.field1832, -50, -10, -50);
            var6.field2430 = true;
            field1791.method3882(var6, (long)this.field1802);
            return var6;
         }
      }
   }

   public class157 method2694(int var1) {
      if (this.field1824 != null && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field1825[var4] && 0 != this.field1825[var4]) {
               var3 = this.field1824[var4];
            }
         }

         if (-1 != var3) {
            return KeyHandler.method93(var3);
         }
      }

      return this;
   }

   public final boolean method2698(boolean var1) {
      int var3 = this.field1812;
      int var4 = this.field1813;
      int var5 = this.field1818;
      if (var1) {
         var3 = this.field1815;
         var4 = this.field1811;
         var5 = this.field1819;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var6 = true;
         if (!class340.field3935.method4500(var3, 0)) {
            var6 = false;
         }

         if (-1 != var4 && !class340.field3935.method4500(var4, 0)) {
            var6 = false;
         }

         if (var5 != -1 && !class340.field3935.method4500(var5, 0)) {
            var6 = false;
         }

         return var6;
      }
   }

   public final class193 method2696(boolean var1) {
      int var3 = this.field1812;
      int var4 = this.field1813;
      int var5 = this.field1818;
      if (var1) {
         var3 = this.field1815;
         var4 = this.field1811;
         var5 = this.field1819;
      }

      if (-1 == var3) {
         return null;
      } else {
         class193 var6 = class193.method3316(class340.field3935, var3, 0);
         if (-1 != var4) {
            class193 var7 = class193.method3316(class340.field3935, var4, 0);
            if (var5 != -1) {
               class193 var8 = class193.method3316(class340.field3935, var5, 0);
               class193[] var9 = new class193[]{var6, var7, var8};
               var6 = new class193(var9, 3);
            } else {
               class193[] var11 = new class193[]{var6, var7};
               var6 = new class193(var11, 2);
            }
         }

         if (!var1 && 0 != this.field1841) {
            var6.method3327(0, this.field1841, 0);
         }

         if (var1 && 0 != this.field1817) {
            var6.method3327(0, this.field1817, 0);
         }

         int var10;
         if (null != this.field1796) {
            for(var10 = 0; var10 < this.field1796.length; ++var10) {
               var6.method3362(this.field1796[var10], this.field1797[var10]);
            }
         }

         if (null != this.field1798) {
            for(var10 = 0; var10 < this.field1798.length; ++var10) {
               var6.method3329(this.field1798[var10], this.field1799[var10]);
            }
         }

         return var6;
      }
   }

   public final boolean method2697(boolean var1) {
      int var3 = this.field1816;
      int var4 = this.field1821;
      if (var1) {
         var3 = this.field1835;
         var4 = this.field1823;
      }

      if (-1 == var3) {
         return true;
      } else {
         boolean var5 = true;
         if (!class340.field3935.method4500(var3, 0)) {
            var5 = false;
         }

         if (-1 != var4 && !class340.field3935.method4500(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   public final class193 method2685(boolean var1) {
      int var3 = this.field1816;
      int var4 = this.field1821;
      if (var1) {
         var3 = this.field1835;
         var4 = this.field1823;
      }

      if (var3 == -1) {
         return null;
      } else {
         class193 var5 = class193.method3316(class340.field3935, var3, 0);
         if (var4 != -1) {
            class193 var6 = class193.method3316(class340.field3935, var4, 0);
            class193[] var7 = new class193[]{var5, var6};
            var5 = new class193(var7, 2);
         }

         int var8;
         if (null != this.field1796) {
            for(var8 = 0; var8 < this.field1796.length; ++var8) {
               var5.method3362(this.field1796[var8], this.field1797[var8]);
            }
         }

         if (null != this.field1798) {
            for(var8 = 0; var8 < this.field1798.length; ++var8) {
               var5.method3329(this.field1798[var8], this.field1799[var8]);
            }
         }

         return var5;
      }
   }

   public int method2741(int var1, int var2) {
      class363 var5 = this.field1831;
      int var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class353 var6 = (class353)var5.method5716((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = var6.field3964;
         }
      }

      return var4;
   }

   public String method2700(int var1, String var2) {
      class363 var5 = this.field1831;
      String var4;
      if (null == var5) {
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

   public int method2701() {
      if (-1 != this.field1792 && null != this.field1810) {
         if (this.field1792 >= 0) {
            return this.field1810[this.field1792] != null ? -1737830199 * this.field1792 * -953529991 : -1;
         } else {
            return class270.field3228.equalsIgnoreCase(this.field1810[4]) ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   boolean method2702() {
      return this.field1797 != null;
   }

   boolean method2703() {
      return null != this.field1799;
   }

   static final void method2711(Interface var0, int var1, byte[] var2, byte[] var3) {
      if (null == var0.field2988) {
         if (var2 == null) {
            return;
         }

         var0.field2988 = new byte[11][];
         var0.field3034 = new byte[11][];
         var0.field2994 = new int[11];
         var0.field3036 = new int[11];
      }

      var0.field2988[var1] = var2;
      if (null != var2) {
         var0.field3032 = true;
      } else {
         var0.field3032 = false;

         for(int var5 = 0; var5 < var0.field2988.length; ++var5) {
            if (null != var0.field2988[var5]) {
               var0.field3032 = true;
               break;
            }
         }
      }

      var0.field3034[var1] = var3;
   }

   static void method2717(class48 var0) {
      if (var0.method1274() != client.field562) {
         client.field562 = var0.method1274();
         class151.method2530(var0.method1274());
      }

      if (var0.field700 != client.field406) {
         class275 var2 = class271.archive8;
         int var3 = var0.field700;
         if (0 != (var3 & 536870912)) {
            class89.field1229 = class118.method2187(var2, "logo_deadman_mode", "");
         } else if ((var3 & 1073741824) != 0) {
            class89.field1229 = class118.method2187(var2, "logo_seasonal_mode", "");
         } else {
            class89.field1229 = class118.method2187(var2, "logo", "");
         }
      }

      class244.field2918 = var0.field701;
      client.field405 = var0.field697;
      client.field406 = var0.field700;
      class170.field1982 = client.field407 == 0 ? '\uaa4a' : var0.field697 + '\u9c40';
      class5.field7 = 0 == client.field407 ? 443 : var0.field697 + '\uc350';
      class291.field3679 = class170.field1982;
   }

   static int method2733(int var0, class59 var1, boolean var2) {
      if (var0 == 6200) {
         class51.field746 -= 2;
         client.field661 = (short)class282.method4546(class51.field747[class51.field746]);
         if (client.field661 <= 0) {
            client.field661 = 256;
         }

         client.field632 = (short)class282.method4546(class51.field747[class51.field746 + 1]);
         if (client.field632 <= 0) {
            client.field632 = 256;
         }

         return 1;
      } else if (var0 == 6201) {
         class51.field746 -= 2;
         client.field663 = (short)class51.field747[class51.field746];
         if (client.field663 <= 0) {
            client.field663 = 256;
         }

         client.field449 = (short)class51.field747[1 + class51.field746];
         if (client.field449 <= 0) {
            client.field449 = 320;
         }

         return 1;
      } else if (6202 == var0) {
         class51.field746 -= 4;
         client.field473 = (short)class51.field747[class51.field746];
         if (client.field473 <= 0) {
            client.field473 = 1;
         }

         client.field543 = (short)class51.field747[1 + class51.field746];
         if (client.field543 <= 0) {
            client.field543 = 32767;
         } else if (client.field543 < client.field473) {
            client.field543 = client.field473;
         }

         client.field667 = (short)class51.field747[class51.field746 + 2];
         if (client.field667 <= 0) {
            client.field667 = 1;
         }

         client.field668 = (short)class51.field747[class51.field746 + 3];
         if (client.field668 <= 0) {
            client.field668 = 32767;
         } else if (client.field668 < client.field667) {
            client.field668 = client.field667;
         }

         return 1;
      } else if (6203 == var0) {
         if (client.field580 != null) {
            class51.method1525(0, 0, client.field580.field2973, client.field580.field2990, false);
            class51.field747[++class51.field746 - 1] = client.field671;
            class51.field747[++class51.field746 - 1] = client.field672;
         } else {
            class51.field747[++class51.field746 - 1] = -1;
            class51.field747[++class51.field746 - 1] = -1;
         }

         return 1;
      } else if (6204 == var0) {
         class51.field747[++class51.field746 - 1] = client.field663;
         class51.field747[++class51.field746 - 1] = client.field449;
         return 1;
      } else if (var0 == 6205) {
         class51.field747[++class51.field746 - 1] = class148.method2490(client.field661);
         class51.field747[++class51.field746 - 1] = class148.method2490(client.field632);
         return 1;
      } else if (6220 == var0) {
         class51.field747[++class51.field746 - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         class51.field747[++class51.field746 - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         class51.field747[++class51.field746 - 1] = class69.canvasWidth;
         return 1;
      } else if (var0 == 6223) {
         class51.field747[++class51.field746 - 1] = client.canvasHeight;
         return 1;
      } else {
         return 2;
      }
   }
}
