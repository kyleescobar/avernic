public class class23 extends class41 {
   int field167;
   public boolean field168;
   public byte[] field165;
   public int field164;
   public int field166;

   class23(int var1, byte[] var2, int var3, int var4) {
      this.field164 = var1;
      this.field165 = var2;
      this.field166 = var3;
      this.field167 = var4;
   }

   class23(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field164 = var1;
      this.field165 = var2;
      this.field166 = var3;
      this.field167 = var4;
      this.field168 = var5;
   }

   public class23 method362(class38 var1) {
      this.field165 = var1.method727(this.field165);
      this.field164 = var1.method720(this.field164);
      if (this.field166 == this.field167) {
         this.field166 = this.field167 = var1.method721(this.field166);
      } else {
         this.field166 = var1.method721(this.field166);
         this.field167 = var1.method721(this.field167);
         if (this.field166 == this.field167) {
            --this.field166;
         }
      }

      return this;
   }
}
