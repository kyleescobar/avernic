public class class155 extends class349 {
   public static class223 field1708 = new class223(64);
   public static class223 field1709 = new class223(64);
   public static class223 field1710 = new class223(20);
   static class277 field1711;
   static class277 field1733;
   static int field1714;
   int field1715 = -1;
   int field1716 = -1;
   int field1718 = -1;
   int field1719 = -1;
   int field1720 = -1;
   int field1721 = -1;
   int field1729 = -1;
   String field1725 = "";
   public int field1707 = -1;
   public int field1717 = 70;
   public int field1722 = 0;
   public int field1723 = 0;
   public int field1724 = 16777215;
   public int field1726 = -1;
   public int field1727 = 0;
   public int[] field1730;

   static long method2626(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   class155() {
   }

   void method2606(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method2621(var1, var3);
      }
   }

   void method2621(Buffer var1, int var2) {
      if (1 == var2) {
         this.field1715 = var1.method5965();
      } else if (var2 == 2) {
         this.field1724 = var1.method5952();
      } else if (var2 == 3) {
         this.field1718 = var1.method5965();
      } else if (4 == var2) {
         this.field1720 = var1.method5965();
      } else if (5 == var2) {
         this.field1721 = var1.method5965();
      } else if (6 == var2) {
         this.field1719 = var1.method5965();
      } else if (7 == var2) {
         this.field1722 = var1.method5951();
      } else if (8 == var2) {
         this.field1725 = var1.method6094();
      } else if (var2 == 9) {
         this.field1717 = var1.readUnsignedShort();
      } else if (10 == var2) {
         this.field1723 = var1.method5951();
      } else if (var2 == 11) {
         this.field1707 = 0;
      } else if (var2 == 12) {
         this.field1726 = var1.readUnsignedByte();
      } else if (var2 == 13) {
         this.field1727 = var1.method5951();
      } else if (14 == var2) {
         this.field1707 = var1.readUnsignedShort();
      } else if (var2 == 17 || 18 == var2) {
         this.field1729 = var1.readUnsignedShort();
         if (this.field1729 == 65535) {
            this.field1729 = -1;
         }

         this.field1716 = var1.readUnsignedShort();
         if (65535 == this.field1716) {
            this.field1716 = -1;
         }

         int var4 = -1;
         if (18 == var2) {
            var4 = var1.readUnsignedShort();
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         int var5 = var1.readUnsignedByte();
         this.field1730 = new int[2 + var5];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field1730[var6] = var1.readUnsignedShort();
            if (65535 == this.field1730[var6]) {
               this.field1730[var6] = -1;
            }
         }

         this.field1730[var5 + 1] = var4;
      }

   }

   public final class155 method2595() {
      int var2 = -1;
      if (-1 != this.field1729) {
         var2 = class175.method3139(this.field1729);
      } else if (this.field1716 != -1) {
         var2 = class244.field2911[this.field1716];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field1730.length - 1) {
         var3 = this.field1730[var2];
      } else {
         var3 = this.field1730[this.field1730.length - 1];
      }

      return -1 != var3 ? class156.method2682(var3) : null;
   }

   public String method2596(int var1) {
      String var3 = this.field1725;

      while(true) {
         int var4 = var3.indexOf("%1");
         if (var4 < 0) {
            return var3;
         }

         var3 = var3.substring(0, var4) + class241.method4139(var1, false) + var3.substring(var4 + 2);
      }
   }

   public class398 method2608() {
      if (this.field1718 < 0) {
         return null;
      } else {
         class398 var2 = (class398)field1708.method3880((long)this.field1718);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class208.method3828(class164.field1914, this.field1718, 0);
            if (null != var2) {
               field1708.method3882(var2, (long)this.field1718);
            }

            return var2;
         }
      }
   }

   public class398 method2598() {
      if (this.field1721 < 0) {
         return null;
      } else {
         class398 var2 = (class398)field1708.method3880((long)this.field1721);
         if (null != var2) {
            return var2;
         } else {
            var2 = class208.method3828(class164.field1914, this.field1721, 0);
            if (null != var2) {
               field1708.method3882(var2, (long)this.field1721);
            }

            return var2;
         }
      }
   }

   public class398 method2599() {
      if (this.field1720 < 0) {
         return null;
      } else {
         class398 var2 = (class398)field1708.method3880((long)this.field1720);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class208.method3828(class164.field1914, this.field1720, 0);
            if (null != var2) {
               field1708.method3882(var2, (long)this.field1720);
            }

            return var2;
         }
      }
   }

   public class398 method2600() {
      if (this.field1719 < 0) {
         return null;
      } else {
         class398 var2 = (class398)field1708.method3880((long)this.field1719);
         if (null != var2) {
            return var2;
         } else {
            var2 = class208.method3828(class164.field1914, this.field1719, 0);
            if (var2 != null) {
               field1708.method3882(var2, (long)this.field1719);
            }

            return var2;
         }
      }
   }

   public class302 method2601() {
      if (-1 == this.field1715) {
         return null;
      } else {
         class302 var2 = (class302)field1710.method3880((long)this.field1715);
         if (null != var2) {
            return var2;
         } else {
            var2 = class252.method4299(class164.field1914, field1733, this.field1715, 0);
            if (var2 != null) {
               field1710.method3882(var2, (long)this.field1715);
            }

            return var2;
         }
      }
   }

   static void method2619() {
      if (class368.field4128 != null) {
         client.field680 = client.cycle;
         class368.field4128.method4597();

         for(int var1 = 0; var1 < client.localPlayers.length; ++var1) {
            if (client.localPlayers[var1] != null) {
               class368.field4128.method4596((client.localPlayers[var1].x >> 7) + class281.baseX, (client.localPlayers[var1].y >> 7) + Npc.baseY);
            }
         }
      }

   }
}
