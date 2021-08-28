public class class337 {
   static int field3924;
   public int field3921;
   public int field3922;
   public int field3923;
   public int field3925;

   public class337(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   public class337(int var1, int var2, int var3, int var4) {
      this.method5367(var1, var2);
      this.method5368(var3, var4);
   }

   public void method5367(int var1, int var2) {
      this.field3925 = var1;
      this.field3922 = var2;
   }

   public void method5368(int var1, int var2) {
      this.field3923 = var1;
      this.field3921 = var2;
   }

   public String toString() {
      return null;
   }

   public void method5369(class337 var1, class337 var2) {
      this.method5371(var1, var2);
      this.method5377(var1, var2);
   }

   void method5371(class337 var1, class337 var2) {
      var2.field3925 = this.field3925;
      var2.field3923 = this.field3923;
      if (this.field3925 < var1.field3925) {
         var2.field3923 = (var2.field3923 * -586279965 - (var1.field3925 * -586279965 - this.field3925 * -586279965)) * 640928203;
         var2.field3925 = var1.field3925;
      }

      if (var2.method5372() > var1.method5372()) {
         var2.field3923 -= var2.method5372() - var1.method5372();
      }

      if (var2.field3923 < 0) {
         var2.field3923 = 0;
      }

   }

   void method5377(class337 var1, class337 var2) {
      var2.field3922 = this.field3922;
      var2.field3921 = this.field3921;
      if (this.field3922 < var1.field3922) {
         var2.field3921 = (var2.field3921 * 1464727199 - (var1.field3922 * 1464727199 - this.field3922 * 1464727199)) * 566469983;
         var2.field3922 = var1.field3922;
      }

      if (var2.method5373() > var1.method5373()) {
         var2.field3921 -= var2.method5373() - var1.method5373();
      }

      if (var2.field3921 < 0) {
         var2.field3921 = 0;
      }

   }

   int method5372() {
      return this.field3925 + this.field3923;
   }

   int method5373() {
      return this.field3921 + this.field3922;
   }
}
