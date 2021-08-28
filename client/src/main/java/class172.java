import java.util.Iterator;

public class class172 implements class188 {
   int field1998;
   int field1999;
   int field2000;
   int field2001;
   int field2002;
   int field2003;
   int field2004;
   int field2005;
   int field2006;
   int field2007;

   class172() {
   }

   public void method3245(class168 var1) {
      if (var1.field1953 > this.field1999) {
         var1.field1953 = this.field1999;
      }

      if (var1.field1951 < this.field1999) {
         var1.field1951 = this.field1999;
      }

      if (var1.field1952 > this.field2006) {
         var1.field1952 = this.field2006;
      }

      if (var1.field1957 < this.field2006) {
         var1.field1957 = this.field2006;
      }

   }

   public boolean method3248(int var1, int var2, int var3) {
      if (var1 >= this.field1998 && var1 < this.field1998 + this.field2003) {
         return var2 >= (this.field2000 << 6) + (this.field2004 << 3) && var2 <= 7 + (this.field2000 << 6) + (this.field2004 << 3) && var3 >= (this.field2007 << 6) + (this.field2005 << 3) && var3 <= 7 + (this.field2005 << 3) + (this.field2007 << 6);
      } else {
         return false;
      }
   }

   public boolean method3246(int var1, int var2) {
      return var1 >= (this.field2001 << 3) + (this.field1999 << 6) && var1 <= (this.field1999 << 6) + (this.field2001 << 3) + 7 && var2 >= (this.field2002 << 3) + (this.field2006 << 6) && var2 <= (this.field2006 << 6) + (this.field2002 << 3) + 7;
   }

   public int[] method3247(int var1, int var2, int var3) {
      if (!this.method3248(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{var2 + (this.field1999 * 64 - this.field2000 * 64) + (this.field2001 * 8 - this.field2004 * 8), this.field2002 * 8 - this.field2005 * 8 + var3 + (this.field2006 * 64 - this.field2007 * 64)};
         return var5;
      }
   }

   public class245 method3249(int var1, int var2) {
      if (!this.method3246(var1, var2)) {
         return null;
      } else {
         int var4 = this.field2000 * 64 - this.field1999 * 64 + var1 + (this.field2004 * 8 - this.field2001 * 8);
         int var5 = this.field2005 * 8 - this.field2002 * 8 + var2 + (this.field2007 * 64 - this.field2006 * 64);
         return new class245(this.field1998, var4, var5);
      }
   }

   public void method3256(Buffer var1) {
      this.field1998 = var1.readUnsignedByte();
      this.field2003 = var1.readUnsignedByte();
      this.field2000 = var1.readUnsignedShort();
      this.field2004 = var1.readUnsignedByte();
      this.field2007 = var1.readUnsignedShort();
      this.field2005 = var1.readUnsignedByte();
      this.field1999 = var1.readUnsignedShort();
      this.field2001 = var1.readUnsignedByte();
      this.field2006 = var1.readUnsignedShort();
      this.field2002 = var1.readUnsignedByte();
      this.method3132();
   }

   static void method3134() {
      Iterator var1 = class85.field1194.iterator();

      while(var1.hasNext()) {
         class45 var2 = (class45)var1.next();
         var2.method777();
      }

   }

   void method3132() {
   }

   public static long method3133(int var0, int var1, int var2, boolean var3, int var4) {
      long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var6 |= 65536L;
      }

      return var6;
   }
}
