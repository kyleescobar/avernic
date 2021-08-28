import java.lang.management.GarbageCollectorMXBean;

public class class152 extends class349 {
   public static class223 field1689 = new class223(64);
   public static class277 field1692;
   static GarbageCollectorMXBean field1694;
   static final int[] field1691 = new int[32];
   public int field1688;
   public int field1690;
   public int field1695;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field1691[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public void method2534(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (0 == var3) {
            return;
         }

         this.method2535(var1, var3);
      }
   }

   void method2535(Buffer var1, int var2) {
      if (1 == var2) {
         this.field1690 = var1.readUnsignedShort();
         this.field1695 = var1.readUnsignedByte();
         this.field1688 = var1.readUnsignedByte();
      }

   }

   static char method2543(char var0, class292 var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (209 == var0 && var1 != class292.field3686) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (223 == var0) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (241 == var0 && class292.field3686 != var1) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (253 == var0 || var0 == 255) {
            return 'y';
         }
      }

      if (338 == var0) {
         return 'O';
      } else if (339 == var0) {
         return 'o';
      } else if (376 == var0) {
         return 'Y';
      } else {
         return var0;
      }
   }

   public static void method2536() {
      class157.field1790.method3883();
      class157.field1791.method3883();
      class157.field1837.method3883();
   }
}
