import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class class214 {
   int field2521;
   int field2522;
   int field2524;
   int field2525;
   int field2526;
   int field2527;
   int field2530;
   int field2531 = 0;
   public class201 field2528;
   public class201 field2529;
   public long field2523 = 0L;

   static int method3849(int var0, int var1) {
      class65 var3 = (class65)class65.field935.get((long)var0);
      if (null == var3) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var3.field931.length ? var3.field931[var1] : -1;
      }
   }

   class214() {
   }

   public static void method3847(String var0, String var1, int var2, int var3) throws IOException {
      class12.field71 = var3;
      class81.field1161 = var2;

      try {
         class76.field1124 = System.getProperty("os.name");
      } catch (Exception var12) {
         class76.field1124 = "Unknown";
      }

      class191.field2132 = class76.field1124.toLowerCase();

      try {
         class235.field2823 = System.getProperty("user.home");
         if (null != class235.field2823) {
            class235.field2823 = class235.field2823 + "/";
         }
      } catch (Exception var11) {
      }

      try {
         if (class191.field2132.startsWith("win")) {
            if (null == class235.field2823) {
               class235.field2823 = System.getenv("USERPROFILE");
            }
         } else if (class235.field2823 == null) {
            class235.field2823 = System.getenv("HOME");
         }

         if (null != class235.field2823) {
            class235.field2823 = class235.field2823 + "/";
         }
      } catch (Exception var10) {
      }

      if (class235.field2823 == null) {
         class235.field2823 = "~/";
      }

      class96.field1254 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class235.field2823, "/tmp/", ""};
      class255.field3127 = new String[]{".jagex_cache_" + class81.field1161, ".file_store_" + class81.field1161};
      int var5 = 0;

      label127:
      while(var5 < 4) {
         class131.field1475 = class13.method110(var0, var1, var5);
         if (!class131.field1475.exists()) {
            class131.field1475.mkdirs();
         }

         File[] var6 = class131.field1475.listFiles();
         if (null == var6) {
            break;
         }

         File[] var7 = var6;
         int var8 = 0;

         while(true) {
            if (var8 >= var7.length) {
               break label127;
            }

            File var9 = var7[var8];
            if (!class52.method1532(var9, false)) {
               ++var5;
               break;
            }

            ++var8;
         }
      }

      ServerPacket.method3920(class131.field1475);

      try {
         File var14 = new File(class235.field2823, "random.dat");
         int var17;
         if (var14.exists()) {
            class131.field1471 = new class370(new class369(var14, "rw", 25L), 24, 0);
         } else {
            label109:
            for(int var15 = 0; var15 < class255.field3127.length; ++var15) {
               for(var17 = 0; var17 < class96.field1254.length; ++var17) {
                  File var18 = new File(class96.field1254[var17] + class255.field3127[var15] + File.separatorChar + "random.dat");
                  if (var18.exists()) {
                     class131.field1471 = new class370(new class369(var18, "rw", 25L), 24, 0);
                     break label109;
                  }
               }
            }
         }

         if (class131.field1471 == null) {
            RandomAccessFile var16 = new RandomAccessFile(var14, "rw");
            var17 = var16.read();
            var16.seek(0L);
            var16.write(var17);
            var16.seek(0L);
            var16.close();
            class131.field1471 = new class370(new class369(var14, "rw", 25L), 24, 0);
         }
      } catch (IOException var13) {
      }

      class131.field1477 = new class370(new class369(class63.method1655("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
      class131.field1479 = new class370(new class369(class63.method1655("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
      class320.field3840 = new class370[class12.field71];

      for(var5 = 0; var5 < class12.field71; ++var5) {
         class320.field3840[var5] = new class370(new class369(class63.method1655("main_file_cache.idx" + var5), "rw", 1048576L), 6000, 0);
      }

   }

   public static boolean method3848(char var0) {
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (0 != var0) {
            char[] var2 = class304.field3755;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               char var4 = var2[var3];
               if (var4 == var0) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   static int method3846(int var0, class59 var1, boolean var2) {
      Interface var4 = var2 ? class286.field3660 : class51.field750;
      if (1800 == var0) {
         class51.field747[++class51.field746 - 1] = class104.method2082(class241.method4140(var4));
         return 1;
      } else if (1801 != var0) {
         if (1802 == var0) {
            if (null == var4.field3037) {
               class51.field738[++class2.field4 - 1] = "";
            } else {
               class51.field738[++class2.field4 - 1] = var4.field3037;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = class51.field747[--class51.field746];
         --var5;
         if (var4.field3038 != null && var5 < var4.field3038.length && var4.field3038[var5] != null) {
            class51.field738[++class2.field4 - 1] = var4.field3038[var5];
         } else {
            class51.field738[++class2.field4 - 1] = "";
         }

         return 1;
      }
   }
}
