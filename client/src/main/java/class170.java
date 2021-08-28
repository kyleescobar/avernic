import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class class170 {
   static class87 field1992;
   static int field1982;
   boolean field1975 = false;
   boolean field1979 = false;
   class169[][] field1977;
   class189 field1991;
   class397[] field1981;
   class398 field1990;
   int field1974;
   int field1986;
   int field1987;
   int field1988;
   HashMap field1978;
   HashMap field1980 = new HashMap();
   final class277 field1983;
   final class277 field1985;
   final HashMap field1984;
   public int field1989 = 0;

   public class170(class397[] var1, HashMap var2, class277 var3, class277 var4) {
      this.field1981 = var1;
      this.field1984 = var2;
      this.field1985 = var3;
      this.field1983 = var4;
   }

   public void method3072(class277 var1, String var2, boolean var3) {
      if (!this.field1975) {
         this.field1979 = false;
         this.field1975 = true;
         System.nanoTime();
         int var5 = var1.readGroup(class187.field2118.field2114);
         int var6 = var1.method4430(var5, var2);
         Buffer var7 = new Buffer(var1.method4432(class187.field2118.field2114, var2));
         Buffer var8 = new Buffer(var1.method4432(class187.field2116.field2114, var2));
         System.nanoTime();
         System.nanoTime();
         this.field1991 = new class189();

         try {
            this.field1991.method3262(var7, var8, var6, var3);
         } catch (IllegalStateException var17) {
            return;
         }

         this.field1991.method2918();
         this.field1991.method2908();
         this.field1991.method2909();
         this.field1974 = this.field1991.method2949() * 64;
         this.field1986 = this.field1991.method2905() * 64;
         this.field1987 = (this.field1991.method2904() - this.field1991.method2949() + 1) * 64;
         this.field1988 = (this.field1991.method2906() - this.field1991.method2905() + 1) * 64;
         int var9 = this.field1991.method2904() - this.field1991.method2949() + 1;
         int var10 = this.field1991.method2906() - this.field1991.method2905() + 1;
         System.nanoTime();
         System.nanoTime();
         class140.method2361();
         this.field1977 = new class169[var9][var10];
         Iterator var11 = this.field1991.field2125.iterator();

         while(var11.hasNext()) {
            class163 var12 = (class163)var11.next();
            int var13 = var12.field2049;
            int var14 = var12.field2053;
            int var15 = var13 - this.field1991.method2949();
            int var16 = var14 - this.field1991.method2905();
            this.field1977[var15][var16] = new class169(var13, var14, this.field1991.method2901(), this.field1984);
            this.field1977[var15][var16].method2960(var12, this.field1991.field2124);
         }

         for(int var18 = 0; var18 < var9; ++var18) {
            for(int var20 = 0; var20 < var10; ++var20) {
               if (null == this.field1977[var18][var20]) {
                  this.field1977[var18][var20] = new class169(this.field1991.method2949() + var18, this.field1991.method2905() + var20, this.field1991.method2901(), this.field1984);
                  this.field1977[var18][var20].method2961(this.field1991.field2123, this.field1991.field2124);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.method4431(class187.field2115.field2114, var2)) {
            byte[] var19 = var1.method4432(class187.field2115.field2114, var2);
            this.field1990 = class76.method1810(var19);
         }

         System.nanoTime();
         var1.method4425();
         var1.method4427();
         this.field1979 = true;
      }
   }

   public final void method3073() {
      this.field1978 = null;
   }

   public final void method3074(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var10 = class394.field4250;
      int var11 = class394.field4245;
      int var12 = class394.field4246;
      int[] var13 = new int[4];
      class394.method6259(var13);
      class178 var14 = this.method3077(var1, var2, var3, var4);
      float var15 = this.method3081(var7 - var5, var3 - var1);
      int var16 = (int)Math.ceil((double)var15);
      this.field1989 = var16;
      if (!this.field1980.containsKey(var16)) {
         class190 var17 = new class190(var16);
         var17.method3273();
         this.field1980.put(var16, var17);
      }

      int var24 = var14.field2064 + var14.field2065 - 1;
      int var18 = var14.field2066 + var14.field2063 - 1;

      int var19;
      int var20;
      for(var19 = var14.field2065; var19 <= var24; ++var19) {
         for(var20 = var14.field2066; var20 <= var18; ++var20) {
            this.field1977[var19][var20].method2968(var16, (class190)this.field1980.get(var16), this.field1981, this.field1985, this.field1983);
         }
      }

      class394.method6312(var10, var11, var12);
      class394.method6260(var13);
      var19 = (int)(64.0F * var15);
      var20 = var1 + this.field1974;
      int var21 = var2 + this.field1986;

      for(int var22 = var14.field2065; var22 < var14.field2064 + var14.field2065; ++var22) {
         for(int var23 = var14.field2066; var23 < var14.field2066 + var14.field2063; ++var23) {
            this.field1977[var22][var23].method2959(var5 + var19 * (this.field1977[var22][var23].field1969 * 64 - var20) / 64, var8 - (64 + (this.field1977[var22][var23].field1963 * 64 - var21)) * var19 / 64, var19);
         }
      }

   }

   public final void method3106(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      class178 var15 = this.method3077(var1, var2, var3, var4);
      float var16 = this.method3081(var7 - var5, var3 - var1);
      int var17 = (int)(var16 * 64.0F);
      int var18 = var1 + this.field1974;
      int var19 = this.field1986 + var2;

      int var20;
      int var21;
      for(var20 = var15.field2065; var20 < var15.field2065 + var15.field2064; ++var20) {
         for(var21 = var15.field2066; var21 < var15.field2063 + var15.field2066; ++var21) {
            if (var13) {
               this.field1977[var20][var21].method2964();
            }

            this.field1977[var20][var21].method2969(var5 + var17 * (this.field1977[var20][var21].field1969 * 64 - var18) / 64, var8 - (64 + (this.field1977[var20][var21].field1963 * 64 - var19)) * var17 / 64, var17, var9);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var20 = var15.field2065; var20 < var15.field2065 + var15.field2064; ++var20) {
            for(var21 = var15.field2066; var21 < var15.field2063 + var15.field2066; ++var21) {
               this.field1977[var20][var21].method2983(var10, var11, var12);
            }
         }
      }

   }

   public void method3096(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.field1990) {
         this.field1990.method6381(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field1978 == null) {
               this.method3099();
            }

            Iterator var9 = var5.iterator();

            while(true) {
               List var11;
               do {
                  if (!var9.hasNext()) {
                     return;
                  }

                  int var10 = (Integer)var9.next();
                  var11 = (List)this.field1978.get(var10);
               } while(var11 == null);

               Iterator var12 = var11.iterator();

               while(var12.hasNext()) {
                  class186 var13 = (class186)var12.next();
                  int var14 = var3 * (var13.field2110.field2920 - this.field1974) / this.field1987;
                  int var15 = var4 - var4 * (var13.field2110.field2922 - this.field1986) / this.field1988;
                  class394.method6263(var1 + var14, var2 + var15, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public List method3079(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var12 = new LinkedList();
      if (!this.field1979) {
         return var12;
      } else {
         class178 var13 = this.method3077(var1, var2, var3, var4);
         float var14 = this.method3081(var7, var3 - var1);
         int var15 = (int)(64.0F * var14);
         int var16 = this.field1974 + var1;
         int var17 = var2 + this.field1986;

         for(int var18 = var13.field2065; var18 < var13.field2065 + var13.field2064; ++var18) {
            for(int var19 = var13.field2066; var19 < var13.field2063 + var13.field2066; ++var19) {
               List var20 = this.field1977[var18][var19].method2990(var5 + var15 * (this.field1977[var18][var19].field1969 * 64 - var16) / 64, var8 + var6 - (this.field1977[var18][var19].field1963 * 64 - var17 + 64) * var15 / 64, var15, var9, var10);
               if (!var20.isEmpty()) {
                  var12.addAll(var20);
               }
            }
         }

         return var12;
      }
   }

   class178 method3077(int var1, int var2, int var3, int var4) {
      class178 var6 = new class178(this);
      int var7 = var1 + this.field1974;
      int var8 = this.field1986 + var2;
      int var9 = this.field1974 + var3;
      int var10 = this.field1986 + var4;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      int var14 = var10 / 64;
      var6.field2064 = 1 + (var13 - var11);
      var6.field2063 = 1 + (var14 - var12);
      var6.field2065 = var11 - this.field1991.method2949();
      var6.field2066 = var12 - this.field1991.method2905();
      if (var6.field2065 < 0) {
         var6.field2064 += var6.field2065;
         var6.field2065 = 0;
      }

      if (var6.field2065 > this.field1977.length - var6.field2064) {
         var6.field2064 = this.field1977.length - var6.field2065;
      }

      if (var6.field2066 < 0) {
         var6.field2063 += var6.field2066;
         var6.field2066 = 0;
      }

      if (var6.field2066 > this.field1977[0].length - var6.field2063) {
         var6.field2063 = this.field1977[0].length - var6.field2066;
      }

      var6.field2064 = Math.min(var6.field2064, this.field1977.length);
      var6.field2063 = Math.min(var6.field2063, this.field1977[0].length);
      return var6;
   }

   public boolean method3097() {
      return this.field1979;
   }

   public HashMap method3095() {
      this.method3099();
      return this.field1978;
   }

   void method3099() {
      if (this.field1978 == null) {
         this.field1978 = new HashMap();
      }

      this.field1978.clear();

      for(int var2 = 0; var2 < this.field1977.length; ++var2) {
         for(int var3 = 0; var3 < this.field1977[var2].length; ++var3) {
            List var4 = this.field1977[var2][var3].method2991();
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               class186 var6 = (class186)var5.next();
               if (var6.method3212()) {
                  int var7 = var6.method3208();
                  if (!this.field1978.containsKey(var7)) {
                     LinkedList var8 = new LinkedList();
                     var8.add(var6);
                     this.field1978.put(var7, var8);
                  } else {
                     List var9 = (List)this.field1978.get(var7);
                     var9.add(var6);
                  }
               }
            }
         }
      }

   }

   float method3081(int var1, int var2) {
      float var4 = (float)var1 / (float)var2;
      if (var4 > 8.0F) {
         return 8.0F;
      } else if (var4 < 1.0F) {
         return 1.0F;
      } else {
         int var5 = Math.round(var4);
         return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
      }
   }
}
