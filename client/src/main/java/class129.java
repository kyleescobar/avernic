public class class129 extends class137 {
   long field1461 = System.nanoTime();

   public void method2322() {
      this.field1461 = System.nanoTime();
   }

   public int method2329(int var1, int var2) {
      long var4 = (long)var2 * 1000000L;
      long var6 = this.field1461 - System.nanoTime();
      if (var6 < var4) {
         var6 = var4;
      }

      class210.method3831(var6 / 1000000L);
      long var8 = System.nanoTime();

      int var10;
      for(var10 = 0; var10 < 10 && (var10 < 1 || this.field1461 < var8); this.field1461 += (long)var1 * 1000000L) {
         ++var10;
      }

      if (this.field1461 < var8) {
         this.field1461 = var8;
      }

      return var10;
   }
}
