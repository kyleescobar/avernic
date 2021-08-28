public class class245 {
   static Interface field2923;
   public int field2920;
   public int field2921;
   public int field2922;

   public class245(int var1, int var2, int var3) {
      this.field2921 = var1;
      this.field2920 = var2;
      this.field2922 = var3;
   }

   public class245(class245 var1) {
      this.field2921 = var1.field2921;
      this.field2920 = var1.field2920;
      this.field2922 = var1.field2922;
   }

   public class245(int var1) {
      if (var1 == -1) {
         this.field2921 = -1;
      } else {
         this.field2921 = var1 >> 28 & 3;
         this.field2920 = var1 >> 14 & 16383;
         this.field2922 = var1 & 16383;
      }

   }

   public int method4161() {
      return this.field2921 << 28 | this.field2920 << 14 | this.field2922;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class245) ? false : this.method4158((class245)var1);
      }
   }

   boolean method4158(class245 var1) {
      if (this.field2921 != var1.field2921) {
         return false;
      } else if (this.field2920 != var1.field2920) {
         return false;
      } else {
         return this.field2922 == var1.field2922;
      }
   }

   public int hashCode() {
      return this.method4161();
   }

   public String toString() {
      return this.method4159(",");
   }

   String method4159(String var1) {
      return this.field2921 + var1 + (this.field2920 >> 6) + var1 + (this.field2922 >> 6) + var1 + (this.field2920 & 63) + var1 + (this.field2922 & 63);
   }
}
