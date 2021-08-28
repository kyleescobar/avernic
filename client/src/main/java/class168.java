import java.util.Iterator;
import java.util.LinkedList;

public class class168 {
   boolean field1947 = false;
   class245 field1949 = null;
   int field1948 = -1;
   int field1950 = -1;
   int field1951 = 0;
   int field1952 = Integer.MAX_VALUE;
   int field1953 = Integer.MAX_VALUE;
   int field1956 = -1;
   int field1957 = 0;
   String field1945;
   String field1946;
   LinkedList field1955;

   public void method2890(Buffer var1, int var2) {
      this.field1950 = var2;
      this.field1945 = var1.readStringNullTerminated();
      this.field1946 = var1.readStringNullTerminated();
      this.field1949 = new class245(var1.readInt());
      this.field1956 = var1.readInt();
      var1.readUnsignedByte();
      this.field1947 = var1.readUnsignedByte() == 1;
      this.field1948 = var1.readUnsignedByte();
      int var4 = var1.readUnsignedByte();
      this.field1955 = new LinkedList();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field1955.add(this.method2891(var1));
      }

      this.method2932();
   }

   class188 method2891(Buffer var1) {
      int var3 = var1.readUnsignedByte();
      class176 var4 = (class176)class251.enumeratedValueOf(class176.method3144(), var3);
      Object var5 = null;
      switch(var4.field2038) {
      case 0:
         var5 = new class172();
         break;
      case 1:
         var5 = new class167();
         break;
      case 2:
         var5 = new class175();
         break;
      case 3:
         var5 = new class185();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class188)var5).method3256(var1);
      return (class188)var5;
   }

   static void method2957(int var0, int var1, int var2, class156 var3, int var4) {
      class50 var6 = new class50();
      var6.field722 = var0;
      var6.field721 = var1 * 128;
      var6.field731 = 128 * var2;
      int var7 = var3.field1750;
      int var8 = var3.field1751;
      if (var4 == 1 || var4 == 3) {
         var7 = var3.field1751;
         var8 = var3.field1750;
      }

      var6.field723 = (var7 + var1) * 128;
      var6.field724 = (var2 + var8) * 128;
      var6.field734 = var3.field1766;
      var6.field719 = var3.field1780 * 128;
      var6.field728 = var3.field1756;
      var6.field729 = var3.field1782;
      var6.field730 = var3.field1781;
      if (null != var3.field1762) {
         var6.field733 = var3;
         var6.method1386();
      }

      class50.field720.method4672(var6);
      if (var6.field730 != null) {
         var6.field726 = var6.field728 + (int)(Math.random() * (double)(var6.field729 - var6.field728));
      }

   }

   public boolean method2892(int var1, int var2, int var3) {
      Iterator var5 = this.field1955.iterator();

      class188 var6;
      do {
         if (!var5.hasNext()) {
            return false;
         }

         var6 = (class188)var5.next();
      } while(!var6.method3248(var1, var2, var3));

      return true;
   }

   public boolean method2893(int var1, int var2) {
      int var4 = var1 / 64;
      int var5 = var2 / 64;
      if (var4 >= this.field1953 && var4 <= this.field1951) {
         if (var5 >= this.field1952 && var5 <= this.field1957) {
            Iterator var6 = this.field1955.iterator();

            class188 var7;
            do {
               if (!var6.hasNext()) {
                  return false;
               }

               var7 = (class188)var6.next();
            } while(!var7.method3246(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int[] method2928(int var1, int var2, int var3) {
      Iterator var5 = this.field1955.iterator();

      class188 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class188)var5.next();
      } while(!var6.method3248(var1, var2, var3));

      return var6.method3247(var1, var2, var3);
   }

   public class245 method2895(int var1, int var2) {
      Iterator var4 = this.field1955.iterator();

      class188 var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (class188)var4.next();
      } while(!var5.method3246(var1, var2));

      return var5.method3249(var1, var2);
   }

   void method2932() {
      Iterator var2 = this.field1955.iterator();

      while(var2.hasNext()) {
         class188 var3 = (class188)var2.next();
         var3.method3245(this);
      }

   }

   public int method2897() {
      return this.field1950;
   }

   public boolean method2889() {
      return this.field1947;
   }

   public String method2899() {
      return this.field1945;
   }

   public String method2900() {
      return this.field1946;
   }

   int method2901() {
      return this.field1956;
   }

   public int method2925() {
      return this.field1948;
   }

   public int method2949() {
      return this.field1953;
   }

   public int method2904() {
      return this.field1951;
   }

   public int method2905() {
      return this.field1952;
   }

   public int method2906() {
      return this.field1957;
   }

   public int method2918() {
      return this.field1949.field2920;
   }

   public int method2908() {
      return this.field1949.field2921;
   }

   public int method2909() {
      return this.field1949.field2922;
   }

   public class245 method2910() {
      return new class245(this.field1949);
   }
}
